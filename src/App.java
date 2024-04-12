import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        //this portion is the in class-code along
        String name = JOptionPane.showInputDialog("what's your name? ");
        JOptionPane.showMessageDialog(null, "hi " +name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("how old are you? "));
        JOptionPane.showMessageDialog(null, "you look way older than "+age+" years old");

        //this portion calls the other functions
        TrueOrFalse();
        GuessNumber();
    }
}
