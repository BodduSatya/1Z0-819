package com.company.VarTypeInference;

public class Main {
    {
        var num = 1.0;
    }
    Main(){
        var name = "Main";
    }

    public static void main(String[] args) {
        var size = 7;
        for (var i = 0; i < 10; i++) {

        }
        for (var arg : args){

        }

        size =4;
//        size="var";



        //can't do'
        //1
/*        var question;
        question = 1;

        var answer;
        if(size==4){
            answer=2;
        }else{
            answer=4;
        }*/

        var silly
                =1;
        //2 Null
        /*var n = null;
        var o = (String)null;

        var n = "ay String";
        n = null;

        var m=4;
        m = null;*/

        //compound declaration
//        var a =2, b =3;
//        int a,var b=3;

        //Array
//        var[] prices = {9.95,8.86};
    }
}
