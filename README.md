# MutableMap values.removeIf() Unexpected Behavior

This example demonstrates a subtle difference between `MutableList.removeIf()` and `MutableMap.values.removeIf()` in Kotlin.  While `MutableList.removeIf()` directly modifies the list, `MutableMap.values.removeIf()` only modifies a *copy* of the map's values, leaving the original map unchanged.

**Bug:** The `map.values.removeIf` call does not modify the original map as expected. This can lead to unexpected results if you are relying on in-place modification of the map.

**Solution:**  To remove elements from a map based on their values, you should iterate through the map's entries and remove entries directly. 

This repository includes two Kotlin files:

- `BuggyMap.kt`: Demonstrates the unexpected behavior of `MutableMap.values.removeIf()`.
- `FixedMap.kt`: Shows the correct way to remove elements from a map based on values.