# CamelCase

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

There is a sequence of words in [CamelCase](https://en.wikipedia.org/wiki/CamelCase) as a string of letters, $s$, having the following properties:

* It is a concatenation of one or more *words* consisting of English letters.
* All letters in the first word are *lowercase*. 
* For each of the subsequent words, the first letter is *uppercase* and rest of the letters are *lowercase*.

Given $s$, determine the number of words in $s$.

**Example**  
$s = \textit{oneTwoThree}$  

There are $3$ words in the string: 'one', 'Two', 'Three'.  

**Function Description**

Complete the *camelcase* function in the editor below.  

camelcase has the following parameter(s):

- *string s*: the string to analyze   

**Returns**  

- *int:* the number of words in $s$  

**Input Format**

A single line containing string $s$.

**Constraints**

* $ 1 \le \text{length of s} \le 10^5 $

**Output Format**

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-10T08:04:25.798Z  

```java
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'camelcase' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */

    public static int camelcase(String s) {
    int l=s.length()-1;
      int count=1;
      for(int i=0;i<=l;i++){
        if(s.charAt(i)=='Q'||s.charAt(i)=='W'||s.charAt(i)=='E'||s.charAt(i)=='R'||s.charAt(i)=='T'||s.charAt(i)=='Y'||s.charAt(i)=='U'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='P'||s.charAt(i)=='A'||s.charAt(i)=='S'||s.charAt(i)=='D'||s.charAt(i)=='F'||s.charAt(i)=='G'||s.charAt(i)=='H'||s.charAt(i)=='J'||s.charAt(i)=='K'||s.charAt(i)=='L'||s.charAt(i)=='Z'||s.charAt(i)=='X'||s.charAt(i)=='C'||s.charAt(i)=='V'||s.charAt(i)=='B'||s.charAt(i)=='N'||s.charAt(i)=='M'){
          count++;  
        }
      }
       return count;

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        int result = Result.camelcase(s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

```

---

[View on HackerRank](https://www.hackerrank.com/challenges/camelcase/problem)