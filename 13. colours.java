
import java.util.*;
class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       
       int a[] = new int [n];
       int three=0;
       int seven=0;
       int six=0;
       
       for(int i=0 ; i<n ;i++){
           a[i]=sc.nextInt();
           if(a[i]==3) three++;
           else if(a[i]==6) six++;
           else seven++;
       }
       
       int index=0;
       
       while(three>0 || six>0 || seven>0){
           
           if(three>0){
               a[index++]=3;
               three--;
           }
           
           if(three==0 && six>0){
               a[index++]=6;
               six--;
           }
           
           if(three==0 && six==0 && seven>0) {
               a[index++]=7;
               seven--;
           }
           
       }
       
       for(int i=0 ; i<n ;i++){
           System.out.print(a[i]+" ");
           
       }
       
       
   
   }
}
