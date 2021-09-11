# CPIT-252 Software Design Patterns
## The Singleton Design Pattern

### Problem

The Singleton design pattern solves the problems of:

- Restricting the instantiation of a class to a single instance.
- Having a global and easy access to the single instance of a class.

### Intent
Ensures that only ONE single instance of a class is ever created.

### Usage
Whenever one object is needed to coordinate actions across your system.
**Examples:** Logging, thread pool, and database connection.


## Building and Running
To compile and run the example, use:

```bash
javac -d . *.java
java singletonExample.Main
```

-