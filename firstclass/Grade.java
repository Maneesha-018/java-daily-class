
import java.util.*;

class Grade {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int m = s.nextInt();

        if(m >= 90) System.out.println("A");
        else if(m >= 75) System.out.println("B");
        else if(m >= 60) System.out.println("C");
        else if(m >= 40) System.out.println("D");
        else System.out.println("F");
    }
}
