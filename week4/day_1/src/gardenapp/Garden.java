package gardenapp;

import java.util.ArrayList;
import java.util.List;

public class Garden {
    public static void main(String[] args) {
        List<Plant> garden = new ArrayList<>();
        Flower flow1 = new Flower("yellow");
        Flower flow2 = new Flower("blue");
        Tree tree1 = new Tree("purple");
        Tree tree2 = new Tree("orange");
        garden.add(flow1);
        garden.add(flow2);
        garden.add(tree1);
        garden.add(tree2);
        for (Plant plant:garden) {
            plant.statusOfPlants();
            plant.waterPlants(40f/garden.size());
            plant.statusOfPlants();
            plant.waterPlants(70f/garden.size());
            plant.statusOfPlants();
        }

    }
}
