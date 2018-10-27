//Created by: Chris Padgett
//Date: 9/26/18
//Last updated 10/27/18

import java.util.Date;


public class Product implements Item, Comparable<Item> {

  //Variable initialization
  protected int serialNumber;
  protected String manufacturer;
  protected Date manufacturedOn;
  protected String name;

  //Class Variable
  private static int currentProductionNumber = 1;

  //Constructor with String name
  public Product(String name) {
    setName(name);
    setProductionNumber(currentProductionNumber++);
    manufacturer = MANUFACTURER;
    manufacturedOn = new Date();
  }

  //Override Methods
  @Override
  public void setProductionNumber(int productionNumber) {
    serialNumber = productionNumber;
  }

  @Override
  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String getName() {
    return name;
  }

  @Override
  public Date getManufactureDate() {
    return manufacturedOn;
  }

  @Override
  public int getSerialNumber() {
    return serialNumber;
  }

  //To String
  public String toString() {
    String output = "Manufacturer: " + manufacturer + "\n" +
        "Serial Number: " + serialNumber + "\n" +
        "Date: " + manufacturedOn + "\n" +
        "Name: " + name + "\n";
    return output;
  }

  //Using Comparable<Item>
  @Override
  public int compareTo(Item o) {
    return name.compareTo(o.getName());
  }
}
