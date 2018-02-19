package section4;

import java.util.Random;

import javax.swing.JOptionPane;

public class AwesomeOrNot {

	// 1. Make a main method that includes all the steps below…
public static void main(String[] args) {
	

	// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"
int nukes = new Random().nextInt(4);
	// 3. Print out this variable
System.out.println(nukes);
	// 4. Get the user to enter something that they think is awesome
String awsom=JOptionPane.showInputDialog("Type something you think is awesome");
	// 5. If the random number is 0
if(nukes==0) {
	// -- tell the user whatever they entered is awesome!
	JOptionPane.showMessageDialog(null, "That's awesome!");
}
	// 6. If the random number is 1
if(nukes==1) {
	// -- tell the user whatever they entered is ok.
	JOptionPane.showMessageDialog(null, "That's kinda cool");
}
	// 7. If the random number is 2
if(nukes==2) {
	// -- tell the user whatever they entered is boring.
	JOptionPane.showMessageDialog(null, "That is the most boring thing in the history of the world");
}
	// 8. If the random number is 3
if(nukes==3) {
	// -- write your own answer
	JOptionPane.showMessageDialog(null, "Why U tuch mah spaghet");
}
}}


