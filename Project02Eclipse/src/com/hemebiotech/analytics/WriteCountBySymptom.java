package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * create a file to list the symptoms with their number of occurrences
 * @author hfx28
 * 
 */

public class WriteCountBySymptom {
	
	/**
	 * 
	 * @param symptoms : to get the list of symptoms in alphabetical order
	 * @param fileRead : to get the number of occurrences of each symptom
	 */

	public void Writer(Set<String> symptoms, List<String> fileRead) {

		try {
			FileWriter writer = new FileWriter ("result.out");

			for (String symptom : symptoms) {
				
				writer.write(symptom + " : " + Collections.frequency(fileRead, symptom) + "\n");
			}
			
			writer.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
