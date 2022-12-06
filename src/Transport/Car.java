package Transport;

import java.time.LocalDate;
import java.util.Locale;
public class Car {
    private final String brand;
    private final String model;
    private final int year;
    private final String country;
    private String color;
    private double engineVolume;

    private String transmission;
    private String bodyType;
    private String registrationNumber;
    private  int numberOfSeats;
    private boolean typeOfTiresCar;


    public Car(String brand, String model, int year, String country, String color, double engineVolume,
    String transmission, String bodyType, String registrationNumber, int numberOfSeats) {
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
        if (transmission.equalsIgnoreCase("автомат") || transmission.equalsIgnoreCase("автоматическая") ||
                transmission.equalsIgnoreCase("ручная") || transmission.equalsIgnoreCase("ручка")) {
            this.transmission = transmission;
        }else {
            this.transmission = "not information";
        }
        if (bodyType == null || bodyType.isEmpty()) {
            this.bodyType = "not information";
        }else {
            this.bodyType = bodyType;
        }
        if (registrationNumber == null || registrationNumber.isEmpty()) {
            this.registrationNumber = "not information";
        }  else {
            this.registrationNumber = registrationNumber;
        }
        if (numberOfSeats < 0) {
            this.numberOfSeats = 0;
        } else if (numberOfSeats > 8) {
            this.numberOfSeats = 4;
        } else {
            this.numberOfSeats = numberOfSeats;
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

    public String getTransmission() {
        return transmission;
    }

    public String getBodyType() {
        return bodyType;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public boolean isTypeOfTiresCar() {
        typeOfTiresCar = !typeOfTiresCar;
        return typeOfTiresCar;
    }

    public void setTypeOfTiresCar(boolean typeOfTiresCar) {
        this.typeOfTiresCar = typeOfTiresCar;
    }

    public void setColor(String color) {
        if (color == null || color == "")
            this.color = "белый";
        else {
            this.color = color;
        }
    }



    public void setBodyType(String bodyType) {
        if (bodyType == null || bodyType.isEmpty()) {
            this.bodyType = "eRROr";
        }else {
            this.bodyType = bodyType;
        }
    }

    public void setRegistrationNumber(String registrationNumber) {
        if (registrationNumber == null || registrationNumber.isEmpty()) {
            this.registrationNumber = "not information";
        }  else {
            this.registrationNumber = registrationNumber;
        }
    }

    public boolean isCorrectNumber(String registrationNumber) {
        if (registrationNumber.length() != 9) {
            return false;}
        char [] nums = registrationNumber.toCharArray();
        if (!Character.isAlphabetic(nums[0]) || !Character.isAlphabetic(nums[4]) ||
                !Character.isAlphabetic(nums[5]) ) {
            return false;
        }else if (!Character.isDigit(nums[1]) || !Character.isDigit(nums[2]) || !Character.isDigit(nums[3]) ||
                !Character.isDigit(nums[6]) || !Character.isDigit(nums[7]) || !Character.isDigit(nums[8])) {
            return false;
        }

        return true;
    }


    @Override
    public String toString() {
        return
                brand +
                        " " + model +
                        ". год выпуска " + year +
                        ". сборка " + country +
                        ". " + color +
                        " цвет. объем двигателя — " + engineVolume + " Л." +
                " Трансмиссия: " +  transmission +" тип кузова: " + bodyType + " регистрационный номер: " +
                        registrationNumber +" количество мест: " + numberOfSeats +
                " тип резины: " + (isTypeOfTiresCar()? "Летняя" : "Зимняя");
    }
}
