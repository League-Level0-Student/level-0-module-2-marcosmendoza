package EverythingIsAwesome;

import javax.swing.JOptionPane;

public class Awesome {
public static void main(String[] args) {
	String name=JOptionPane.showInputDialog("how are you"); 
	JOptionPane.showMessageDialog(null, "thats cool im also " +name);
	String name1=JOptionPane.showInputDialog("what are you doing today"); 
	JOptionPane.showMessageDialog(null, "thats cool i like doing " +name1);
	String name11=JOptionPane.showInputDialog("what are you wearing today"); 
	JOptionPane.showMessageDialog(null, "woah i also like to wear  " +name11);
	String name111=JOptionPane.showInputDialog("what is your favorite food"); 
	JOptionPane.showMessageDialog(null, "is cool woah "+name111 );
}}