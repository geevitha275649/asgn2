package asgn2;

public class Passenger {
	
		String firstname,lastname, address, contact,email ,id;
		int age;
		
	public Passenger(String firstname, String lastname,String address,String email, int age , String Id) {
		    this.firstname =  firstname;
		    this.lastname = lastname;
		    this.address = address;
		    this.email = email;
		    this.age = age;
		    this.id = Id;
		    
	}		    
		    
		    public void setfirstname(String firstname) {
		    	this.firstname = firstname;
		    }	    
		    public String getfirstname() {
		    	return firstname;   	
		    }
		    public void setKey(String lastname) {
		    	this.lastname=lastname;
		    }
		  	public String getlastname() {
		  		return lastname;
		    }
		  	public void setAddress(String address) {
			    this.address = address;
			}
			public String getAddress() {
			    return address;   	
			}
			public void setEmail(String email) {
			    this.email=email;
			}
			public String getEmail() {
			  	return email;
			}
			public void setAge(int age) {
			    this.age=age;
			}
			public int getAge() {
			  	return age;
			} 	
			public void setId(String Id) {
			    this.id=Id;
			}
			public String getId() {
			  	return id;
		    }
			
			//defining a method for POLYMORPHISM
			void run() {
				
				System.out.println("Disclaimer : Lost of personal belongings are under personal awareness - cruise authorities won't be responsible");
			}	
	}

