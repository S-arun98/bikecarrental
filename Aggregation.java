class City
{
    String place,address;
    city(String place)
    {
        this.place=place;
    }
}
class Address
{
    String street;
    Address ad;
    address(String st,Address ad)
    {
        street=st;
        this.ad=ad;

    void add()
    {
        System.out.println(street);
        System.out.println(ad.place);
    }  
    public static void main(String args[])
    {
        City ob=new City("Chennai");
        City obj=new City("Devakottai");
        Address ob2=new Address("2nd street",ob);
        Address obj2=new Address("3rd street",obj);
        obj.add();
    }  

    }
}