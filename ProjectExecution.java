package Phase1Project;

import java.util.Scanner;


public class ProjectExecution {
	
	CreationOfFile creationOfFile;

	public static void main(String[] args) {
		//CreationOfFile creationOFFile = new CreationOfFile();
		//CreationOfFile.createDirectory();
		ProjectExecution projectExecution = new ProjectExecution();
		projectExecution.mainMenu();
	}

	public void mainMenu() {
		System.out.println("Main Menu");
		creationOfFile = new Phase1finalProject.CreationOfFile ();
		this.creationOfFile.createDirectory();


		Scanner input = new Scanner(System.in);
		int mainSelection;

		System.out.println("*****************************************");
		System.out.println("******* LockedMe.Com ********");
		System.out.println("*****************************************");
		System.out.println("************ Suriya Arjunan *************");

		System.out.println("*****************************************");
		System.out.println("******* Full Stack Developer  ***********");
		System.out.println();


		do {
			System.out.println("Choose from these options");
			System.out.println("1. Display all file names in ascending order");
			System.out.println("2. Go to user interface menu");
			System.out.println("3. Exit");


			mainSelection = input.nextInt();



			switch(mainSelection) {
			case 1:
				creationOfFile.listAllFilesAscending();
				break;
			case 2:
				System.out.println("Option 2 selected");
				userInterfaceMenu();
				break;
			case 3: 
				System.out.println("Thanks for using our Application");
				System.exit(0);
				break;

			default:
				System.out.println("Wrong option");
			}
		}while(mainSelection!=3);		


	}

	public void userInterfaceMenu() {
		//CreationOfFile creationOfFile = new CreationOfFile();

		Scanner input = new Scanner(System.in);
		int selection;


		do {
			System.out.println("******* User Interface Menu ***********");
			System.out.println("Choose from these options");
			System.out.println("1. Add a user specified file");
			System.out.println("2. Delete a user specified file");
			System.out.println("3. Search a user specified file");
			System.out.println("4. Back to Main Menu");


			selection = input.nextInt();

			switch(selection) {
			case 1:
				this.creationOfFile.createFile();
				break;
			case 2:
				System.out.println("Option 2 selected");
				this.creationOfFile.deleteFile();
				break;
			case 3: 
				System.out.println("Option 3 selected");
				this.creationOfFile.searchFile();
				break;
			case 4:
				mainMenu();
				break;
			default:
				System.out.println("Wrong option");
			}


		}while(selection!=4);
	}

}
