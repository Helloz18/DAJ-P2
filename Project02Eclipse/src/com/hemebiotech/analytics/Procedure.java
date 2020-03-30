package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;


/**
 * Procedure is the Class for the organization of the program
 * @author hfx28
 * 
 */

public class Procedure {
	

	/**
	 * In event we find the list of methods used and in which order
	 */

	public void event() {
		
		
		List<String> symptomsFromFile = new ReadSymptomDataFromFile("symptoms.txt").getSymptoms();
		Map<String,Integer>count=new CountOccurrences().countSymptoms(symptomsFromFile);
		Map<String, Integer> symptomsInOrder = new AlphabeticalOrder().analysisAlphabet(count);
		new WriteCountBySymptom().writer(symptomsInOrder);
		System.out.println("a file result.out has been generated");	
	}
}