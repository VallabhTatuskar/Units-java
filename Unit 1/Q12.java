import java.util.*;
public class Q12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int c=0;
        String s;
        System.out.print("Enter a string: ");
        s=sc.nextLine().toLowerCase();
        for (char a:s.toCharArray()) {
            if ("aeiou".indexOf(a)!=-1) {
                c++;
            }
        }
        System.out.println("Vowels: " +c);
    }
}
