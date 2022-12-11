import java.util.Scanner;

public class ASCII_code {
    public static void main(String[] args) {
       Scanner input =new Scanner(System.in);
        int x =input.nextInt();  //get the ascii code from the user
        char ascii_value =(char) x; // casting the integer value to char
        System.out.println("the character is "+ascii_value);



    }


}