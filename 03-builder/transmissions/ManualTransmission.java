package transmissions;

public class ManualTransmission implements Transmission {

  private int speeds;

  public ManualTransmission(int speeds) {
    this.speeds = speeds;
  }

  @Override
  public String getTransmissionType() {
    return "Manual";
  }

  @Override
  public int getNumberOfSpeeds() {
    return this.speeds;
  }

  @Override
  public String toString() {
    return "Manual transmission with " + speeds + " speeds.";
  }
}
