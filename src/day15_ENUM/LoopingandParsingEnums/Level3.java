package day15_ENUM.LoopingandParsingEnums;

public enum Level3 {
    
    // 1. Define constants with specific values in parentheses
    LOW(30),
    MEDIUM(40),
    HIGH(50);
    
    // 2. Private field to store the value
    private final int levelScore;
    
    // 3. Constructor (must be private or package-private)
    // This runs once for each constant defined above.
    Level3(int score) {
        this.levelScore = score;
    }
    
    // 4. Getter method to access the value
    public int getLevelScore() {
        return this.levelScore;
    }
}
