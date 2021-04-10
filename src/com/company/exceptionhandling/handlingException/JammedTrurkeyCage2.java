package com.company.exceptionhandling.handlingException;

public class JammedTrurkeyCage2 implements AutoCloseable{
    @Override
    public void close() throws IllegalArgumentException {
        throw new IllegalArgumentException("Cage door does not closed");
    }

    public static void main(String[] args) {
        try(var t = new JammedTrurkeyCage2()){
            throw new RuntimeException("Turkey ran off"); // primary exception
        }finally {
          throw  new RuntimeException(" and we couldn't find them");
        }
    }
}
