package Transport;

import java.util.Locale;

public class Bus extends Car {
    public Bus(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public String getModel() {
        return super.getModel().toLowerCase();
    }

    @Override
    public void race() {
        System.out.println("Cегодня проходит гонка в классе Автобусов-автомобилей");
        start();
        stop();
    }

    /*public Bus(String brand, String model, int year, String country, String color, int maxSpeed, double fuelPercentage) {
        super(brand, model, year, country, color, maxSpeed, fuelPercentage);
    }
    @Override
    public void refill() {
        setFuelPercentage(100.00);
        System.out.println("Ваш Автобус " + getBrand() +" заправлен  бензином ");
        System.out.println(" количество топлива %: " + getFuelPercentage());
    }

    @Override
    public String toString() {
        return "Автобус " + getBrand() + " Модель " + getModel() + " год производства " + getYear() +
                "\n" + " Страна производства " + getCountry() + " Цвет " + getColor() + " Сколько он может ехать? " +
                getMaxSpeed() + " КМ/Ч" +
                " Остаток топлива в % " + getFuelPercentage();
    }*/
}
