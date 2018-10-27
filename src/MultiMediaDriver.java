//Created by: Chris Padgett
//Date: 9/26/18
//Last updated 10/27/18

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Driver to sort and print products
public class MultiMediaDriver {

  //Print Method to print Products from list
  private static void print(List<Product> list) {
    for (Product p : list) {
      System.out.println(p + "\n");
    }
  }

  //Main Method to test multiple functions
  public static void main(String[] args) {
    ArrayList<Product> list = new ArrayList<Product>();

    list.add(new AudioPlayer("my AudioPlayer 3", "audioSpec1"));
    list.add(new MoviePlayer("my MoviePlayer 3"));

    list.add(new AudioPlayer("my AudioPlayer 1", "audioSpec1"));
    list.add(new MoviePlayer("my MoviePlayer 1", new Screen("1024x768", 70, 20), MonitorType.LED));

    list.add(new AudioPlayer("my AudioPlayer 2", "audioSpec1"));
    list.add(new MoviePlayer("my MoviePlayer 2"));

    Collections.sort(list);

    print(list);

  }
}