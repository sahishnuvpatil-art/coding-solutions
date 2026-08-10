# Armstrong Numbers

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

You are given a **3-digit**  number  **n**, Find whether it is an  **Armstrong** number or not.

An  *Armstrong number*  of three digits is a number such that the sum of the cubes of its digits is equal to the  *number* itself. 371 is an Armstrong number since 33 + 73 + 13 = 371. 

 **Examples:** 

```
Input: n = 153
Output: true
Explanation: 153 is an Armstrong number since 13 + 53 + 33 = 153. 

```

```
Input: n = 372
Output: false
Explanation: 372 is not an Armstrong number since 33 + 73 + 23 = 378. 

```

```
Input: n = 100
Output: false
Explanation: 100 is not an Armstrong number since 13 + 03 + 03 = 1. 
```

 **Constraints:** 
100 ≤ n <1000

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-10T17:06:54.962Z  

```java
class Solution {
    static boolean armstrongNumber(int n) {
        if(n<11)return false;
        
        int arm=0; int temp=n;
        while(temp>0){
         int ld=temp%10;
         int s=ld*ld*ld;
         arm+=s;
         temp/=10;
         
        }
        if(arm==n)return true;
        else return false;
        
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/armstrong-numbers2727/1)