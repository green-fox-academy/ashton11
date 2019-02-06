package charsequence;

public class Main {
    public static void main(String[] args) {
        Gnirts gnirt = new Gnirts("Looking");
        System.out.println(gnirt.charAt(3));
        System.out.println(gnirt.subSequence(3,4));
        Shifter s = new Shifter("Shift me baby one more time!",2);
        System.out.println(s.charAt(2));
        System.out.println(s.subSequence(2,13));
    }
}
