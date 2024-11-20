public class Main {
    public static void main(String[] args) {
        PasswordGenerator pg = new PasswordGenerator();
        System.out.println(pg.generate(1000000, 5, true, true, 1,2,3,4,5));

    }
}