package Example;
public class Seljuqturks063_03 {
private int id;
private String street;
private String city;
private String country;
public int getId() {
return id;
}
public void setId(int id) {
this.id = id;
}
public String getStreet() {
return street;
}
public void setStreet(String street) {
this.street = street;
}
public String getCity() {
return city;
}
public void setCity(String city) {
this.city = city;
}
public String getCountry() {
return country;
}
public void setCountry(String country) {
this.country = country;
}
public Seljuqturks063_03() {
}
@Override
public String toString() {
return "Seljuqturks063_03{" +
"id=" + id +
", street='" + street + '\'' +
", city='" + city + '\'' +
", country='" + country + '\'' +
'}';
 }
public Seljuqturks063_03(int id, String street, String city, String country) {
this.id = id;
this.street = street;
this.city = city;
this.country = country;
}
}
