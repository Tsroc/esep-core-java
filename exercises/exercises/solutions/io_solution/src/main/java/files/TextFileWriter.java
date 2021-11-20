package files;


import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TextFileWriter {
    private String fileName;

    public TextFileWriter(String fileName){
        this.fileName = fileName;
    }


    public void writeToFile(){
        PrintWriter out = null;
        Scanner keyboard = new Scanner(System.in);
        try (FileWriter file = new FileWriter(fileName,false)){
            out = new PrintWriter(file);

            String input = "";
            do{
                System.out.println("Enter a line of text for file (x to finish) >");
                input = keyboard.nextLine();
                if(!input.equalsIgnoreCase("x")){
                    out.println(input);
                }
            }while(!input.equalsIgnoreCase("x"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }}
