
import java.util.*;

public class airline {
    public static void main(String[] args){
       /* this program represent only on reservation */

        /* make a simple database of flights and their schedule
        so that the person can make a reservation depends on it
         */
        flightDescription flight1 =new flightDescription("Cairo","Tokyo",
                "3AM","7AM",100);
        flightDescription flight2 =new flightDescription("Cairo","Madride",
                "1AM","3AM",120);
        flightDescription flight3 = new flightDescription("London","Alex",
                "5PM","9PM",80);
        flightDescription flight4 =new flightDescription("Berlin","New york",
                "1PM","9Pm",200);

        //an array of list to hold the flight description objects
        List<flightDescription> flightDescriptions =new ArrayList<>();
        flightDescriptions.add(flight1);
        flightDescriptions.add(flight2);
        flightDescriptions.add(flight3);
        flightDescriptions.add(flight4);

        //add a date schedule to each flight

        flightSchedule f1Schedule =new flightSchedule(flight1);
        f1Schedule.addFlightSchedule("1/1/2023");
        f1Schedule.addFlightSchedule("5/1/2023");
        f1Schedule.addFlightSchedule("20/1/2023");

        flightSchedule f2Schedule =new flightSchedule(flight2);
        f2Schedule.addFlightSchedule("3/1/2023");
        f2Schedule.addFlightSchedule("8/1/2023");
        f2Schedule.addFlightSchedule("13/1/2023");

        flightSchedule f3Schedule =new flightSchedule(flight3);
        f3Schedule.addFlightSchedule("2/1/2023");
        f3Schedule.addFlightSchedule("9/1/2023");
        f3Schedule.addFlightSchedule("23/1/2023");

        flightSchedule f4Schedule =new flightSchedule(flight4);
        f4Schedule.addFlightSchedule("6/1/2023");
        f4Schedule.addFlightSchedule("12/1/2023");
        f4Schedule.addFlightSchedule("29/1/2023");

        //a list of flights schedules to hold the flight schedule
        List<flightSchedule> flightSchedules =new ArrayList<>();
        flightSchedules.add(f1Schedule);
        flightSchedules.add(f2Schedule);
        flightSchedules.add(f3Schedule);
        flightSchedules.add(f4Schedule);



        //Hash map to take the number of passenger as akey and the passenger object as value
        HashMap<Integer,passenger> passengerHashMap =new HashMap();
        Scanner input=new Scanner(System.in);

        //enter all the data of the passenger
        System.out.println("enter the passenger data: name, id ,address, number");

        String personName=input.nextLine();
        String personId=input.nextLine();
        String personAddress=input.nextLine();
        int passengerNumber=input.nextInt();


       person p= new person(personName,personId,personAddress);//object of person
        passenger Pass =new passenger(p,passengerNumber);//object of passenger

        System.out.println("chose a number of  flight form the available flight in our airline");

        //get  the values of all keys
        int flightNumber=1; //integer give each flight a number
       for(flightDescription flight:flightDescriptions )
       {
           System.out.print((flightNumber++)+" ");
           flight.printFlightInfo();
       }



        System.out.println("\n"+"choose the data you want to travel on it  ");

          int flightReservationNumber =input.nextInt();


        flightDescriptions.get(flightReservationNumber).printFlightInfo();//print the flight information
        flightSchedules.get(flightReservationNumber).printFlightSchedule(); //print the flight schedule


        System.out.println("added reservesion reservation date");
        int dateOfReservation =input.nextInt();  // to choose the number of reservation

        /*
        input the  flight information and the date the passenger choose into the passenger
        flight reservation map
        */
        Pass.passengerFlightsReservation(flightDescriptions.get(flightReservationNumber),
                flightSchedules.get(flightReservationNumber).getFightDate(dateOfReservation ));


        passengerHashMap.put(passengerNumber,Pass);//put the number of passenger  and passenger object in the map



        System.out.println("enter passanger number");
        int passengerSearchNumber =input.nextInt();
        //make the object pass2 to refrence to the value of the key get by the passenger number
       passenger pass2 = passengerHashMap.get(passengerSearchNumber);
       pass2.printPassengerData();//print the passenger data
       pass2.printPassengerFlightsData();//print the passenger flights data




















    }

}