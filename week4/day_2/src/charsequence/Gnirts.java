package charsequence;

import com.sun.xml.internal.fastinfoset.util.CharArray;

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
        int oppositeIndex = this.string.length() - index;
        return this.string.charAt(oppositeIndex - 1);
    }

    @Override
    public char[] subSequence(int start, int end) {
         String beforeStart = ((String)string.subSequence(0,start));
         String afterEnd = ((String)string.subSequence(end,string.length()));

        String s = beforeStart + afterEnd;

        return s.toCharArray();
    }
}
