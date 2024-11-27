//public class Main {
//    public static void main(String[] args) {
//        PasswordGenerator pg = new PasswordGenerator();
//        System.out.println(pg.generate(1000000, 5, true, true, 1,2,3,4,5));
//    }
//}
import java.util.List;

public class Main {
    public static void main(String[] args) {
        PasswordGenerator pg = new PasswordGenerator();
        var lengths = List.of(10000, 100000, 1000000, 10000000, 100000000);
        for (var length : lengths) {
            var start = System.nanoTime();
            pg.generate(length, 2, true, true, 1, 2, 3, 4, 5);
            var duration = (double) (System.nanoTime() - start) / 1000000000;
            System.out.println("create a password with size of " + length + " takes " + duration + " seconds");
        }
    }
}
