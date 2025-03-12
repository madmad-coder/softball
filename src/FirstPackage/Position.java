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
    
    /*
    Planet(double mass, double radius) {
        this.mass = mass;
        this.radius = radius;
    }
    */
    private double mass() { return mass; }
    private double radius() { return radius; }

    // universal gravitational constant  (m3 kg-1 s-2)
    public static final double G = 6.67300E-11;

    double surfaceGravity() {
        return G * mass / (radius * radius);
    }
    double surfaceWeight(double otherMass) {
        return otherMass * surfaceGravity();
    }
    public static void main(String[] args) {
        if (args.length != 1) {
            System.err.println("Usage: java Planet <earth_weight>");
            System.exit(-1);
        }
        double earthWeight = Double.parseDouble(args[0]);
        double mass = earthWeight/EARTH.surfaceGravity();
        for (Planet p : Planet.values())
           System.out.printf("Your weight on %s is %f%n",
                             p, p.surfaceWeight(mass));
    }
}