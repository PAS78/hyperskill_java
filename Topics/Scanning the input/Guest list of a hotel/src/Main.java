import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] name = new String[4];

        for (int i = 0; i < 4; i++) {
            name[i] = scanner.next();

//            if (name[i].contains(" ")) {
//                name[i + 1] = name[i].substring(name[i].indexOf(" ") + 1, name[i].length());
//                name[i] = name[i].substring(0, name[i].indexOf(" "));
////                System.out.println(name[i] + "\n" + name[i + 1]);
//                i++;
//            }
        }

        for (int j = 3; j >= 0; j--) {
            System.out.println(name[j]);
        }


    }
}