package getdata;

import java.util.ArrayList;
import java.util.Collections;

import de.exxcellent.challenge.models.DataModel;

//this class gives the actual information, which is asked in the task
public class GetInformation {

		 
	//this method returns the searched value
	public String getInformation (ArrayList<DataModel> getData) {

			//needed to find the minimum 
		 ArrayList <Double> differences=new ArrayList<>();
		 
		 //needed for the return statement
		String searchedValue ="";
		 
		//for all data elements, the differences are added in the ArrayList, to later find the minimum difference of the data
		for(DataModel element :  getData)
		{
			differences.add(element.getDiff());	
		}
		
		//Function, which finds the minimum
		 Double smallestNumber = Collections.min(differences);

		 
		 //searches the relevant value, by using the variable smallestNumber and comparing it to the data 
		 for(DataModel element :  getData)
			{
			 if(element.getDiff()==smallestNumber) {
				 searchedValue= element.getSearchedValue();
			 }
			}
		 
		 //returns the value, which is asked in the task
		return searchedValue;
				
	}
	
}
		