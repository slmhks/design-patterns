# Design Patterns

This project has short examples that implement an understandable way to design patterns described in the book "Design Patterns: Elements of Reusable Object-Oriented Software" by the Gang of Four, which details 23 classic software design patterns categorized in three groups:

* Creational Patterns
They focus on the abstraction of the object instantiation mechanisms, ensuring that objects are created in a way that is suited to the specific context or need. These patterns help to control which objects are created, how many and under which conditions.
* Structural Patterns
They deal with the composition of classes and objects to form larger and more complex structures. They focus on how objects are organized and interact with each other, ensuring flexibility and efficiency.

* Behavioral Patterns
They deal with communication between objects and how responsibilities are distributed. The focus on the interaction between objects, ensuring flexibility and proper responsibility management among cooperating objects.

**IMPORTANT: Read the last section to know how to run the applications to test each pattern.**

## Creational Patterns

**1. Abstract Factory**
This pattern focuses on creating entire product families without specifying their concrete classes. It is known as the "factory of factories". What are the benefits of this pattern? It relies on abstract interfaces instead of concrete classes (they are isolated). The concrete factory only appears once in the application, where it's instantiated and, in case we need to change the factory, only the concrete class is updated (no more changes to be done).

**2. Builder**
This pattern focuses on the flexible creation of an object. It prevents the classes from having complex constructors by setting multiple optional parameters in a flexible, sequential and readable. These two latter characteristics are related because a builder allows to manually set the actions in order (chaining) so that the source code can be easily read and understood. Additionally, before creating and returning an object, validations can be done to ensure that the parameters are valid. Finally, immutability is also accomplished (the domain class has no setter methods and, once the values are assigned, they cannot be changed.

**3. Prototype**
This pattern is used to create a clone of an object in order to prevent the tedious creation and setting of fields. It is helpful when an object has several fields and we need to avoid repeating setting them every time we instantiate it. The concept involves having a *prototype*, which can be used later as a template that can be slightly modified and be ready for use. The new objects, results of cloning, can be customized without impacting the original prototype. It is important to highlight that concepts like "shallow copy" or "deep copy" must be mastered to have a better implementation of this pattern.

## How to test each pattern
Each pattern has a <pattern>Application.java class, for example: BuilderApplication or AbstractFactory. Just run each of them and check the consoles. The printed lines might not be correctly defined in terms of the business solutions tested because the classes were created without much expertise about each domain.