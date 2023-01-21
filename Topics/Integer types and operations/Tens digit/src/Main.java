import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputDigital = scanner.next();
        char result;

        if (inputDigital.length() > 1) {
            result = inputDigital.charAt(inputDigital.length()-2);
        } else {
            result = '0';
        }

        System.out.println(result);

    }
}