package day15_ENUM.EnumswithValues;

public class Main {
    public static void main (String[] args) {
        
        // Accessing the Enum constant
        Level2 myVar = Level2.HIGH;
        
        // Accessing the data associated with that constant
        System.out.println("Selected: " + myVar);
        System.out.println("Point Value: " + myVar.getLevel2Score());
        
        // You can also use them in calculations
        int doubleScore = myVar.getLevel2Score() * 2;
        System.out.println("Double Power: " + doubleScore);
        
    }
}
