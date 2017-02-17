package Project;

import javax.swing.*;
import java.awt.*;

/**
 * Created by yassin on 2/16/17.
 */
public class frame1 extends JFrame {

    public static void main(String[] args) {

        new frame1(true);


    }

    public frame1() {

        this.setSize(400, 400);
        Toolkit tk = Toolkit.getDefaultToolkit();

        Dimension dim = tk.getScreenSize();
        int xPos = (dim.width / 2) - (this.getWidth() / 2);
        int yPos = (dim.height / 2) - (this.getHeight() / 2);
        this.setLocation(xPos, yPos);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("My First Frame");
        this.setResizable(false);
        this.setVisible(true);
    }


    public frame1(String whatever) {
        this.setTitle("My First Frame");
        this.setSize(300, 300);
        JPanel thePanel = new JPanel();
        JLabel jLabel = new JLabel("Tell me something");
        JLabel jLabel1 = new JLabel("What do you want to know");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        thePanel.add(jLabel);
        thePanel.add(jLabel1);
        this.add(thePanel);
        this.setVisible(true);
    }


    public frame1(int myInt) {
        this.setTitle("Welcome to this pop-up");
        this.setSize(500, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension dimension = tk.getScreenSize();
        int xPos = (dimension.width / 2) - (this.getWidth() / 2);
        int yPos = (dimension.height / 2) - (this.getHeight() / 2);
        setLocation(xPos, yPos);
        this.setVisible(true);

    }


    public frame1(boolean okay) {
        this.setSize(300,300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel thepanel = new JPanel();
        JLabel label = new JLabel("tell me anything");
        label.setText("New Text");
        label.setToolTipText("Doesn't do shit");
        thepanel.add(label);


        JButton button = new JButton("Send");
        button.setText("New Button");
        button.setSize(30,30);
        button.setToolTipText("this button also does nothing");

        this.add(button);

        JTextField textField = new JTextField("Type here",15);
        textField.setColumns(10);
        textField.setText("Type again");
        textField.setToolTipText("It's a field");

        thepanel.add(textField);


        JTextArea textArea = new JTextArea(15, 20);
        textArea.setText("Just a whole bunch of textJust a \nwhole bunch of textJust a whole bunch of textJust a whole bunch of text");
        textArea.setToolTipText("Still, does nothing");
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);

        int numOfLines = textArea.getLineCount();

        textArea.append("Appended this: " + numOfLines + " are the number of lines");

        JScrollPane scrollPane = new JScrollPane(textArea, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
                JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

        thepanel.add(scrollPane);


        textArea.requestFocus();
        this.add(thepanel);

        this.setVisible(true);



    }

}