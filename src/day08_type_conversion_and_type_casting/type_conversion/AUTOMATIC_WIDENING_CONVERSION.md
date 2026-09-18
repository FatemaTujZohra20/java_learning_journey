# Java Automatic Widening Conversion

This project demonstrates **automatic widening conversion** in Java using primitive data types.

The purpose of this practice is to understand how Java automatically converts a value from one compatible primitive type to another without requiring an explicit cast.

---

## What is Type Conversion?

**Type conversion** is the process of converting a value from one data type to another compatible data type.

For example:

```java
int number = 25;
double value = number;
```

Java automatically converts the `int` value into a `double` value.

```text
int → double
```

---

## What is Widening Conversion?

**Widening conversion** occurs when a value is converted from a type with a smaller range/representation to a type with a larger range/representation.

Java can perform many widening primitive conversions automatically.

For example:

```java
int number = 100;
long value = number;
```

No explicit cast is required.

---

## Common Widening Conversions

The commonly taught widening primitive conversion paths include:

```text
byte → short → int → long → float → double
```

There are also conversions involving `char`, such as:

```text
char → int → long → float → double
```

---

## Examples in This Project

### 1. int → long

```java
int number = 1000;
long convertedNumber = number;
```

Java automatically converts the `int` value to `long`.

---

### 2. int → double

```java
int number = 25;
double convertedNumber = number;
```

The value becomes:

```text
25 → 25.0
```

---

### 3. float → double

```java
float temperature = 36.5f;
double convertedTemperature = temperature;
```

Java automatically converts the `float` value to `double`.

---

### 4. char → int

```java
char letter = 'A';
int numericValue = letter;
```

The character `'A'` is converted to its Unicode numeric value:

```text
'A' → 65
```

---

## Why Does Java Allow Automatic Widening?

Java allows these conversions because the target type can represent the source type's values within the relevant conversion rules.

For example:

```java
int number = 100;
long value = number;
```

An `int` value can be converted to `long` without requiring the programmer to explicitly request the conversion.

Therefore:

```java
long value = number;
```

is valid.

---

## No Explicit Cast Required

With widening conversion, you generally do not need to write a cast.

### Preferred:

```java
int number = 25;
double value = number;
```

### Unnecessary:

```java
int number = 25;
double value = (double) number;
```

The second version is valid, but the explicit cast is unnecessary because Java already performs the widening conversion automatically.

---

## Important Difference: Conversion vs Casting

### Automatic widening conversion

```java
int number = 25;
double value = number;
```

Java automatically performs the conversion.

### Explicit casting

```java
double number = 25.75;
int value = (int) number;
```

Here the programmer explicitly requests a conversion using:

```java
(int)
```

The second concept will be practiced separately in the type-casting exercises.

---

## Important Note About `float`

Java treats decimal literals as `double` by default.

Therefore:

```java
float price = 25.5;
```

does not compile.

You need:

```java
float price = 25.5f;
```

The `f` suffix tells Java that the literal is a `float`.

---

## Important Note About Precision

Widening does not always mean that every source value will gain decimal precision in a mathematically meaningful way.

For example, `float` has less precision than `double`.

```text
float  → approximately 6–7 decimal digits
double → approximately 15–16 decimal digits
```

Converting a `float` to a `double` does not recover precision that was already lost when the value was represented as a `float`.

---

## Key Concepts Practiced

* Primitive data types
* Type conversion
* Widening conversion
* Automatic conversion
* `byte`
* `short`
* `int`
* `long`
* `float`
* `double`
* `char`
* Unicode character values
* Floating-point literals
* `f` suffix
* Numeric representation

---

## Mental Model

Remember:

```text
WIDENING CONVERSION

Smaller / narrower type
          ↓
    Automatic conversion
          ↓
Larger / wider type
```

Examples:

```text
int → long
int → double
float → double
char → int
```

---

## Learning Goal

By completing these examples, to be able to explain:

1. What type conversion means.
2. What widening conversion means.
3. Why Java performs widening conversions automatically.
4. When an explicit cast is unnecessary.
5. How `char` can be converted to its numeric Unicode value.
6. Why `float` literals require the `f` suffix.
7. The difference between automatic conversion and explicit casting.

---

## Summary

```text
Type Conversion
       │
       └── Widening Conversion
                │
                ├── int → long
                ├── int → double
                ├── float → double
                └── char → int
```

### Core Rule

> **Widening primitive conversion is generally automatic in Java, so an explicit cast is not required.**
