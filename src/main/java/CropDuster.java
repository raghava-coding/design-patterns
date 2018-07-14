public class CropDuster extends AirplaneBuilder {

    CropDuster(String customer) {
        super.customer = customer;
        super.type = "CropDuster v3.4";
    }

    public void buildWings() {
        airplane.setWingspan(9f);
    }

    public void buildPowerPlant() {
        airplane.setPowerPlant("single piston");
    }

    public void buildAvionics() {
    }

    public void buildSeats() {
        airplane.setPassengerSeats(1);
        airplane.setCrewSeats(1);
    }
}
