public class TV implements Device {

  String state = "off";
  int channel = 7;

  @Override
  public void turnOn() {
    if (state == "off") {
      state = "on"; //如果電視尚未打開 則打開電視
      printState();
    } else {
      System.out.println("TV already turn on"); //如果電視已經打開 則通知已經打開
    }

  }

  @Override
  public void turnOff() {
    if (state == "on") {
      state = "off"; //如果電視尚未關閉 則關閉電視
      printState();
    } else {
      System.out.println("TV already turn off"); //如果電視已經關閉 則通知已經關閉
    }
  }

  //調高頻道 1 台
  @Override
  public void up() {
    if (state == "on") {
      if (channel < 15)
        channel++;
      else
        channel = 15;

      printChannel();
    } else {
      printAlert(); //若電視尚未打開 提醒應先打開電視
    }
  }

  //調低頻道 1 台
  @Override
  public void down() {
    if (state == "on") {
      if (channel <= 1)
        channel = 1;
      else
        channel--;

      printChannel();
    } else {
      printAlert(); //若電視尚未打開 提醒應先打開電視
    }
  }

  private void printState() {
    System.out.println("TV is " + state);
  }

  private void printChannel() {
    System.out.println("The TV channel is " + channel);
  }

  private void printAlert() {
    System.out.println("TV is off, turn on the tv first");
  }
}
