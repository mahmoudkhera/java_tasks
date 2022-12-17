

public class flightDescription {

    //flight description variables
    private String flightSource;
    private String flightDestination;
    private String flightDeparture;
    private String flightArrival;
    private int flightCapacity;

    flightDescription (String source,String destination ,String departure,String arrival,int capacity)
    {
        this.flightSource=source;
        this.flightDestination=destination;
        this.flightDeparture=departure;
        this.flightArrival=arrival;
        this.flightCapacity=capacity;


    }

    public String getFlightSource() {
        return flightSource;
    }

    public String getFlightDestination() {
        return flightDestination;
    }

    public String getFlightDeparture() {
        return flightDeparture;
    }

    public String getFlightArrival() {
        return flightArrival;
    }

    public int getFlightCapacity() {
        return flightCapacity;
    }
    public void printFlightInfo() //print all the information about the flight and the date of it
    {
        System.out.print("flight from " + getFlightSource() + " to " + getFlightDestination());
        System.out.println(" departure at " + getFlightDeparture() + " arrival at " + getFlightArrival());
    }





}
