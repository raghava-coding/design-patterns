public abstract class AirplaneBuilder {
    protected Airplane airplane;
    protected String customer;
    protected String type;

    public Airplane getAirplane() {
        return airplane;
    }

    public void createAirplane() {
        airplane = new Airplane(customer, type);
    }

    public abstract void buildWings();

    public abstract void buildPowerPlant();

    public abstract void buildAvionics();

    public abstract void buildSeats();
}
