package charsequence;

public class Shifter implements CharSequence {

    String string;
    int numberToShift;


    public Shifter (String string, int numberToShift){
        this.string = string;
        this.numberToShift = numberToShift;
    }

    @Override
    public int lenght() {
        return string.length();
    }


    @Override
    public char charAt(int index) {
        if (index+numberToShift > string.length()){
            throw new IllegalArgumentException();
        }
        return string.charAt(index + numberToShift);

    }


    @Override
    public java.lang.CharSequence subSequence(int start, int end) {
      if(end+numberToShift < string.length()) {
          int startNew = start + numberToShift;
          int endNew = end + numberToShift;
          return string.subSequence(startNew , endNew);
      } throw new IllegalArgumentException();
    }
}
