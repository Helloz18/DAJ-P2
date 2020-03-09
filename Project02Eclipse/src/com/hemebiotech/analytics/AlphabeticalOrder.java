package com.hemebiotech.analytics;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * 
 * @author hfx28
 * Set the line from the file read in alphabetical order
 */
public class AlphabeticalOrder {

	/**
	 * 
	 * @param fileRead is the result obtained from method GetSymptom() from Class ReadSymptomDataFromFile
	 * @return symptoms : TreeSet of each symptom in alphabetical order
	 */
	
	public Set<String> AnalysisAlphabet(List<String> fileRead) {
		
			Set<String> symptoms = new TreeSet<String>(fileRead);
							
		return symptoms;
		
		
	}

}