import javax.swing.JOptionPane;

public class TrueOrFalse {
    public static void main(String[] args) {
        while (true) {
            //ask the question, remember to ask ms.r about why i have to put title (breaks otherwise)
            int answer = JOptionPane.showConfirmDialog(null, "are bears the best animal?", "question", JOptionPane.YES_NO_OPTION);
            
            //check if answer is right
            if (answer == JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(null, "correct!  🐻");
                break;
            }
            //answer is wrong >:(
            if (answer == JOptionPane.NO_OPTION) {
                JOptionPane.showMessageDialog(null, "incorrect!  🐻");
            }
        }
    }
}