package aircraftcarrier;

public class Main {
    public static void main(String[] args) {
        Aircrafts aircraft = Aircrafts.make("f35");
        System.out.println(aircraft.type);
        aircraft.type = "ez lett a tipusa";

        System.out.println(aircraft.type);
    }
}
