package day11;

import java.util.function.BiFunction;

public class BiFunction2 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        BiFunction<String,String,Boolean> a=(name1,name2)->
        {
            if(name1=="hari" && name2=="krishna")
                return true;
            else
                return false;
        };
        boolean d=a.apply("hari", "krishna");
        System.out.println(d);
    } 

}