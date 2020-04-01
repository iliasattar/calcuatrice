package com.combinee;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App {

    public App() {

        BtnOne.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String BtnOneText  = BtnOne.getText();
                txtDisplay.setText( BtnOneText );
            }
        });
        BtnTwo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String BtnTwoText  = BtnTwo.getText();
                txtDisplay.setText( BtnTwoText );
            }
        });
        BtnThree.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String BtnThreeText  = BtnThree.getText();
                txtDisplay.setText( BtnThreeText );
            }
        });
        BtnFour.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String BtnFourText  = BtnFour.getText();
                txtDisplay.setText( BtnFourText );
            }
        });
        BtnFive.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String BtnFiveText  = BtnFive.getText();
                txtDisplay.setText( BtnFiveText );
            }
        });
        BtnSix.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String BtnSixText  = BtnSix.getText();
                txtDisplay.setText( BtnSixText );
            }
        });
        BtnSeven.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String BtnSevenText  = BtnSeven.getText();
                txtDisplay.setText( BtnSevenText );
            }
        });
        BtnEight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String BtnEightText  = BtnEight.getText();
                txtDisplay.setText( BtnEightText );
            }
        });
        BtnNine.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String BtnNineText  = BtnNine.getText();
                txtDisplay.setText( BtnNineText );
            }
        });
        BtnPoint.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(txtDisplay.getText().equals("")){
                    txtDisplay.setText("0.0");
                }
                else if(txtDisplay.getText().contains(".")){
                    BtnPoint.setEnabled(false);
                }
                else {String BtnPointText = txtDisplay.getText() + BtnPoint.getText();
                txtDisplay.setText(BtnPointText);
                BtnPoint.setEnabled(true);
                }

            }

        });
        BtnZero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String BtnZeroText  = BtnZero.getText();
                txtDisplay.setText( BtnZeroText );
            }
        });

        BtnPlus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button_text = BtnPlus.getText();
                getOperator(button_text);
            }
        });

        BtnEquals.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switch (math_operator){
                    case "+":
                        total2 = total1 + Double.parseDouble(txtDisplay.getText());
                        break;
                    case "-":
                        total2 = total1 - Double.parseDouble(txtDisplay.getText());
                        break;
                    case "*":
                        total2 = total1 * Double.parseDouble(txtDisplay.getText());
                        break;
                    case "/":
                        total2 = total1 / Double.parseDouble(txtDisplay.getText());
                        break;
                    case "sqrt":
                        total2 = Math.sqrt(Double.parseDouble(txtDisplay.getText()));
                        break;
                    case "1/":
                        total2 = 1 / Double.parseDouble(txtDisplay.getText());
                        break;
                    case "x^2":
                        total2 = Math.pow(Double.parseDouble(txtDisplay.getText()), 2);
                        break;
                    case "x^3":
                        total2 = Math.pow(Double.parseDouble(txtDisplay.getText()), 3);
                        break;
                    case "cos":
                        total2 = Math.cos(Double.parseDouble(txtDisplay.getText()));
                        break;
                    case "sin":
                        total2 = Math.sin(Double.parseDouble(txtDisplay.getText()));
                        break;
                    case "tan":
                        total2 = Math.tan(Double.parseDouble(txtDisplay.getText()));
                        break;
                    case "x!":
                        total2 = fact(Double.parseDouble(txtDisplay.getText()));
                        break;
                }
                txtDisplay.setText( Double.toString( total2) );
                total1=0;
            }
        });
        BtnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                total2 =0;
                txtDisplay.setText("");
            }
        });
        BtnMinus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button_text = BtnMinus.getText();
                getOperator(button_text);
            }
        });
        BtnMultiply.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button_text = BtnMultiply.getText();
                getOperator(button_text);
            }
        });
        BtnDivide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button_text = BtnDivide.getText();
                getOperator(button_text);
            }
        });

        Btnsqrt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button_text = Btnsqrt.getText();
                txtDisplay.setText(button_text);
                getOperator(button_text);
            }
        });


        Btnreverse.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String button_text = "1/";
                txtDisplay.setText(button_text);
                getOperator(button_text);
            }
        });
        Btnpwr2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String button_text = "x^2";
                txtDisplay.setText(button_text);
                getOperator(button_text);
            }
        });
        Btnpwr3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String button_text = "x^3";
                txtDisplay.setText(button_text);
                getOperator(button_text);
            }
        });

        Btncos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String button_text = "cos";
                txtDisplay.setText(button_text);
                getOperator(button_text);
            }
        });
        Btnsin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String button_text = "sin";
                txtDisplay.setText(button_text);
                getOperator(button_text);
            }
        });
        Btntan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String button_text = "tan";
                txtDisplay.setText(button_text);
                getOperator(button_text);
            }
        });
        Btnfact.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String button_text = "x!";
                txtDisplay.setText(button_text);
                getOperator(button_text);
            }
        });
    }
    double fact(double x) {
        int er = 0;
        if (x < 0) {
            er = 20;
            return 0;
        }
        double i, s = 1;
        for (i = 2; i <= x; i += 1.0)
            s *= i;
        return s;
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("App");
        frame.setContentPane(new App().Panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
    private String math_operator;
    private double total1 =0.0;
    private double total2 = 0.0;
    private JPanel Panel1;
    private JTextField txtDisplay;
    private JButton BtnEquals;
    private JButton BtnMultiply;
    private JButton BtnThree;
    private JButton BtnPlus;
    private JButton BtnSix;
    private JButton BtnNine;
    private JButton BtnClear;
    private JButton BtnMinus;
    private JButton BtnDivide;
    private JButton BtnTwo;
    private JButton BtnFive;
    private JButton BtnEight;
    private JButton BtnZero;
    private JButton BtnOne;
    private JButton BtnFour;
    private JButton BtnSeven;
    private JButton BtnPoint;
    private JButton Btnreverse;
    private JButton Btnsqrt;
    private JButton Btnpwr2;
    private JButton Btnfact;
    private JButton Btncos;
    private JButton Btnsin;
    private JButton Btntan;
    private JButton Btnpwr3;

    private void getOperator(String BtnText){
        math_operator = BtnText.toString();
        total1 = total2 + Double.parseDouble(txtDisplay.getText());
        txtDisplay.setText("");
    }
}
