import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long target = scanner.nextLong();
        int number = 1;
        long factorial = 1;
        while (factorial <= target) {
            factorial *= ++number;
        }
        System.out.print(number);
    }
}