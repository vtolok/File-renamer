package net.icenet.massrenamer.core;

public class FileNameSplitter {

	String [] OriginalExtentions;
	String [] OriginalNames; 
	
	FileNameSplitter (FileNameReader Original){ 
		
		OriginalExtentions = new String [Original.quantOfFiles];
		OriginalNames = new String [Original.quantOfFiles];
		
		extentionSeparator (Original.OriginalFilesArray, OriginalNames, OriginalExtentions);	
	}
	
// method for inversing a string and sendng it back
		String invString (String inString){
			String outString;
			outString=new StringBuilder(inString).reverse().toString();
			return outString;
		}
		
		
//method for separating a filename and extention from original filenames
		void extentionSeparator (String [] OriginalFiles, String []OriginalNames, String [] OriginalExtentions){
			
			String [] OriginalFilesWholeReversed = new String [OriginalFiles.length];
			for (int i=0;i<OriginalFiles.length;i++)
				//if (OriginalFiles[i]!=null)// CHK for NULL filename entry (i.e. there was a folder)
					OriginalFilesWholeReversed[i]=invString(OriginalFiles[i]);

			// 	separating extentions
	 			for (int i=0;i<OriginalFiles.length;i++){
					String tempExt = OriginalFilesWholeReversed[i].substring(0,OriginalFilesWholeReversed[i].indexOf('.'));
					OriginalExtentions[i] = invString(tempExt);
					}
	 			
//	separating filenames
	 			for (int i=0;i<OriginalFiles.length;i++){
					String tempOrig = OriginalFilesWholeReversed[i].substring(OriginalFilesWholeReversed[i].indexOf('.')+1);
					OriginalNames[i]=invString(tempOrig);
	 			}
	 			
	 			System.out.println("\n*** File names and extentions extrusion - complete!\n");
	 			System.out.println("");
		}
		
/*
		// DEMONSTRATOR
		void showResult (String inNames [], String inExts [] ){
			System.out.println("CHECKING! Rebuilt filenames are:");
			for (int i=0;i<inExts.length;i++)
				System.out.print(inNames[i]+"."+inExts[i]+"\n");		
		}*/
	
}