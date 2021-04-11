package com.company.exceptionhandling.CustomException;

class CannotSwimException extends Exception{
    public CannotSwimException(){
        super();
    }
    public CannotSwimException(Exception e){
        super("Cannot swim because ::"+e.toString());
    }
    public CannotSwimException(String message){
        super(message);
    }
}

class DangerInWater extends RuntimeException{

}

class SharkInTheWaterException extends DangerInWater{

}

public class Dolphin {
    public void swim()throws CannotSwimException{

    }
}
