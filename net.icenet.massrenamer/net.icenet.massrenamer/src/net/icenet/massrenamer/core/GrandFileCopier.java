package net.icenet.massrenamer.core;

import java.io.File;
import java.io.IOException;

public class GrandFileCopier {

	//String originalDir;

//	File[] originalFiles;
//	File[] newFiles;  //THIS SHOULD DRAW FILENMES FROM "NEWFILENAMECOMBINATOR" 
	
	//...
	
	/*
	 * How to throw in all necessary data?
	 * way 1 - FileReader Original: for a) number of files, b) original filenames from array + FileNameConstructor newFileNames for c) new filenames
	 * way 2- a) number of files, b) original filenames array and c) new filenames as INT, STRING and STRING input
	 * 
	 * SO..?
	 */

	GrandFileCopier (FileNameReader Original, FileNameConstructor newFileNames){
		
		for (int i=0;i<Original.quantOfFiles;i++){
			
			String origFilePath = Original.dirPath+File.separator+Original.OriginalFilesArray[i];// source not found Exception!!!!!
			String newFilePath = Original.dirPath+File.separator+newFileNames.newFileNamesArray[i];
			
			File F = new File (origFilePath);
			File newF = new File (newFilePath);
			
			FileContentCopier.Copy(F, newF);
			
			try{
				newF.createNewFile();
			} 
			catch (IOException E) {
				E.printStackTrace();
			}
			
			
			
		}
		
	}

}
