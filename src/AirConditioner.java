public class AirConditioner implements Device {

  String state = "off";
  int degree = 25;

  @Override
  public void turnOn() {
    if (state == "off") {
      state = "on"; //如果冷氣尚未打開 則打開冷氣
      printState();
    } else {
      System.out.println("TV already turn on");//如果冷氣已經打開 則通知已經打開
    }
  }

  @Override
  public void turnOff() {
    if (state == "on") {
      state = "off"; //如果冷氣尚未關閉 則關閉冷氣
      printState();
    } else {
      System.out.println("TV already turn off"); //如果電視已經關閉 則通知已經關閉
    }
  }

  //調高冷氣 1 度
  @Override
  public void up() {
    if (state == "on") {
      if (degree < 30)
        degree++;
      else
        degree = 30;

      printDegree();
    } else {
      printAlert();  //若冷氣尚未打開 提醒應先打開冷氣
    }
  }

  //調低冷氣 1 度
  @Override
  public void down() {
    if (state == "on") {
      if (degree > 20)
        degree--;
      else
        degree = 20;

      printDegree();
    } else {
      printAlert(); //若冷氣尚未打開 提醒應先打開冷氣
    }
  }

  private void printState() {
    System.out.println("AC is " + state);
  }

  private void printDegree() {
    System.out.println("The degree of AC is " + degree);
  }

  private void printAlert() {
    System.out.println("AC is off, turn on the AC first");
  }
}
