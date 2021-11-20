package main;


import files.TextFileWriter;

public class Driver {
    public static void main(String[] args) {
        String fileName = "default.txt";
        if(args.length == 1){
            fileName = args[0];
        }
        TextFileWriter fileWriter = new TextFileWriter(fileName);
        fileWriter.writeToFile();
    }
}
