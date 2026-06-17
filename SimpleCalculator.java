import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class SimpleCalculator {

   public static void main(String[] args){

        JFrame frame = new JFrame("Simple Calculator");
        frame.setSize(400,400);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //pannel

        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        //calculator Part
        
        //for number entering

        //label 1
        gbc.gridx = 0;
        gbc.gridy = 0;
        JLabel num1 = new JLabel("Num1");
        panel.add(num1,gbc);

        //textfeild
        gbc.gridx = 1;
        gbc.gridy = 0;
        JTextField number1 = new JTextField(10);
        panel.add(number1,gbc);

        //label 2
        gbc.gridx = 0;
        gbc.gridy = 1;
        JLabel num2 = new JLabel("Num2");
        panel.add(num2,gbc);

        //textfeild
        gbc.gridx = 1;
        gbc.gridy = 1;
        JTextField number2 = new JTextField(10);
        panel.add(number2,gbc);

        //result label
        gbc.gridx = 0;
        gbc.gridy = 3;
        JLabel result = new JLabel("Result :");
        panel.add(result,gbc);

        // buttons

        //add button
        gbc.gridx = 0;
        gbc.gridy = 2;
        JButton add = new JButton("+");
        panel.add(add,gbc);

        //subtract button
        gbc.gridx = 1 ;
        gbc.gridy = 2 ;
        JButton sub = new JButton("-");
        panel.add(sub,gbc);

        //divide button
        gbc.gridx = 2;
        gbc.gridy = 2;
        JButton divide = new JButton("/");
        panel.add(divide,gbc);

        //multlipy button
        gbc.gridx = 3;
        gbc.gridy = 2;
        JButton mult = new JButton("x");
        panel.add(mult,gbc);
        
        add.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e){
                String n1 = number1.getText().trim();
                String n2 = number2.getText().trim();
                if(n1.isEmpty() || n2.isBlank()){
                    JOptionPane.showMessageDialog(frame,"Field empty!!!" , "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                
                double num1 = Double.parseDouble(n1);
                double num2 = Double.parseDouble(n2);
                double sum = num1 + num2;

                result.setText("Sum = "+ sum);
            }
        });

        sub.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                String n1 = number1.getText().trim();
                String n2 = number2.getText().trim();
                if(n1.isEmpty() || n2.isBlank()){
                    JOptionPane.showMessageDialog(frame,"Field empty!!!" , "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                double num1 = Double.parseDouble(n1);
                double num2 = Double.parseDouble(n2);
                double sub = num1 - num2;

                result.setText("Sub = "+ sub);
            }
        });

        mult.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e){
                String n1 = number1.getText().trim();
                String n2 = number2.getText().trim();
                if(n1.isEmpty() || n2.isBlank()){
                    JOptionPane.showMessageDialog(frame,"Field empty!!!" , "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                double num1 = Double.parseDouble(n1);
                double num2 = Double.parseDouble(n2);
                double mult = num1 * num2;

                result.setText("Mult = "+ mult);
            }
        });

        divide.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e){
                String n1 = number1.getText().trim();
                String n2 = number2.getText().trim();
                if(n1.isEmpty() || n2.isBlank()){
                    JOptionPane.showMessageDialog(frame,"Field empty!!!" , "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                double num1 = Double.parseDouble(n1);
                double num2 = Double.parseDouble(n2);
                try{
                    double div = num1/num2;
                    result.setText("Div = "+ div);
                }
                catch(ArithmeticException err){
                    result.setText("Can not divide by zero");
                }
            }
        });
        frame.add(panel);
        frame.setVisible(true);

   }
}