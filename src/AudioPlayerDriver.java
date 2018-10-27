//Created by: Chris Padgett
//Date: 9/26/18
//Last updated 10/27/18

public class AudioPlayerDriver {

  //Test AudioPlayer
  public static void main(String[] args) {
    AudioPlayer player = new AudioPlayer("myAudioPlayer", "mySpec");
    System.out.println("Created an audio player and calling methods...");
    System.out.println(player);
    player.play();
    player.previous();
    player.next();
    player.stop();
  }
}

