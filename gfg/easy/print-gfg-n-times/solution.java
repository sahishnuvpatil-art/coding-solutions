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