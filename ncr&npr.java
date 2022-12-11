import java.util.Scanner;

public class lab1 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        int n,r;
        System.out.println("inter the n and r value");
        n=input.nextInt();
        r=input.nextInt();
        permutation(n,r); //  method to  calculate the permutation
        combination(n,r); // method to calculate the combination






    }
    static int factorial(int number)
    {
        int count=1,fact=1;
        while(count<=number)
        {
            fact*=count;
            count++;
        }
        return fact;
    }
    static void permutation(int n,int r)
    {
        int fact_1= factorial(n); //the factorial of n!
        int fact_2=factorial((n-r)); //the factorial of (n-r)!
        System.out.println("the permutation value "+(fact_1/fact_2)); //the npr value



    }
    static void combination (int n, int r)
    {
        int fact_1= factorial(n); //the factorial of n!
        int fact_2=factorial((n-r)); //the factorial of (n-r)!
        int fact_3=factorial(r); // the factorial of r!
        System.out.println("the combination value "+(fact_1/(fact_3*fact_2))); //the ncr value
    }

}