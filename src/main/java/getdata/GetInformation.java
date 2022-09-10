package getdata;

import java.util.ArrayList;
import java.util.Collections;

import de.exxcellent.challenge.models.WeatherData;
import de.exxcellent.challenge.models.FootballData;

//this class gives the actual information, which is asked in the task
public class GetInformation {

	//the initialization is global, because it is needed in both tasks
	private ReadCSV getData = new ReadCSV();
		 
	//this method searches the day of the minimum temperature spread and returns it 
	public String getDayWithSmallestSpread () {

			//needed to find the minimum spread
		 ArrayList <Double> differences=new ArrayList<>();
		 
		 //needed for the return statement
		String dayWithSmallestTempSpread ="";
		 
		//for all weather data elements, the differences are added in the ArrayList
		for(WeatherData element :  getData.readWeatherData())
		{
			differences.add(element.getDiff());	
		}
		
		//Function, which finds the smallest spread
		 Double smallestSpread = Collections.min(differences);

		 
		 //searches the day of the smallest spread, by using  smallestSpread and comparing it 
		 for(WeatherData element :  getData.readWeatherData())
			{
			 if(element.getDiff()==smallestSpread) {
				 dayWithSmallestTempSpread= element.getDay();
			 }
			}
		 
		 //returns the day with the smallest spread
		return dayWithSmallestTempSpread;
				
	}
	
	//this method searches the name of the team with the smallest goal distance 
	public String getTeamNameWithSmallestDistance () {

		//needed for finding the minimum distance
		 ArrayList <Integer> distance=new ArrayList<>();
		 
		 //teamname, needed for return statement
		 String teamName ="";
		 
		//for all football data elements, the distances are added in the ArrayList
		for(FootballData element :  getData.readFootballData())
		{
			//all distances are added into the array, for finding the teamname
			distance.add(element.getDistance());	
		}
		
		//Function, which finds the smallest distance
		 int smallestDistance = Collections.min(distance);

//searches the name of the team with the smallest distance spread, by using the variable smallest Distance
		
		 for(FootballData element :  getData.readFootballData())
			{
			 if(element.getDistance()==smallestDistance ) {
				 teamName= element.getTeamName();
			 }
			}
		//returns the name of the team
		return teamName;
				
	}
}
		