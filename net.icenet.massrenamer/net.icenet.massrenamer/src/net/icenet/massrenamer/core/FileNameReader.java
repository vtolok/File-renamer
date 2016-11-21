package net.icenet.massrenamer.core;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class FileNameReader {

	//body of future OBJECT
	String dirPath;
	public int quantOfFiles=0;
	public int quantOfFilesAndFolders;
	String [] OriginalFilesArray;

	//object constructor
	FileNameReader(){
		
		while(true){// SHOULD ASK FOR FOLDER NAME UNTILL A REAL ONE IS INPUT!
			
				dirPath=takePath();
				File dir = new File(dirPath);
				
				if(dir.isDirectory())
					System.out.print("*** Directory found OK; ");
				
				try{
				quantOfFilesAndFolders=new File(dirPath).listFiles().length;
				System.out.println("there are "+quantOfFiles+" files in the specified dir");
				break;
				} 
				catch (NullPointerException e0){
					System.out.println("0 files in the directory - try a different dir. path!");
				}
		}

	String [] OriginalFilesArrayUnsorted = new String [quantOfFilesAndFolders];		
		
	File [] OriginalFiles = new File(dirPath).listFiles();

	for (int i=0,j=0;i<quantOfFilesAndFolders;i++)
		if (OriginalFiles[i].isFile()){
			OriginalFilesArrayUnsorted[j]=OriginalFiles[i].getName();
			j++;
			quantOfFiles=j;
			}
	
	OriginalFilesArray =Arrays.copyOf(OriginalFilesArrayUnsorted, quantOfFiles);
	Arrays.sort(OriginalFilesArray);
	
	}
	
String takePath (){
	int ctrl0=0;
	String path;
	Scanner keyboard = new Scanner(System.in);
	do{
		System.out.println("Input the desired directory:");
		path=keyboard.next();
		System.out.println("Verify if input was correct: (1) - YES; (any other num) - NO");
		ctrl0=keyboard.nextInt();
	}while(ctrl0!=1);
	return path;
	}
	
}
