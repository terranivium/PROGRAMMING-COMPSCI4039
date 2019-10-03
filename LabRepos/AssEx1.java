/* 
    Instructions - Assessed Exercise 1
    - This exercise tests the things you've learnt in week 1.
    - Add your code to this file, leaving the main method unchanged.
    - Each of the tasks involves writing a single method.
    - Total number of marks is 22.
    - Read the instructions for each task *carefully*.
    - Submit a single .java file on moodle by the deadline (details on moodle).
    - Do not change the name of the Java file, but ensure you add your name and 
        matric as requested below...
    - Add all of your methods *below* the main method, in question order.
    - You do not need to add any additional import lines.
    - Everything you need to do these tasks is covered in the week 1 slides.
*/

/*
    Non task-specific marks:
     - Add a comment with your name and matric here - [1 mark]
     // Wesley Scott, 20460681S
     - Clear code commenting [1 mark]
     - Use of correct Java variable naming conventions [1 mark]
*/
import java.util.Scanner;

public class AssEx1 {

    public static void main(String[] args) {
        String name = "Fred";
        
        /* Task 1 [2 marks]
            Create a method called welcome that prints the word "Hello" followed by whatever
            is stored in the variable 'name'. It will be called by the line below.
        */

        // Task 1 method is called
        welcome(name);

        /* Task 2 [3 marks]
            Write a method called multiples that prints out all multiples of some integer m between m and
            another intger max in individual lines.
            For example multiples(3,11) should print:
            3
            6
            9
            Your method *must* use a loop
        */

        // Task 2 input variables and method called using those as arguments
        int m = 7;
        int max = 100;
        multiples(m,max); 

        /* Task 3 [3 marks]
            Write a method called check that takes an integer as an argument and 
            returns a boolean value that is true if the integer is greater
            than 5 and less than 10. Call the method three times with the integers
            1, 6 and 12 respectively, printing the output each time on a new line. 
        */
        // Call the method and print the output three times below...
        
        System.out.println(check(1));
        System.out.println(check(6));
        System.out.println(check(12));
        
        /* Task 4 [6 marks]
            Write a method called calculator that prompts the user to input 
            an integer, an operator ('+' or '-') and finally another integer.
            The method should then perform the calculation and print the answer using
            String.format. The result of the claculation should be padded with 
            zeros to make it length 4. E.g. if the user enters:
            4
            -
            3
            The program should output:
            "Calculation: 4 - 3 = 0001"
            The inputs should be on separate lines.
            You don't need to do any error checking on the user input.
        */
        calculator();

        /* Task 5 [5 marks]
            Write a method called table that takes two integers as arguments that correspond to
            a number of rows and a number of columns respectively.
            If either integer is <0 or >= 10, the program should print:
            "Error, rows and columns must be >0 and <10"
            and return.
            If the number of rows and columns is between >=0 and <=9 the method
            should print a table with the table co-ordinates in each position. For example, if
            the number of rows is 2 and the number of columns 4:
              (0,0)  (0,1)  (0,2)  (0,3)
              (1,0)  (1,1)  (1,2)  (1,3)
            Important:
             - You *must* only use System.out.print and *not* System.out.println...
             - Separate each co-ordinate pair with a tab ('\t')
             - You may *not* use for loops! I.e. you *must* use a do or a while loop.
        */
        table(13,5);
        table(-2,7);
        table(3,6);
    }

    // Task 1 welcome method, prints "Hello" plus the string (name) which was passed when calling the welcome method in main.
    public static void welcome(String name){
        System.out.println("Hello, " + name);
    }

    // Task 2 multiples method, prints the multiples of the given int (m), up to the max multiplier (max)
    public static void multiples(int m, int max){
        for(int i = 1; m * i <= max; i++)
            System.out.println(m * i);
    }

    // Task 3 number check method, checks the given int input (m) is greater than 5 and less than 10
    // Returns to main true only when both conditions are met, otherwise returned value is false
    public static boolean check(int m){
        if(m > 5 && m < 10) return true;
        else return false;
    }

    // Task 4 calculator method
    public static void calculator(){
        Scanner keyboard = new Scanner(System.in); //creating instance of scanner, recieving keyboard input as argument

        System.out.println("*Bleep Bloop* Glasgow Instruments SD-001...");

        System.out.println("Please enter the first digit of your calculation:");
        int input1 = keyboard.nextInt(); //first user input int stored in input1

        System.out.println("Please enter math opertor:");
        String operator = keyboard.next(); //user input string stored in operator

        System.out.println("Please enter the second digit of your calculation:");
        int input2 = keyboard.nextInt(); //second user input int stored in input2

        //switch checks what is stored in operator from desired cases and executes required code
        //error is provided to user if a non-desired character is stored in opertor
        switch(operator){
            case "+":
                int answer = input1 + input2;
                System.out.printf("Calculation: %d %s %d = %04d\n", input1, operator, input2, answer);
                break;
            case "-":
                answer = input1 - input2;
                System.out.printf("Calculation: %d %s %d = %04d\n", input1, operator, input2, answer);                
                break;                
            case "*":
                answer = input1 * input2;
                System.out.printf("Calculation: %d %s %d = %04d\n", input1, operator, input2, answer);                
                break;
            case "/":
                answer = input1 / input2;
                System.out.printf("Calculation: %d %s %d = %04d\n", input1, operator, input2, answer);                
                break;
            case "%":
                answer = input1 % input2;
                System.out.printf("Calculation: %d %s %d = %04d\n", input1, operator, input2, answer);                
                break;
            default:
                System.out.printf("Input %s is not a valid operator...\n", operator);
                break;
        }
    }

    // Task 5 method, takes number of rows and columns and generates table
    public static void table(int rows, int columns){

        int i = 0; //row counter
        int j = 0; //column counter

        //input check ensures rows and columns meet requirement of being >0 and <10.
        if((rows < 0 || rows >= 10) || (columns < 0 || columns >= 10)){
            System.out.print("Error, rows and columns must be >0 and <10\n");
        } else do{
                System.out.print("(" + i + "," + j + ")\t");
                do{
                    j++; //increment columns
                    System.out.print("(" + i + "," + j + ")\t");
                } while (j < columns - 1);
                System.out.print("\n");
                j = 0; //resets column counter to begin new row
                i++;//increment rows
            } while (i < rows);
    }
}
