# 📘 PECS Principle in Java Generics

In Java Generics, choosing between:
`? extends T` and `? super T` can be confusing.

To simplify this decision, Java developers follow a powerful rule:

`PECS → Producer Extends, Consumer Super`

Let’s understand this using fruit containers 🍎🍌

## 🔵 ? extends → Producer (We Only Take Out)

`Imagine:
List<? extends Fruit>
`
This is like a basket containing some type of fruit.

We don’t know exactly which fruit:

- It could be Apples 🍎

- It could be Bananas 🍌

- It could be Mangoes 🥭

But we are guaranteed:

👉 Everything inside is at least a Fruit.

What can we safely do?

✔ Take fruits out 

❌ Put fruits in

Why?

Because if it's actually a banana-only basket, putting an apple would break type safety.

Conclusion:

When a collection produces data (we read from it) → use `extends`.

## 🟢 ? super → Consumer (We Only Put In)

`Now imagine:
List<? super Apple>
`

This is like a container that can hold:

- Apples

- Fruits

- Food

- Objects

We don’t know the exact type, but we know:

👉 It can safely accept Apple.

What can you safely do?

✔ Put apples inside

❌ Assume what type comes out

Because when we retrieve something, it may just be an `Object`.

Conclusion

When a collection consumes data (We insert into it) → use `super`.


## 🎯 The Golden Rule

`Producer → extends`

`Consumer → super`

## 🔬 Technical Explanation
### 🔷 Upper Bounded Wildcard

`List<? extends Number>`


- Accepts: `List<Integer>` , `List<Double>` , etc.

- Safe for reading

- Not safe for inserting

Example:

    for (Number n : list) {
    System.out.println(n.doubleValue());
    }

We cannot safely add elements because the exact subtype is unknown.

### 🔷 Lower Bounded Wildcard

`List<? super Integer>`


- Accepts: `List<Integer>` , `List<Number>` , `List<Object>`

- Safe for inserting

- Not safe for reading specific subtype

Example:

`list.add(100);`


But:

`Integer x = list.get(0); // Not safe`


### 📊 Quick Comparison Table


| Wildcard | Safe For | Not Safe For |
|---|---|---|
| ? extends T | Reading as T | Adding elements |
| ? super T | Adding elements | Reading specific subtype |


## 🏗 Real-World Backend Analogy

Imagine a payment system:

### Processing payments (Read only)
    List<? extends Payment>


We are just reading and processing.

### Adding new credit card payments
    List<? super CreditCardPayment>


We are inserting new payment objects.

## ⚠ When NOT to Use Wildcards

If we need to both:

- Read specific subtype

- AND insert specific subtype

Then use proper generic type parameter:

    <T extends Number>


Instead of wildcards.

## 🚀 Final Mental Model

Think of collections as containers:

- If we only take from container → `extends`

- If we only put into container → `super`

That’s `PECS`.


### 📚 Summary

PECS helps maintain:

- Compile-time type safety

- Clean generic design

- Professional API contracts

Mastering PECS is essential for:

- Java Interviews

- Spring Framework understanding

- Writing reusable backend utilities

- Designing type-safe APIs

