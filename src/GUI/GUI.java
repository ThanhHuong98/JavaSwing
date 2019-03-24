package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUI extends JFrame {
    public static final int WIDTH_FRAME=500;
    public static final int HEIGHT_FRAME=250;
    public GUI(String titile){
        initGUI(titile);
        addEvents();
        addComps();
    }
    private void initGUI(String titile){
        setTitle(titile);
        setSize(WIDTH_FRAME,HEIGHT_FRAME);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.WHITE);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setLayout(new CardLayout());
    }
    private void addEvents(){
        WindowListener windowListener=new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent windowEvent) {
                super.windowClosing(windowEvent);
                System.out.println("The windowns be closed");
            }
        };
        addWindowListener(windowListener);
    }
    public void addComps(){
        MainPanel mainPanel=new MainPanel();
        add(mainPanel);
    }
}
