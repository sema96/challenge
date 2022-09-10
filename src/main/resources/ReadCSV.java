import java.io.*;
import java.util.ArrayList;

//class that reads the csv file
public class ReadCSV
{  
	
//code for reading the relevant data from the weather.csv file, returns an ArrayList
public ArrayList <WeatherData> readWeatherData() 
{  
	private String line = "";  
	private String splitBy = ","; 
	

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
	//column, which contains the maximum temperature, parsing, because it is necessary
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
}