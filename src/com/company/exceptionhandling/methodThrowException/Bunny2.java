package com.company.exceptionhandling.methodThrowException;

class CanNotHopException2 extends Exception{}
class Hopper2{
    public void hop()throws Exception{}
}
/*public class Bunny extends Hopper{
    //overwritten method with checked exception - compile time exception
    public void hop() throws CanNotHopException{

    }
}*/


public class Bunny2 extends Hopper2{
    //overwritten method with unchecked exception - no exception
    public void hop() throws CanNotHopException{

    }
}