import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator {
    JFrame jFrame = new JFrame();
    JButton numBtn1 = new JButton();
    JButton numBtn2 = new JButton();
    JButton numBtn3 = new JButton();
    JButton numBtn4 = new JButton();
    JButton numBtn5 = new JButton();
    JButton numBtn6 = new JButton();
    JButton numBtn7 = new JButton();
    JButton numBtn8 = new JButton();
    JButton numBtn9 = new JButton();
    JButton numBtn0 = new JButton();
    JButton addBtn = new JButton();
    JButton subtractionBtn = new JButton();
    JButton multiplactionBtn = new JButton();
    JButton divisionBtn = new JButton();
    JButton clearBtn = new JButton();
    JButton percentageBtn = new JButton();
    JButton backSpaceBtn = new JButton();
    JButton dotBtn = new JButton();
    JButton equalBtn = new JButton();
    JTextField answerField = new JTextField();

    String operators;
    double firstNumbers;
    double secondNumbers;
    double result;

    public Calculator(){
        //set components
        answerField.setBounds(100, 100, 270, 50);
        clearBtn.setBounds(100, 170, 60, 50);
        percentageBtn.setBounds(170, 170, 60, 50);
        backSpaceBtn.setBounds(240, 170, 60, 50);
        divisionBtn.setBounds(310, 170, 60, 50);
        numBtn7.setBounds(100, 240, 60, 50);
        numBtn8.setBounds(170, 240, 60, 50);
        numBtn9.setBounds(240, 240, 60, 50);
        multiplactionBtn.setBounds(310, 240, 60, 50);
        numBtn4.setBounds(100, 310, 60, 50);
        numBtn5.setBounds(170, 310, 60, 50);
        numBtn6.setBounds(240, 310, 60, 50);
        subtractionBtn.setBounds(310, 310, 60, 50);
        numBtn1.setBounds(100, 380, 60, 50);
        numBtn2.setBounds(170, 380, 60, 50);
        numBtn3.setBounds(240, 380, 60, 50);
        addBtn.setBounds(310, 380, 60, 120);
        numBtn0.setBounds(100, 450, 60, 50);
        dotBtn.setBounds(170, 450, 60, 50);
        equalBtn.setBounds(240, 450, 60, 50);
        // button text set
        numBtn0.setText("0");
        numBtn1.setText("1");
        numBtn2.setText("2");
        numBtn3.setText("3");
        numBtn4.setText("4");
        numBtn5.setText("5");
        numBtn6.setText("6");
        numBtn7.setText("7");
        numBtn8.setText("8");
        numBtn9.setText("9");
        dotBtn.setText(".");
        equalBtn.setText("=");
        addBtn.setText("+");
        subtractionBtn.setText("-");
        multiplactionBtn.setText("*");
        divisionBtn.setText("/");
        clearBtn.setText("C");
        percentageBtn.setText("%");
        backSpaceBtn.setText("del");

        // add components
        jFrame.add(numBtn0);
        jFrame.add(numBtn1);
        jFrame.add(numBtn2);
        jFrame.add(numBtn3);
        jFrame.add(numBtn4);
        jFrame.add(numBtn5);
        jFrame.add(numBtn6);
        jFrame.add(numBtn7);
        jFrame.add(numBtn8);
        jFrame.add(numBtn9);
        jFrame.add(addBtn);
        jFrame.add(subtractionBtn);
        jFrame.add(multiplactionBtn);
        jFrame.add(divisionBtn);
        jFrame.add(clearBtn);
        jFrame.add(percentageBtn);
        jFrame.add(backSpaceBtn);
        jFrame.add(dotBtn);
        jFrame.add(equalBtn);
        jFrame.add(answerField);
        //action listener
        // event 0
        numBtn0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String previousValue = answerField.getText();
                //System.out.println(previousValue);
                String newValue = previousValue + "0";
                answerField.setText(newValue);
            }
        });
        // event 1
        numBtn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String previousValue = answerField.getText();
                //System.out.println(previousValue);
                String newValue = previousValue + "1";
                answerField.setText(newValue);
            }
        });
        //event 2
        numBtn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String previousValue = answerField.getText();
                //System.out.println(previousValue);
                String newValue = previousValue + "2";
                answerField.setText(newValue);
            }
        });
        //event 3
        numBtn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String previousValue = answerField.getText();
                //System.out.println(previousValue);
                String newValue = previousValue + "3";
                answerField.setText(newValue);
            }
        });
        //event 4
        numBtn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String previousValue = answerField.getText();
                //System.out.println(previousValue);
                String newValue = previousValue + "4";
                answerField.setText(newValue);
            }
        });
        // event 5
        numBtn5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String previousValue = answerField.getText();
                //System.out.println(previousValue);
                String newValue = previousValue + "5";
                answerField.setText(newValue);
            }
        });
        //event 6
        numBtn6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String previousValue = answerField.getText();
                //System.out.println(previousValue);
                String newValue = previousValue + "6";
                answerField.setText(newValue);
            }
        });
        //event 7
        numBtn7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String previousValue = answerField.getText();
                //System.out.println(previousValue);
                String newValue = previousValue + "7";
                answerField.setText(newValue);
            }
        });
        //event 8
        numBtn8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String previousValue = answerField.getText();
                //System.out.println(previousValue);
                String newValue = previousValue + "8";
                answerField.setText(newValue);
            }
        });
        //event 9
        numBtn9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String previousValue = answerField.getText();
                //System.out.println(previousValue);
                String newValue = previousValue + "9";
                answerField.setText(newValue);
            }
        });
        //event clear
        clearBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clearField();
            }
        });
        // event back space
        backSpaceBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String previousValue = answerField.getText();
               if((previousValue.length()) != 0){
                   String newValue = previousValue.substring(0, previousValue.length()-1);
                   answerField.setText(newValue);
               }

            }
        });
        //event sum
        addBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String previousValue = answerField.getText();
                firstNumbers = Double.parseDouble(previousValue);
                operators = "+";
                clearField();
            }
        });
        //event subtraction
        subtractionBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String previousValue = answerField.getText();
                firstNumbers = Double.parseDouble(previousValue);
                operators = "-";
                clearField();
            }
        });
        //event multiplication
        multiplactionBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String previousValue = answerField.getText();
                firstNumbers = Double.parseDouble(previousValue);
                operators = "*";
                clearField();
            }
        });
        // event division
        divisionBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String previousValue = answerField.getText();
                firstNumbers = Double.parseDouble(previousValue);
                operators = "/";
                clearField();
            }
        });
        // event percentage
        percentageBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String previousValue = answerField.getText();
                firstNumbers = Double.parseDouble(previousValue);
                operators = "%";
                clearField();
            }
        });
        // event equal
        equalBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String previousValue = answerField.getText();
                secondNumbers = Double.parseDouble(previousValue);
                switch(operators){
                    case "+":
                        result = firstNumbers + secondNumbers;
                        answerField.setText(Double.toString(result));
                        break;
                    case "-":
                        result = firstNumbers - secondNumbers;
                        answerField.setText(Double.toString(result));
                        break;
                    case "*":
                        result = firstNumbers * secondNumbers;
                        answerField.setText(Double.toString(result));
                        break;
                    case "/":
                        result = firstNumbers / secondNumbers;
                        answerField.setText(Double.toString(result));
                        break;
                    case "%":
                        result = firstNumbers * (secondNumbers/100);
                        answerField.setText(Double.toString(result));
                        break;
                    default:
                        answerField.setText("Error");

                }
            }
        });

        //set container
        jFrame.setLocation(500, 200);
        jFrame.setSize(500, 650);
        jFrame.setLayout(null);
        jFrame.setVisible(true);
    }
    public void clearField () {
        answerField.setText(null);
    }
    public static void main(String []args){
        new Calculator();
    }
}
