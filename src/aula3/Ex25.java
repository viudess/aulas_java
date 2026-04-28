package aula3;

public class Ex25 {
    public static void main(String[] args) {
        int a, b, c, p;

        a = 1;
        b = -1;
        c = 1;

        for (int i=1; i<=20; i++) {
            p = a + b + c;
            System.out.println(p);
            a = b;
            b = c;
            c = p;
        }
    }
}
