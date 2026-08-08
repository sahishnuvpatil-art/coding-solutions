# Q1. Number of Elapsed Seconds Between Two Times

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

You are given two valid times `startTime` and `endTime`, each represented as a string in the format `"HH:MM:SS"`.

Return the number of seconds that have elapsed from `startTime` to `endTime`.

 

 **Example 1:** 

 **Input:**  startTime = "01:00:00", endTime = "01:00:25"

 **Output:**  25

 **Explanation:** 

`endTime` is 25 seconds ahead of `startTime`.

 **Example 2:** 

 **Input:**  startTime = "12:34:56", endTime = "13:00:00"

 **Output:**  1504

 **Explanation:** 

`endTime` is 25 minutes and 4 seconds ahead of `startTime`, which equals 1504 seconds.

 

 **Constraints:** 

- startTime.length == 8
- endTime.length == 8
- startTime and endTime are valid times in the format "HH:MM:SS"
- 00 <= HH <= 23
- 00 <= MM <= 59
- 00 <= SS <= 59
- endTime is not earlier than startTime

## Solution

**Language:** Python  
**Runtime:** 1 ms (beats 33.20%)  
**Memory:** 19.3 MB (beats 24.01%)  
**Submitted:** 2026-08-08T05:22:53.633Z  

```py
class Solution:
    def secondsBetweenTimes(self, startTime: str, endTime: str) -> int:
        def to_seconds(t):
            h, m, s = map(int, t.split(":"))
            return h * 3600 + m * 60 + s

        return to_seconds(endTime) - to_seconds(startTime)
```

---

[View on LeetCode](https://leetcode.com/problems/number-of-elapsed-seconds-between-two-times/)