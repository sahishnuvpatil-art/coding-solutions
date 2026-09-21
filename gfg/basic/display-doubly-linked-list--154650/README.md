# Doubly Linked List Traversal

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given head of a doubly linked list containing n nodes, return a 2D array where:

- The first row contains the elements obtained by traversing the linked list in forward direction.
- The second row contains the elements obtained by traversing the linked list in backward direction.

 **Examples:** 

```
Input: head: 1 <-> 2 <-> 3 <-> 4 <-> 5
 
Output: [[1, 2, 3, 4, 5], [5, 4, 3, 2, 1]]
Explanation: After traversing forward the linked list will look like 1 -> 2 -> 3 -> 4 -> 5 and from backward will 5 -> 4 -> 3 -> 2 -> 1.

```

```
Input: head: 34 <-> 22
 
Output: [[34, 22], [22, 34]]
Explanation: After traversing forward the linked list will look like 34 -> 22 and from backward will 22 -> 34.
```

 **Constraints:** 
1 ≤ n ≤ 105
0 ≤ data of nodes ≤ 105

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-21T02:59:45.122Z  

```java
class Solution {
    public List<List<Integer>> displayList(Node head) {
        List<Integer> forward = new ArrayList<>();
        List<Integer> backward = new ArrayList<>();

        Node curr = head;
        Node last = null;

        while (curr != null) {
            forward.add(curr.data);
            last = curr;
            curr = curr.next;
        }

        curr = last;
        while (curr != null) {
            backward.add(curr.data);
            curr = curr.prev;
        }

        List<List<Integer>> result = new ArrayList<>();
        result.add(forward);
        result.add(backward);

        return result;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/display-doubly-linked-list--154650/1)