
package Swing;

import javax.swing.*;

public class Survey {

    public static void main(String[] args) {

        String[] questions =
        {
            "How many players played well this season?\nA. 4 B. 7 C. 9",
            "How many points did Boswell score this season?\nA.3 B.40 C.114",
            "How many penalties did the Steelers have in game 3 of the season?\n A.1 B.3 C.0"
        };

        char[] answers = {'C', 'C', 'B'};
        char ans = ' ';
        int x, correct = 0;
        String entry;
        boolean isGood;

        // NEW: Stores the numbers of incorrectly answered questions
        String wrongQuestions = "";

        for(x = 0; x < questions.length; ++x)
        {
            isGood = false;
            int firstError = 0;

            while(!isGood)
            {
                isGood = true;
                entry = JOptionPane.showInputDialog(null, questions[x]);

                // NEW: Prevents an error if Cancel is clicked
                if(entry == null)
                {
                    return;
                }

                // NEW: Prevents an error if no answer is entered
                if(entry.trim().isEmpty())
                {
                    JOptionPane.showMessageDialog(null,
                        "Please enter A, B, or C.");
                    isGood = false;
                    continue;
                }

                // NEW: Allows lowercase answers
                ans = Character.toUpperCase(entry.trim().charAt(0));

                if(ans != 'A' && ans != 'B' && ans != 'C')
                {
                    isGood = false;

                    if(firstError == 0)
                    {
                        questions[x] = questions[x] +
                            "\nYour answer must be A, B or C.";
                        firstError = 1;
                    }
                }
            }

            if(ans == answers[x])
            {
                ++correct;
                JOptionPane.showMessageDialog(null, "Correct!");
            }
            else
            {
                // NEW: Records the incorrect question number
                wrongQuestions += (x + 1) + " ";

                JOptionPane.showMessageDialog(null,
                    "The correct answer is " + answers[x]);
            }
        }

        // UPDATED: Displays the number and identity of wrong answers
        JOptionPane.showMessageDialog(null,
            "You received " + correct + " right and\n"
            + (questions.length - correct) + " wrong"
            + "\nQuestions answered incorrectly: "
            + (wrongQuestions.isEmpty() ? "None" : wrongQuestions));
    }
}

