package transport;

public class Driver1<D extends Bus> {
    private final String fullName;
    private boolean license;
    private int experience;



    public Driver1(String fullName, boolean license, int experience) {
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

    public void start(D bus) {
        System.out.println("\n" + "Водитель " + getFullName() +
                " управляющий автобусом " + bus.getBrand() + " " + bus.getModel() + "\n"
                + " и будет участвовать в заезде" );
        bus.printInfoAboutCars();
    }

    public void stop() {
        System.out.println("Водитель "+ getFullName() +" останавливается.");
    }

    public void refill() {
        System.out.println("Водитель "+ getFullName() +" заправляет свой транспорт.");
    }
}
