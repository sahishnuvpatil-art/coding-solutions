# Print GFG n times

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a positive number  **n**, print the string " **GFG** " exactly n times separated by a single space.

 **Examples:** 

```
Input: n = 5
Output:
GFG GFG GFG GFG GFG
```

```
Input: 3
Output:
GFG GFG GFG
```

 **Constraint:** 
1 ≤ n ≤ 103

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-11T05:32:21.186Z  

```java
import java.util.Scanner;

class GFG {
    
    
    // static void f(int n,int count){
    //     if(count==n) return ;
    //     System.out.print("GFG ");
       
    //     f(count+1,n);
        
    // }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // input n
        // f(0, n);  
       
        for(int i=0;i<n;i++){
            System.out.print("GFG ");
        }
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/print-gfg-n-times/1)