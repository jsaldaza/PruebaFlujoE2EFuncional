package co.com.demoblaze.tests.models;

import co.com.demoblaze.tests.models.builder.ComprarProductosBuilder;

public class ComprarProductos {

    private static String name;
    protected static String country;
    private static String city;
    private static String creditCard;
    private static String month;
    private static String year;

    public ComprarProductos(ComprarProductosBuilder comprarProductosBuilder){
        this.name = comprarProductosBuilder.getName();
        this.country = comprarProductosBuilder.getCountry();
        this.city = comprarProductosBuilder.getCity();
        this.creditCard = comprarProductosBuilder.getCreditCard();
        this.month = comprarProductosBuilder.getMonth();
        this.year = comprarProductosBuilder.getYear();
    }

    public static String getName() {return name;}
    public static String getCountry() {return country;}
    public static String getCity() {return city;}
    public static String getCreditCard() {return creditCard;}
    public static String getMonth() {return month;}
    public static String getYear() {return year;}


}
