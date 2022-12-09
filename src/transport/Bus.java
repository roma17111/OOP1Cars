package transport;


public class Bus extends Car implements Сompeting{
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

    @Override
    public void pitStop() {
        System.out.println("Автобус " + getBrand() +" "+
                getModel() +"С обьёмом двигателя "+getEngineVolume()
                + " литров заезжает на пит-стоп. ");
        System.out.println("Пит-стоп окончен");
    }

    @Override
    public void bestTimeOfLap() {
        System.out.println("Автобус"
        + getBrand() + " выезжает из питстопа и" +
                "и заезжает на круг. Лучшее время круга 2 минуты и 56 секунд пока никому не удалось побить");
    }

    @Override
    public void maxSpeed() {
        System.out.println("максимальная скорость на трассе 150 километров в час - это абсолютный рекорд");
    }

    public void addPitstopBus() {
        pitStop();
        bestTimeOfLap();
        maxSpeed();
    }

}
