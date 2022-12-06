package Transport;

import java.time.LocalDate;
import java.util.Locale;

public class Car {

    public static class Insurance {


        private LocalDate expireDate;
        private final double cost;
        private final String number;

        public Insurance(LocalDate expireDate, double cost, String number) {
            if (expireDate == null) {
                expireDate = LocalDate.now().plusDays(365);
            } else {
                this.expireDate = expireDate;
            }
            this.cost = cost;
            if (number == null || number.isEmpty()) {
                this.number = "123456789";
            } else {
                this.number = number;
            }
        }

        public Insurance () {
            this(null, 110.111, null);
        }

        public LocalDate getExpireDate() {
            return expireDate;
        }

        public double getCost() {
            return cost;
        }

        public String getNumber() {
            return number;
        }

        public void checkEmpireDate() {
            if (expireDate.isBefore(LocalDate.now()) || expireDate.equals(LocalDate.now())) {
                System.out.println("Нужно срочно оформлять страховку");
            }
        }

        public void checkLongNumber() {
            if (number.length() != 9) {
                System.out.println("Номер страховки некорректен");
            }
        }
    }

    public static class Key {
        private final boolean remoteRuneEngine;
        private final boolean withoutKeyAccess;

        public Key(boolean remoteRuneEngine, boolean withoutKeyAccess) {
            this.remoteRuneEngine = remoteRuneEngine;
            this.withoutKeyAccess = withoutKeyAccess;
        }

        public Key() {
            this(false, false);
        }

        public boolean isRemoteRuneEngine() {
            return remoteRuneEngine;
        }

        public boolean isWithoutKeyAccess() {
            return withoutKeyAccess;
        }
    }

    private final String brand;
    private final String model;
    private final int year;
    private final String country;
    private String color;
    private double engineVolume;

    private String transmission;
    private String bodyType;
    private String registrationNumber;
    private int numberOfSeats;
    private boolean typeOfTiresCar;

    private Key key;

    private Insurance insurance;


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
        } else {
            this.transmission = "not information";
        }
        if (bodyType == null || bodyType.isEmpty()) {
            this.bodyType = "not information";
        } else {
            this.bodyType = bodyType;
        }
        if (registrationNumber == null || registrationNumber.isEmpty()) {
            this.registrationNumber = "not information";
        } else {
            this.registrationNumber = registrationNumber;
        }
        if (numberOfSeats < 0) {
            this.numberOfSeats = 0;
        } else if (numberOfSeats > 8) {
            this.numberOfSeats = 4;
        } else {
            this.numberOfSeats = numberOfSeats;
        }
        if (key == null) {
            this.key = new Key();
        } else {
            this.key = key;
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
        } else {
            this.bodyType = bodyType;
        }
    }

    public void setRegistrationNumber(String registrationNumber) {
        if (registrationNumber == null || registrationNumber.isEmpty()) {
            this.registrationNumber = "not information";
        } else {
            this.registrationNumber = registrationNumber;
        }
    }

    public boolean isCorrectNumber(String registrationNumber) {
        if (registrationNumber.length() != 9) {
            return false;
        }
        char[] nums = registrationNumber.toCharArray();
        if (!Character.isAlphabetic(nums[0]) || !Character.isAlphabetic(nums[4]) ||
                !Character.isAlphabetic(nums[5])) {
            return false;
        } else if (!Character.isDigit(nums[1]) || !Character.isDigit(nums[2]) || !Character.isDigit(nums[3]) ||
                !Character.isDigit(nums[6]) || !Character.isDigit(nums[7]) || !Character.isDigit(nums[8])) {
            return false;
        }

        return true;
    }

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        this.key = key;
    }

    public Insurance getInsurance() {
        return insurance;
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
                        " Трансмиссия: " + transmission + " тип кузова: " + bodyType + " регистрационный номер: " +
                        registrationNumber + " количество мест: " + numberOfSeats +
                        " тип резины: " + (isTypeOfTiresCar() ? "Летняя" : "Зимняя") +
                        "Доступ: " + (key.isWithoutKeyAccess() ? " Ключевой " : " бесключевой "
                        + " Запуск: " + (key.isRemoteRuneEngine() ? "разрешен" : "запрещён"));

    }
}
