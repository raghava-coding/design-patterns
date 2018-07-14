public class Glider extends AirplaneBuilder {
    Glider(String customer) {
        super.customer = customer;
        super.type = "Glider v9.0";
    }

    public void buildWings() {
       airplane.setWingspan(59.1f);
    }

    public void buildPowerPlant() {
    }

    public void buildAvionics() {

    }

    public void buildSeats() {
        airplane.setPassengerSeats(0);
        airplane.setCrewSeats(1);
    }
}
