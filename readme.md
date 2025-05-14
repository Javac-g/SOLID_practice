# SOLID Principles in Java

This repository provides simple and clean demonstrations of the SOLID principles using Java. Each principle is explained through minimal, easy-to-understand examples designed to help developers understand and apply these principles in real-world projects.

## Table of Contents

| Principle | Description |
|----------|-------------|
| Single Responsibility Principle (SRP) | A class should have one and only one reason to change |
| Open/Closed Principle (OCP)          | Software entities should be open for extension, but closed for modification |
| Liskov Substitution Principle (LSP)  | Subtypes must be substitutable for their base types |
| Interface Segregation Principle (ISP)| Clients should not be forced to depend on interfaces they do not use |
| Dependency Inversion Principle (DIP) | Depend on abstractions, not concretions |

---

## Single Responsibility Principle (SRP)

Each class should focus on a single responsibility. This ensures easier maintenance and reduces the chance of bugs when requirements change. If a class has multiple responsibilities, each one becomes a reason for change, leading to tightly coupled and hard-to-manage code.

---

## Open/Closed Principle (OCP)

Code should be easily extendable without modifying existing functionality. This is typically achieved by using interfaces or abstract classes and leveraging polymorphism. Modifying existing code can introduce bugs; instead, new functionality should be added via extensions.

---

## Liskov Substitution Principle (LSP)

Derived classes should be completely substitutable for their base classes without changing the desirable properties of the program. If a subclass changes expected behavior or throws unexpected exceptions, it violates this principle and introduces instability.

---

## Interface Segregation Principle (ISP)

Large, general-purpose interfaces should be split into more specific ones so that clients only need to know about the methods that are of interest to them. This leads to higher cohesion and lower coupling.

---

## Dependency Inversion Principle (DIP)

High-level modules should not depend on low-level modules. Both should depend on abstractions. This helps to reduce tight coupling and increases flexibility and testability. Abstractions should not depend on details; details should depend on abstractions.

---

## How to Use

1. Clone the repository
2. Navigate to the appropriate Java file demonstrating each principle
3. Compile and run the examples using any Java IDE or CLI

---

## Requirements

| Tool     | Version              |
|----------|----------------------|
| Java SDK| 8 or later            |
| IDE     | IntelliJ IDEA, Eclipse, or any editor |
| Build Tool | Not required, optional Gradle or Maven setup |

---

## License

MIT License. Free to use and distribute for educational and non-commercial purposes.

---

## Author

Your Name  
GitHub: https://github.com/Javac-g  

