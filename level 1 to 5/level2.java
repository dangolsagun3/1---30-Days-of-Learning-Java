import java.util.Scanner;
public class level2 {
    void add(int a, int b){
        int sum = a +b;
        System.out.println("Sum is " + sum);
    }
    public static void main(String[] args) {
        level2 l1 = new level2();
        Scanner sc = new Scanner (System.in);
        int x, y;
        System.out.println("Enter First Num: ");
        x = sc.nextInt();
        System.out.println("Enter Second Num: ");
        y = sc.nextInt();
        l1.add(x, y);
    }
}
