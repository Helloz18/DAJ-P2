package com.hemebiotech.analytics;

import java.util.List;
import java.util.Set;

/**
 * 
 * @author hfx28
 * Procedure is the Class for the organization of the program
 */

public class Procedure {
	

	/**
	 * In Event we find the list of methods used and in which order
	 */

	public void Event() {
		
		
		List<String> test = new ReadSymptomDataFromFile("symptoms.txt").GetSymptoms();
		Set<String> suite = new AlphabeticalOrder().AnalysisAlphabet(test);
		
	}
}