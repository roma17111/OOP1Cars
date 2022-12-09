package Transport;

public class Passengercar extends Car implements Сompeting{
    public Passengercar(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public String getBrand() {
        return super.getBrand().toUpperCase();
    }

    @Override
    public void race() {
        System.out.println("Cегодня проходит гонка в классе легковых автомобилей");
        start();
        stop();
    }




    @Override
    public void pitStop() {
        System.out.println("Автомобиль " + getBrand() +" "+
                getModel() +"С обьёмом двигателя "+getEngineVolume()
                + " литров заезжает на пит-стоп. ");
        System.out.println("Пит-стоп окончен");
    }

    @Override
    public void bestTimeOfLap() {
        System.out.println("Автомобиль"
                + getBrand() + " выезжает из питстопа и" +
                "и заезжает на круг. Лучшее время круга 1 минуту и 5 секунд пока никому не удалось побить");
    }

    @Override
    public void maxSpeed() {
        System.out.println("максимальная скорость на трассе 350 километров в час - это абсолютный рекорд");
    }
    public void addPitstop() {
        pitStop();
        bestTimeOfLap();
        maxSpeed();
    }

}

