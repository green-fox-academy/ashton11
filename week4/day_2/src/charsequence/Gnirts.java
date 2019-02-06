package charsequence;

public class Gnirts implements CharSequence{


    String string;



    public Gnirts (String string){
        this.string = string;
    }


    @Override
    public int lenght() {
    return string.length();
    }

    @Override
    public char charAt(int index) {
        int oppositeIndex = string.length() - index;
        return string.charAt(oppositeIndex - 1);
    }

    @Override
    public java.lang.CharSequence subSequence(int start, int end) {
         String beforeStart = ((String)string.subSequence(0,start));
         String afterEnd = ((String)string.subSequence(end,string.length()));

        String newString = beforeStart + afterEnd;

        return newString.subSequence(0,newString.length());
    }
}
