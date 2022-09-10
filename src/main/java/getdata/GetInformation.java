package getdata;

import java.util.ArrayList;
import java.util.Collections;

import de.exxcellent.challenge.models.WeatherData;


//this class gives the actual information, which is asked in the task
public class GetInformation {

	//this method searches the day of the minimum temperature spread and returns it 
	public String getDayWithSmallestSpread () {
		
			ReadCSV getData = new ReadCSV();
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
	
}
		