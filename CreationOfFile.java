package Phase1Project;



import java.io.File;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

// Creation Of Path & Directory...
public class CreationOfFile {
		Path path;

		public void createDirectory() {

			this.path = Paths.get("./resources/Userproducts");
			//Using Exception Handling...
			try {
				Files.createDirectories(path);
				System.out.println("Directory is created!");
			} catch (IOException e) {
				System.err.println("Failed to create directory!" + e.getMessage());
			}
			

		}
		
		public Path getDirectoryPath() {
			return this.path;
		}

		//  Creation Of Files...
		public void createFile() {
			Scanner sc = new Scanner(System.in);

			System.out.println("Enter product Name you want to create");

			String fileName = sc.next();


			Path newFilePath = Paths.get(this.path + "/" + fileName);

			try {
				Files.createFile(newFilePath);
				System.out.println("Product created successfully");
			}
			catch(FileAlreadyExistsException e) {
				System.out.println("Product already exist!!! Enter new Product name");
				this.createFile();

			}
			catch (IOException e) {
				System.err.println("Failed to create Product!" + e.getMessage());
			}
		}

		
	// Listing of All Files...
		public void listAllFiles() {

			String dir = this.path.toString();
			//Using ArrayList...
			File[] listOfFiles = new File(dir).listFiles();


			for (File file : listOfFiles) {
				if (file.isDirectory()) {

					System.out.println(file.getName());
				} else if (file.isFile()) {
					System.out.println(file.getName());
				}
			}
		}

		
		//  TO delete a Files....
		public void deleteFile() {
			Scanner sc = new Scanner(System.in);

			System.out.println("Enter the product name you want to delete");
			String fileToDelete = sc.next();

			try {
				Files.delete(Paths.get(this.path + "/" + fileToDelete));
				System.out.println("product deleted successfully");
			} 
			catch(NoSuchFileException e) {
				System.out.println("No such product exist!!! Enter new product name to delete");
				this.deleteFile();
			}
			catch (IOException e) {
				e.printStackTrace();
			}

		}

		  // Arrange the Files in Ascending Order...
		public void listAllFilesAscending() {
			String dir = this.path.toString();
			File[] listOfFiles = new File(dir).listFiles();

			List<File> listFile = Arrays.asList(listOfFiles);
			
             //Using Merge Sort Collections...
			Collections.sort(listFile);

			Iterator<File> it = listFile.iterator();

			while(it.hasNext()) {
				System.out.println(it.next().getName());
			}		
		}


		// To Search a File....
		public void searchFile() {

			Scanner sc = new Scanner(System.in);

			System.out.println("Enter the Product name you want to search");
			String fileToSearch = sc.next();
			
			 Path path = Paths.get(this.path + "/" + fileToSearch);

		        // check exists for file and directory
		        if (Files.exists(path)) {

		            if (Files.isRegularFile(path)) {
		                System.out.println("Product exists!");
		            }
		            if (Files.isDirectory(path)) {
		                System.out.println("Product exists, but it is a directory.");
		            }

		        } else {
		            System.out.println("Product doesn't exist");
		        }
			

		}
	}