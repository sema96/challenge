package de.exxcellent.challenge.models;

//This class is to store the relevant data of the csv files 

	public class DataModel{
		
// Initializing relevant data for the task
		
	    private  String searchedValue;
	    private  double value1;
	    private  double value2;
	
//constructor
	    public DataModel(String searchedValue, double value1, double value2) {
	        this.setSearchedValue(searchedValue);
	        this.setValue1(value1);
	        this.setValue2(value2);
	    }
	    
 // getter and setter for the parameters
	    
	    //value which has to be found
		public String getSearchedValue() {
			return searchedValue;
		}

		public void setSearchedValue(String searchedValue) {
			this.searchedValue = searchedValue;
		}

		// max value
		public double getValue1() {
			return value1;
		}

		public void setValue1(double value1) {
			this.value1 = value1;
		}

		//min value
		public double getValue2() {
			return value2;
		}

		public void setValue2(double value2) {
			this.value2 = value2;
		}

// difference of the value1 and value2 , to find the searchedValue 
		public double getDiff() {
			//negative values are changed to positive values
			double diff= getValue1()-getValue2();
			if(diff<0) {
				diff=-diff;
			}
			return diff;
		}
		

}
