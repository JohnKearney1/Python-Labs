package solution;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


/**
 * Lab 05 - Simple GUI Calculator
 * @author John Kearney
 * @version 2/16/2023
 *
 */
public class Calculator
{
    
    private JFrame f = new JFrame();
    
    public JFrame getFrame()
    {
        return f;
    }
    
    public Calculator() 
    {
        
        /*
         * Setup
         */
        
        // set FlowLayout for JFrame
        // f.setLayout(new FlowLayout());
        
        // Set title to `Calculator`
        f.setTitle("Calculator");
        
        // Set size
        f.setSize(400, 200);
        
        // Make container panel for everything
        //JPanel framePanel = new JPanel(new GridLayout(3,1));
        
        /*
         * Jpanel for BUTTON PANEL (bp)
         */
        
        // Create button panel
        JPanel bp = new JPanel();
        bp.setName("buttonPanel");
        
        // Create buttons and setLabel
        JButton addButton = new JButton("ADD");
        addButton.setLabel("ADD");
        addButton.setName("addButton");
        addButton.setVisible(true);
        
        
        JButton subButton = new JButton("SUB");
        subButton.setLabel("SUB");
        subButton.setName("subButton");
        subButton.setVisible(true);
        
        JButton multButton = new JButton("MULT");
        multButton.setLabel("MULT");
        multButton.setName("multButton");
        multButton.setVisible(true);
        
        JButton divButton = new JButton("DIV");
        divButton.setLabel("DIV");
        divButton.setName("divButton");
        divButton.setVisible(true);
        
        // Add buttons to panel
        bp.add(addButton);
        bp.add(subButton);
        bp.add(multButton);
        bp.add(divButton);
        
        
        /*
         * Jpanel for RESULT PANEL (rp)
         */
        
        // Create result panel (rp)
        JPanel rp = new JPanel();
        rp.setName("resultPanel");
        
        // Create result label and setName "Result"
        JLabel resultLabel = new JLabel("Result");
        resultLabel.setName("resultLabel");
        resultLabel.setVisible(true);
        
        // Add result label to result panel
        rp.add(resultLabel);
        
        /*
         * JPanel for TEXT PANEL (tp)
         */
        
        // Create text panel (tp)
        JPanel tp = new JPanel();
        tp.setName("textPanel");
        
        // Create text fields
        JTextField leftOperand = new JTextField();
        // leftOperand.setName("leftOperand");
        leftOperand.setPreferredSize(new Dimension(150, 25));
        leftOperand.setName("leftOperand");
        leftOperand.setVisible(true);
        
        JTextField rightOperand = new JTextField();
        // rightOperand.setName("leftOperand");
        rightOperand.setPreferredSize(new Dimension(150, 25));
        rightOperand.setName("rightOperand");
        rightOperand.setVisible(true);


        // Add text fields to text panel
        tp.add(leftOperand);
        tp.add(rightOperand);
        
        
        /*
         * frame finalization
         */
        
        // Add panels to frame
        //framePanel.add(tp);
        //framePanel.add(rp);
        //framePanel.add(bp);
        
        f.add(tp, BorderLayout.NORTH);
        f.add(rp, BorderLayout.CENTER);
        f.add(bp, BorderLayout.SOUTH);
        
        // Add framePanel to panel
        //f.add(framePanel);
        
        // Set layout
        
        // Create action listeners for the four buttons
        
        // Add button
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(leftOperand.getText().length() > 0 && rightOperand.getText().length() > 0) 
                {
                    String result = addMethod(leftOperand.getText(), rightOperand.getText());
                    resultLabel.setText("Result = " + result);
                }
                else if(leftOperand.getText().length() <= 0 || rightOperand.getText().length() <= 0) 
                {
                    resultLabel.setText("Result = Error");
                }
                
                
            }
        });
        
        subButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(leftOperand.getText().length() > 0 && rightOperand.getText().length() > 0) 
                {
                    String result = subMethod(leftOperand.getText(), rightOperand.getText());
                    resultLabel.setText("Result = " + result);
                }
                else if(leftOperand.getText().length() <= 0 || rightOperand.getText().length() <= 0) 
                {
                    resultLabel.setText("Result = Error");
                }
            }
        });
        
        multButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(leftOperand.getText().length() > 0 && rightOperand.getText().length() > 0) 
                {
                    String result = multMethod(leftOperand.getText(), rightOperand.getText());
                    resultLabel.setText("Result = " + result);
                }
                else if(leftOperand.getText().length() <= 0 || rightOperand.getText().length() <= 0) 
                {
                    resultLabel.setText("Result = Error");
                }
            }
        });
        
        divButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(leftOperand.getText().length() > 0 && rightOperand.getText().length() > 0) 
                {
                    String result = divMethod(leftOperand.getText(), rightOperand.getText());
                    resultLabel.setText("Result = " + result);
                }
                else if(leftOperand.getText().length() <= 0 || rightOperand.getText().length() <= 0) 
                {
                    resultLabel.setText("Result = Error");
                }
            }
        });
        
        
        // Make text pane visible to frame
        //framePanel.setVisible(true);
        tp.setVisible(true);
        rp.setVisible(true);
        bp.setVisible(true);
        // Make frame visible to user
        f.setVisible(true);
        
        
    }
    
    public String addMethod(String str1, String str2) 
    {
        String result = null;
        
        // Remove whitespaces
        String str1Crop = str1.replaceAll("\\s", "");
        String str2Crop = str2.replaceAll("\\s", "");
        
        // Parse Doubles
        try {
            
            double a = Double.parseDouble(str1Crop);
            double b = Double.parseDouble(str2Crop);
            
            // Add Doubles
            double ans = a + b;
            
            // Convert to string
            result = Double.toString(ans);
        }
        catch(NumberFormatException e)
        {
            result = "Error";
        }

        


        // Return string answer
        return result;
    }
    
    public String subMethod(String str1, String str2) 
    {
        String result = null;
        
        // Remove whitespaces
        String str1Crop = str1.replaceAll("\\s", "");
        String str2Crop = str2.replaceAll("\\s", "");
        
        try {
            
            // Parse Doubles
            double a = Double.parseDouble(str1Crop);
            double b = Double.parseDouble(str2Crop);

            // Subtract Doubles
            double ans = a - b;
            
            // Convert to string
            result = Double.toString(ans);
        }
        catch(NumberFormatException e)
        {
            result = "Error";
        }
        
        // Return string answer
        return result;
    }
    
    public String multMethod(String str1, String str2) 
    {
        String result = null;
        
        // Remove whitespaces
        String str1Crop = str1.replaceAll("\\s", "");
        String str2Crop = str2.replaceAll("\\s", "");
        
        try {
            
            // Parse Doubles
            double a = Double.parseDouble(str1Crop);
            double b = Double.parseDouble(str2Crop);

            // multiply Doubles
            double ans = a * b;
            
            // Convert to string
            result = Double.toString(ans);
        }
        catch(NumberFormatException e)
        {
            result = "Error";
        }
        
        
        // Return string answer
        return result;
    }
    
    public String divMethod(String str1, String str2) 
    {
        String result = null;
        
        // Remove whitespaces
        String str1Crop = str1.replaceAll("\\s", "");
        String str2Crop = str2.replaceAll("\\s", "");
        
        try {
            
            // Parse Doubles
            double a = Double.parseDouble(str1Crop);
            double b = Double.parseDouble(str2Crop);
            
            if (a != 0 && b != 0) {
                
                // Divide Doubles
                double ans = a / b;
                
                // Convert to string
                result = Double.toString(ans);
            }
            else {
                result = "Error";
            }
            
        }
        catch(NumberFormatException e)
        {
            result = "Error";
        }

        // Return string answer
        return result;
    }
    
    
    
    public static void main(String[] args)
    {
        Calculator calc = new Calculator();
    }
    
    

}
