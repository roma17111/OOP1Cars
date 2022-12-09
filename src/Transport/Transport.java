package Transport;

public abstract class Transport {
    private final String brand;
    private final String model;
   /* private final int year;
    private final String country;
    private String color;
    private int maxSpeed;

    double fuelPercentage;

    public abstract void refill();*/


    public Transport(String brand, String model/*, int year, String country,
                     String color,
                     int maxSpeed,
                     double fuelPercentage*/) {
        if (brand == null || brand.isEmpty()) {
            this.brand = "NO NAME";
        } else {
            this.brand = brand;
        }

        if (model == null || model.isEmpty()) {
            this.model = "Default";
        } else {
            this.model = model;
        }

       /* this.year = year;
        this.country = country;
        setColor(color);
        setMaxSpeed(maxSpeed);
        setFuelPercentage(fuelPercentage);*/
    }


    /*public Transport(String brand, String model, int year, String country, String color) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.country = country;
        setColor(color);
        this.maxSpeed = 250;
    }*/

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

  /*  public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public double getFuelPercentage() {
        return fuelPercentage;
    }

    public void setFuelPercentage(double fuelPercentage) {
        if (fuelPercentage > 100 || fuelPercentage < 0) {
            this.fuelPercentage = 0.00;
        } else {
            this.fuelPercentage = fuelPercentage;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color == null || color.isEmpty()) {
            this.color = "Not Information";
        } else {
            this.color = color;
        }
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        if (maxSpeed < 100 || maxSpeed > 450) {
            this.maxSpeed = 100;
        } else {
            this.maxSpeed = maxSpeed;
        }
    }*/
}
