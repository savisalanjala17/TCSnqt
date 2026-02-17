import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lower  = sc.nextInt();
        int upper  = sc.nextInt();
       
       int sum=0;
        
        for(int i=lower ; i<=upper ; i++){
            sum+=Math.pow(i,3);  // i*i*i
        }
        
         System.out.print(sum);
    
    }
    
    
}



import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lower  = sc.nextInt();
        int upper  = sc.nextInt();
        
        int sum=0;
       
       
        
        int total1 = upper*(upper+1)/2;
        total1 = total1*total1;
        
        int total2 = (lower-1)*((lower-1)+1)/2;
        total2 = total2*total2;
        
        
        
    
        
         System.out.print(total1-total2);
    
    }
    
    
}



