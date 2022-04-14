package basic;

import java.util.Scanner;

public class Calculator {

    //SCANNER
    static Scanner input = new Scanner(System.in);

//     *********************************************** ADDITION ******************************************************
    public float addition() {

        System.out.print("Input your first number: ");
        float num1 = input.nextFloat();

        System.out.print("Input your second number: ");
        float num2 = input.nextFloat();

        System.out.println("--------------------------------------------");
        System.out.print(num1 + " + " + num2 + " = ");
        float sum = num1 + num2;
        return sum;
    }

    public float addition(float num1, float num2, float num3 ) {

        System.out.print("Input your first number: ");
        num1 = input.nextFloat();

        System.out.print("Input your second number: ");
        num2 = input.nextFloat();

        System.out.print("Input your third number: ");
        num3 = input.nextFloat();

        System.out.println("--------------------------------------------");
        System.out.print(num1 + " + " + num2 + " + "  + num3 + " = ");
        float sum = num1 + num2 + num3;
        return sum;
    }

    public float addition(float num1, float num2, float num3,float num4 ) {

        System.out.print("Input your first number: ");
        num1 = input.nextFloat();

        System.out.print("Input your second number: ");
        num2 = input.nextFloat();

        System.out.print("Input your third number: ");
        num3 = input.nextFloat();

        System.out.print("Input your fourth number: ");
        num4 = input.nextFloat();

        System.out.println("--------------------------------------------");
        System.out.print(num1 + " + " + num2 + " + "  + num3 + " + " + num4 + " = ");
        float sum = num1 + num2 + num3 + num4;
        return sum;
    }

    public float addition(float num1, float num2, float num3,float num4, float num5 ) {

        System.out.print("Input your first number: ");
        num1 = input.nextFloat();

        System.out.print("Input your second number: ");
        num2 = input.nextFloat();

        System.out.print("Input your third number: ");
        num3 = input.nextFloat();

        System.out.print("Input your fourth number: ");
        num4 = input.nextFloat();

        System.out.print("Input your fifth number: ");
        num5 = input.nextFloat();

        System.out.println("--------------------------------------------");
        System.out.print(num1 + " + " + num2 + " + "  + num3 + " + " + num4 + " + " + num5 + " = ");
        float sum = num1 + num2 + num3 + num4 + num5;
        return sum;
    }

    //*******************************************SUBTRACTION**********************************************************
    public float subtraction() {

        System.out.print("Input your first number: ");
        float num1 = input.nextFloat();

        System.out.print("Input your second number: ");
        float num2 = input.nextFloat();

        System.out.println("--------------------------------------------");
        System.out.print(num1 + " - " + num2 + " = ");
        float difference = num1 - num2;
        return difference;
    }

    public float subtraction(float num1, float num2, float num3 ) {

        System.out.print("Input your first number: ");
        num1 = input.nextFloat();

        System.out.print("Input your second number: ");
        num2 = input.nextFloat();

        System.out.print("Input your third number: ");
        num3 = input.nextFloat();

        System.out.println("--------------------------------------------");
        System.out.print(num1 + " - " + num2 + " - "  + num3 + " = ");
        float difference = num1 - num2 - num3;

        return difference;
    }

    public float subtraction(float num1, float num2, float num3, float num4 ) {

        System.out.print("Input your first number: ");
        num1 = input.nextFloat();

        System.out.print("Input your second number: ");
        num2 = input.nextFloat();

        System.out.print("Input your third number: ");
        num3 = input.nextFloat();

        System.out.print("Input your fourth number: ");
        num4 = input.nextFloat();

        System.out.println("--------------------------------------------");
        System.out.print(num1 + " - " + num2 + " - "  + num3 + " - " + num4 + " = ");
        float difference = num1 - num2 - num3 - num4;
        return difference;
    }

    public float subtraction(float num1, float num2, float num3, float num4, float num5 ) {

        System.out.print("Input your first number: ");
        num1 = input.nextFloat();

        System.out.print("Input your second number: ");
        num2 = input.nextFloat();

        System.out.print("Input your third number: ");
        num3 = input.nextFloat();

        System.out.print("Input your fourth number: ");
        num4 = input.nextFloat();

        System.out.print("Input your fifth number: ");
        num5 = input.nextFloat();

        System.out.println("--------------------------------------------");
        System.out.print(num1 + " + " + num2 + " + "  + num3 + " + " + num4 + " + " + num5 + " = ");
        float difference = num1 - num2 - num3 - num4 - num5;
        return difference;
    }

//    *****************************************MULTIPLICATION********************************************************
public float multiplication() {

    System.out.println("Input your numbers for multiplication:");

    System.out.print("Input your first number: ");
    float num1 = input.nextFloat();

    System.out.print("Input your second number: ");
    float num2 = input.nextFloat();

    System.out.println("--------------------------------------------");
    System.out.print(num1 + " * " + num2 + " = ");
    float product = num1 * num2;
    return product;
}

    public float multiplication(float num1, float num2, float num3) {

        System.out.print("Input your first number: ");
        num1 = input.nextFloat();

        System.out.print("Input your second number: ");
        num2 = input.nextFloat();

        System.out.print("Input your third number: ");
        num3 = input.nextFloat();

        System.out.println("--------------------------------------------");
        System.out.print(num1 + " * " + num2 + " * "  + num3 + " = ");
        float product = num1 * num2 * num3;
        return product;
}

    public float multiplication(float num1, float num2, float num3, float num4) {

        System.out.print("Input your first number: ");
        num1 = input.nextFloat();

        System.out.print("Input your second number: ");
        num2 = input.nextFloat();

        System.out.print("Input your third number: ");
        num3 = input.nextFloat();

        System.out.print("Input your fourth number: ");
        num4 = input.nextFloat();

        System.out.println("--------------------------------------------");
        System.out.print(num1 + " * " + num2 + " * "  + num3 + " * " + num4 + " = ");

        float product = num1 * num2 * num3 * num4;
        return product;
    }

    public float multiplication(float num1, float num2, float num3, float num4, float num5) {

        System.out.print("Input your first number: ");
        num1 = input.nextFloat();

        System.out.print("Input your second number: ");
        num2 = input.nextFloat();

        System.out.print("Input your third number: ");
        num3 = input.nextFloat();

        System.out.print("Input your fourth number: ");
        num4 = input.nextFloat();

        System.out.print("Input your fifth number: ");
        num5 = input.nextFloat();

        System.out.println("--------------------------------------------");
        System.out.print(num1 + " + " + num2 + " + "  + num3 + " + " + num4 + " + " + num5 + " = ");
        float product = num1 * num2 * num3 * num4 * num5;
        return product;
    }

    //    *****************************************DIVISION********************************************************

    public float division(float num1, float num2) {
        System.out.print("Input your first number: ");
        num1 = input.nextFloat();

        System.out.print("Input your second number:");
        num2 = input.nextFloat();

        System.out.println(num1 + " / " + num2 + " = ");
        float quotient = num1 / num2;
        return quotient;
    }

    public float division(float num1, float num2, float num3) {

        System.out.print("Input your first number: ");
        num1 = input.nextFloat();

        System.out.print("Input your second number: ");
        num2 = input.nextFloat();

        System.out.print("Input your third number: ");
        num3 = input.nextFloat();

        System.out.println("--------------------------------------------");
        System.out.print(num1 + " / " + num2 + " / " + num3 + " = ");
        float quotient = num1 / num2 / num3;
        return quotient;
    }

    public float division(float num1, float num2, float num3, float num4) {

        System.out.print("Input your first number: ");
        num1 = input.nextFloat();

        System.out.print("Input your second number: ");
        num2 = input.nextFloat();

        System.out.print("Input your third number: ");
        num3 = input.nextFloat();

        System.out.print("Input your fourth number: ");
        num4 = input.nextFloat();

        System.out.println("--------------------------------------------");
        System.out.print(num1 + " / " + num2 + " / "  + num3 + " / " + num4 + " = ");

        float quotient = num1 / num2 / num3 / num4;
        return quotient;
    }

    public float division(float num1, float num2, float num3, float num4, float num5) {

        System.out.print("Input your first number: ");
        num1 = input.nextFloat();

        System.out.print("Input your second number: ");
        num2 = input.nextFloat();

        System.out.print("Input your third number: ");
        num3 = input.nextFloat();

        System.out.print("Input your fourth number: ");
        num4 = input.nextFloat();

        System.out.print("Input your fifth number: ");
        num5 = input.nextFloat();

        System.out.println("--------------------------------------------");
        System.out.print(num1 + " / " + num2 + " / "  + num3 + " / " + num4 + " / " + num5 + " = ");
        float product = num1 / num2 / num3 / num4 / num5;
        return product;
    }

    public static void main (String[]args) {
        Calculator Calculator = new Calculator();
        System.out.println("What kind of calculation would you like to do? (+, -, *, /)");
        char whatCalculation = input.next().charAt(0);
        System.out.println("How many numbers would you like to use? (2, 3, 4, 5)");
        int howManyNumbers = input.nextInt();

        //**********IF STATEMENTS FOR ADDITION************
        if (whatCalculation == '+' && howManyNumbers == 2) {
            System.out.println(Calculator.addition());
        } else if (whatCalculation == '+' && howManyNumbers == 3) {
            System.out.println(Calculator.addition(0, 0, 0));
        } else if (whatCalculation == '+' && howManyNumbers == 4) {
            System.out.println(Calculator.addition(0, 0, 0, 0));
        } else if (whatCalculation == '+' && howManyNumbers == 5) {
            System.out.println(Calculator.addition(0, 0, 0, 0, 0));
        }
        //**********IF STATEMENTS FOR SUBTRACTION***********
        if (whatCalculation == '-' && howManyNumbers == 2) {
            System.out.println(Calculator.subtraction());
        } else if (whatCalculation == '-' && howManyNumbers == 3) {
            System.out.println(Calculator.subtraction(0, 0, 0));
        } else if (whatCalculation == '-' && howManyNumbers == 4) {
            System.out.println(Calculator.subtraction(0, 0, 0, 0));
        } else if (whatCalculation == '-' && howManyNumbers == 5) {
            System.out.println(Calculator.subtraction(0, 0, 0, 0, 0));
        }

//     //***********IF STATEMENTS FOR MULTIPLICATION***********
        if (whatCalculation == '*' && howManyNumbers == 2) {
            System.out.println(Calculator.multiplication());
        } else if (whatCalculation == '*' && howManyNumbers == 3) {
            System.out.println(Calculator.multiplication(0,0,0));
        } else if (whatCalculation == '*' && howManyNumbers == 4) {
            System.out.println(Calculator.multiplication(0,0,0,0));
        } else if (whatCalculation == '*' && howManyNumbers == 5) {
            System.out.println(Calculator.multiplication(0,0,0,0,0));
        }

        //***********IF STATEMENTS FOR DIVISION****************
        if (whatCalculation == '/' && howManyNumbers == 2) {
            System.out.println(Calculator.division(0,0));
        } else if (whatCalculation == '/' && howManyNumbers == 3) {
            System.out.println(Calculator.division(0,0,0));
        } else if (whatCalculation == '/' && howManyNumbers == 4) {
            System.out.println(Calculator.division(0,0,0,0));
        } else if (whatCalculation == '/' && howManyNumbers == 5) {
            System.out.println(Calculator.division(0,0,0,0,0));
        }
    }

}

