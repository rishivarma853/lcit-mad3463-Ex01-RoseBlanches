import java.util.*;

public class RoseBlanches {
    static int recievedAmount, remainingAmount, restOfTheAmount;
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        input();
        calcRemainAmount();
        calcCanBuy();
    }
    public static void input() {
        System.out.print("\n  How much money did you recieve ? :  $");
        recievedAmount = scan.nextInt();
    }
    public static void calcRemainAmount() {
        remainingAmount = recievedAmount - ((recievedAmount/4)*3);
        System.out.println("\n  Book and Supplies :  $" + ((recievedAmount/4)*3));
    }
    public static void calcCanBuy() {
        final int cafePrice = 2;
        final int flashCompPrice = 4;
        final int subwayTicketPrice = 3;
        int perUnitTotalPrice = remainingAmount/3;
        System.out.println("  You Can Buy :");
        System.out.println("    " + (perUnitTotalPrice/cafePrice) + " coffees");
        System.out.println("    " + (perUnitTotalPrice/flashCompPrice) + " Flash Computer Numbers");
        System.out.println("    " + (perUnitTotalPrice/subwayTicketPrice) + " Subway Tickets");

    }
}
