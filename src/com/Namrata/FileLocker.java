package com.Namrata;

public class FileLocker {

	public static void main(String[] args) {
		
		
		OperationsOnFiles.createProjectFolder("Project");
		
		Menu.displayWelcomeScreen(" LockedMe.com", "Namrata Phalke");
		
		ManageOptions.handleWelcomeScreenInput();
	}

	
}
