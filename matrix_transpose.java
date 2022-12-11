import java.util.Scanner;

public class matrix_transpose {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        int [][]arr =new int[4][5];


        for (int i=0; i<arr.length; i++)
        {
           for (int j=0; j<arr[0].length; j++)
           {
               arr[i][j]=input.nextInt();
           }
        }
        for(int i=0; i<arr[0].length; i++)
        {
            for(int j=0; j<arr.length; j++)
                System.out.print(arr[j][i]+ " ");

            System.out.println();
        }


    }


}