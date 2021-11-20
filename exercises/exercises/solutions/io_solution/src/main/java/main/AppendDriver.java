package main;


import java.io.FileWriter;
import java.io.PrintWriter;

public class AppendDriver {
    public static void main(String[] args) {
        try(FileWriter file = new FileWriter("default.txt",true);
                PrintWriter out = new PrintWriter(file) ){

            out.println("Jim");

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
