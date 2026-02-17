import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int girls = sc.nextInt();
        int pens = sc.nextInt();
        int pencils = sc.nextInt();

        if (girls <= 0 || pens % girls != 0 || pencils % girls != 0) {
            System.out.println("Can't");
            return;
        }

        int penCount = pens / girls;
        int pencilCount = pencils / girls;

        System.out.print("{");

        for (int i = 1; i <= girls; i++) {
            System.out.print("'Girl " + i + "':{'Pens':" 
                             + penCount + ",'Pencils':" 
                             + pencilCount + "}");

            if (i != girls) {
                System.out.print(",");
            }
        }

        System.out.print("}");
    }
}
