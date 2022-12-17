public class person {
    private String name;
    private String iD;
    private String address;


    person(String name,String iD,String address)
    {
        this.name=name;
        this.address=address;
        this.iD=iD;

    }

    public String getName()
    {
        return name;

    }
    public String getiD()
    {
        return iD;
    }
    public String getAddress()
    {
        return address;
    }



}
