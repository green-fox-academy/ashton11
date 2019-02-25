package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Trees {

    public static void main(String[] args) {
        List<Map<String , Object>> treeList = new ArrayList<>();
            Map<String , Object>tree1 = new HashMap<>();
                tree1.put("Type" , "Pine");
                tree1.put("Leaf Color" , "Green");
                tree1.put("Age" , 20 );
                tree1.put("Sex" , "Male");
                treeList.add(tree1);
            Map<String , Object>tree2 = new HashMap<>();
                tree2.put("Type" , "Maple");
                tree2.put("Leaf Color" , "Green");
                tree2.put("Age" , 40 );
                tree2.put("Sex" , "Female");
                treeList.add(tree2);
            Map<String , Object>tree3 = new HashMap<>();
                tree3.put("Type" , "Oak");
                tree3.put("Leaf Color" , "Green");
                tree3.put("Age" , 50 );
                tree3.put("Sex" , "Female");
                treeList.add(tree3);
            Map<String , Object>tree4 = new HashMap<>();
                tree4.put("Type" , "Dragon Tree");
                tree4.put("Leaf Color" , "Green");
                tree4.put("Age" , 10 );
                tree4.put("Sex" , "Male");
                treeList.add(tree4);
            Map<String , Object>tree5 = new HashMap<>();
                tree5.put("Type" , "Cherry");
                tree5.put("Leaf Color" , "Green");
                tree5.put("Age" , 15 );
                tree5.put("Sex" , "Female");
                treeList.add(tree5);
        System.out.println(treeList);
    }
}
