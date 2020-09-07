/* TODO: Create methods which calculate addition, subtraction, multiplication, division, modulo, and indices for two entered numbers.
        With your division method, the sum should only execute if the first parameter is smaller than the second - else,
        it prints a warning message. Also print a warning message when attempting to divide by zero.

 */
public class QuikMaffz {

    private double firstNumber;
    private double secondNumber;
    QuikMaffz(double firstNumber, double secondNumber){
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }
    private double addition(double x, double y){
        return x+y;
    }
    private double substraction(double x, double y){
        return x-y;
    }
    private double multipication(double x, double y){
        return x*y;
    }
    private double division(double x, double y){
        double result=0;
        try{

            if(x>=y) result = x/y;
//            else{
//                System.out.println("WARNING: Can't divide");
//            }
        }catch (Exception e){
            System.out.println("WARNING: "+ e.getMessage());
        }

     return  result;
    }
    private double moduler(double x, double y){
        return x%y;
    }
    private double indices(double x, double y){
        return Math.pow(x,y);
    }
    public void displayMessage(){
        System.out.println("__/The result of calculation\\__");
        System.out.println("The result of Addition: "+ addition(firstNumber,secondNumber));
        System.out.println("The result of substraction: "+ substraction(firstNumber,secondNumber));
        System.out.println("The result of multipication: "+ multipication(firstNumber,secondNumber));
        if(division(firstNumber, secondNumber)!=0){System.out.println("The result of division: "+ division(firstNumber, secondNumber));}
        System.out.println("The result of moduler: "+ moduler(firstNumber,secondNumber));
        System.out.println("The result of indices: "+ indices(firstNumber,secondNumber));



    }

}
