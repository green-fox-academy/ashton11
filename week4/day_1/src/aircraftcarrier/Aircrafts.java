package aircraftcarrier;

public class Aircrafts {
   String type ;


    private Aircrafts(String type){
        this.type= type;
    }

    public static Aircrafts make(String type) {
        if(!type.equals("f35") && !type.equals("f16")) {
            return null;
        }
        return new Aircrafts(type);
    }

}
