import javax.swing.JOptionPane;

public class GuessNumber {
    //removed static because have to instatiate (as per instructions)
    public void RunGuesser() throws Exception{
        //get random number 1-100
        int number = (int) (Math.random() * 100) + 1;

        while (true) {
            //get guess
            int guess = Integer.parseInt(JOptionPane.showInputDialog("guess a number 1-100"));

            //check guess
            //correct
            if (guess == number) {
                JOptionPane.showMessageDialog(null, "correct!");
                break;
            }
            //too low
            else if (guess < number) {
                JOptionPane.showMessageDialog(null, "that's too low, try again...");
            }
            //too high
            else {
                JOptionPane.showMessageDialog(null, "that's too high, try again...");
            }
        }
    }
}
