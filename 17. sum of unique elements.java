import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        HashMap<Integer,Integer> h = new HashMap<>();

        int n = sc.nextInt();
        int a [] = new int [n];
        
        for(int i=0 ;i < n ;i++){
            a[i]=sc.nextInt();
            h.put(a[i],h.getOrDefault(a[i],0)+1);
        }
        int sum=0;
        
        for(int i=0; i<n; i++){
            if(h.get(a[i])==1){
                sum+=a[i];
            }
        }

        System.out.print(sum);
    }
}
