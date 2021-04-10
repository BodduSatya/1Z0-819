package com.company.exceptionhandling.methodThrowException;

class CanNotHopException1 extends Exception{}
class Hopper1{
    public void hop()throws CanNotHopException{}
}
/*public class Bunny extends Hopper{
    //overwritten method with checked exception - compile time exception
    public void hop() throws CanNotHopException{

    }
}*/


public class Bunny1 extends Hopper1{
    //overwritten method with unchecked exception - no exception
    public void hop() {

    }
}