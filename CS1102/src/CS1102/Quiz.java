package CS1102;

import javax.swing.JOptionPane;

public class Quiz {
    public static void main(String[] args) {
        Question question1 = new MultipleChoiceQuestion(
                "What element is used to create a green color of flame?\n",
                "Sodium",
                "Calcium",
                "Copper",
                "Barium",
                "Barium",
                "C");

        Question question2 = new MultipleChoiceQuestion(
                "What is H3PO4?\n",
                "Phosphorus Trioxide",
                "Phosphoric Acid",
                "Phosphorus Trichloride",
                "Phosphorus Pentoxide",
                "Phosphorus Dioxide",
                "B");

        Question question3 = new MultipleChoiceQuestion(
                "What is the chemical symbol for hydrogen?\n",
                "He",
                "Hg",
                "U",
                "O",
                "H",
                "E");

        Question question4 = new MultipleChoiceQuestion(
                "What is the approximate molecular mass of Uranium?\n",
                "234",
                "238",
                "240",
                "244",
                "248",
                "B");

        Question question5 = new MultipleChoiceQuestion(
                "Which of the following chemical formulas represents a salt?\n",
                "H2O",
                "CO2",
                "CH4",
                "NaCl",
                "C6H12O6",
                "D");

        Question question6 = new TrueFalseQuestion(
                "The chemical formula for water is H2O.", "TRUE");

        Question question7 = new TrueFalseQuestion(
                "Oxygen is a noble gas.", "FALSE");

        Question question8 = new TrueFalseQuestion(
                "Acidic solutions have a pH value greater than 7.", "FALSE");

        Question question9 = new TrueFalseQuestion(
                "The process of rusting is a chemical change.", "TRUE");

        Question question10 = new TrueFalseQuestion(
                "A catalyst increases the rate of a chemical reaction.", "TRUE");

        question1.check();
        question2.check();
        question3.check();
        question4.check();
        question5.check();
        question6.check();
        question7.check();
        question8.check();
        question9.check();
        question10.check();

        Question.showResults();
    }
}
