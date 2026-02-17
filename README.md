---

### UC3: String Join Refactoring

**Goal:**  
Refactor UC2 by replacing traditional string concatenation with the `String.join()` method to construct each banner line more efficiently.

**Problem in UC2:**  
Using `+` for string concatenation creates multiple intermediate `String` objects due to string immutability, leading to unnecessary memory usage.

**Solution in UC3:**  
Used `String.join()` to construct each line of the banner in a cleaner and more memory-efficient way.

**Code Approach:**
- Created each banner row using `String.join(" ", parts...)`
- Printed each row using `System.out.println()`
- Preserved original banner layout

**Output:**
```
***** ***** ***** *****
*   * *   * *   * *   *
*   * *   * *   * *   *
***** ***** ***** *****
```
