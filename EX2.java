package org.example;
import java.util.Random;
import java.util.Scanner;

public class EX2 {

    public static void main(String [] args){

        Scanner scanner = new Scanner(System.in);

//        1.Write a program that checks the role of the user
//        If the role is admin print "welcome admin"
//        If the role is superuser print "welcome superuser"
//        If the role is user print "welcome user" (tip:
//        use if else)

         System.out.println("Please, enter your role: ");
         String role = scanner.nextLine();
         scanner.nextLine();

         if(role.equalsIgnoreCase("admin")){
             System.out.println("welcome admin");

         }else if (role.equalsIgnoreCase("superuser")){
             System.out.println("welcome superuser");

         }else System.out.println("welcome user");

         System.out.println("-----------------------------------");

//        2.Take three numbers from the user and print the greatest number.

         System.out.println("Please, enter first number: ");
         int num1 = scanner.nextInt();
         scanner.nextLine();

        System.out.println("Please, enter second number: ");
        int num2 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Please, enter third number: ");
        int num3 = scanner.nextInt();
        scanner.nextLine();

        if (num1 >= num2 && num1 >= num3) {
            System.out.println("The greatest: " + num1);

        }else if (num2 >= num1 && num2 >= num3){
            System.out.println("The greatest: " + num2);

        }else System.out.println("The greatest: " + num3);


        System.out.println("-----------------------------------");



//        3.Write a Java program that generates an integer between 1 and 7
//        and displays the name of the weekday.

           Random random = new Random();

           int num = random.nextInt(7);
           System.out.println(num);
           // Days start with Sunday
           switch (num){

               case 1:
                   System.out.println("Sunday");
                   break;

               case 2:
                   System.out.println("Monday");
                   break;

               case 3:
                   System.out.println("Tuesday");
                   break;

               case 4:
                   System.out.println("Wednesday");
                   break;

               case 5:
                   System.out.println("Thursday");
                   break;

               case 6:
                   System.out.println("Friday");
                   break;

               case 7:
                   System.out.println("Saturday");
                   break;

               default:
                   System.out.println("Enter a number between 1 and 7!");

           }
                 System.out.println("-----------------------------------");


//        4. Write a program that takes a numeric score as input and prints
//        the corresponding letter grade using the following grading scale:

          System.out.println("A: 90-100 ");
          System.out.println("B: 80-89  ");
          System.out.println("C: 70-79  ");
          System.out.println("D: 60-69  ");
          System.out.println("F: 0-59   ");

         System.out.println("Enter your numeric score: ");
         int score = scanner.nextInt();
         scanner.nextLine();

         System.out.println("Numeric Score: " + score);

         if(score >= 90 && score <= 100){
             System.out.println("Letter Grade: A");

         }else if(score >= 80 && score <= 89){
             System.out.println("Letter Grade: B");

         }else if(score >= 70 && score <= 79){
             System.out.println("Letter Grade: C");

         }else if(score >= 60 && score <= 69){
             System.out.println("Letter Grade: D");

         }else System.out.println("Letter Grade: F");

          System.out.println("-----------------------------------");

//        5. Write a Java program that takes a person's age as input and
//        categorizes them into one of three age categories: "Child,"
//        "Teenager," or "Adult" using an if statement.
//                use an if statement to categorize the age based on the following criteria:
//           • If the age is less than 13, categorize them as a "Child."
//           • If the age is between 13 and 19 (inclusive), categorize them as a
//        "Teenager."
//           • If the age is 20 or older, categorize them as an "Adult."

              System.out.println("Please, enter your age: ");
              int age = scanner.nextInt();
              scanner.nextLine();

              if(age < 13){
                  System.out.println("You are a Child.");

              }else if(age >= 13 && age <= 19){
                  System.out.println("You are a Teenager.");

              }else System.out.println("You are an Adult.");

              System.out.println("-----------------------------------");




























    }


}
