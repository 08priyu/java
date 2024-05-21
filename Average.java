import java.util.Scanner;
class Average{
    public static int calculateAverage(int a, int b, int c){
       int Average = (a+b+c)/3;
    
        return Average ;
    }
    public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = sc.nextInt();
        System.out.println("Enter b: ");
        int b = sc.nextInt();
        System.out.println("Enter c: ");
        int c = sc.nextInt();
         int Average = calculateAverage(a,b,c);
         System.out.println(Average);
    }
}