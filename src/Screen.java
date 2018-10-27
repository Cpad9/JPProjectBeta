//Created by: Chris Padgett
//Date: 9/26/18
//Last updated 10/27/18

public class Screen implements ScreenSpec {

  //Variable Initialization

  protected String resolution;
  protected int refreshRate;
  protected int responseTime;

  public Screen(String resolution, int refreshRate, int responseTime) {
    this.resolution = resolution;
    this.refreshRate = refreshRate;
    this.responseTime = responseTime;
  }

  //Method Overrides
  @Override
  public String getResolution() {
    return resolution;
  }

  @Override
  public int getRefreshRate() {
    return refreshRate;
  }

  @Override
  public int getResponseTime() {
    return responseTime;
  }

  //toString OR
  public String toString() {
    String str;
    str = "Resolution: " + resolution + "\n" +
        "Refresh Rate: " + refreshRate + "\n" +
        "Response Time: " + responseTime;
    return str;
  }
}
