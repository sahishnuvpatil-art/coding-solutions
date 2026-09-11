class Solution {
    boolean isPalindrome(String s) {
       
        StringBuilder sb=new StringBuilder(s);
       
                sb.reverse();
            String b=  sb.toString();
              return b.equals(s);
       
    }
}