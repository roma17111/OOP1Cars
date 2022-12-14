package transport;


public class Driver3<B extends Passengercar>{



    private  String fullName;
    private boolean license;
    private int experience;


    public Driver3(String fullName, boolean license, int experience) {
        this.fullName = fullName;
        this.license = license;
        setExperience(experience);

    }

    public String getFullName() {
        return fullName;
    }


    public boolean isLicense() {
        return license;
    }
    public void setLicense(boolean license) {
        this.license = license;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        if (experience <= 0 || experience > 120) {
            this.experience = experience;
        }else {
            this.experience = experience;}
    }


    public void start(B passengercar) {
            System.out.println("\n" + "Водитель " + getFullName()+ '\n' +
                    " управляющий машиной " + passengercar.getBrand() +" "+ passengercar.getModel()
                    + " и будет участвовать в заезде" );
            passengercar.printInfoAboutCars();
        }

        public void stop() {
            System.out.println("Водитель "+ getFullName() +" останавливается.");
        }

        public void refill() {
            System.out.println("Водитель "+ getFullName() +" заправляет свой транспорт.");
        }
    }



