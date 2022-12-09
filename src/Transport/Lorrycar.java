package Transport;

public class Lorrycar extends Car{
    public Lorrycar(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }


    @Override
    public void race() {
        System.out.println("Cегодня проходит гонка в классе легковых Грузовых автомобилей");
        start();
        stop();
    }
}
