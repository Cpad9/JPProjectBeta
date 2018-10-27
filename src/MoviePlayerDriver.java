//Created by: Chris Padgett
//Date: 9/26/18
//Last updated 10/27/18

//Driver Class
public class MoviePlayerDriver {

  //Main method to test MoviePlayer.java
  public static void main(String[] args) {
    MoviePlayer player = new MoviePlayer("Movie player");
    //TESTING TESTING
    //MoviePlayer player1=new MoviePlayer("Movie player", new Screen  ("1024x720",60,60), MonitorType.LCD);
    System.out.println("Created a movie player and calling methods..");
    System.out.println(player);
    player.play();
    player.previous();
    player.next();
    player.stop();
  }

}