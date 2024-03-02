import javax.swing.JOptionPane;

public class GUI_intro {
    public static void GUI_intro() {
        // JOptionPane.showMessageDialog(null, "Hello, World!");
        String name = JOptionPane.showInputDialog("Enter your Name");
        JOptionPane.showMessageDialog(null, "Hello " + name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your Age"));
        JOptionPane.showMessageDialog(null, "Your are " + age + " years old");

        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your Height"));
        JOptionPane.showMessageDialog(null, "Your are height is " + height );
    }
}