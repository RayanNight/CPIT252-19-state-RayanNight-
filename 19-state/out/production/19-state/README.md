# State Design Pattern

## Usage

```
javac -d ./out $(find . | grep .java)
```

# Compare the two implementations
### State pattern implementation:
- Each state carry's its own logic and its own behaviour no more.
- Easily can add more States with no need to touch the client code.
- Each state can be tested while isolated from other states.
- Changing the logic of one state won't affect the others.
- Require 5 classes instead of one.
### No State pattern implementation:
- Require 1 class instead of 5.
- Any change to any state involves mutating client code.
- Adding more states involve adding multiple if-statements in client code.
- Testing states in isolation is impossible.


#### Overall State pattern shows superior quality at the cost of slight complexity.