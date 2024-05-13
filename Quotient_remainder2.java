import java.util.Scanner;
class Quotient_reminder2{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Dividend: ");
        int Dividend = sc.nextInt();
        System.out.println("Enter Divisior: ");
        int Divisior =sc.nextInt();
        int quotient = Dividend/Divisior;
        int remainder = Dividend%Divisior;
        System.out.println("Quotient is: "+quotient);
        System.out.println("Remainder is: "+remainder);

    }
}