package com.company.exceptionhandling.methodThrowException;

class CanNotHopException extends Exception{}
class Hopper{
    public void hop(){}
}
/*public class Bunny extends Hopper{
    //overwritten method with checked exception - compile time exception
    public void hop() throws CanNotHopException{

    }
}*/


public class Bunny extends Hopper{
    //overwritten method with unchecked exception - no exception
    public void hop() throws IllegalArgumentException{

    }
}