package GUI;

import CheckboxDemo.CheckboxDemo;

import javax.swing.*;
import java.awt.*;

public class MainPanel extends JPanel {
    private Menu menu;
    private PlayGame playGame;
    private PTB2Panel ptb2Panel;
    private SortPanel sortPanel;
    private CheckboxDemo checkboxDemo;
    public MainPanel(){
        initPanel();
        addEvents();
        addComps();
    }

    private void initPanel(){
        setBackground(Color.white);
        setLayout(new CardLayout());
    }
    private void addEvents(){

    }
    private void addComps(){
        /*menu=new Menu();
        menu.setMainPanel(this);
        playGame=new PlayGame();
        playGame.setMainPanel(this);
        add(playGame);
        add(menu);*/
       // ptb2Panel=new PTB2Panel();
       // add(ptb2Panel);
        checkboxDemo=new CheckboxDemo();
        add(checkboxDemo);
       /* sortPanel=new SortPanel();
        add(sortPanel);*/

    }
    public void showPlayGame(){
        playGame.setVisible(true);
    }
    public void showMenuGame(){
        menu.setVisible(true);
    }

}