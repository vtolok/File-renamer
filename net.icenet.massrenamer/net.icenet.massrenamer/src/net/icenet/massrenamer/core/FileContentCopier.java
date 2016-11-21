package net.icenet.massrenamer.core;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileContentCopier {
	
	static void Copy (File original, File clone){
		InputStream inS = null;
		OutputStream ouS = null;
		
		try{
			
			inS = new FileInputStream(original);
			ouS = new FileOutputStream(clone);
			
			byte [] fileBuffer = new byte [1048576];
			
			int fileLength;
			
			while ((fileLength = inS.read(fileBuffer))>0){
				ouS.write(fileBuffer, 0, fileLength);
			}
		}
		catch (IOException e) {
			System.out.println("Ooops! There was a problem reading the files :-(");
		}
	}
	
	
}
