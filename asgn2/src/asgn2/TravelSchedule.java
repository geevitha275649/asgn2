package asgn2;

public class TravelSchedule {
	
		String firstclass;
		String secondclass;
		String thirdclass;

		
	public TravelSchedule(String firstclass, String secondclass,String thirdclass) {
		    this.firstclass = firstclass;
		    this.secondclass = secondclass;
		    this.thirdclass = thirdclass;

		   
	}		     
		    public void setfirstclass(String firstclass) {
		    	this.firstclass = firstclass;
		    }
		    public String getfirstclass() {
		    	return firstclass;   	
		    }
		    public void setsecondclass(String secondclass) {
		    	this.secondclass = secondclass;
		    }
		    public String getsecondclass() {
		    	return secondclass;   	
		    }	    
		    public void setthirdclass(String thirdclass) {
		    	this.thirdclass = thirdclass;
		    }
		    public String getthirdclass() {
		    	return thirdclass;   	
		    }
		  
		    void run() {
				System.out.println("Disclaimer : Lost of personal belongings are under personal awareness - cruise authorities won't be responsible");
				
			}
				
	}

