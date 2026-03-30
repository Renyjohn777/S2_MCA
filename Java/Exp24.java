import java.awt.*;
import java.awt.event.*;

public class Exp24 extends Frame implements ActionListener {
    TextField t1, t2, result;
    Button add, sub, mul, div, clear;
    Label l1, l2, lResult;

    public Exp24() {
        setTitle("Simple Calculator");
        setSize(400, 350);
        setLayout(new GridLayout(6, 2, 10, 10));

        l1 = new Label("Enter Number 1:");
        t1 = new TextField();
        l2 = new Label("Enter Number 2:");
        t2 = new TextField();
        lResult = new Label("Result:");
        result = new TextField();
        result.setEditable(false);

        add  = new Button("Add (+)");
        sub  = new Button("Subtract (-)");
        mul  = new Button("Multiply (*)");
        div  = new Button("Divide (/)");   
        clear = new Button("Clear");

        add.addActionListener(this);
        sub.addActionListener(this);
        mul.addActionListener(this);
        div.addActionListener(this);
        clear.addActionListener(this);

        add(l1);     add(t1);
        add(l2);     add(t2);
        add(add);    add(sub);
        add(mul);    add(div);
        add(lResult); add(result);
        add(clear);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            double n1 = Double.parseDouble(t1.getText());
            double n2 = Double.parseDouble(t2.getText());
            double res = 0;

            if (e.getSource() == add)        res = n1 + n2;
            else if (e.getSource() == sub)   res = n1 - n2;
            else if (e.getSource() == mul)   res = n1 * n2;
            else if (e.getSource() == div) {
                if (n2 == 0) {
                    result.setText("Cannot divide by zero!");
                    return;
                }
                res = n1 / n2;
            } else if (e.getSource() == clear) {
                t1.setText(""); t2.setText(""); result.setText("");
                return;
            }
            result.setText(String.valueOf(res));
        } catch (NumberFormatException ex) {
            result.setText("Enter valid numbers!");
        }
    }

    public static void main(String[] args) {
        new Exp24();
    }
}