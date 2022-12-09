package Transport;

public class Passengercar extends Car {
    public Passengercar(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }


    @Override
    public void race() {
        System.out.println("Cегодня проходит гонка в классе легковых автомобилей");
        start();
        stop();
    }
}

