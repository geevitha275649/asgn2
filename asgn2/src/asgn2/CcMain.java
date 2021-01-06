package asgn2;
import java.util.Scanner;

public class CcMain {

	public static void main(String[] args) {
		
				Passenger p = new Passenger("Geevitha" ,"Batumalai","Teluk Intan, Perak","geevitha.gb@gmail.com",22,"981028080000");
				System.out.println("1) Passenger Detail \r\n ");
				System.out.println("First Name       :" + p.getfirstname());
				System.out.println("Last  Name       :" + p.getlastname());
				System.out.println("IC / Passport    :" + p.getId());
				System.out.println("Age              :" + p.getAge());
				System.out.println("Permanent Address:" + p.getAddress());
				System.out.println("Email Name       :" + p.getEmail());
				
				Scanner scan =  new Scanner (System.in);
				System.out.println ("Contact number   :");
		        int n = scan.nextInt();
				
		        System.out.println("------------------------------------------------------------------------------------------------ ");
				
				TravelSchedule ts = new TravelSchedule("First Class","Second Class", "Third Class");
				System.out.println("\n2) Travel Schedule of the Cruise \r\n ");
				System.out.println("                         Available          Boarding Point            Destination Point                   Class\r\n");
				System.out.println("Silver Cruise       Jan-Mar & July-Sept       Jamaica                Papua New Gunea Sea                "          + ts.getthirdclass());
				System.out.println("Golden Star Cruise   Mac-May & Oct-Dec         Sydney           Netherland / Cambodia / Atlantic       " + ts.getsecondclass());
				System.out.println("Premium Cruise       All time Available       Washington            Canada / Australia / Sydney         "    + ts.getfirstclass());
				System.out.println("\nNote: All cruise are available on specified months but cruises must be booked a month earlier and only at weekdays.");
				System.out.println("       Weekend Bookings will be terminated. Thank you.\r\n");
			    ts.run();
				
			    System.out.println("------------------------------------------------------------------------------------------------ ");
				
			  
		        
			    Package pk = new Package();
				System.out.println("\n3) Cruise Packages\r\n");
				
				packages obj =new packages();
		        obj.typePackages();
		        System.out.println("\n");
				pk.packages();
				ts.run();
	        }
	          
	
		}