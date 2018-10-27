//Created by: Chris Padgett
//Date: 9/26/18
//Last updated 10/27/18

public enum ItemType {
  //Pretty much like saying this
  //ItemType AUDIO = new ItemType("AU");
  //Constants creation
  AUDIO("AU"),
  VISUAL("VI"),
  AUDIO_MOBILE("AM"),
  VISUAL_MOBILE("VM");

  private final String code;

  ItemType(String code) {
    this.code = code;
  }

  public String getCode() {
    return code;
  }
}
