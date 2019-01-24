import javax.swing.JOptionPane;

public class greeter {
public static void main(String[] args) {
	String name=JOptionPane.showInputDialog("what name"); 
	JOptionPane.showMessageDialog(null, "hello" +name);
	
}
}
