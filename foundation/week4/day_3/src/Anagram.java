import java.util.Arrays;

public class Anagram {

    public Anagram(){

    }

    public boolean isAnagram (String first , String second){
        int firstStringLength = first.length();
        int secondStringLength = second.length();

        if (firstStringLength != secondStringLength){
            return false;
        }
        char[] firstStringChars = first.toCharArray();
        char[] secondStringChars = second.toCharArray();
        Arrays.sort(firstStringChars);
        Arrays.sort(secondStringChars);

        for (int i = 0; i < firstStringLength ; i++) {
            if (firstStringChars[i] != secondStringChars[i]){
                return false;
            }
        }return true;
    }
}
