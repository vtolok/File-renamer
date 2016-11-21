package net.icenet.massrenamer.core;

public class FileNameConstructor {
	
	String [] newFileNamesArray;
	
	FileNameConstructor (FileNameReader Original, FileNameSplitter OriginalSplit, NameOptions newNameProto){
		
		newFileNamesArray = new String [Original.quantOfFiles];
		
		for (int i=0;i<Original.quantOfFiles;i++){
			newFileNamesArray[i]=NameBuilder.buildString(newNameProto.nameAppendix, OriginalSplit.OriginalNames[i],
					(Iterator.iterPart(newNameProto.iterateSelector, i)), OriginalSplit.OriginalExtentions[i]); 
		}

	}
}
