package day15_ENUM.EnumBasic;

/**
 * Think of an Enum (short for "enumeration") as a way to create your own data type that can only hold
 * a specific set of predefined values. It’s perfect for things like days of the week, colors,
 * or—in your case—fixed levels of intensity.
 * An Enum represents a group of constants (unchangeable variables).
 * Use enums when you have values that you know aren't going to change,
 * like month days, colors, or difficulty levels.
 */
public enum Level {
    
    /** Represents the minimum threshold. */
    LOW,
    
    /** Represents the standard or average threshold. */
    MEDIUM,
    
    /** Represents the maximum threshold. */
    HIGH
}
