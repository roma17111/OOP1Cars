package Transport;

public class Car {
    private String brand;
    private String model;
    private int year;
    private String country;
    private String color;
    private double engineVolume;

    private String transmission;
    private String bodyType;
    private String registrationNumber;
    private int numberOfSeats;
    private boolean typeOfTiresCar;


    public Car(String brand, String model, int year, String country, String color, double engineVolume) {
        if (brand == null || brand == "")
            this.brand = "Default";
        else {
            this.brand = brand;
        }

        if (model == null || model == "")
            this.model = "Default";
        else {
            this.model = model;
        }
        if (year < 0) {
            this.year = 2000;
        } else {
            this.year = year;
        }

        if (country == null || country == "")
            this.country = "Default";
        else {
            this.country = country;
        }

        if (color == null || color == "")
            this.color = "белый";
        else {
            this.color = color;
        }
        if (engineVolume < 0.0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
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

    public double getEngineVolume() {
        return engineVolume;
    }

    @Override
    public String toString() {
        return
                brand +
                        " " + model +
                        ". год выпуска " + year +
                        ". сборка " + country +
                        ". " + color +
                        " цвет. объем двигателя — " + engineVolume + " Л."
                ;
    }
}
