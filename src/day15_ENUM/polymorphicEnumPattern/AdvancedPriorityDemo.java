package day15_ENUM.polymorphicEnumPattern;

/**
 * ============================================
 * Advanced Enum Design using Abstract Methods
 * ============================================
 *
 * This example demonstrates:
 * - Constant-specific method implementation
 * - Polymorphism inside enum
 * - Clean business logic design
 */
public class AdvancedPriorityDemo {
    
    public enum AdvancedPriority {
        
        // Enum constants (Objects of type Priority)
        LOW(1, "Low Priority") {
            @Override
            public boolean requiresImmediateAction() {
                return false;
            }
        },
        
        MEDIUM(2, "Medium Priority") {
            @Override
            public boolean requiresImmediateAction() {
                return false;
            }
        },
        
        HIGH(3, "High Priority") {
            @Override
            public boolean requiresImmediateAction() {
                return true;
            }
        };
        
        private final int level;
        private final String description;
        
        AdvancedPriority (int level, String description) {
            this.level = level;
            this.description = description;
        }
        
        // Getter for level
        public int getLevel() {
            return level;
        }
        
        // Getter for description
        public String getDescription () {
            return description;
        }
        
        /*
         * Abstract method.
         * Each constant MUST implement this...
         */
        public abstract boolean requiresImmediateAction();
        
    }
    
    
    public static void main(String[] args) {
        
        // Creating enum references
        AdvancedPriority taskAdvancedPriority = AdvancedPriority.HIGH;
        
        // Accessing Fields
        System.out.println("Priority Name: " + taskAdvancedPriority);
        System.out.println("Priority Level: " + taskAdvancedPriority.getLevel());
        System.out.println("Priority Description: " + taskAdvancedPriority.getDescription());
        
        // Using advanced enum business logic
        if (taskAdvancedPriority.requiresImmediateAction()) {
            System.out.println("Immediate Action Required!!!");
        } else {
            System.out.println("Normal processing...");
        }
        
        // Looping through all enum constants
        System.out.println("\nAll Available Priorities: ");
        for (AdvancedPriority advancedPriority : AdvancedPriority.values()) {
            System.out.println(
                    advancedPriority + " -> Level: " + advancedPriority.getLevel()
                            + ", Description: " + advancedPriority.getDescription());
        }
    }
}
