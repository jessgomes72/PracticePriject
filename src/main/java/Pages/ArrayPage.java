package Pages;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayPage {

    public static void main(String[] args) {

        String [] name = {"ashraf", "tashrif", "bushra", "abid"};

        System.out.println(Arrays.toString(name));

        ArrayList<String > name1 = new ArrayList<>();

        for(int i =0; i < name.length; i++){
            name1.add(name[i]);


        }
        name1.add("bob");
        name1.remove("bushra");

        ArrayList<String> name2 = new ArrayList<>(Arrays.asList(name));

        System.out.println(name1);
        System.out.println(name2);
    }


}
