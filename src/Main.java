import Transport.*;

import java.util.Arrays;
//import Transport.Train;

public class Main {
    public static void main(String[] args) {
      /*  Car car1 = new Car("Lada", "Granta", 2015, "Россия(и)",
                "Желтый(того)", 280,1.7,
                "автомат", "седан", "х000хх000",
                4,45.45);
        Car car2 = new Car("Audi ", "A8 50 L TDI quattro", 2020,
                "Германии(я)",
        "черный", 300,3.0, "Ручная","седан",
                "х000хх000", 5,25.45);
        Car car3 = new Car("черный boomer", "Z8",
                2021, "Германия", "черный",
                300,3.0, "ручная",
                "хетчбэк", "х000хх000", 6,56.23);
        Car car4 = new Car("Kia", "Sportage 4-го поколения", 2018, "Южной Корее(Южная Корея)",
                "красный", 260,2.4,
                "автомат", "седан",
                "х000хх000", 5, 45.56);
        Car car5 = new Car("Hyundai", "Avante", 2016,
                "Южная корея(Южной Корее)",
                "оранжевый", 280,1.6,
                "ручная", "седан",
                "х000хх000", 5,76.21);








        car2.setTypeOfTiresCar(true);
        car5.setTypeOfTiresCar(true);



        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);
        System.out.println(car5);


        Train train1 = new Train("Ласточка", "В-901", 2011, "Россия",
                null, 301, 3500, 12.00, "Белорусский вокзал",
                "Минск-пассажирский", 11,45.23);
        Train train2 = new Train("Ленинград", "D-125", 2019, "Россия",
                null, 270, 1700, 12.30, "Ленинградский вокзал",
                "Ленинград-Пассажирский", 8, 23.45);


        System.out.println(train1);
        train1.checkModel();
        System.out.println(train2);
        train2.checkModel();

        Bus bus1 = new Bus("Икарус", null, 1992,
                "Россия", "серо-буро-малиновый",
                140,65.33);
        Bus bus2 = new Bus("Вольво", null, 2020,
                "Щвеция", "рыжий",
                240,46.34);
        Bus bus3 = new Bus("Мерседес", "B-class" , 2010,
                "Германия", "синий",
                223,45.76);
        System.out.println(bus1);
        System.out.println(bus2);
        System.out.println(bus3);

        car1.refill();
        bus3.refill();
*/
        Passengercar passengercar1 = new Passengercar("Феррари", "Enszo", 4.7);
        Passengercar passengercar2 = new Passengercar("Паганни", "Зонда", 4.5);
        Passengercar passengercar3 = new Passengercar("Бугатти", "veron supersport", 5.2);
        Passengercar passengercar4 = new Passengercar(null, "supersport", 4.2);
        passengercar1.race();

        Bus bus1 = new Bus("Mersedes", "b-class", 2.4);
        Bus bus2 = new Bus("volvo", "class1", 1.4);
        Bus bus3 = new Bus("Mersedes", null, 2.3);
        Bus bus4 = new Bus("икарус", null, 4.3);
        Bus[] bus = {bus1, bus2, bus3, bus4};

        bus1.race();

        Lorrycar lorrycar1 = new Lorrycar("Hunday", null, 3.3);
        Lorrycar lorrycar2 = new Lorrycar("infiniti", null, 4.3);
        Lorrycar lorrycar3 = new Lorrycar("Камаз", null, 6.3);
        Lorrycar lorrycar4 = new Lorrycar(null, null, 6.3);
        lorrycar1.race();
        passengercar1.addPitstop();
        passengercar2.addPitstop();
        passengercar3.addPitstop();
        passengercar4.addPitstop();
        bus1.addPitstopBus();
        bus2.addPitstopBus();
        bus3.addPitstopBus();
        bus4.addPitstopBus();
        lorrycar1.addPitstopLorry();
        lorrycar2.addPitstopLorry();
        lorrycar3.addPitstopLorry();
        lorrycar4.addPitstopLorry();

        Driver<Passengercar> driver1 = new Driver("Семёнов артём анатольевич",
                true, 21);
        Driver1<Bus> driver2 = new Driver1("Алексеев Вячеслав анатольевич", true, 12);
        Driver2<Lorrycar> driver3 = new Driver2("Якименко Вероника Владимировна", true, 123);

        driver1.start(passengercar1);
        driver2.start(bus1);
        driver3.start(lorrycar2);
        driver1.refill();
        driver2.refill();
        driver3.stop();


    }
}