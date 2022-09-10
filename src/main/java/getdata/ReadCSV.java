package getdata;
import java.io.*;
import java.util.ArrayList;

import de.exxcellent.challenge.models.WeatherData;
import de.exxcellent.challenge.models.FootballData;

public class ReadCSV
{  
	//initialization is global, because it is needed for both methods to read and split the 
	//data from the csv file
	
	private String line = "";  
	private String splitBy = ","; 
	
//code for reading the relevant data from the weather.csv file, returns an ArrayList
public ArrayList <WeatherData> readWeatherData() 
{  

	//using the WeatherData model, for storing the data
	ArrayList<WeatherData>  weatherData=new ArrayList<>();
	try   
	{  
	//parsing a CSV file into BufferedReader class constructor  
	BufferedReader br = new BufferedReader(new FileReader("src\\main\\resources\\de\\exxcellent\\challenge\\weather.csv"));  
	
	//skipping first csv line
	br.readLine();
	
	while ((line = br.readLine()) != null)   //returns a Boolean value  
	{  
		
	String[] data = line.split(splitBy); 
	
	//column, which contains the day
	String day=data[0];
	//column, which contains the maximum temperature
	double mxt=Double.parseDouble(data[1]);
	//column, which contains the minimum temperature
	double mnt=Double.parseDouble(data[2]);
	
	//the data is stored in the ArrayList
	weatherData.add(new WeatherData(day,mxt, mnt));

	} 
	
	}   
	catch (IOException e)   
	{  
	e.printStackTrace();  
	}  
	
	//ArrayList with the WeatherData is returned
	return weatherData;
}

//code for reading the relevant data from the football.csv file, returns an ArrayList
public ArrayList <FootballData> readFootballData() 
{  
	
	//using the FootballData model, for storing the data
	ArrayList<FootballData>  footballData=new ArrayList<>();
	try   
	{  
	//parsing a CSV file into BufferedReader class constructor  
	BufferedReader br = new BufferedReader(new FileReader("src\\main\\resources\\de\\exxcellent\\challenge\\football.csv"));  
	
	//skipping first csv line
	br.readLine();
	while ((line = br.readLine()) != null)   //returns a Boolean value  
	{  
		
	String[] data = line.split(splitBy); 
	
	//column, which contains the name of the team
	String teamName=data[0];
	//column, which contains the amount of goals the team made
	int goals=Integer.parseInt(data[5]);
	//column, which contains the amount of goals, which are actually allowed
	int goalsAllowed=Integer.parseInt(data[6]);
	
	//the data is stored in the ArrayList
	
	footballData.add(new FootballData(teamName,goals, goalsAllowed));
	} 
	
	}   
	catch (IOException e)   
	{  
	e.printStackTrace();  
	}  
	
	//ArrayList with the FootballData is returned
	return footballData;
}
}  