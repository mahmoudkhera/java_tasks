import java.util.ArrayList;
import java.util.List;

public class flightSchedule {

   public  final List<String> flightDate =new ArrayList<>();
     flightDescription flightINfo;


      flightSchedule(flightDescription flightInfo)//constructor to take the flight description object
     {
         this.flightINfo=flightInfo;
     }

     public  void  addFlightSchedule(String date)// enter the available date of the flight
     {
        this.flightDate.add(date); //add a  string date to the list for the same flight
     }
     public String getFightDate(int flightDate)
     {
         return this.flightDate.get(flightDate);
     }



        public void printFlightSchedule() //print  the flight date
     {

         System.out.println("the available reservation  DATE");
         for(String date:flightDate)
         {
             System.out.println(" at "+date);//print the date in the list
         }
     }


}
