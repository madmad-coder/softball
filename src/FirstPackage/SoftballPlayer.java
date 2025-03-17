package FirstPackage;

public class SoftballPlayer {
	String fn;
	String ln;
	String jerseyNum;
	Position position;
	
	/*
	 * Modify the constructor
	 * Modify the toString
	 * Modify main to print the position abbreviation
	 */

	public SoftballPlayer(String fn, String ln, String jerseyNum, Position pos) {
		this.fn = fn;
		this.ln = ln;
		this.jerseyNum = jerseyNum;
		this.position = pos;
		
	
	

	}

	public String toString() {

		return fn + " " + ln + " " + jerseyNum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("My First Program");
		SoftballPlayer[] roster = new SoftballPlayer [10];
		
		
		SoftballPlayer player = new SoftballPlayer("Adley", "Rustchman", "35", Position.CACTHER);
		roster [0]  = player;
		System.out.println(player);
		
		
		player= new SoftballPlayer ("Cedric",  "Mullins" , "31" , Position.LEFT_FIELD);
		roster [1]  = player;
		System.out.println(player);
		
		
		player = new SoftballPlayer("Fred", "Fastball", "99", Position.PITCHER );
		roster [2]  = player;
		System.out.println(player);
		
		 player= new SoftballPlayer ("Tlyer", "O'Neil", "24", Position.RIGHT_FIELD);
		 roster [3]  = player;
		 System.out.println(player);
		
		 player= new SoftballPlayer ("Colton", "Cowser", "17", Position.CENTER_FIELD);
		 roster [4]  = player;
		 System.out.println(player);
		 
		 player= new SoftballPlayer ( "Ryan", "Mountcastle", "06", Position.FIRST_BASEMAN);
		 roster [5]  = player;
		 System.out.println(player);
		 
		 player= new SoftballPlayer ("Jackson" , "Holiday", "07", Position.SECOND_BASEMAN);
		 roster [6]  = player;
		 System.out.println(player);
		
		 player= new SoftballPlayer ("Ramon", "Urias", "29", Position.THIRD_BASEMAN);
		 roster [7]  = player;
		 System.out.println(player);
		
		 player= new SoftballPlayer ("Gunnar", "Herderson", "02", Position.SHORTSTOP);
		 roster [8]  = player;
		 System.out.println(player);
		
		 player= new SoftballPlayer ("David" ,"Oritz", "34", Position.DHitter);
		 roster [9]  = player;
		 System.out.println(player);
		
	
		
	System.out.println("\narray size is " + roster.length + "\n");
		
		for (int i=0; i < roster.length; i++) {
			  System.out.println(roster[i]);
			}
				
	}

}
