package net.icenet.massrenamer.core;

import java.io.File;

/**
 * A file that reads names of all similar files in the folder + their extentions separately
 * It can add a random length text into every files' name - and add a complex iterable number as well
 */


/*
 * Class READER - reads all file names and their extentions into separate ArrayList
 * Class EDITOR - gives interface for selecting a type of modification user can make to all file's names
 * Class WORKBENCH - adds the modification to filenames
 * Class KAMINO - copies the contents of every respected file into a newly-created one with an altered name + add the extention 
 * and puts new files into a SUBFOLDER with a name generated from user's modification choices
 */

public class EntryPoint {
	
	public static void main (String args []){
		
		FileNameReader Original = new FileNameReader ();
		
		FileNameSplitter OriginalSplit = new FileNameSplitter (Original);
		
		NameOptions newNameProto = new NameOptions ();
		
		FileNameConstructor newFileNames = new FileNameConstructor (Original, OriginalSplit, newNameProto);
		
			// TESTING Block
			System.out.println("TESTING original filenames:");
			for (String filename: Original.OriginalFilesArray)
				System.out.println(filename);
			
			System.out.println("\nTESTINGNEW filenames:");
			for (String filename: newFileNames.newFileNamesArray)
				System.out.println(filename);
		
			System.out.println("\nTESTING ORIGINAL FILE PATH AND NAME REBUILT: "+Original.dirPath+File.separator+Original.OriginalFilesArray[0]);
			////
			
			GrandFileCopier NewFilez = new GrandFileCopier (Original, newFileNames);
		
			System.out.println("New files are cussefully made!\n"
					+ " **                **"
					+ "***have a good day!***"
					+ " **                **");
	}

}
