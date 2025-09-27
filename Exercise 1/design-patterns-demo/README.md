# Design Patterns Demo (Java)

## Overview

This project demonstrates six key software design patterns using Java, each with a creative real-world use case.  
Patterns covered:
- **Behavioral:** Observer, Strategy
- **Creational:** Factory, Singleton
- **Structural:** Adapter, Decorator

The codebase is organized for clarity, maintainability, and adherence to best practices.  
Each pattern can be demoed via the menu-driven CLI in `Main.java`.

---

## Project Structure

```
src/
  behavioral/
    observer/      # Weather Station (Observer)
    strategy/      # Shopping Cart Payment (Strategy)
  creational/
    factory/       # Notification System (Factory)
    singleton/     # Centralized Logger (Singleton)
  structural/
    adapter/       # Legacy Printer Adapter (Adapter)
    decorator/     # Coffee Customization (Decorator)
  common/          # Shared utilities, e.g., Validations
  Main.java        # Interactive menu
  test/            # Test files for each pattern
```

---

## How to Run

1. **Clone the repository**
    ```bash
    git clone https://github.com/<your-username>/<your-repo>.git
    cd <your-repo>
    ```
2. **Compile the project**
    ```bash
    javac src/**/*.java
    ```
3. **Run the main program**
    ```bash
    java -cp src Main
    ```

---

## How to Test

Test classes are under `src/test/`.  
Example:
```bash
javac src/test/TestObserverPattern.java
java -cp src/test TestObserverPattern
```

---

## Design Decisions

- **Separation of Concerns:** Each class in its own file. Packages by pattern.
- **Defensive Programming:** Input validation and error handling in all classes.
- **Logging:** Centralized, singleton logger (`AppLogger`) used everywhere.
- **Transient Error Handling:** Retry logic where relevant (e.g., notifications).
- **Performance:** Efficient use of collections, minimal object creation.
- **Coding Standards:** Java naming conventions, meaningful comments, and JavaDoc.

---

## Walkthrough

- **Observer:** Weather station notifies multiple display devices of weather changes.
- **Strategy:** Shopping cart allows runtime selection of payment method.
- **Factory:** Notification system instantiates the correct notification type.
- **Singleton:** Logger ensures consistent, thread-safe logging.
- **Adapter:** Legacy printer integrated with new system.
- **Decorator:** Coffee orders customized with add-ons.

---

## Author

- [Your Name](https://github.com/Avudai-Nayagam)

---
