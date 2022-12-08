package Transport;

public class Transport {
    protected final String brand;
    protected final String model;
    protected final int year;
    protected final String country;
    protected String color;
    protected int maxSpeed;


    public Transport(String brand, String model, int year, String country, String color, int maxSpeed) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.country = country;
        setColor(color);
        setMaxSpeed(maxSpeed);
    }


    public Transport(String brand, String model, int year, String country, String color) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.country = country;
        setColor(color);
        this.maxSpeed = 250;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color != null || !color.isEmpty()) {
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
    }
}
