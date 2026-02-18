# Duplicates

Educational Java project to explore the behavior of **ArrayList** and **HashSet** regarding duplicates and ordering.

## Objective

- Practice `ArrayList` (preserves insertion order, allows duplicates) vs `HashSet` (removes duplicates, no guaranteed order)
- Insert elements at specific positions
- Observe duplicate handling
- Iterate collections using `for-each` and `Iterator`

## Statement Summary

1. Create a `Month` class with a `name` attribute (String)
2. Add 11 months to an `ArrayList<Month>` (excluding "August")
3. Insert "August" in the correct position (index 7)
4. Verify the chronological order is correct
5. Convert the `ArrayList` to a `HashSet` and confirm duplicates are eliminated
6. Iterate using both `for-each` loop and `Iterator`

## Project Structure

```text
src/
├── Month.java
└── Main.java          # full demonstration
```
## Main Classes
```text
| Class    | Description                                            |
|----------|--------------------------------------------------------|
| `Month`  | Simple class with `name` attribute and `toString()`    |
| `Main`   | Executes the exercise and prints results               |
```
## How to Run

```bash
javac src/*.java
java -cp src Main
```
## Expected Output (example)
```text
Months in ArrayList (12 months):
January, February, March, April, May, June, July, August, September, October, November, December

After converting to HashSet (no duplicates, order not guaranteed):
[January, September, February, August, April, June, November, March, May, July, October, December]

Iteration with for-each:
January
September
...

Iteration with Iterator:
January
September
...
```