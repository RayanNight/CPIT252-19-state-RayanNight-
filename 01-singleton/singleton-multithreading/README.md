# CPIT-252 Software Design Patterns
## The Singleton Design Pattern in a multithreaded environment
This code is similar in functionality to the single threaded singleton example
with the exception of being thread safe, so it can be used in a multithreaded 
code base.

### Problem

The Singleton design pattern solves the problems of:

- Restricting the instantiation of a class to a single instance.
- Having a global and easy access to the single instance of a class.

### Intent
Ensures that only ONE single instance of a class is ever created. We also need 
to make sure that our Singleton works and safe in the presence of multiple threads.

### Usage
Whenever one object is needed to coordinate actions across your system.
**Examples:** Logging, thread pool, and database connection.


## Building and Running
To compile and run the example, use:

```bash
javac -d . *.java
java singletonMultiThreadingExample.Main
```

-
