package animals;



public class Earth {
	public static int sum(int ...a){
		    int sum=0;
		    for(int i : a){
		        sum += i;
		    }
		    return sum;}
		    

	public static void main(String[] args) {
	
		Animal b= new Bird() ;
		Animal i = new Insects();
		Animal l= new Land();
		Animal w= new Water();
		
		
		 System.out.println(b instanceof Mamal);
		 System.out.println(i instanceof Animal);
		 System.out.println(l instanceof Oviparous);
		 System.out.println(w instanceof Animal);
		 
	    b.Can_move();
	    i.Can_move();
	   l.Can_move();
	   w.Can_move();
	    
	b.chk();
	w.chk();

	 int s=sum(1,2);
	System.out.println(s);
		

	}

}
