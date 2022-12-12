import transport.*;


public class Main {
    public static void main(String[] args) {
        Passengercar passengercar1 = new Passengercar("Феррари", "Enszo",
                4.7, Passengercar.CarBodyType.SEDAN_CAR);
        Passengercar passengercar2 = new Passengercar("Паганни",
                "Зонда", 4.5,Passengercar.CarBodyType.SEDAN_CAR);
        Passengercar passengercar3 = new Passengercar("Бугатти", "veron supersport", 5.2,
                Passengercar.CarBodyType.SEDAN_CAR);
        Passengercar passengercar4 = new Passengercar(null,
                "supersport", 4.2,Passengercar.CarBodyType.SEDAN_CAR);
        passengercar1.race();

        Bus bus1 = new Bus("Mersedes", "b-class", 2.4, Bus.Capacity.LARGE);
        Bus bus2 = new Bus("volvo", "class1", 1.4, Bus.Capacity.MEDIUM);
        Bus bus3 = new Bus("Mersedes", null, 2.3, Bus.Capacity.SMALL);
        Bus bus4 = new Bus("икарус", null, 4.3, Bus.Capacity.MEDIUM);
        Bus[] bus = {bus1, bus2, bus3, bus4};

        bus1.race();

        Lorrycar lorrycar1 = new Lorrycar("Hunday", null, 3.3, Lorrycar.Weight.N1);
        Lorrycar lorrycar2 = new Lorrycar("infiniti", null, 4.3, Lorrycar.Weight.N2);
        Lorrycar lorrycar3 = new Lorrycar("Камаз", null, 6.3, Lorrycar.Weight.N1);
        Lorrycar lorrycar4 = new Lorrycar(null, null, 6.3, Lorrycar.Weight.N3);
        lorrycar1.race();

        Driver3<Passengercar> driver1 = new Driver3("Семёнов артём анатольевич",
                true, 21);
        Driver1<Bus> driver2 = new Driver1("Алексеев Вячеслав анатольевич", true, 12);
        Driver2<Lorrycar> driver3 = new Driver2("Якименко Вероника Владимировна", true, 123);

        driver1.start(passengercar1);
        driver2.start(bus1);
        driver3.start(lorrycar2);
        driver1.refill();
        driver2.refill();
        driver3.stop();

Car.raceStart(passengercar1,passengercar1,passengercar2,passengercar3);
        System.out.println(passengercar2);
        System.out.println(lorrycar1);
        System.out.println(bus1);
    }
}