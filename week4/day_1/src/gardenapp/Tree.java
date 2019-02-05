package gardenapp;

public class Tree extends Plant {



    public Tree (String color){
        super.name = "tree";
        super.color = color;
        super.minWaterLevel = 10;
    }

    @Override
    public void waterPlants(float litresOfWater) {
        super.waterPlants((litresOfWater/10)*4);
    }
}
