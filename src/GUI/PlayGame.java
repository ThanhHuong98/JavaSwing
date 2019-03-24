package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class PlayGame extends JPanel {
    private MainPanel mainPanel;
    public PlayGame(){
        initPanel();
        addEvents();
        addComps();
    }
    private void initPanel(){
        setBackground(Color.BLUE);
        setLayout(null);

    }
    private void addEvents(){
        MouseListener mouseListener=new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {
                super.mouseClicked(mouseEvent);
                setVisible(false);
                mainPanel.showMenuGame();
            }
        };
        addMouseListener(mouseListener);


    }
    private void addComps(){

    }
    public void setMainPanel(MainPanel mainPanel){
        this.mainPanel=mainPanel;
    }
}