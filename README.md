# ☕ Java Learning Journey

This repository documents my **daily Java learning progress** through hands-on coding, mini projects, and clear explanations.  
The goal of this repository is to build **strong Java fundamentals**, understand **object-oriented programming**, and develop **clean coding habits** through consistent practice.

---

## 🎯 Purpose of This Repository

- Practice Java concepts step by step
- Write clean, readable, and structured code
- Apply concepts through small programs and mini projects
- Track learning progress publicly on GitHub

This repository is organized **day-wise**, where each folder represents what I learned and implemented on that day.

---

## 📂 Repository Structure

```text
java_learning_journey/
├── README.md
└── src
    ├── day01_basics
    │   ├── HelloWorld.java
    │   └── README.md
    ├── day02_variables
    │   ├── README.md
    │   └── VariablesExample.java
    ├── day03_conditionals
    │   ├── GradeEvaluator.java
    │   ├── GuardClauseExample.java
    │   ├── InputValidation.java
    │   ├── LoanEligibility.java
    │   ├── LoginValidation.java
    │   ├── README.md
    │   └── SimpleIfElse.java
    ├── day04_loops
    │   ├── DoWhileLoopBasics.java
    │   ├── ForLoopBasics.java
    │   ├── LoopControlStatements.java
    │   ├── LoopOptimizations.java
    │   ├── NestedLoopsDemo.java
    │   ├── PatternProblems.java
    │   ├── README.md
    │   └── WhileLoopBasics.java
    ├── day05_arrays
    │   ├── ArrayBasics.java
    │   ├── ArrayOfObjectsInJava.java
    │   ├── ArrayOperations.java
    │   ├── ArrayTraversal.java
    │   ├── CollectionDemo.java
    │   ├── CommonArrayMistakes.java
    │   ├── LoopArrayRelationship.java
    │   ├── README.md
    │   └── TwoDArrayBasics.java
    ├── day06_Strings
    │   ├── Notes_on_String.java
    │   ├── README.md
    │   ├── StringBuilderVsString.java
    │   ├── StringComparison.java
    │   ├── StringCreation.java
    │   ├── StringImmutabilityDemo.java
    │   └── StringMethods.java
    ├── day07_OOP_Basic
    │   ├── Encapsulation
    │   │   ├── BankAccountDetails.java
    │   │   └── Main.java
    │   ├── Inheritance
    │   │   ├── Developer.java
    │   │   ├── Employee.java
    │   │   └── Main.java
    │   ├── OOP_Main.java
    │   ├── Polymorphism
    │   │   ├── Exercise01
    │   │   │   ├── Circle.java
    │   │   │   ├── Exercise01_Main.java
    │   │   │   ├── Rectangle.java
    │   │   │   └── Shape.java
    │   │   ├── Exercise02
    │   │   │   ├── Animal.java
    │   │   │   ├── Cat.java
    │   │   │   ├── Dog.java
    │   │   │   └── Exercise02_Main.java
    │   │   ├── Exercise03
    │   │   │   ├── Employee.java
    │   │   │   ├── Exercise03_Main.java
    │   │   │   ├── FullTimeEmployee.java
    │   │   │   └── PartTimeEmployee.java
    │   │   ├── Exercise04
    │   │   │   ├── CashPayment.java
    │   │   │   ├── CreditCardPayment.java
    │   │   │   ├── Exercise04_Main.java
    │   │   │   ├── Payment.java
    │   │   │   └── UPIPayment.java
    │   │   ├── Exercise05
    │   │   │   ├── EmailNotification.java
    │   │   │   ├── Exercise05_Main.java
    │   │   │   ├── Notification.java
    │   │   │   ├── NotificationService.java
    │   │   │   ├── PushNotification.java
    │   │   │   └── SMSNotification.java
    │   │   ├── Exercise06
    │   │   │   ├── BankAccount.java
    │   │   │   ├── CurrentAccount.java
    │   │   │   ├── Exercise06_Main.java
    │   │   │   └── SavingsAccount.java
    │   │   ├── Exercise07
    │   │   │   ├── Circle.java
    │   │   │   ├── Exercise07_Main.java
    │   │   │   ├── Shape.java
    │   │   │   ├── Square.java
    │   │   │   └── Triangle.java
    │   │   └── Exercise08
    │   │       ├── ConsoleLogger.java
    │   │       ├── DatabaseLogger.java
    │   │       ├── Exercise08_Main.java
    │   │       ├── FileLogger.java
    │   │       └── Logger.java
    │   ├── README.md
    │   └── Student.java
    ├── day08_Upcasting_Downcasting
    │   └── Upcasting_Downcasting.java
    ├── day09_Class
    │   └── InnerClass.java
    ├── day10_List
    │   ├── ListDemo.java
    │   ├── ListWithGenerics.java
    │   └── SortingList.java
    ├── day11_Generics
    │   ├── BoundedGenerics
    │   │   ├── BoundedGenericsDemo.java
    │   │   ├── Data.java
    │   │   └── NumberBox.java
    │   ├── BoundedTypeParameter2
    │   │   └── NumberCalculator.java
    │   ├── GenericClassExample
    │   │   └── Box.java
    │   ├── GenericClassSyntax.java
    │   ├── GenericMethodDemo.java
    │   ├── GenericUtilityMethod
    │   │   └── GenericPrinter.java
    │   ├── MultipleBounds
    │   │   └── MaxFinder.java
    │   ├── MultipleTypeParameters.java
    │   └── WildcardExample
    │       ├── PECSExample.java
    │       ├── README.md
    │       └── WildcardExample.java
    ├── day12_Lambda_Expression
    ├── day13_forEach
    ├── day14_Stream_API
    │   ├── CustomSorting.java
    │   ├── README.md
    │   ├── WithoutStream.java
    │   └── WithStream.java
    └── day15_ENUM
        ├── EnumBasic
        │   ├── Level.java
        │   └── Main.java
        ├── EnumInsideAclass
        │   └── EnumInsideAclass.java
        ├── EnumswithValues
        │   ├── Level2.java
        │   ├── Main.java
        │   └── README.md
        ├── LoopingandParsingEnums
        │   ├── Level3.java
        │   ├── LoopingAndParsingEnum.java
        │   └── README.md
        ├── polymorphicEnumPattern
        │   └── AdvancedPriorityDemo.java
        ├── professionalEnum
        │   ├── PriorityDemo.java
        │   └── README.md
        └── README.md

        
```
This repository is organized in a day-wise learning structure, where each folder represents a specific topic or learning day.

**Each folder may contain:**
- Java source files (`.java`)
- Small programs and practice exercises
- A short README explaining the concept (when applicable)

---

## 🧠 Topics Covered

- Java Basics & Syntax
- Variables and Data Types
- Conditional Statements
- Loops (upcoming)
- Methods and Input Handling  (upcoming)
- Object-Oriented Programming (OOP) (upcoming)
- Constructors and `this` keyword (upcoming)
- Inheritance & Polymorphism (upcoming)
- Abstraction & Interfaces (upcoming)
- Exception Handling (upcoming)
- Collections & File I/O (upcoming)

---

## 🛠 Tools Used

- Java (JDK)
- IntelliJ IDEA
- Git & GitHub
- Command Line

---

## 🚀 Learning Approach

- Learn → Code → Commit → Improve
- Focus on **understanding**, not memorization
- Refactor old code regularly
- Write explanations where possible

---

## 📌 Note

This repository reflects my **learning journey**, so the code improves over time as I learn better practices and concepts.

---

⭐ Feel free to explore the folders and follow along!
