package com.Namrata;

public class Menu {

	public static void displayWelcomeScreen(String appName, String developerName) {
	
		String welcomeScreen ="""
               ========Welcome to========
                    %s. 
   This Application is Developed by %s.	
******************************************************

              **Functions of application**
   -List all the Current file names in ascending order.
   -Add,delete,Search specified file.
*******************************************************      
""";
		welcomeScreen = String.format(welcomeScreen, appName,developerName);
System.out.println(welcomeScreen);
	}

	public static void displayMenu() {
		String menu ="""
		                     ==MENU==
     Press 1 to display List the file names in ascending order.
	    Press 2 to Add,Delete or Search file.
	    Press 3 to Exit.
		
		           ====Enter your choice====
		""";
		
		System.out.println(menu);

	}

	public static void displayFileMenuOptions() {
		String fileMenu = """
*********************************************************8		
		 ==File Menu==
	   Press 1 to Add a file
	   Press 2 to delete a file.
	   Press 3 to Search a file.
	   Press 4 to Exit.
	   
	    ====Enter Your choice==== 
				""";

		System.out.println(fileMenu);
	}

}
