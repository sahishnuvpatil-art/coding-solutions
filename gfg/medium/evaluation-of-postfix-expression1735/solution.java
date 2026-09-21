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
