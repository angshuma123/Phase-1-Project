package simplilearnPhaseOneProject;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class LockedMe {
	static final String ProjectFilesPath="E:\\LockedMe Final Project";
	/**
	 * This method will display starting menu
	 */
	public static void displayMenu() {
		System.out.println("****************************************");
		System.out.println("\tWelcome to LockedMe.com secure app");
		System.out.println("\tDeveloped by :Angshuman Bhattacharyya");
		System.out.println("********************************************");
		System.out.println("\t1. Display all files");
		System.out.println("\t2. Add a new file");
		System.out.println("\t3. Delete a file");
		System.out.println("\t4. Search a file");
		System.out.println("\t5. Exit");
		System.out.println("************************************************");
	}
	/**
	 * This method will retrieve all the files from the folder
	 */
	public static void getAllFiles() {
		//Declaring project path
		File folder=new File(ProjectFilesPath);
		File[] listOfFiles=folder.listFiles();
		if(listOfFiles.length>0) {
			
		System.out.println("File list is below :");
		for(var l : listOfFiles) {
			System.out.println(l.getName());
		}
		
	}
		else {
			System.out.println("The folder is empty");
		}
		}
		/**
		 * This method will read all file details from the user and create a file
		 */
	public static void createFiles() {
		try {
		Scanner obj=new Scanner(System.in);
		//Variable declaration
		String fileName;
		//Take filename from user
		System.out.println("Enter the file name");
		fileName=obj.nextLine();
		int linesCount;
		System.out.println("Enetr how many lines you want to create in the file:");
		linesCount=Integer.parseInt(obj.nextLine());
		
		FileWriter	fw = new FileWriter(ProjectFilesPath+"//"+fileName+".txt");
		
		
			
		
		
		//Read line by line from user
		for(int i=1;i<=linesCount;i++) {
			System.out.println("Enter file lines");
			fw.write(obj.nextLine()+"\n");
		}
		System.out.println("File created successfully .");
		fw.close();
		
		}
		catch(Exception Ex){
			
		}
		
	}
	
	public static boolean checkFileExists(String fileName) {
		//Get all filenames into the list.
		ArrayList<String> allFilesNames =new ArrayList<String>();
		File folder=new File(ProjectFilesPath);
		File[] listOfFiles=folder.listFiles();
		if(listOfFiles.length>0) {
		
		for(var l : listOfFiles) {
			allFilesNames.add(l.getName());
		}
		
	}
		return allFilesNames.contains(fileName)	;
	}
	/**
	 * This method will help to delete an existing file from the folder
	 */
	public static void deleteFiles() {
		try {
		Scanner obj=new Scanner(System.in);
		String fileName;
		System.out.println("Enter the file name to delete it :");
		fileName=obj.nextLine();
		
		File f= new File(ProjectFilesPath+"//"+fileName);
		if(checkFileExists(fileName)) {
			f.delete();
			System.out.println("File deleted successfully.");
		}
		else {
			System.out.println("File doesnot exists.");
		}
		
	}
		catch(Exception Ex){
			System.out.println("Unable to delete the file.Please contact @Angshuman321.test");
		}
	}
	/**
	 * This method helps to check availability of a file in a folder
	 */
	public static void searchFiles() {
		try {
			Scanner obj=new Scanner(System.in);
			String fileName;
			System.out.println("Enter filename to be searched");
			fileName=obj.nextLine();
			
			if(checkFileExists(fileName)) {
				System.out.println("File is available.");
			}
			else {
				System.out.println("File is not available");
			}
		}
		catch(Exception Ex) {
			
		}
	}

}
