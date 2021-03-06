package in.pbaldu.cba;

public class City {
  private final double latitude;
  private final String name;
  private final double longitude;

  // Kutaisi,Kutaisi,42.24999086,42.72999101,181141.5,Georgia,GE,GEO,Imereti
  public City(String name, double latitude, double longitude) {
    this.name = name;
    this.latitude = latitude;
    this.longitude = longitude;
  }

  public double getLatitude() {
    return latitude;
  }

  public double getLongitude() {
    return longitude;
  }

  public String getName() {
    return name;
  }
}
