import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        String cuisine = scanner.nextLine();
        String experience = scanner.next();

        System.out.printf("The form for %s is completed. We will contact you if we need a chef who cooks %s dishes and has %s years of experience.", name, experience, cuisine);

        // start coding here
    }
}