/**
 * Created by chrisczarnecki on 13/07/15.
 */
public class TimesTable {
    public static void main(String[] args) {
        for(int i=1; i <= 10; i++){
            System.out.println("\n" + i + " times table :\n");
            for(int j=1; j <=12; j++){
                System.out.println(i + " x " + j + " = " + i*j);
            }
        }
    }
}
