package in.pbaldu.cba;

import java.util.Random;

public class Humidity {
  private final Random generator;

  public Humidity() {
    generator = new Random();
  }
  public double at(double latitude, double longitude) {
    return generator.nextInt(70) + 20.0;
  }
}
