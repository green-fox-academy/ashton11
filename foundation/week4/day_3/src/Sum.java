import java.util.ArrayList;


public class Sum {



    public int sum (ArrayList<Integer> numbers){

        if (numbers.equals(null)){
            throw new NullPointerException();
        }
        else if (numbers.isEmpty()){
            throw new IllegalArgumentException();
        }

        int sum = 0;

        for (int number:numbers) {
            sum += number;



        }

        return sum;
    }

}

