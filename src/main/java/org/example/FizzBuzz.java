package org.example;

public class FizzBuzz {


    public FizzBuzz() {

    }

    public String run(){
        StringBuilder print= new StringBuilder();
        for (int i = 1; i <= 100; i++) {

            if (!(i%3==0) && !(i%5==0)){
                print.append(i+" ");
            }
            if (i%3==0){
                print.append("Fizz");
            }
            if (i%5==0){
                print.append(" Buzz");
            }

            print.append("\n");
            System.out.print(print);

        }
        return print.toString();
    }

    public String calculate(int num){
        StringBuilder print= new StringBuilder();

        if (!(num%3==0) && !(num%5==0)){
            print.append(num+" ");
        }
        if (num%3==0){
            print.append("Fizz");
        }
        if (num%5==0){
            print.append(" Buzz");
        }

        print.append("\n");
        //System.out.print(print);
        return print.toString();
    }


}
