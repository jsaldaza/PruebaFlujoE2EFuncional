package co.com.demoblaze.tests.models.builder;

import co.com.demoblaze.tests.models.ComprarProductos;
import co.com.demoblaze.tests.utils.Builder;

public class ComprarProductosBuilder implements Builder<ComprarProductos> {
    private String name;
    private String country;
    private String city;
    private String creditCard;
    private String month;
    private String year;




    public static ComprarProductosBuilder informacionCompraProductos(){return new ComprarProductosBuilder();}
    public ComprarProductosBuilder withname(String name) {this.name = String.valueOf(name);return this;}
    public ComprarProductosBuilder withcountry(String country) {this.country = String.valueOf(country);return this;}
    public ComprarProductosBuilder withcity(String city) {this.city = String.valueOf(city);return this;}
    public ComprarProductosBuilder withcreditCard(String creditCard) {this.creditCard = String.valueOf(creditCard);return this;}
    public ComprarProductosBuilder withmonth(String month) {this.month = String.valueOf(month);return this;}
    public ComprarProductosBuilder withyear(String year) {this.year = String.valueOf(year);return this;}



    public String getName() {return name;}
    public String getCountry() {return country;}
    public String getCity() {return city;}
    public String getCreditCard() {return creditCard;}
    public String getMonth() {return month;}
    public String getYear() {return year;}


@Override
public ComprarProductos builder(){return new ComprarProductos(this);}
}
