package com.company.exceptionhandling.handlingException;

import java.io.FileInputStream;
import java.io.IOException;

public class TryResource {
    public static void main(String[] args) {

    }

    //traditional style of release resource before java7
    public void readFile(String file){
        FileInputStream is = null;
        try{
            is = new FileInputStream("myfile.txt");
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            if(is!=null){
                try{
                    is.close();
                }catch (IOException e2){
                    e2.printStackTrace();
                }
            }
        }
    }

    public void readFile2(String file){

        try(FileInputStream is = new FileInputStream("myfile.txt")){
            //Read File data
        }catch (IOException e){
            e.printStackTrace();
        }
    }

}
