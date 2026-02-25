## 1. What is `this` inside an enum?

In an enum each constant is an **object**.

So when I write: 

`Priority taskPriority = Priority.HIGH;`

`taskPriority` refers to an object of type `Priority`.

Inside the `enum` method:

`return this == HIGH;`

👉 `this` means:

The current enum object on which the method is called.

## 2. What does `this == HIGH` mean?

It checks:

Is the current object equal to the constant `HIGH`?

Since enums are singletons (only one instance per constant), using == is perfectly safe.

So this:

`this == HIGH`

means:

- If the current enum constant is HIGH → return `true`

Otherwise →  
- return `false`
