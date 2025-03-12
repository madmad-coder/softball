public enum Position {
    PITCHER ( "P", "Pitcher"),
    CACTHER ("C", "Cacther"),
    FIRST_BASEMAN  ("1B", "First baseman"),
    SECOND_BASEMAN  ( "2B", "Second baseman"),
    THIRD_BASEMAN ("3B", "Third baseman"),
    SHORTSTOP ("SS", "Shortstop"),
   LEFT_FIELD  ("LF", "Left Field"),
   RIGHT_FIELD ("RF", "Right Field"),
   CENTER_FIELD ("CF", " Center Field),
   DHitter ("DH" "D_Hitter);

    private final String abbr;  
    private final String fullName;
    
    Position (abbr, fullName) {
    this.abbr=abbr;
    this.fullName=fullName;}
    
   
    public static void main(String[] args) {
        for (Position p : Planet.values()) {
           System.out.printf(p);
    }
}
