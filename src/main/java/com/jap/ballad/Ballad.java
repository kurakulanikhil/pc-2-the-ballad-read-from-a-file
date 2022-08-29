package com.jap.ballad;

import java.io.*;

public class Ballad {
    public static void main(String[] args) {
        Ballad obj = new Ballad();
        String fileData = obj.readPoemFromAFile("src/main/resources/ballad.txt");
        System.out.println(fileData);

    }
    public String readPoemFromAFile(String fileName){
       // Write the logic to read from a file
        FileReader fileReader = null;
        String result = "";
        try{
             fileReader = new FileReader(fileName);
            BufferedReader bufferedreader = new BufferedReader(fileReader);
            String data = "";

            while((data = bufferedreader.readLine()) != null) {




                result = result.concat("\n") + data;

            }


        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
            System.out.println(e);
        }

        result.replace("\n","");
        return result;
    }


}
