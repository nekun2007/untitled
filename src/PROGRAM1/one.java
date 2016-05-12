package PROGRAM1;

/**
 * Created by akimov.s.a on 12.05.2016.
 */
public class one {
    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {
            if (i % 7 == 0 && i % 5 == 0) {
                System.out.println("ABBA");
            } else {
                if (i % 5 == 0) {
                    System.out.println("A");
                } else {
                    if (i % 7 == 0) {
                        System.out.println("B");
                    } else {
                        System.out.println(i);
                    }
                }
            }
        }
    }
}
