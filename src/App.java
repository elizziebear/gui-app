import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        //this portion is the in class-code along
        String name = JOptionPane.showInputDialog("what's your name? ");
        JOptionPane.showMessageDialog(null, "hi " +name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("how old are you? "));
        JOptionPane.showMessageDialog(null, "wow! only "+age+" years old?!?");

        //instantiating an instance of the class
        TrueOrFalse trueOrFalse = new TrueOrFalse();
        //run my method in instance of the class
        trueOrFalse.RunTrueFalse();

        GuessNumber guessNumber = new GuessNumber();
        guessNumber.RunGuesser();
    }
    
}
