# Java LeetCode Solutions

This project contains Java solutions to various LeetCode problems, organized by problem number. It uses Maven for build automation and includes unit tests for each solution.

## Project Structure

```
pom.xml
src/
  main/java/com/practice/leetcode/   # LeetCode solution classes
  test/java/com/practice/leetcode/   # JUnit test classes for solutions
target/                              # Compiled classes and build output
```

## Getting Started

### Prerequisites
- Java 8 or higher
- Maven

### Build the Project
```
mvn clean compile
```

### Run Tests
```
mvn test
```

## Adding a New LeetCode Solution
1. Add your solution as a new Java class in `src/main/java/com/practice/leetcode/` (e.g., `LeetcodeXXXX.java`).
2. Add corresponding unit tests in `src/test/java/com/practice/leetcode/` (e.g., `LeetcodeXXXXTest.java`).
3. Run `mvn test` to ensure your solution passes all tests.

## Contributing
Feel free to fork this repository and submit pull requests for new solutions or improvements.

---

*This project is for educational purposes and personal practice.*
