public class FighterJet extends AirplaneBuilder {
    FighterJet(String customer) {
        super.customer = customer;
        super.type = "F-35 Lighting II";
    }

    public void buildWings() {
        airplane.setWingspan(35.0f);
    }

    public void buildPowerPlant() {
        airplane.setPowerPlant("dual thrust vectoring");
    }

    public void buildAvionics() {
        airplane.setAvionics("military");
    }

    public void buildSeats() {
        airplane.setPassengerSeats(0);
        airplane.setCrewSeats(1);
    }
}
