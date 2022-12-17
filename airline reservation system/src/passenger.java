import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class passenger {


    int number;
    HashMap<flightDescription,String> passengerFlights =new HashMap<>() ;
    flightDescription flight;
    person personData;
    List<String>flightDate =new ArrayList<>();

    passenger(person personData,int number)//constructor take the number of passenger and person object
    {
        this.personData=personData;
        this.number=number;
    }
    //inter the flight information to the passenger map as key and flight date as a value
    public void passengerFlightsReservation( flightDescription flightInfo, String flightDate) {
        passengerFlights.put(flightInfo,flightDate);
    }


    public void printPassengerData()

    {
        System.out.println("Passenger DAta ");
        System.out.println("name :"+personData.getName()+"  ID :"+personData.getiD());
        System.out.println("address :"+personData.getAddress());

    }
    public void printPassengerFlightsData()
    {
        flightDescription flightIfo;
        String date;
        System.out.println("the Reservations");

        //print all the reservation the passenger make
        for(Map.Entry passengerReservations :passengerFlights.entrySet() )
        {
            flightIfo=(flightDescription) passengerReservations.getKey();
            date=(String) passengerReservations.getValue();
            flightIfo.printFlightInfo();;
            System.out.println("date of reservation "+date);
        }





    }









}
