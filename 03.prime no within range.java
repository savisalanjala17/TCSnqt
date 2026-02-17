import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        
        if(n<2) System.out.print("Invalid");
       
        

        for(int i=2 ; i<=n; i++){
            
            if(isprime(i)){
                System.out.print(i+" ");
            }
            
        }
        
        
    
    }
    
    public static boolean isprime(int n){
        
        for(int i=2 ; i<=Math.sqrt(n) ; i++){
            if(n%i == 0) return false;
        }
        
        return true;
    }
}
