package com.company.exceptionhandling.types;

public class TryIllegalArgumentException {
    int numberEggs;
    public void setNumberOfEggs(int numberOfEggs){
        if(numberOfEggs>=0)
            this.numberEggs = numberOfEggs;
        else
            throw new IllegalArgumentException("No -ve allowed");
    }
    public static void main(String[] args) {
        TryIllegalArgumentException obj = new TryIllegalArgumentException();
        obj.setNumberOfEggs(-2);
    }
}
