
//This class is to store the relevant data of the weather.csv 

	public class WeatherData{
		
// Initializing relevant data for the task
		
	    private  String day;
	    private  double mxt;
	    private  double mnt;
	
//constructor
	    public WeatherData(String day, double mxt, double mnt) {
	        this.setDay(day);
	        this.setMxt(mxt);
	        this.setMnt(mnt);
	    }
	    
 // getter and setter for the parameters
	    
		public String getDay() {
			return day;
		}

		public void setDay(String day) {
			this.day = day;
		}

		public double getMxt() {
			return mxt;
		}

		public void setMxt(double mxt) {
			this.mxt = mxt;
		}

		public double getMnt() {
			return mnt;
		}

		public void setMnt(double mnt) {
			this.mnt = mnt;
		}

// difference of the maximum and minimum temperature, to find the day of the smallest temperature spread
		public double getDiff() {
			return getMxt()-getMnt();
		}

		

}
