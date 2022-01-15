package com.Namrata;

import java.util.List;
import java.util.Scanner;

public class ManageOptions {
	public static void handleWelcomeScreenInput() {
		boolean running = true;
		Scanner sc = new Scanner(System.in);
		do {
			try {
				Menu.displayMenu();
				int input = sc.nextInt();

				switch (input) {
				case 1:
					OperationsOnFiles. displayFilesInAscending("Project");
					break;
				case 2:
					ManageOptions.handleFileMenuOptions();
					break;
				case 3:
					System.out.println("Program exited successfully.");
					running = false;
					sc.close();
					System.exit(0);
					break;
				default:
					System.out.println("Please select a valid option from above.");
				}
			} catch (Exception e) {
				System.out.println(e.getClass().getName());
				handleWelcomeScreenInput();
			} 
		} while (running == true);
	}
	
	public static void handleFileMenuOptions() {
		boolean running = true;
		Scanner sc = new Scanner(System.in);
		do {
			try {
				Menu.displayFileMenuOptions();
				OperationsOnFiles.createProjectFolder("main");
				
				int input = sc.nextInt();
				switch (input) {
				case 1:
					// To Add File
					System.out.println("Enter the name of the file you want Add ");
					String fileToAdd = sc.next();
					
					OperationsOnFiles.createFile(fileToAdd, sc);
					
					break;
				case 2:
					// To Delete File or Folder
					System.out.println("Enter the name of the file you want to Delete");
					String fileToDelete = sc.next();
					
					OperationsOnFiles.createProjectFolder("Project");
					List<String> filesToDelete =OperationsOnFiles.displayFileLocations(fileToDelete, "Project");
					String deletionPrompt = "\nSelect index of which file to delete?"
							+ "\n(Enter 0 if you want to delete all elements)";
					System.out.println(deletionPrompt);
					 int index = sc.nextInt();
						
						if (index != 0) {
							OperationsOnFiles.deleteFileRecursively(filesToDelete.get(index - 1));
						} else {
							
							// If index == 0, delete all files displayed for the name
							for (String path : filesToDelete) {
								OperationsOnFiles.deleteFileRecursively(path);
							}
						}
					

				
					
					break;
					
					case 3:
					// To search File
					System.out.println("Enter the name of the file to be searched from \"Project\" folder");
					String fileName = sc.next();
					
					OperationsOnFiles.createProjectFolder("Project");
					OperationsOnFiles.displayFileLocations(fileName, "Project");

					
					break;
				case 4:
					// To go back to menu Option
					return;
				case 5:
					// Exit
					System.out.println("You are exited from program successfully.");
					running = false;
					sc.close();
					System.exit(0);
				default:
					System.out.println("Please select a valid option from above.");
				}
			} catch (Exception e) {
				System.out.println(e.getClass().getName());
				handleFileMenuOptions();
			}
		} while (running == true);
	}
}