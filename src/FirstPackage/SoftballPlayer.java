package FirstPackage;

public class SoftballPlayer {
	String fn;
	String ln;
	String jerseyNum;

	public SoftballPlayer(String fn, String ln, String jerseyNum) {
		this.fn = fn;
		this.ln = ln;
		this.jerseyNum = jerseyNum;

	}

	public String toString() {

		return fn + " " + ln + " " + jerseyNum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("My First Program");
			
		SoftballPlayer catcher = new SoftballPlayer("Adley", "Rustchman", "35");
		System.out.println(catcher);
		
		SoftballPlayer leftfielder= new SoftballPlayer ("Cedric",  "Mullins" , "31");
		System.out.println(leftfielder);
		
		SoftballPlayer pitcher = new SoftballPlayer("Fred", "Fastball", "99");
		System.out.println(pitcher);
		
		SoftballPlayer rightfielder= new SoftballPlayer ("Tlyer", "O'Neil", "24");
		
		SoftballPlayer centerfielder= new SoftballPlayer ("Colton", "Cowser", "17");
		
		SoftballPlayer firstbaseman= new SoftballPlayer ( "Ryan", "Mountcastle", "06");
		
		SoftballPlayer secondbaseman= new SoftballPlayer ("Jackson" , "Holiday", "07");
		
		SoftballPlayer thirdbaseman= new SoftballPlayer ("Ramon", "Urias", "29");
		
		SoftballPlayer shortstop= new SoftballPlayer ("Gunnar", "Herderson", "02");
		
		SoftballPlayer dhitter= new SoftballPlayer ("David" ,"Oritz", "34");
		
		SoftballPlayer[] roster = new SoftballPlayer [10];
		roster [0]  = catcher;
		roster [1]= pitcher;
		roster [2]= leftfielder;
		roster [3]= rightfielder;
		roster [4]= centerfielder;
		roster [5]=firstbaseman;
		roster [6]= secondbaseman;
		roster [7]= thirdbaseman;
		roster [8]= shortstop;
		roster [9]= dhitter;
		System.out.println("array size is " + roster.length);
		
		for (int i=0; i < roster.length; i++) {
			  System.out.println(roster[i]);
			}
				
	}

}
