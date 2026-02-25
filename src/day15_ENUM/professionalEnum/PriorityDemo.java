package day15_ENUM.professionalEnum;

/**
 * ===============================================
 *      Priority Enum Demonstration
 * ===============================================
 * ...
 * This example demonstrates :
 * - Enum with fields
 * - constructor inside enum
 * - Getter methods
 * - Using enum in business logic
 * ...
 * Each enum constant behaves like an object
 */

public class PriorityDemo {
    
    /**
     * Enum representing task priority levels.
     * ...
     * Each constant has:
     * - numeric level (int)
     * - description (String)
     */
    public enum Priority {
        
        // Enum constants (objects of type Priority)
        LOW(1, "Low Priority"),
        MEDIUM(2, "Medium Priority"),
        HIGH(3, "High Priority");
        
        // Instance variables
        private final int level;
        private final String description;
        
        /**
         * Private constructor
         * Called once for each constant.
         */
        Priority (int level, String description) {
            this.level = level;
            this.description = description;
        }
        
        // Getter for level
        public int getLevel () {
            return level;
        }
        
        // Getter for description
        public String getDescription () {
            return description;
        }
        
        /*
         * Business logic method inside enum
         */
        public boolean isHighPriority() {
            return this == HIGH;
        }
        
    }
    
    /**
     * Main method to test enum behavior
     */
    public static void main (String[] args) {
        
        // Creating enum references
        Priority taskPriority = Priority.HIGH;
        
        // Accessing fields
        System.out.println("Priority Name: " + taskPriority);
        System.out.println("Priority Level: " + taskPriority.getLevel());
        System.out.println("Priority Description: " + taskPriority.getDescription());
        
        // Using enum method
        if (taskPriority.isHighPriority()) {
            System.out.println("Immediate attention required!!!");
        }
        
        // Looping through all enum constants
        System.out.println("\nAll Available Priorities: ");
        for (Priority priority : Priority.values()) {
            System.out.println(
                    priority + " -> Level: " + priority.getLevel()
                            + ",  Description: " + priority.getDescription());
        }
    }


}
