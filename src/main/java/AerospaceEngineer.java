public class AerospaceEngineer {
    private AirplaneBuilder airplaneBuilder;

    public void setAirplaneBuilder(AirplaneBuilder airplaneBuilder) {
        this.airplaneBuilder = airplaneBuilder;
    }

    public void constructAirplane() {
        airplaneBuilder.createAirplane();
        airplaneBuilder.buildAvionics();
        airplaneBuilder.buildPowerPlant();
        airplaneBuilder.buildSeats();
        airplaneBuilder.buildWings();
    }

    public Airplane getAirplane() {
        return airplaneBuilder.getAirplane();
    }
}
