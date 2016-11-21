package net.icenet.massrenamer.core;

public class Iterator {

	public static String iterPart (boolean iterate, int i){
		
		if (iterate==true){
			int newNum = 1;
			if (i>0)
				newNum+=i;
			
		String tempIter = "0000"+Integer.toString(newNum);
		String iterator = tempIter.substring(tempIter.length()-4,tempIter.length());//from, say 11-4=9th to 11th symbols - i.e. the rightmost ones only
		return iterator;
		}
		
		else
			return null;
	}
}
