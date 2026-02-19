import java.util.*;
class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int k = sc.nextInt();
       int a[] = new int [n];
       
       for(int i=0 ; i<n ; i++){
           a[i]=sc.nextInt();
       }
       
       for(int i=0 ; i<=n-k ; i++){
           int maxx=0;
           for(int j=i ; j<i+k ; j++){
               
               maxx=Math.max(maxx,a[j]);
               
           }
           System.out.print(maxx+" ");
       }
       
   }
}
