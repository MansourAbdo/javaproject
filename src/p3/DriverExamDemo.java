package p3;

import java.util.Scanner;

public class DriverExamDemo {
   public static void main(String[] args) {
       System.out.println("Drivers Lincense Exam");

      //SCANNER OBJECT
      Scanner keyboard = new Scanner(System.in);

       System.out.println("10 multiplt choice quesions ");
       
       // ARRAY OF STRING
       String[] answers = new String[10];

       String answer;
       for (int i = 0; i < 10; i++) {
           do {
               System.out.print((i + 1) + ".");
               answer = keyboard.nextLine();
           } while (!isValidAnswer(answer));
           answers[i] = answer;
       }
       
       DriverExam input = new DriverExam(answers);

       displayResult(input);
   }

  public static void displayResult(DriverExam input) {

       // Result
       System.out.println("Your Exam Results are:");
       input.displayStudentAnswers();
       // DISPLAY TOTAL CORRECT ANSWERS
       System.out.println("Total Correct:" + input.totalCorrect());
       
       // DISPLAY TOTAL INCORRECT ANSWERS
       System.out.println("total incorrect:" + input.totalInCorrect());
       String passed = input.passed() ? "Yes " : " No";
       
       // DISPLAY PASS OR FAIL
       System.out.println("Passed :" + passed);
       if (input.totalInCorrect() > 0) {
           System.out.println("Missed quesions :");
           int missed;
           for (int i = 0; i < input.totalInCorrect(); i++) {
               missed = input.questionsMissed()[i] + 1;
               System.out.print(" " + missed);
           }
       }

   }
  

   // RETURN IF THE ANSWER IS RIGHT
   public static boolean isValidAnswer(String answer) {
       return "A".equalsIgnoreCase(answer) || "B".equalsIgnoreCase(answer)
               || "C".equalsIgnoreCase(answer) || "D".equalsIgnoreCase(answer);
   }
}