package animals;


public class Animal {
	 
	
	void chk()
	 { System.out.println("In Animal class");
	 
	}
	
	
	void Can_move()
	{ try {
		if(this instanceof Oviparous) {
			 System.out.println("It can move");}
		else
			 System.out.println("It can't move");	 
			
		}
	catch(Exception ee) {System.out.println("Error occured");}	
		
		
		
	}
	
	
	

}