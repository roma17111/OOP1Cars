package Transport;

public class Bus extends Transport {

    public Bus(String brand, String model, int year, String country, String color, int maxSpeed) {
        super(brand, model, year, country, color, maxSpeed);
    }

    @Override
    public String toString() {
        return "Автобус " + getBrand() + " Модель " + getModel() + " год производства " + getYear() +
                "\n" + " Страна производства " + getCountry() + " Цвет " + getColor() + " Сколько он может ехать? " +
                getMaxSpeed() + " КМ/Ч";
    }
}
