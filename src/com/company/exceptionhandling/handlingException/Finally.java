package com.company.exceptionhandling.handlingException;

import java.io.IOException;

public class Finally {
    static String info;
    public static void main(String[] args) {
        Finally f = new Finally();
//        System.out.println(f.goHome());
//        System.out.println(f.goHome2());
//        System.out.println(f.excepionInFinallyBlock());
        System.out.println(f.excepionInFinallyBlock2());
    }

    int goHome(){
        try{
            System.out.println("1");
            return -1;
        }catch (Exception e){
            System.out.println("2");
            return -2;
        }finally {
            System.out.println("3");
            return -3;
        }
    }

    int goHome2(){
        try{
            fall();
            System.out.println("1");

            return -1;
        }catch (Exception e){
            System.out.println("2");
            return -2;
        }finally {
            System.out.println("3");
            return -3;
        }
    }
    private void fall()throws Exception{
        throw new IOException();
    }

    // suppressed exception will come, instead of primary exception
    String excepionInFinallyBlock() {
        try{
//            throw new IOException(); //primary exception
//            Integer.parseInt("s");
        }finally {
            info.toString();//suppressed exception
            System.out.println("exiting" );
            return "zoo";
        }
    }

    // primary exception is suppressed
    String excepionInFinallyBlock2() {
        try{
            throw new IOException(); //primary exception
//            Integer.parseInt("s");
        }finally {
//            info.toString();//suppressed exception
            System.out.println("exiting" );
            return "zoo";
        }
    }

}
