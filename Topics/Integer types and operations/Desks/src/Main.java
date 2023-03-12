import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int total = 0;
        while (scanner.hasNext()) {
            int x = scanner.nextInt();
            x += 1;
            total += x / 2;
        }
        System.out.println(total);
    }
}