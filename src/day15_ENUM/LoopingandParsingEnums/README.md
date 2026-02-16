These two operations—`looping and parsing`—are the most common "real-world" tasks we will do with Enums,
especially when building menus or handling user input.

Java provides two `built-in methods` for every Enum to make this easy: `.values() and .valueOf()`.

Important Technical Details:

- **Case Sensitivity:** `Level3.valueOf("high") (lowercase)` will fail and throw an exception. 
The string must match the constant name exactly as written in the Enum.

- **Ordinality:** Every Enum has an `.ordinal() method` that returns its `position (starting at 0)`.

`Level3.LOW.ordinal() is 0`

`Level3.MEDIUM.ordinal() is 1`

    We should avoid using ordinals for logic; if we reorder our Enum constants later, our logic will break!
    Use the custom levelScore field we created earlier instead.

**Memory:** 

Using values() creates a new array every time we call it. In high-performance loops, 
it's better to call it once and store the result in a variable.


