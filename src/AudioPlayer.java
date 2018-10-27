//Created by: Chris Padgett
//Date: 9/26/18
//Last updated 10/27/18

public class AudioPlayer extends Product implements MultimediaControl {

  protected String audioSpecification;
  protected ItemType mediaType;

  //Constructor that sets name and specification, defaults the mediaType.
  public AudioPlayer(String name, String specification) {
    super(name);
    audioSpecification = specification;
    mediaType = ItemType.AUDIO;
  }

  //Override Methods
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
    String str = super.toString() + "\n" +
        "Audio Specification: " + audioSpecification + "\n" +
        "Type: " + mediaType;
    return str;
  }

}
