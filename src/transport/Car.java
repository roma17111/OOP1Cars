package transport;


public abstract class Car extends Transport implements Сompeting{



    private double engineVolume;

    public Car(String brand, String model, double engineVolume) {
        super(brand, model);
        setEngineVolume(engineVolume);
    }

    public void setEngineVolume(double engineVolume) {
        if (engineVolume < 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public static void start() {
        System.out.println("Автомобили начинают движение");
    }

    public static void stop() {
        System.out.println("Автомобили заканчиваютдвижение");
    }

    public abstract void race();
}
