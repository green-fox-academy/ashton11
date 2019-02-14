package com.company;

import java.util.Arrays;
import java.util.Collections;

// - Create an array variable named `abc`
//   with the following content: `["first", "second", "third"]`
// - Swap the first and the third element of `abc`
public class SwapNew {
    public static void main(String[] args) {
        String[] abc = {"first", "second", "third"};
        Collections.swap(Arrays.asList(abc),0 ,2);

        System.out.println(abc);
    }
}
