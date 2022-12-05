public class Car {
        private String brand;
        private String model;
        private int year;
        private String country;
        private String color;
        private double engineVolume;

    public Car(String brand, String model, int year, String country, String color, double engineVolume) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.country = country;
        this.color = color;
        this.engineVolume = engineVolume;
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
