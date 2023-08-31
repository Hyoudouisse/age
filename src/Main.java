import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int age;
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();
        if(isEligible(age))
        {
            System.out.println("Eligible to vote");
        }
        else {
            System.out.println("Not Eligible to vote");
        }
    }
    static boolean isEligible(int age)
    {
        if (age>=18)
            return true;
        else
            return false;
    }
}