public class Airplane {
    private String type;
    private String customer;
    private float wingspan;
    private String powerPlant;
    private int crewSeats;
    private int passengerSeats;
    private String avionics;

    public Airplane(String customer, String type) {
        this.customer = customer;
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public float getWingspan() {
        return wingspan;
    }

    public void setWingspan(float wingspan) {
        this.wingspan = wingspan;
    }

    public String getPowerPlant() {
        return powerPlant;
    }

    public void setPowerPlant(String powerPlant) {
        this.powerPlant = powerPlant;
    }

    public int getCrewSeats() {
        return crewSeats;
    }

    public void setCrewSeats(int crewSeats) {
        this.crewSeats = crewSeats;
    }

    public int getPassengerSeats() {
        return passengerSeats;
    }

    public void setPassengerSeats(int passengerSeats) {
        this.passengerSeats = passengerSeats;
    }

    public String getAvionics() {
        return avionics;
    }

    public void setAvionics(String avionics) {
        this.avionics = avionics;
    }
}
