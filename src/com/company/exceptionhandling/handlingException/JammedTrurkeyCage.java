package com.company.exceptionhandling.handlingException;

public class JammedTrurkeyCage implements AutoCloseable{
    @Override
    public void close() throws IllegalArgumentException {
        throw new IllegalArgumentException("Cage door does not closed");
    }

    public static void main(String[] args) {
        try(var t = new JammedTrurkeyCage()){
            throw new RuntimeException("Turkey ran off"); // primary exception
        }catch (IllegalArgumentException e){
            System.out.println("caught: "+e.getMessage());
        }
    }
}
