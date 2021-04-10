package com.company.exceptionhandling.handlingException;

class AnimalsOutForWalk extends RuntimeException{}
class ExhibitClosed extends RuntimeException{}
class ExhibitClosedForLunch extends ExhibitClosed{}

public class ChainingCatch {

    //unchecked exception
    public void visitPorcupine(){
        try{
            seeAnimals();
        }catch (AnimalsOutForWalk e){
            System.out.println("try back later");
        }catch (ExhibitClosed e){
            System.out.println("not today");
        }
    }
    //checked exception
    public void visitMonkey(){
        try{
            seeAnimals();
        }catch (ExhibitClosedForLunch e){
            System.out.println("try back later");
        }catch (ExhibitClosed e){
            System.out.println("not today");
        }

        /*//prentclass followed by childclass complier
        try{
            seeAnimals();
        }catch (ExhibitClosed e){
            System.out.println("not today");
        } catch (ExhibitClosedForLunch e){
            System.out.println("try back later");
        }*/

    }
    public void visitManatess(){
        /*try{

        }catch (NumberFormatException e1){
            System.out.println(e1);
        }catch (IllegalArgumentException e2){
            System.out.println(e1);
        }*/
    }
    public void seeAnimals(){
        throw new ExhibitClosed();
    }


}
