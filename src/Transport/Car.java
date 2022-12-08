package Transport;

import java.time.LocalDate;
import java.util.Locale;

public class Car extends Transport {

    public static class Insurance {


        private LocalDate expireDate;
        private final double cost;
        private final String number;

        public Insurance(LocalDate expireDate, double cost, String number) {
            if (expireDate == null) {
                this.expireDate = LocalDate.now().plusDays(365);
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

        public Insurance() {
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





    private String color;
    private double engineVolume;

    private String transmission;
    private String bodyType;
    private String registrationNumber;
    private int numberOfSeats;
    private boolean typeOfTiresCar;

    private Key key;

    private Insurance insurance;




    public Car(String brand, String model, int year, String country, String color, int maxSpeed, double engineVolume,
               String transmission, String bodyType, String registrationNumber, int numberOfSeats,double fuelPercentage) {
        super(brand, model , year , country, color , maxSpeed ,fuelPercentage);
        setColor(color);
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
        setBodyType(bodyType);
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
            this.key = new Key();
        }
        this.insurance = new Insurance();
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

    public void setInsurance(Insurance insurance) {
        this.insurance = insurance;
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
    public void refill() {
        System.out.println("Автомобиль " + getBrand() + " подьехал на заправку ");
        setFuelPercentage(100.00);
        System.out.println(" Ваш Автомобиль " + getBrand() +" заправлен  дизелем ");
        System.out.println(" количество топлива %: " + getFuelPercentage());
    }

    @Override
    public String toString() {
        return
                getBrand() +
                        " " + getModel()+
                        ". год выпуска " + getYear() +
                        ". сборка " + getCountry()+
                        ". " + color +
                        " цвет. объем двигателя — " + engineVolume + " Л." + "\n" +
                        " Трансмиссия: " + transmission + " тип кузова: " + bodyType + " регистрационный номер: " +
                        registrationNumber + " количество мест: " + numberOfSeats + "\n" +
                        " тип резины: " + (isTypeOfTiresCar() ? "Летняя" : "Зимняя.") +
                        " Доступ: " + (key.isWithoutKeyAccess() ? " Ключевой " : " бесключевой "
                        + " Запуск: " + (key.isRemoteRuneEngine() ? "разрешен" : "запрещён ") + "\n" + " Страховка: " +
                        " Дата: "
                        + insurance.expireDate + " " + " Номер: " + insurance.number + " Стоимость: " + insurance.cost +
                        " Остаток топлива в % " + getFuelPercentage())
                ;

    }
}
