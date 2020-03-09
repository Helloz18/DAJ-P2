package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class AnalyticsCounter {
	private static int headacheCount = 0;	
	private static int rashCount = 0;		
	private static int pupilCount = 0;
	private static int CountOtherSymptoms = 0;
	
	public static void main(String args[]) throws Exception {
		// first get input
		
		try {	
			BufferedReader reader = new BufferedReader (new FileReader("symptoms.txt"));
			String line = reader.readLine();
			
			while (line != null) {

				if (line.equals("headache")) {
					headacheCount++;
				}
				
				else if (line.equals("rash")) {
					rashCount++;
				}
				// for this symptom which is composed by multiple words : "contains" is used
				else if (line.contains("pupils")) { 
					pupilCount++;
				}
				else {
					CountOtherSymptoms++; //to check if there are others symptoms left to count
				} 
				line = reader.readLine();	// get another symptom

			}
			reader.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
			
			// next generate output
			
			FileWriter writer = new FileWriter ("result2.out");
			writer.write("headache: " + headacheCount + "\n");
			writer.write("rash: " + rashCount + "\n");
			writer.write("dialated pupils: " + pupilCount + "\n");
			writer.write("Other Symptoms: " + CountOtherSymptoms + "\n");
			writer.close();		
				
		}
	
}