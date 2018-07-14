public class Client {
    public static void main(String args[]) {
        AerospaceEngineer aerospaceEngineer = new AerospaceEngineer();

        AirplaneBuilder builder = new CropDuster("Farmer Joe");
        aerospaceEngineer.setAirplaneBuilder(builder);
        aerospaceEngineer.constructAirplane();
        System.out.println(aerospaceEngineer.getAirplane().getType());

        builder = new FighterJet("Navy");
        aerospaceEngineer.setAirplaneBuilder(builder);
        aerospaceEngineer.constructAirplane();
        System.out.println(aerospaceEngineer.getAirplane().getType());
    }
}
