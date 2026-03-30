import java.awt.*;
import java.awt.event.*;

public class Exp23 extends Frame implements ActionListener {
    Label l1, l2, l3, result;
    TextField t1, t2, t3;
    Button findMax, clear;

    public Exp23() {
        setTitle("Maximum of Three Numbers");
        setSize(400, 300);
        setLayout(new GridLayout(5, 2, 10, 10));

        l1 = new Label("Enter Number 1:");
        t1 = new TextField();
        l2 = new Label("Enter Number 2:");
        t2 = new TextField();
        l3 = new Label("Enter Number 3:");
        t3 = new TextField();
        result = new Label("Maximum: ");
        findMax = new Button("Find Maximum");
        clear = new Button("Clear");

        findMax.addActionListener(this);
        clear.addActionListener(this);

        add(l1); add(t1);
        add(l2); add(t2);
        add(l3); add(t3);
        add(findMax); add(clear);
        add(result);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == findMax) {
            try {
                int n1 = Integer.parseInt(t1.getText());
                int n2 = Integer.parseInt(t2.getText());
                int n3 = Integer.parseInt(t3.getText());
                int max = Math.max(n1, Math.max(n2, n3));
                result.setText("Maximum: " + max);
            } catch (NumberFormatException ex) {
                result.setText("Please enter valid numbers!");
            }
        } else if (e.getSource() == clear) {
            t1.setText("");
            t2.setText("");
            t3.setText("");
            result.setText("Maximum: ");
        }
    }

    public static void main(String[] args) {
        new Exp23();
    }
}