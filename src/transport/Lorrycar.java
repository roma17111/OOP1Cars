package transport;

public class Lorrycar extends Car implements Сompeting{
    public Lorrycar(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }


    @Override
    public void race() {
        System.out.println("Cегодня проходит гонка в классе легковых Грузовых автомобилей");
        start();
        stop();
    }

    @Override
    public void pitStop() {
        System.out.println("Грузовик  " + getBrand() +" "+
                getModel() +"С обьёмом двигателя "+getEngineVolume()
                + " литров заезжает на пит-стоп. ");
        System.out.println("Пит-стоп окончен");
    }

    @Override
    public void bestTimeOfLap() {
        System.out.println("грузовик "
                + getBrand() + " выезжает из питстопа и" +
                "и заезжает на круг. Лучшее время круга 3 минуты и 56 секунд пока никому не удалось побить");
    }

    @Override
    public void maxSpeed() {
        System.out.println("максимальная скорость на трассе 120 километров в час - это абсолютный рекорд");
    }
    public void addPitstopLorry() {
        pitStop();
        bestTimeOfLap();
        maxSpeed();
    }
}
