# Tasca S1 08: Lambdas & Streams

## Description

This project was created for academic purposes as part of the IT ACADEMY Java & Spring specialization. The goal is to master the use of **Lambda Expressions**, **Functional Interfaces**, and the **Streams API** in Java to write more concise, readable, and functional code.

The project is structured into three levels of increasing complexity, ranging from basic filtering to complex data analysis of object collections.


## Techonologies

- **Java 17+**
- **Gradle**


## Project Structure

```
TascaS1.08/
├── build.gradle
└── src/
     ├── main/
     └── java/
         ├── first_level/
         │   ├── FirstLevelMethods.java
         │   ├── PiValue.java (Interface)
         │   ├── StringReverse.java (Interface)
         │   └── FirstLevelMain.java
         ├── second_level/
         │   ├── SecondLevelMethods.java
         │   ├── Filter.java (Interface)
         │   ├── Operation.java (Interface)
         │   └── SecondLevelMain.java
         └── third_level/
             ├── Student.java
             ├── StudentAnalyzer.java
             └── ThirdLevelMain.java
```


## Installation & Execution

1. **Clone the repository**:
   ```bash
   git clone https://github.com/isalvama/tascaS1.08.git

2. **Build the project**:
    ```bash
   ./gradlew build

3. **Run the exercises**: You can run the main classes for each level:
    ```bash
    ./gradlew run --args="first_level.FirstLevelMain"


## Concepts covered

- **Lambda Expressions**: Writing anonymous functions to implement functional interfaces.
- **Streams API**:
  - `filter()`: Selecting elements based on a predicate.
  - `map()`: Transforming elements (e.g., casting, replacing characters).
  - `sorted()`: Ordering elements using `Comparator.
  - `collect()`: Gathering results into lists or joining them into strings.
  - `forEach()`: Iterating over elements.
- **Functional Interfaces**: Using `@FunctionalInterface` to define single abstract method contracts.
- **Method References**: Using `System.out::println` or `Integer::sum as shorthand for lambdas.
- **Modern Logic**: Reversing strings and performing arithmetic operations through functional programming.


## First Level: Basic Streams and Interfaces

### String Filtering and Transformation

The `FirstLevelMethods` class demonstrates the fundamentals of the Streams API:
- **Filtering**: Methods to find strings containing the letter 'o' or matching a specific length (5 letters).
- **Iteration**: Contrasting standard lambdas `(str -> System.out.println(str))` with Method References `(System.out::println)`.
- **Sorting**: Implementing custom sorting logic based on string length, both in ascending and descending order, while handling a mixed `List<Object> through filtering and casting.

### Functional Interfaces

This level introduces custom interfaces:
- **`PiValue`**: A parameterless interface that returns a constant `double.
- **`StringReverse`**: A lambda implementation that utilizes `StringBuffer` to reverse a given string.


## Second Level: Complex Filtering and Operations

### Advanced Stream Mapping

- **`getStringOfInts`**: Transforms a list of integers into a single comma-separated string. It uses a ternary operator within `map()` to prefix numbers with 'e' (even) or 'o' (odd) and joins them using `Collectors.joining()`.
- **Name Filtering**: Case-insensitive filtering of names starting with a specific letter.

### Dynamic Operations and Filters

- **`Operation` Interface**: Used to implement a basic calculator. It demonstrates the power of method references by assigning `Integer::sum` or `Integer::divideUnsigned` directly to an interface instance.
- **`Filter` Interface**: A highly flexible interface used to create various list processors:
  - Sorting alphabetically by the first character. 
  - Conditional sorting (placing words starting with 'e' first). 
  - Character replacement (e.g., replacing 'a' with '4' in all strings).


## Third Level: Data Analysis with Streams

This level focuses on a real-world scenario: managing a list of `Student objects.

### StudentAnalyzer class

This class encapsulates complex data processing logic using the Streams API:
- **Comprehensive Iteration**: Printing names and ages of all students.
- **Conditional Filtering**:
  - Students whose names start with the letter 'a'. 
  - Students with a passing grade (>= 5). 
  - Students with a passing grade who are not enrolled in the PHP course. 
  - Adult students (>= 18 years) enrolled specifically in the Java course.

### Main Execution

The `ThirdLevelMain` class initializes a collection of 10 students with different ages, courses, and grades. The `StudentAnalyzer` then processes this data, illustrating how Streams can replace complex nested loops and `if` statements with clean, declarative code.