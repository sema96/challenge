package de.exxcellent.challenge;

import java.util.ArrayList;

import de.exxcellent.challenge.models.DataModel;
import getdata.GetInformation;
import getdata.ReadCSV;

/**
 * The entry class for your solution. This class is only aimed as starting point and not intended as baseline for your software
 * design. Read: create your own classes and packages as appropriate.
 *
 * @author Benjamin Schmid <benjamin.schmid@exxcellent.de>
 */
public final class App {

    /**
     * This is the main entry method of your program.
     * @param args The CLI arguments passed
     */
    public static void main(String... args) {

        // Gets the relevant information from the ReadCSV Class, it is necessary to give the filename, the column where the day,
    	// the max and min temperature is stored
    	ArrayList<DataModel> weatherData =new ReadCSV().readData("src\\main\\resources\\de\\exxcellent\\challenge\\weather.csv",0,1,2);
    	//the day with the smallest Spread is returned, by using the weatherData
        String dayWithSmallestTempSpread = new GetInformation().getInformation(weatherData);  // Your day analysis function call …
        System.out.printf("Day with smallest temperature spread : %s%n", dayWithSmallestTempSpread);

        // Gets the relevant information from the ReadCSV Class, it is necessary to give the filename, the column of the teamName,
    	//as well as the column of the goals and goalsallowed
        ArrayList<DataModel> footballData =new ReadCSV().readData("src\\main\\resources\\de\\exxcellent\\challenge\\football.csv",0,5,6);
         //returns the team with the smallest distance
        String teamWithSmallestGoalSpread = new GetInformation().getInformation(footballData);   // Your goal analysis function call …
        System.out.printf("Team with smallest goal spread       : %s%n", teamWithSmallestGoalSpread);}
}
