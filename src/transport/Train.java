package transport;

public class Train  extends Transport{
    public Train(String brand, String model) {
        super(brand, model);
    }
    /*
    private int priceOfTrip;
    private double timeOfTrip;
    private String departureStation;
    private String finishStation;
    private int numberOfWagons;



    public Train(String brand, String model,
                 int year, String country,
                 String color, int maxSpeed,
                 int priceOfTrip, double timeOfTrip,
                 String departureStation, String finishStation,
                 int numberOfWagons,
                 double fuelPercentage) {
        super(brand, model, year, country, color, maxSpeed,fuelPercentage);
        setPriceOfTrip(priceOfTrip);
        setTimeOfTrip(timeOfTrip);
        setDepartureStation(departureStation);
        setFinishStation(finishStation);
        setNumberOfWagons(numberOfWagons);
    }

    public int getPriceOfTrip() {
        return priceOfTrip;
    }

    public void setPriceOfTrip(int priceOfTrip) {
        if (priceOfTrip > 0) {
            this.priceOfTrip = priceOfTrip;
        } else {
            this.priceOfTrip = Math.abs(priceOfTrip);
        }
    }

    public double getTimeOfTrip() {
        return timeOfTrip;
    }

    public void setTimeOfTrip(double timeOfTrip) {
        if (timeOfTrip < 0) {
            this.timeOfTrip = Math.abs(timeOfTrip);
        } else {
            this.timeOfTrip = timeOfTrip;
        }
    }

    public String getDepartureStation() {
        return departureStation;
    }

    public void setDepartureStation(String departureStation) {
        if (departureStation == null || departureStation.isEmpty()) {
            this.departureStation = "Default";
        } else {
            this.departureStation = departureStation;
        }
    }

    public String getFinishStation() {
        return finishStation;
    }

    public void setFinishStation(String finishStation) {
        if (finishStation == null || finishStation.isEmpty()) {
            this.finishStation = "Default";
        } else {
            this.finishStation = finishStation;
        }
    }

    public int getNumberOfWagons() {
        return numberOfWagons;
    }

    public void setNumberOfWagons(int numberOfWagons) {
        if (numberOfWagons <= 0) {
            this.numberOfWagons = 4;
        } else {
            this.numberOfWagons = numberOfWagons;
        }
    }

    public void checkModel() {
        if (!Character.isAlphabetic(getModel().charAt(0)) || !Character.isDigit(getModel().charAt(2)) ||
                !Character.isDigit(getModel().charAt(3)) || !Character.isDigit(getModel().charAt(4)) ||
                Character.isAlphabetic(getModel().charAt(1)) || Character.isDigit(getModel().charAt(1))) {
            System.out.println("Ошибочный номер модели");
        }else {
            System.out.println("Всё Ок");
        }
    }

    @Override
    public void refill() {
        setFuelPercentage(100.00);
        System.out.println("Ваш поезд" + getBrand() +" заправлен  дизелем ");
        System.out.println(" количество топлива %: " + getFuelPercentage());
    }

    @Override
    public String toString() {

        return"Поезд " + getBrand() + " Модель " + getModel() + " " + getYear() + " год выпуска в " + getCountry() +
                " скорость передвижения - " + getMaxSpeed() + "\n" +  " км/ч, станция отправления: " +
                getDepartureStation() + " И станция назначения:" + getFinishStation() + " Цена поездки: " +
                getPriceOfTrip() + "\n" + " рублей. В поезде " + getNumberOfWagons() + " вагонов. " +
                " Остаток топлива в % " + getFuelPercentage()
                ;
    }*/
}
