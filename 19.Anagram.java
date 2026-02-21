import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String a = sc.nextLine();
        String b = sc.nextLine();
        
        if(a.length() != b.length()) {
            System.out.print("NO");
            return;
        }
        
        HashMap<Character,Integer> h = new HashMap<>();
        
        for(char c : a.toCharArray()){
            h.put(c,h.getOrDefault(c,0)+1);
        }
        
        for(char c : b.toCharArray()){
            
            if(!h.containsKey(c) || h.get(c)==0){
                System.out.print("NO");
                return;
            }
            else{
                h.put(c,h.getOrDefault(c,0)-1);
            }
        }
        
        System.out.print("YES");
    }
}
