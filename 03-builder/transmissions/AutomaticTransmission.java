package transmissions;

public class AutomaticTransmission implements Transmission {

  private int speeds;

  public AutomaticTransmission(int speeds) {
    this.speeds = speeds;
  }

  @Override
  public String getTransmissionType() {
    return "Automatic";
  }

  @Override
  public int getNumberOfSpeeds() {
    return this.speeds;
  }

  @Override
  public String toString() {
    return "Automatic transmission with " + speeds + " speeds.";
  }
}
