package com.hemebiotech.analytics;

import java.util.Map;
import java.util.TreeMap;

/**
 * Set the String from the Map in alphabetical order
 * @author hfx28
 * 
 */
public class AlphabeticalOrder {

	/**
	 * 
	 * @param count is the result obtained from method countSymptoms from CountOccurrences class
	 * @return symptoms : TreeMap of each symptom in alphabetical order
	 */
	
	public Map<String, Integer> analysisAlphabet(Map<String, Integer> count) {
		
			Map<String, Integer> symptoms = new TreeMap<String, Integer>(count);
							
		return symptoms;
		
		
	}

}