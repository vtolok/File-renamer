package net.icenet.massrenamer.core;

public class NameBuilder {
	
public static String buildString(String inputString, String inputName, String inputIterator, String inputExtentions){
	
	StringBuilder S = new StringBuilder();
	S.append(inputString).append("_").append(inputName).append("_").append(inputIterator).append(".").append(inputExtentions);
	return S.toString();
	
	}
}
