package com.company.exceptionhandling.handlingException;

import java.util.Scanner;

public class OrderOfOperation {
    public static void main(String[] args) throws Exception{
        //modal-1, semicolumn in last statement in try is  optional
        try(MyFileClass f1 = new MyFileClass(1);
        MyFileClass f2 = new MyFileClass(2);
        ) {
            throw new RuntimeException();
        }catch (Exception e){
            //e.printStackTrace();
            System.out.println("e = " + e);
        }finally {
            System.out.println("finally");
        }

        // modal-2
        try(var f1 = new MyFileClass(1);
            var f2 = new MyFileClass(2);
        ) {
            throw new RuntimeException();
        }catch (Exception e){
            //e.printStackTrace();
            System.out.println("e = " + e);
        }finally {
            System.out.println("finally");
        }

        // modal-3
        try(var f1 = new MyFileClass(1);
            var f2 = new MyFileClass(2)
        ) {
            throw new RuntimeException();
        }
    }

    public void scope(){
        try(Scanner s = new Scanner(System.in)){
            s.nextLine();
        }catch (Exception e){
            System.out.println("e = " + e);
            //s.nextLine(); compile err
        }finally {
              //s.nextLine(); compile err
        }

    }
}
