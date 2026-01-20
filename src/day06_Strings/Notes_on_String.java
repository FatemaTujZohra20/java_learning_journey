package day06_Strings;

public class Notes_on_String {
    public static void main(String[] args) {

        String str = """
                            This is only for my study purpose later....
                -------------------------------------------------------------------------------
                
                 Strings & Immutability (Java)
        
                This module explains why Strings behave the way they do in Java, focusing on immutability, memory optimization, performance, and thread safety.
        
                📌 Why String is Immutable?
                🔹 Definition
                -------------------------------------------------------------------------------
        
                A String in Java is immutable, meaning once created, its value cannot be changed.
        
                String s = "Java";
                s.concat(" Programming"); // creates a new String
        
                🔹 Reasons for Immutability
                -------------------------------------------------------------------------------
                -------------------------------------------------------------------------------
                
                Security
        
                Strings are used in:
        
                Database URLs
        
                File paths
        
                Network connections
        
                Passwords
        
                If Strings were mutable, malicious code could modify critical values at runtime.
        
                ✅ Immutability prevents this risk.
                -------------------------------------------------------------------------------
                
        
                String Pool Optimization
                -------------------------------------------------------------------------------
                
        
                Java reuses String literals from the String Pool.
        
                String a = "Java";
                String b = "Java";
        
        
                Both a and b refer to the same object.
        
                        If Strings were mutable, changing one reference would affect all others — which is unsafe.
        
                Thread Safety
                -------------------------------------------------------------------------------
                
        
                Immutable objects:
        
                Cannot change state
        
                Are inherently thread-safe
        
                Multiple threads can safely share the same String without synchronization.
        
                HashCode Caching
                -------------------------------------------------------------------------------
                
        
                Strings are frequently used as keys in:
        
                HashMap
        
                        HashSet
        
                Because Strings never change, their hashCode() can be cached for faster lookups.
        
                ✅ One-Line Summary
                -------------------------------------------------------------------------------
                
        
                String is immutable to ensure security, memory efficiency, thread safety, and performance.
        
                📌 What is String Pool?
                🔹 Definition
                -------------------------------------------------------------------------------
                
        
                The String Pool is a special memory area inside the Heap that stores String literals.
        
                🔹 Why String Pool Exists
                -------------------------------------------------------------------------------
                
        
                Avoid duplicate String objects
        
                Reduce memory usage
        
                Improve performance
        
                🔹 How It Works
                -------------------------------------------------------------------------------
                
                String s1 = "Java";
                String s2 = "Java";
        
        
                ✔ Java checks the pool
                ✔ Finds "Java" already exists
                ✔ Reuses the same object
        
                String s3 = new String("Java");
        
                
                ❌ Creates a new object in Heap (outside pool)
        
                🔹 Memory Representation
                -------------------------------------------------------------------------------
                
                String Pool:        Heap:
                "Java"           "Java"
                 ↑ ↑               ↑
                s1 s2              s3
        
                ✅ One-Line Summary
                -------------------------------------------------------------------------------
                
        
                String Pool stores and reuses String literals to optimize memory usage.
        
                📌 Difference between String, StringBuilder, StringBuffer
                -------------------------------------------------------------------------------
                
                Feature	String	StringBuilder	StringBuffer
                Mutability	❌ Immutable	✅ Mutable	✅ Mutable
                Thread Safety	✅ Yes	❌ No	✅ Yes
                Performance	❌ Slow in loops	✅ Fast	⚠ Slower
                Synchronization	N/A	❌ No	✅ Yes
                Use Case	Fixed text	Single-threaded modifications	Multi-threaded modifications
                
                
                🔹 Example
                -------------------------------------------------------------------------------
                
                // String (creates new object)
                                s = s + "Java";
                
                // StringBuilder (same object modified)
                        sb.append("Java");
                
                // StringBuffer (thread-safe modification)
                        sb.append("Java");
        
                    ✅ Rule of Thumb
                -------------------------------------------------------------------------------
                    
        
                String → Read-only text
        
                StringBuilder → Fast & mutable
        
                StringBuffer → Thread-safe mutable
        
                        📌 How equals() Works for String
                        🔹 equals() vs ==
                        Comparison	Meaning
                -------------------------------------------------------------------------------
                        
                                ==	Compares memory reference
                        equals()	Compares content
                
                        🔹 Internal Working of String.equals()
                -------------------------------------------------------------------------------
                        
                public boolean equals(Object obj) {
                    if (this == obj) return true;
                    if (obj instanceof String) {
                        String other = (String) obj;
                        if (this.length() != other.length()) return false;
                        for (int i = 0; i < length; i++) {
                            if (this.charAt(i) != other.charAt(i))
                                return false;
                        }
                        return true;
                    }
                    return false;
                }
                -------------------------------------------------------------------------------
                
        
                ✔ Reference check
                ✔ Type check
                ✔ Character-by-character comparison
        
                    ✅ One-Line Summary
                -------------------------------------------------------------------------------
                    
        
                String’s equals() method compares content, not memory location.
        
                                📌 Why Strings are Thread-Safe?
                                🔹 Core Reason
                -------------------------------------------------------------------------------
                                
        
                Strings are immutable, so their state cannot be changed after creation.
        
                        🔹 Multi-Thread Scenario
                -------------------------------------------------------------------------------
                        
                String s = "Java";
        
        
                Thread 1 reads "Java"
        
                Thread 2 reads "Java"
        
                            ✔ No modification
                            ✔ No race condition
                            ✔ No synchronization needed
        
                ❌ If Strings Were Mutable
                -------------------------------------------------------------------------------
        
                One thread could modify while another reads
        
                Leads to inconsistent data and bugs
        
                ✅ One-Line Summary
                ---------------------------------
        
                Strings are thread-safe because immutability prevents shared-state modification.
        
                🔑 Key Takeaways (Remember Forever)
                ---------------------------------------------------------
        
                Strings are immutable for security and performance
        
                String Pool prevents duplicate literals
        
                Use equals() for content comparison
        
                Use StringBuilder for frequent modifications
        
                Immutability makes Strings thread-safe
        
                🏁 Conclusion
                ---------------------------
        
                Understanding String immutability, String Pool, and performance trade-offs is essential for:
        
                Writing efficient Java code
        
                Avoiding memory issues
        
                """;
        System.out.println(str);
    }
}
