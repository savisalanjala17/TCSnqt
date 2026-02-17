import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();   
        int arr[] = new int[size];

        int sum = 0;

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        int n = size + 1; 
        int total = (n * (n + 1)) / 2;

        System.out.println("Missing no : " + (total - sum));
    }
}








import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        int a [] = new int [n];
        

        for(int i=0 ; i<a.length ; i++){
            
            a[i]=sc.nextInt();
            
        }
        
        int xor=0;
        
        for(int i=1 ; i<=n+1 ;i++){
            xor^=i;
        }
        
        for(int num :a){
            xor^=num;
        }
        
        System.out.print(xor);
    }
}




