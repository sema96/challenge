package de.exxcellent.challenge.models;

//This class is to store the relevant data of the football.csv 

	public class FootballData{
	
		// Initializing relevant data for the task
		
	    private  String teamName;
	    private  int goals;
	    private  int goalsAllowed;
	    
	// constructor	
	    public FootballData(String teamName,  int goals, int goalsAllowed) {
	        this.setTeamName(teamName);
	        this.setGoalsAllowed(goalsAllowed);
	        this.setGoals(goals);
	    }

	    //getter and setter for the parameters
		public String getTeamName() {
			return teamName;
		}

		public void setTeamName(String teamName) {
			this.teamName = teamName;
		}

		
		public int getGoals() {
			return goals;
		}

		public void setGoals(int goals) {
			this.goals = goals;
		}

		public int getGoalsAllowed() {
			return goalsAllowed;
		}

		public void setGoalsAllowed(int goalsAllowed) {
			this.goalsAllowed = goalsAllowed;
		}

//distance of the goals, negative values are transformed into positive values		
		public int getDistance() {
			int distance= getGoals()-getGoalsAllowed();
			if(distance<0) {
				distance=-distance;
			}
			return distance;
		}

}
