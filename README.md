# Bracket Sequence

## Description
A **balanced bracket sequence** is a string consisting of only brackets, such that this sequence, when inserted certain numbers and mathematical operations, gives a valid mathematical expression. 

To define it formally:
- An empty string is a balanced sequence.
- If string *s* is balanced, then so is (s).
- If *s* and *t* are balanced, then so is *st*.

You do not need to parse the string, you are given a element of a `BracketSequence` class and need to check whether it is balanced or not.

Note that bracket ids are not guaranteed to be sequential.

Implement [`org.p3121.id311755.brackets.BracketSequenceChecker`](src/main/java/org/p3121/id311755/brackets/BracketSequenceChecker.java) method:
- `check` - returns a boolean that shows that either the sequence is correct (**true**) or incorrect (**false**)
  
## Example

Here different bracket types represent brackets of different ids.

```
((())) - true
{([(){}])} - true
)()() - false
([{(})]) - false
```
