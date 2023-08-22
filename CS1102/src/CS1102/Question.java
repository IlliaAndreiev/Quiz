package CS1102;

import java.awt.*;
import javax.swing.*;


public abstract class Question {
	Question(String question) {
		this.question = new QuestionDialog();
	    this.question.setLayout(new GridLayout(0,1));
	    this.question.add(new JLabel(" "+question+" ",JLabel.CENTER));
	}
	
	void initQuestionDialog() {
		question.setModal(true);
		question.pack();
		question.setLocationRelativeTo(null);
	}
	
	String ask() {
		question.setVisible(true);
		return question.answer;
	}
	
	static int nQuestions = 0;
    static int nCorrectAnswers = 0;
    QuestionDialog question;
    String answer;
    
    public void check() {
        nQuestions++;
        String userAnswer = ask();
        if (userAnswer.equals(answer.toUpperCase())) {
            JOptionPane.showMessageDialog(null, "Correct answer!");
            nCorrectAnswers++;
        } else {
            JOptionPane.showMessageDialog(null, "Incorrect answer.");
        }
    }

    public static void showResults() {
        JOptionPane.showMessageDialog(null, "Number of questions: " + nQuestions + "\n"
                + "Number of correct answers: " + nCorrectAnswers);
    }
}
