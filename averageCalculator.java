

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class averageCalculator {
private JTextField score1 = new JTextField(5);
private JTextField score2 = new JTextField(5);
private JTextField score3 = new JTextField(5);
private JTextField score4 = new JTextField(5);
private JTextField output = new JTextField(5);

public averageCalculator() {

JFrame swingFrame = new JFrame("Layout Box Alignment");
swingFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
JPanel mainPanel = new JPanel();
//mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
mainPanel.setLayout(new FlowLayout());
JPanel row1 = new JPanel();
row1.setLayout(new FlowLayout());
row1.add(new JLabel("BIO:"));
row1.add(score1);

JPanel row2 = new JPanel();
row2.setLayout(new FlowLayout());
row2.add(new JLabel("STAT:"));
row2.add(score2);

JPanel row3 = new JPanel();
row3.setLayout(new FlowLayout());
row3.add(new JLabel("MATH:"));
row3.add(score3);

JPanel row4 = new JPanel();
row4.setLayout(new FlowLayout());
row4.add(new JLabel("ENG:"));
row4.add(score4);

JPanel row5 = new JPanel();
row5.setLayout(new FlowLayout());
row5.add(new JLabel("Average:"));
output.setEditable(false);
row5.add(output);
JButton calcButton = new JButton("Calculate");
calcButton.addActionListener(new Calculator());
mainPanel.add(row1);
mainPanel.add(row2);
mainPanel.add(row3);
mainPanel.add(row4);
mainPanel.add(row5);
//mainPanel.add(row3);
mainPanel.add(calcButton);
swingFrame.getContentPane().add(mainPanel,BorderLayout.CENTER);
swingFrame.pack();
swingFrame.setLocation(50,100);
swingFrame.setSize(250, 250);
swingFrame.setVisible(true);
}

public static void main(String[] args) {

new averageCalculator();
}

private class Calculator implements ActionListener {
public void actionPerformed(ActionEvent ae) {
String input1 = score1.getText().trim();
if(null == input1 || input1.isEmpty()) {
JOptionPane.showMessageDialog(null,
"wrong input value!", "ERROR", JOptionPane.ERROR_MESSAGE);
return;
}
int num1 = 0;
try {
num1 = Integer.parseInt(input1);
} catch (Exception ex) {
JOptionPane.showMessageDialog(null,
"Invalid input " + input1, "ERROR", JOptionPane.ERROR_MESSAGE);
return;



}
String input2 = score2.getText().trim();
if(null == input2 || input2.isEmpty()) {
JOptionPane.showMessageDialog(null,
"Wrong input value!", "ERROR", JOptionPane.ERROR_MESSAGE);
return;
}
int num2 = 0;
try {
num2 = Integer.parseInt(input2);
} catch (Exception ex) {
JOptionPane.showMessageDialog(null,
"Invalid input " + input2, "ERROR", JOptionPane.ERROR_MESSAGE);
return;
}
String input3 = score3.getText().trim();
if(null == input3 || input3.isEmpty()) {
JOptionPane.showMessageDialog(null,
"Wrong input value!", "ERROR", JOptionPane.ERROR_MESSAGE);
return;
}
int num3 = 0;
try {
num3 = Integer.parseInt(input3);
} catch (Exception ex) {
JOptionPane.showMessageDialog(null,
"Invalid input " + input3, "ERROR", JOptionPane.ERROR_MESSAGE);
return;
}

String input4 = score4.getText().trim();
if(null == input4 || input4.isEmpty()) {
JOptionPane.showMessageDialog(null,
"wrong input value!", "ERROR", JOptionPane.ERROR_MESSAGE);
return;
}
int num4 = 0;
try {
num4 = Integer.parseInt(input4);
} catch (Exception ex) {
JOptionPane.showMessageDialog(null,
"Invalid input " + input4, "ERROR", JOptionPane.ERROR_MESSAGE);
return;
}
float number1 = num1;
output.setText((number1+num2+num3+num4)/4 + "");
}
}

}