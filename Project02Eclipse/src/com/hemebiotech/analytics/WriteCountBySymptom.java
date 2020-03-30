package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

/**
 * create a file to list the symptoms with their number of occurrences
 * @author hfx28
 * 
 */

public class WriteCountBySymptom {
	
	/**
	 * 
	 * @param symptomsInOrder : to get the symptoms in alphabetical order obtained by analysisAlphabet method from AlphabeticalOrder Class
	 * 
	 */

	public void writer(Map<String, Integer> symptomsInOrder) {

		try {
			FileWriter writer = new FileWriter ("result.out");
			
			for(Map.Entry<String,Integer> symptom : symptomsInOrder.entrySet()) {
				writer.write(symptom.getKey() + " : " + symptom.getValue() +"\n");
			}
						
			writer.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
