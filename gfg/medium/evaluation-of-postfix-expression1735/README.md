# Postfix Evaluation

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are given an array of strings  **arr[]**  that represents a valid arithmetic expression written in Postfix Notation. Your task is to evaluate the expression and return an integer representing its value.

- The division operation between two integers always computes the floor value, i.e floor(5 / 3) = 1 and floor(-5 / 3) = -2.
- It is guaranteed that the result of the expression and all intermediate calculations will fit in a 32-bit signed integer.
- arr[i] is either an operator: "+", "-", "*", "/" or "^", or an integer in the range [-104, 104]

 **Examples:** 

```
Input: arr[] = ["2", "3", "1", "*", "+", "9", "-"]
Output: -4
Explanation: If the expression is converted into an infix expression, it will be 2 + (3 * 1) – 9 = 5 – 9 = -4.
```

```
Input: arr[] = ["2", "3", "^", "10", "+"]
Output: 18
Explanation: If the expression is converted into an infix expression, it will be 2 ^ 3 + 10 = 8 + 10 = 18.
```

**Constraints:
**3 ≤ arr.size() ≤ 103

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-21T02:51:07.305Z  

```java
import java.util.*;

class Solution {
    public int evaluatePostfix(String[] arr) {
        Stack<Integer> st = new Stack<>();

        for (String token : arr) {
          
            if (!isOperator(token)) {
                st.push(Integer.parseInt(token));
            } else {
     
                int b = st.pop();
                int a = st.pop();
                int res = 0;

                switch (token) {
                    case "+":
                        res = a + b;
                        break;
                    case "-":
                        res = a - b;
                        break;
                    case "*":
                        res = a * b;
                        break;
                    case "/":
           
                        res = a / b;
                        if (a % b != 0 && ((a < 0) ^ (b < 0))) {
                            res--;
                        }
                        break;
                    case "^":
                        res = (int)Math.pow(a, b);
                        break;
                }
                st.push(res);
            }
        }
        return st.pop();
    }

    private boolean isOperator(String s) {
        return s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/") || s.equals("^");
    }
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/evaluation-of-postfix-expression1735/1)