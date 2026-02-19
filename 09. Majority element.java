
import java.util.*;
class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int a[] = new int [n];
       
       for(int i=0 ; i<n ; i++){
           a[i]=sc.nextInt();
       }
       
       HashMap<Integer, Integer> h = new HashMap<>();
       
       for(int i=0 ; i<n ; i++){
          
        h.put(a[i],h.getOrDefault(a[i],0)+1);
           
       }
       
       for(Map.Entry<Integer,Integer> entry : h.entrySet()){
           if(entry.getValue()>=n/2){
               System.out.print(entry.getKey()+" ");
           }
       }
       
   
   }
}
