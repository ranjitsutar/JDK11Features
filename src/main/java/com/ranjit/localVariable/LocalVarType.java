package com.ranjit.localVariable;

public class LocalVarType {
    public static void main(String[] args) {
//        Normal
        Function function= (a,b) -> a+b;
        System.out.println(function);


//        Enhance
        String x= "sadfgsb";
        int y = 12324;

//      we can represent without define data type
        var e= "sadfgsb";
        var f= 12324;

        Function function1= (var c, var j) ->c+j;

    }
}

interface  Function{
    int operation(int a, int b);

}
