# Java Type Conversion

This practice project demonstrates **type conversion in Java**, with a focus on automatic primitive type conversion and widening conversions.

## What is Type Conversion?

Type conversion is the process of converting a value from one data type to another compatible data type.

For example:

```java
int number = 25;
double value = number;
```

Java automatically converts the `int` value into a `double` value.

```text
int → double
```

## Widening Conversion

Widening conversion occurs when a value is converted from a type with a smaller range to a type with a larger range.

Common examples include:

```text
byte → short
short → int
int → long
int → float
long → float
float → double
```

Widening primitive conversions generally happen automatically.

## Examples in This Project

### 1. int → double

```java
int number = 25;
double convertedNumber = number;
```

### 2. int → long

```java
int employeeId = 1001;
long convertedId = employeeId;
```

### 3. long → float

```java
long distance = 150000L;
float convertedDistance = distance;
```

### 4. float → double

```java
float temperature = 36.5f;
double convertedTemperature = temperature;
```

## Key Concepts Practiced

* Primitive data types
* Type conversion
* Widening conversion
* Automatic conversion
* Numeric data types
* `int`
* `long`
* `float`
* `double`

## Important Rule

```text
Widening conversion → usually automatic
```

Example:

```java
int number = 10;
double value = number;
```

No explicit cast is required.

## Learning Goal

The goal of this practice is to understand how Java automatically converts compatible primitive types and why widening conversions are generally allowed without explicit casting.
