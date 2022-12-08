import Transport.Car;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Lada", "Granta", 2015, "Россия(и)",
                "Желтый(того)", 280,1.7, "автомат", "седан", "х000хх000",
                4);
        Car car2 = new Car("Audi ", "A8 50 L TDI quattro", 2020, "Германии(я)",
        "черный", 300,3.0, "Ручная","седан", "х000хх000", 5);
        Car car3 = new Car("черный boomer", "Z8", 2021, "Германия", "черный",
                300,3.0, "ручная", "хетчбэк", "х000хх000", 6);
        Car car4 = new Car("Kia", "Sportage 4-го поколения", 2018, "Южной Корее(Южная Корея)",
                "красный", 260,2.4, "автомат", "седан", "х000хх000", 5);
        Car car5 = new Car("Hyundai", "Avante", 2016, "Южная корея(Южной Корее)",
                "оранжевый", 280,1.6, "ручная", "седан", "х000хх000", 5);




        car2.setTypeOfTiresCar(true);
        car5.setTypeOfTiresCar(true);



        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);
        System.out.println(car5);


    }
}