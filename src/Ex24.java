public class Ex24 {
    public static void main(String[] args) {
        int a, b, f;
        a = 1;
        b = 0;

        for (int i=1; i<=30; i++) {
            f = a + b;
            System.out.println(f);
            a = b;
            b = f;
        }
    }
}
