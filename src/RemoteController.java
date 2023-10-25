public class RemoteController {

  private Device device;

  public RemoteController(Device d) {
    device = d;
  }

  public void turnOn() {
    device.turnOn();
  }

  public void turnOff() {
    device.turnOff();
  }

  public void up() {
    device.up();
  }

  public void down() {
    device.down();
  }
}
