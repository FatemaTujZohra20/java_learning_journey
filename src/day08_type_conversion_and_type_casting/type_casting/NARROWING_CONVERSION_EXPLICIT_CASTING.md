# Java Narrowing Conversion / Explicit Casting

This project demonstrates **narrowing conversion** in Java using primitive data types.

Narrowing conversion means converting a value from a **wider primitive data type to a narrower primitive data type**.

Because narrowing conversion can cause **data loss, truncation, overflow, or loss of precision**, Java generally requires an **explicit cast**.

---

## 🎯 Learning Objectives

By completing these examples, you should be able to:

* Understand narrowing conversion
* Understand explicit casting
* Understand why Java does not automatically perform most narrowing conversions
* Use casting syntax correctly
* Identify possible data loss
* Understand truncation when converting floating-point values
* Understand overflow when converting to smaller integer types
* Understand precision loss when converting `double` to `float`

---

# 1. What Is Narrowing Conversion?

Narrowing conversion is the conversion of a value from a wider primitive type to a narrower primitive type.

For example:

```java
double price = 99.99;

int wholePrice = (int) price;
```

The conversion is:

```text
double
   ↓
 (int)
   ↓
 int
```

The result is:

```text
99.99 → 99
```

The decimal portion is discarded.

---

# 2. Why Is Explicit Casting Required?

Java does not automatically perform most narrowing conversions because information may be lost.

For example:

```java
double number = 25.75;

int result = (int) number;
```

The cast:

```java
(int)
```

explicitly tells Java:

> "I understand that this conversion may lose information, and I intentionally want to perform it."

Without the cast:

```java
int result = number;
```

the program will not compile.

---

# 3. Explicit Casting Syntax

The general syntax is:

```java
targetType variable = (targetType) sourceValue;
```

Example:

```java
double number = 50.99;

int result = (int) number;
```

Here:

* `double` → source type
* `(int)` → explicit cast
* `int` → target type
* `number` → source value

---

# 4. Examples in This Project

## Example 1: `double → int`

File:

```text
DoubleToInt.java
```

Example:

```java
double price = 99.99;

int wholePrice = (int) price;
```

Result:

```text
99
```

The decimal portion is discarded.

### Important

Casting does **not** round the value.

```text
99.99 → 99
```

It does not become:

```text
100
```

---

# 5. Example 2: `long → int`

File:

```text
LongToInt.java
```

Example:

```java
long population = 17000000000L;

int result = (int) population;
```

`long` is a 64-bit integer type, while `int` is a 32-bit integer type.

Therefore:

```text
long
 ↓
(int)
 ↓
int
```

If the `long` value is outside the `int` range, information can be lost.

### `int` range

```text
-2,147,483,648
        to
 2,147,483,647
```

Therefore, narrowing a very large `long` value to `int` can produce an unexpected result.

---

# 6. Example 3: `int → byte`

File:

```text
IntToByte.java
```

Example:

```java
int number = 130;

byte result = (byte) number;
```

A Java `byte` has a range of:

```text
-128 to 127
```

Since `130` is outside this range, narrowing can produce a different value.

For example:

```text
130 → -126
```

This happens because the value cannot be represented directly within the signed 8-bit `byte` range.

---

# 7. Example 4: `double → float`

File:

```text
DoubleToFloat.java
```

Example:

```java
double number = 123.456789123456;

float result = (float) number;
```

The conversion is:

```text
double
   ↓
(float)
   ↓
float
```

`double` provides more precision than `float`.

Therefore, converting:

```text
double → float
```

may result in precision loss.

Example:

```text
123.456789123456
```

may become approximately:

```text
123.45679
```

---

# 8. Widening vs Narrowing

Understanding the difference between widening and narrowing is essential.

| Feature                 | Widening                       | Narrowing               |
| ----------------------- | ------------------------------ | ----------------------- |
| Direction               | Narrower → Wider               | Wider → Narrower        |
| Usually automatic?      | Yes                            | No                      |
| Explicit cast required? | Usually no                     | Yes                     |
| Data loss possible?     | Sometimes precision can change | Yes                     |
| Example                 | `int → long`                   | `double → int`          |
| Syntax                  | `long x = number;`             | `int x = (int) number;` |

---

# 9. Common Examples

### Widening

```java
int number = 100;

long result = number;
```

Java performs the conversion automatically.

```text
int → long
```

### Narrowing

```java
long number = 100;

int result = (int) number;
```

Explicit casting is required.

```text
long → int
```

---

# 10. Important Types of Data Loss

Narrowing conversion can cause different kinds of information loss.

### 1. Truncation

Example:

```java
double number = 10.99;

int result = (int) number;
```

Result:

```text
10
```

The fractional portion is discarded.

---

### 2. Overflow / Range Loss

Example:

```java
int number = 130;

byte result = (byte) number;
```

Because `byte` can only represent:

```text
-128 to 127
```

the result cannot represent `130` directly.

---

### 3. Precision Loss

Example:

```java
double number = 123.456789123456;

float result = (float) number;
```

Some decimal precision may be lost.

---

# 11. Key Rule to Remember

```text
Widening:
smaller → wider
automatic in many primitive conversions

Narrowing:
wider → narrower
explicit casting required
possible data loss
```

A simple memory rule:

> **Widening is usually automatic; narrowing usually requires explicit casting.**

---

# 12. Concepts Practiced

This project practices:

* Primitive data types
* Type conversion
* Narrowing conversion
* Explicit casting
* Casting syntax
* `double → int`
* `long → int`
* `int → byte`
* `double → float`
* Truncation
* Integer range
* Overflow
* Floating-point precision
* Data loss

---

# 🚀 Learning Progression

This project is part of the Java type-conversion learning journey.

Recommended progression:

```text
Primitive Data Types
        ↓
Type Conversion
        ↓
Automatic / Widening Conversion
        ↓
Narrowing Conversion
        ↓
Explicit Casting
        ↓
Reference Type Casting
        ↓
Upcasting
        ↓
Downcasting
        ↓
Polymorphism
```

---

## 💡 Interview Definition

**What is narrowing conversion in Java?**

> Narrowing conversion is the process of converting a value from a wider primitive data type to a narrower primitive data type. Since the conversion may result in data loss, Java generally requires explicit casting.

Example:

```java
double value = 99.99;

int result = (int) value;
```

Output:

```text
99
```

The decimal portion is discarded.

---