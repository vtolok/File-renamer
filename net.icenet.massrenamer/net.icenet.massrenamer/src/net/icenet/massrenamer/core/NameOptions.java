package net.icenet.massrenamer.core;

import java.util.Scanner;

// This class is for renaming existing files
public class NameOptions {
	
	String nameAppendix="";
	Boolean iterateSelector = false;
	String dummyFileName = "XXXXXXXX";
	String dummyExtention = "ext";
	
	Scanner keyboard = new Scanner(System.in);
	
	NameOptions (){
	
		int ctrl1=0;
		int ctrl2=0;

		do{
			
			do{
				System.out.println("++\nFile renaming OPTIONS:"
						+ "\n1 - view current filename template"
						+ "\n2 - edit filename addendix"
						+ "\n3 - iterator on/off"
						+ "\n4 - editing comlete, lets make some files!"
						+ "\n++");
				ctrl1=keyboard.nextInt();
			}while(ctrl1!=1&&ctrl1!=2&&ctrl1!=3&&ctrl1!=4);
			
			
			//if 1 
			if (ctrl1==1){
				showFileTemplae();
			}
			
			//if 2 
			if (ctrl1==2){
				nameAppendix=addName();
			}
			
			//if 3
			if (ctrl1==3){
				iterateSelector=useIterator();
			}
			
			//if 4
			System.out.println("+++ EXIT filename editor?\n1 - YES, lets make some files!"
				+ "\n0 - do nothing, EXIT PROGRAM RIGHT AWAY"
				+ "\n(any other key) - return to filename menu\n+++");
			ctrl2=keyboard.nextInt();
			
			if (ctrl2==0)
				System.exit(0);
			
			ctrl1=0;
		}while(ctrl2!=1);
		
		System.out.println("System is now ready to generate new files!\n");

	}
	
		// FILENAME DEMONSTRATOR
		void showFileTemplae (){
			System.out.println("\nThe filename looks like: "+NameBuilder.buildString(nameAppendix, dummyFileName,
					Iterator.iterPart(iterateSelector, 0), dummyExtention)+'\n');
		}
			
		// FILE NAME APPENDIX EDITOR
		String addName (){
			int ctrl3=0;
			String appendix=null;
			
			do{
				System.out.println("Input an appendix name to the BEGINNIG of filename:");
				appendix=keyboard.next();
				System.out.println("Are you happy with this name: \""+appendix+"\"\n1 - YES\n2 - NO, let me re-enter!");
				ctrl3=keyboard.nextInt();
			}while(ctrl3!=1);
			
			return appendix;
		}
		
		
		//	FILE ITERATION APPENDIX EDITOR
		boolean useIterator (){
			boolean iterate=false;
			int ctrl4=0;
			System.out.println("Do you want to auto-iterate all files?\n1 - YES\n(any other key) - NO, skip it");
			ctrl4=keyboard.nextInt();
			
				if (ctrl4==1)
					iterate=true;
			
			return iterate;
		}
	
}
