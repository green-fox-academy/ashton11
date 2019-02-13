package aircraftcarrier;

import java.util.ArrayList;
import java.util.List;

public class Carrier {
    List<Aircrafts> hangar = new ArrayList<>();
    int ammoStore;
    int hp;
    int damageOfAll;

    public Carrier(int ammoStore, int hp) {
        this.ammoStore = ammoStore;
        this.hp = hp;
    }

    public void addAircraft(Aircrafts aircraft) {
        aircraft.setBaseDamage();
        aircraft.setMaxAmmo();
        hangar.add(aircraft);
    }

    public void fill() {
        for (Aircrafts aircraft : hangar) {
            if (aircraft.isPriority && ammoStore > aircraft.getMaxAmmo()) {
                aircraft.refill();
                ammoStore -= aircraft.getCurrentAmmo();
            } else if (!aircraft.isPriority && ammoStore > aircraft.getMaxAmmo()) {
                aircraft.refill();
                ammoStore -= aircraft.getCurrentAmmo();
            } else {
                System.out.println("Not enough ammo to refill!");
            }
        }
    }

    public void fight(Carrier carrierToFight){
        for (Aircrafts aircraft : hangar) {
            if (carrierToFight.hp > 0) {
                aircraft.setDamage();
                aircraft.fight();
                carrierToFight.hp -= aircraft.getDamage();
            }
        }
    }

    private int getHangarDamage(){
        damageOfAll = 0;
        for (Aircrafts aircraft : hangar){
            aircraft.setDamage();
            damageOfAll += aircraft.getDamage();
        }
        return damageOfAll;
    }

    public void getStatus(){
        System.out.println("HP: " + hp + " Aircraft count: " + hangar.size() + " Ammo Storage: " + ammoStore +
                " Total Damage: " + getHangarDamage());
        for (Aircrafts aircraft : hangar) {
          aircraft.getStatus();
        }
    }
}
