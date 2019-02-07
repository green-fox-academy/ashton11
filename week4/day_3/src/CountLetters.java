import java.util.HashMap;

import java.util.Map;

public class CountLetters {



    public Map<String,Integer> dictionary (String string) {

        Map<String,Integer> dict = new HashMap<>();

        if (string.isEmpty()){
            throw new NullPointerException();
        }

        int charNumber = 1;

        for (int i = 0; i < string.length() ; i++) {
            String key = Character.toString(string.toUpperCase().charAt(i));
            if (dict.containsKey(key)){
                charNumber ++;
            }dict.put(key , charNumber);
        }

        return dict;
    }
}

