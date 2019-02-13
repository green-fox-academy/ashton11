package aircraftcarrier;

public class Main {
    public static void main(String[] args) {
        Carrier carrier = new Carrier(3000 , 3000);
        Carrier carrier1 = new Carrier(2700 , 4000);
        Aircrafts aircraft = Aircrafts.make("f35");
        Aircrafts aircraft2 = Aircrafts.make("f35");
        Aircrafts aircraft3 = Aircrafts.make("f16");
        Aircrafts aircraft4 = Aircrafts.make("f35");
        carrier.addAircraft(aircraft);
        carrier.addAircraft(aircraft2);
        carrier1.addAircraft(aircraft3);
        carrier1.addAircraft(aircraft4);
        carrier.fill();
        carrier.getStatus();
        carrier.fight(carrier1);
        carrier1.getStatus();
        carrier.getStatus();


    }
}
