import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();  
        sc.nextLine();         
        
        List<String> namesOver20 = new ArrayList<>();
        int sumFemaleGrades = 0;
        int femaleCount = 0;
        
        for(int i = 0; i < N; i++) {
            String line = sc.nextLine();
            String[] parts = line.split(" ");
            
            String name = parts[0];
            int age = Integer.parseInt(parts[1]);
            char grade = parts[2].charAt(0);  
            String gender = parts[3];
            
         
            if(age > 20) {
                namesOver20.add(name);
            }
            
         
            if(gender.equalsIgnoreCase("female")) {
                sumFemaleGrades += (int) grade; 
                femaleCount++;
            }
        }
        
      
        for(String name : namesOver20) {
            System.out.println(name);
        }
       
        if(femaleCount > 0) {
            int avgGrade = sumFemaleGrades / femaleCount; 
            System.out.println(avgGrade);
        } else {
            System.out.println(0); 
        }
        
        sc.close();
    }
}
