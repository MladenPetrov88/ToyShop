import java.util.Scanner;

public class Task12_ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double excursionCost = Double.parseDouble(scanner.nextLine());
        int puzzleCount = Integer.parseInt(scanner.nextLine());
        int dollsCount = Integer.parseInt(scanner.nextLine());
        int bearsCount = Integer.parseInt(scanner.nextLine());
        int minionsCount = Integer.parseInt(scanner.nextLine());
        int truckCounts = Integer.parseInt(scanner.nextLine());
        double puzzleProfit = puzzleCount * 2.6;
        double dollsProfit = dollsCount * 3;
        double bearsProfit = bearsCount * 4.10;
        double minionsProfit = minionsCount * 8.20;
        double truckProfits = truckCounts * 2;

        double totalPrice = puzzleProfit + dollsProfit + bearsProfit + minionsProfit + truckProfits;

        int countAllToys = puzzleCount + dollsCount + bearsCount + minionsCount + truckCounts;

        if (countAllToys >= 50) {
            totalPrice = totalPrice - totalPrice * 0.25;
        }
        double rent = totalPrice * 0.10;
        double endProfit = totalPrice - rent;
        if (endProfit >= excursionCost) {
            double leftMoney = endProfit - excursionCost;
            System.out.printf("Yes! %.2f lv left.", leftMoney);
        } else {
            double neededMoney = endProfit - excursionCost;
            System.out.printf("Not enough money! %.2f lv needed.",Math.abs(neededMoney));
        }
    }
}
