public class Sharpie {
    String color;
    float width;
    float inkAmount;


    public Sharpie(String color, float width){
        if (width < 0){
            throw new ArithmeticException();
        }
        this.color = color;
        this.width = width;
        inkAmount = 100f;


    }public void use(float lineLength){
        if (lineLength < 0 || inkAmount<0){
            throw new ArithmeticException();
        }
        inkAmount -= lineLength * width;
    }


    public void checkInkAmount () {
        if (inkAmount<0){
            System.out.println("Your pen has run out, please create a new one");
        }
        System.out.println("Your pen has " + inkAmount + " ink left.");
    }
}