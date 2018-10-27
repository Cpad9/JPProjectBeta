//Created by: Chris Padgett
//Date: 9/26/18
//Last updated 10/27/18

public class MoviePlayer extends Product implements MultimediaControl {

  //Create Screen, MonitorType
  private Screen screen;
  private MonitorType monitorType;

  //Constructor with Name, Sets a default Screen and MonitorType
  public MoviePlayer(String name) {
    super(name);
    screen = new Screen("1024x768", 60, 10);
    monitorType = MonitorType.LCD;
  }

  //Constructor with Name Screen and Monitor Type
  public MoviePlayer(String name, Screen screen, MonitorType type) {

    super(name);

    this.screen = screen;

    this.monitorType = type;

  }

  //Override methods
  @Override
  public void play() {
    System.out.println("Playing");
  }

  @Override

  public void stop() {
    System.out.println("Stopped");
  }

  @Override

  public void previous() {
    System.out.println("Previous");
  }

  @Override

  public void next() {
    System.out.println("Next");
  }


  public String toString() {
    return super.toString() + "\n" +
        screen.toString() + "\n" +
        "Monitor Type: " + monitorType;

  }


}