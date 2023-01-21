import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int coefficient = 60;

        int h1 = scanner.nextInt() * coefficient * coefficient;
        int m1 = scanner.nextInt() * coefficient;
        int s1 = scanner.nextInt();
        int h2 = scanner.nextInt() * coefficient * coefficient;
        int m2 = scanner.nextInt() * coefficient;
        int s2 = scanner.nextInt();

        System.out.println(h2 + m2 + s2 - h1 - m1 - s1);

    }
}