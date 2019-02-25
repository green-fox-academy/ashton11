package gardenapp;

public class Plant {
    String name;
    String color;
    float waterLevel;
    float minWaterLevel;



    public Plant(){
        name = "plant";
        color = "white";
        waterLevel = 0f;
    }

    public Plant(String color){
        name = "plant";
        this.color = color;
        waterLevel = 0f;
    }



    public void waterPlants(float litresOfWater){
        if (waterLevel<minWaterLevel){
            waterLevel += litresOfWater;
        }
    }

    public void statusOfPlants(){
        if (waterLevel<minWaterLevel){
            System.out.println(color + " " + name + " needs more water.");
        }else{
            System.out.println(color + " " + name + " doesn't need more water.");
        }
    }
}
