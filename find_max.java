import java.util.Scanner;

public class lab2 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int max;
        int []arr =new int[10];
        max=arr[0];
        for (int i=1; i<arr.length; i++)
        {
            arr[i]=input.nextInt();
        }
        for (int i=1; i<arr.length; i++)
        {
            if(arr[i]>max)
                max=arr[i];
        }
        System.out.println("the max value is "+max);
        

    }


}