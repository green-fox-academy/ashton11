package aircraftcarrier;

public class Aircrafts {
    String type;
    private int maxAmmo;
    private int currentAmmo;
    private int baseDamage;
    boolean isPriority;
    int damage;

    private Aircrafts(String type) {
        this.type = type;
        isPriority = this.type.equals("f35") ?  true : false;
    }

    public static Aircrafts make(String type) {
        if (!type.equals("f35") && !type.equals("f16")) {
            return null;
        }
        return new Aircrafts(type);
    }

    public void setMaxAmmo() {
        if (type.equals("f35")) {
            maxAmmo = 12;
            currentAmmo = 0;
        } else {
            maxAmmo = 8;
            currentAmmo = 0;
        }
    }

    public int getCurrentAmmo() {
        return currentAmmo;
    }

    public void setBaseDamage() {
        if (type.equals("f35")) {
            baseDamage = 50;
        } else {
            baseDamage = 30;
        }
    }

    public void refill(){
        for (int i = 0; i < maxAmmo ; i++) {
            if (currentAmmo < maxAmmo) {
                currentAmmo++;
            }
        }
    }

    public void fight(){
        System.out.println(type + " Has done: " + damage + " Damage.");
        currentAmmo = 0;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage() {
        this.damage = getCurrentAmmo()*baseDamage;
    }

    public int getMaxAmmo() {
        return maxAmmo;
    }

    public void getStatus() {
        setDamage();
        System.out.println("Type: " + type + " Ammo: " + currentAmmo + " Base Damage: " + baseDamage + " All Damage: "
                + getDamage());
    }
}