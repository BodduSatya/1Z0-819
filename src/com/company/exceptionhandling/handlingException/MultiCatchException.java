package com.company.exceptionhandling.handlingException;

import java.io.FileNotFoundException;
import java.io.IOException;

public class MultiCatchException {
    public static void main(String[] args) {
        try {
            System.out.println(Integer.parseInt(args[1]));
        }catch (ArrayIndexOutOfBoundsException | NumberFormatException e){
            System.out.println("Missing or invalid input1");
        }

        // FileNotFoundException class is the subclass of IOException , so not allowed parent will handle, no use of child - complie time exception
        /*try{

//        }catch (IOException | FileNotFoundException  e){
        }catch (FileNotFoundException | IOException e){
            System.out.println("e = " + e);
        }*/
    }
}
