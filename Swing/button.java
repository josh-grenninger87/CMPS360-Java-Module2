package Swing;

import java.awt.*;

class button {
    button()
    {
        Frame f = new Frame();
        Button button1 = new Button("Submit");
        button1.setBounds(50,50,100,100);
        f.add(button1);

        Button button2 = new Button("Exit");
        button2.setBounds(250,50,100,100);
        f.add(button2);

        f.setSize(500,500);
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String a[]) {new button();}
}
