package gardenapp;

public class Flower extends Plant {



    public Flower (String color) {
        super.name = "flower";
        super.color = color;
        super.minWaterLevel = 5;
    }


    @Override
    public void waterPlants(float litresOfWater) {
        super.waterPlants((litresOfWater/4)*3);
    }
}
