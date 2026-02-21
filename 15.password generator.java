import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String n = sc.nextLine();
        int m = sc.nextInt();

        StringBuilder sb = new StringBuilder();

        for(char c : n.toCharArray()) {

            // Lowercase letters
            if(Character.isLowerCase(c)) {
                char shifted = (char)((((c - 'a') + m) % 26 + 26) % 26 + 'a');
                sb.append(shifted);
            }

            // Uppercase letters
            else if(Character.isUpperCase(c)) {
                char shifted = (char)((((c - 'A') + m) % 26 + 26) % 26 + 'A');
                sb.append(shifted);
            }

            // Numbers
            else if(Character.isDigit(c)) {
                char shifted = (char)((((c - '0') + m) % 10 + 10) % 10 + '0');
                sb.append(shifted);
            }

            // Swap @ and #
            else if(c == '@') {
                sb.append('#');
            }
            else if(c == '#') {
                sb.append('@');
            }

            // Other characters unchanged
            else {
                sb.append(c);
            }
        }

        System.out.println(sb);
    }
}
