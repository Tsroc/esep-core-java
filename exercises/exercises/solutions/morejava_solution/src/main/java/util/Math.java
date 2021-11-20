package util;

public class Math {
    public static int add(int v1, int v2, int... values){
        int total = v1+v2;
        for(int value: values){
            total+= value;
        }
        return total;
    }

    public static double add(double v1, double v2, double... values){
        double total = v1+v2;
        for(double value: values){
            total+= value;
        }
        return total;
    }

}
