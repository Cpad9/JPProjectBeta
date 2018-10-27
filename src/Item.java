//Created by: Chris Padgett
//Date: 9/26/18
//Last updated 10/27/18

import java.util.Date;

//Interface, All these must be implemented into items
public interface Item {

  public static final String MANUFACTURER = "OracleProduction";

  public void setProductionNumber(int productionNumber);

  public void setName(String name);

  public String getName();

  public Date getManufactureDate();

  public int getSerialNumber();
}
