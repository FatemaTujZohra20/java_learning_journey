package day15_ENUM.EnumswithValues;

/**
 * An advanced Enum that associates a specific numeric score with each level.
 */
public enum Level2 {
    
    // 1. Define constants with specific values in parentheses
    LOW(10),
    MEDIUM(20),
    HIGH(30);
    
    // 2. Private field to store the value
    private final int level2Score;
    
    // 3. Constructor (must be private or package-private)
    // This runs once for each constant defined above.
    Level2(int level2Score) {
        this.level2Score = level2Score;
    }
    
    // 4. Getter method to access the value
    public int getLevel2Score() {
        return level2Score;
    }
}
