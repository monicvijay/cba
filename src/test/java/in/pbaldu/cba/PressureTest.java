package in.pbaldu.cba;

import org.junit.Test;

import static org.junit.Assert.*;

public class PressureTest {

  @Test
  public void at_sea_level_the_pressure_is_greater_than_on_a_mountain() {
    final double seaLevel = 0;
    final double mountain = 2000;
    final double temperature = 15.0;

    final double pressureAtSea = Pressure.calculate(seaLevel, temperature);
    final double pressureOnMountain = Pressure.calculate(mountain, temperature);

    assertTrue(pressureAtSea > pressureOnMountain);
  }

  @Test
  public void the_lower_the_tempeature_the_greater_the_pressure() {
    final double seaLevel = 0;
    final double cold = 10.0;
    final double hot = 30.0;

    final double pressureCold = Pressure.calculate(seaLevel, cold);
    final double pressureHot = Pressure.calculate(seaLevel, hot);

    assertTrue(pressureCold > pressureHot);

  }

}