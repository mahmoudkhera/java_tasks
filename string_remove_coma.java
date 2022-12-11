import java.util.Scanner;

public class string_remove_coma {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        String str;
        str=input.nextLine();

        String [] str_array= str.split(",");
        str=null;
        for(String x:str_array)
        {
            str+=x;
        }
        System.out.println(str);


    }


}