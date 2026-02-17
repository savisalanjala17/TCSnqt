import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m  = sc.nextInt();
        int n  = sc.nextInt();
        int o  = sc.nextInt();
        int p  = sc.nextInt();
        
        int a[] = {m,n,o,p};
        
        for(int i=0 ; i<4 ;i++){
            if(a[i]%3==0 && a[i]%5==0){
                System.out.print("ThreeFive ");
            }
            
            else if(a[i]%3==0 ){
                System.out.print("Three ");
            }
            
            else if(a[i]%5==0 ){
                System.out.print("Five ");
            }
            
            else{
                System.out.print(a[i]+" ");
            }
        }
        
        
        
        
    
        
         
    
    }
    
    
}
