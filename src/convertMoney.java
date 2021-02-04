import java.util.Scanner;

public class convertMoney {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double VND = 23000;
        double USD;
        System.out.println("Enter Your Money");
        USD = scanner.nextDouble();
        double Total = USD*23000;
        System.out.println("VND" + Total);
    }
}
