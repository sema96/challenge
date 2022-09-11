package getdata;
import java.io.*;
import java.util.ArrayList;


import de.exxcellent.challenge.models.DataModel;

public class ReadCSV
{  
	

//code for reading the relevant data from the csv file, returns an ArrayList
public ArrayList <DataModel> readData(String filename, int columnSearchedValue, int columnValue1, int columnValue2) 
{  
	 String line = "";  
	 String splitBy = ","; 
	
	//using the Data model, for storing the data
	ArrayList<DataModel>  csvData=new ArrayList<>();
	try   
	{  
	//parsing a CSV file into BufferedReader class constructor  
	BufferedReader br = new BufferedReader(new FileReader(filename));  
	
	//skipping first csv line
	br.readLine();
	while ((line = br.readLine()) != null)   //returns a Boolean value  
	{  
		
	String[] data = line.split(splitBy); 
	
	//column, which contains the searched value
	String searched=data[columnSearchedValue];
	//column, which contains the value1 
	double val1=Double.parseDouble(data[columnValue1]);
	//column, which contains the value2 
	double val2=Double.parseDouble(data[columnValue2]);
	
	//the data is stored in the ArrayList
	csvData.add(new DataModel(searched,val1, val2));

	} 
	
	}   
	catch (IOException e)   
	{  
	e.printStackTrace();  
	}  
	
	//ArrayList with the csvData is returned
	return csvData;
}


}  