package p3;

//MANSOUR ABDO CPS121 3/20/2022
// Student must get 7 out of 10 to pass

public class DriverExam {
// ARRAY OF THE RIGHT ANSWERS 
private final String[] correctAnswers = { "C", "A", "B", "A", "A", "C", "D", "B", "A", "D"};

// ARRAY TO STORE THE STUDENT ANSWERS
private final String[] studentAnswers;

private int[] missed = new int[correctAnswers.length];

//RETURNS TEH VALUE IF STUDENT CORRECT ANSWERS>7
public boolean passed() {
    if (totalCorrect() >= 7)
        return true;
    else
        return false;
}

// TOTAL NUMBER OF CORRECT QUESTIONS 
public int totalCorrect()
{
	   int countcorrect=0;
     for(int i=0; i<correctAnswers.length;i++)
    {
     	if (studentAnswers[i].equalsIgnoreCase(correctAnswers[i]))
        {
     	   countcorrect++;
        }
    }
     return countcorrect;
}

//TOTAL NUMBER OF INCORRECR ANSWERS
public int totalInCorrect() {
    int countIncorrect = 0;
    for (int i = 0; i < correctAnswers.length; i++)
    {
        if (!studentAnswers[i].equalsIgnoreCase(correctAnswers[i])) 
        {
            missed[countIncorrect] = i;
            countIncorrect++;
        }
    }
    return countIncorrect;
}

//TOTAL NUMBER OF QUESTIONS MISSED
public int[] questionsMissed() {
    return missed;
}

public void displayStudentAnswers() {
    System.out.println("The student Answers are  :");
    for (int i = 0; i < studentAnswers.length; i++) {
        System.out.print(studentAnswers[i] + " ");
    }
    System.out.println();
}
//PROCESS THE STUDENT DISPLAY ANSWERS
public DriverExam(String[] Answers) {
    studentAnswers = new String[Answers.length];
    for (int i = 0; i < Answers.length; i++) {
        studentAnswers[i] = Answers[i];
    }
}



}
