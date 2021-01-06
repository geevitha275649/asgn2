package asgn2;

public class Package {
private String  p1 , p2 , p3, sf1;
	
	Package(){
		
		this.p1 = "a) Period : 3 day 2 nights - ";
		this.sf1 ="b) Special Offer";
		this.p2 = "a) Period : 4 day 3 nights - ";
		this.p3 = "a) Period : 2 day 1 night - ";
	}

	public void packages() {
		
    	System.out.println("1) Package A - Couple Ticket \r\n");
    	System.out.println( p1 +"Days are fixed. Extra days will be charged differently \r\n" );
    	System.out.println(sf1 +" : Swimming pool and Bar facility are free of charge\r\n");
    	System.out.println("c) Price : RM 3570\r\n");
 
    	System.out.println("2) Package B - Family Ticket \r\n");
    	System.out.println( p2 +"Days are fixed. Extra days will be charged differently \r\n");
    	System.out.println( sf1 + " : Restaurant - Dinner and lunch for the first day and last day will be free of charge\r\n");
    	System.out.println("c) Price : RM 4900\r\n");

	    System.out.println("3) Package C - Single Ticket \r\n");
   	    System.out.println( p3 +"Days are fixed. Extra days will be charged differently \r\n");
   	    System.out.println(sf1 +" : Can purchase items for RM200 in particular shops for free - T&C Applied.\r\n");
   	    System.out.println("c) Price : RM 1890\r\n");
	 }
   
   void run() {
	   System.out.println("Disclaimer : Lost of personal belongings are under personal awareness - cruise authorities won't be responsible");
	}

}


