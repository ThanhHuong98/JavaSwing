package MultiLayout;

import javax.swing.*;
import java.awt.*;

public class GridLayoutDemo {
    JFrame jFrame;
    GridLayout gridLayout;
    JButton arrayBtn[];
    public GridLayoutDemo(String titile){
        initUI(titile);
        addEvents();
        addComps();
    }
    private void initUI(String titile){
        jFrame =new JFrame(titile);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.setSize(500,500);
        jFrame.setBackground(Color.WHITE);
        gridLayout=new GridLayout(3,3,10,10);
        jFrame.setLayout(gridLayout);
    }
    private void addEvents(){

    }
    private void addComps(){

        arrayBtn = new JButton[9];
        // add JButtons dynamically
        for(int i=0; i < arrayBtn.length; i++) {
            arrayBtn[i] = new JButton(Integer.toString(i));
            jFrame.add(arrayBtn[i]);
        }
        jFrame.setVisible(true);
    }
}
