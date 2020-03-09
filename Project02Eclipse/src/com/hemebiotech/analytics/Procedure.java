package com.hemebiotech.analytics;

import java.util.List;
import java.util.Set;

/**
 * Procedure is the Class for the organization of the program
 * @author hfx28
 * 
 */

public class Procedure {
	

	/**
	 * In Event we find the list of methods used and in which order
	 */

	public void Event() {
		
		
		List<String> symptomsFromFile = new ReadSymptomDataFromFile("symptoms.txt").GetSymptoms();
		Set<String> symptomsInOrder = new AlphabeticalOrder().AnalysisAlphabet(symptomsFromFile);
		new WriteCountBySymptom().Writer(symptomsInOrder, symptomsFromFile);
		
		System.out.println("a file result.out has been generated");	//message printed in console at the end of the program
	}
}