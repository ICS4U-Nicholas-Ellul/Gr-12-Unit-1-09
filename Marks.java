/****************************************************************************
 *
 * Created by: Nicholas Ellul
 * Created on: Sept 2016
 * This program populates kids marks and returns class average. 
 *  Unit 1-09
 *    
 *
 ****************************************************************************/

import java.util.Arrays;
import java.util.Random;

class Main {
    public static void main(String[] args) {
        
        	//variables
        int kidsInClass = 4;
        int assignemnts = 6;
        int minMark = 50;
   		int markSum = 0;
    	int[][] classMarksArray = new int[kidsInClass][assignemnts];
   	    int classAverage;
        Random rng = new Random();
        
        	//populate array with marks
        for (int column = 0;column<kidsInClass; column++){
     		for(int row = 0;row<assignemnts; row++){
     			classMarksArray[column][row]= rng.nextInt(minMark) +51;
     			markSum += classMarksArray[column][row];
     			System.out.println(classMarksArray[column][row]);
     		}

		}
			//output
   		classAverage = markSum/(kidsInClass*assignemnts);
   		System.out.println("The class average is " + classAverage);
    }
}
