package day11;

import java.util.function.BiFunction;

public class BiFunctional {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //double result=0;
        BiFunction<Integer,Integer,Integer> p=(num1,num2)->
        {
            double result=Math.pow(num1,num2);
            
            return (int) result;
        };
        //System.out.println("Result:"+result);
        double result=p.apply(2, 3);
        System.out.println(result);
    }

 

}