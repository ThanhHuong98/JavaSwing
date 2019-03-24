package CheckboxDemo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;

public class CheckboxDemo extends JPanel {
    private JCheckBox cbBold, cbItalic, cbPlain;
    private JTextArea jTextArea;
    private JButton jButton;
    private MouseAdapter mouseAdapter;

    public CheckboxDemo(){
        initPanel();
        addComps();
        addEvents();
    }
    private void initPanel(){
        setBackground(Color.WHITE);
        setLayout(null);
    }
    private void addEvents(){
       jButton.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent actionEvent) {
               doClickCheckBox();
           }
       });
    }
    protected void doClickCheckBox(){
        Font font;
        if(cbBold.isSelected()){
            font=new Font("Arial",Font.BOLD,16);
            handleText(font);
            setBackground(Color.RED);
        }else if(cbItalic.isSelected()){
            font=new Font("Arial",Font.ITALIC,16);
            handleText(font);
            setBackground(Color.CYAN);
        }else if(cbPlain.isSelected()){
            font=new Font("Arial",Font.PLAIN,16);
            handleText(font);
            setBackground(Color.YELLOW);
        }else {
            font=new Font("Time new romance",Font.PLAIN,16);
            handleText(font);
            setBackground(Color.BLUE);
        }
    }
    protected void handleText(Font font){
        String text = jTextArea.getText();
        try{
            jTextArea.setFont(font);
            jTextArea.setText(text);
        }catch (NullPointerException e){
            //
        }
    }
    private void addComps(){
        cbBold=new JCheckBox();
        cbBold.setBounds(20,20,100,30);
        cbBold.setText("Bold");
        cbBold.setFont(new Font("Arial",Font.BOLD,16));
        cbBold.setForeground(Color.BLACK);
        //cbBold.addMouseListener(mouseAdapter);
        add(cbBold);
        //
        cbItalic=new JCheckBox();
        cbItalic.setBounds(20,50,100,30);
        cbItalic.setText("Italic");
        cbItalic.setFont(new Font("Arial",Font.ITALIC,16));
        cbItalic.setForeground(Color.BLACK);
        //cbItalic.addMouseListener(mouseAdapter);
        add(cbItalic);
        //
        cbPlain=new JCheckBox();
        cbPlain.setBounds(20,80,100,30);
        cbPlain.setText("Plain");
        cbPlain.setFont(new Font("Arial",Font.PLAIN,16));
        cbPlain.setForeground(Color.BLACK);
        //cbPlain.addMouseListener(mouseAdapter);
        add(cbPlain);
        //
        jTextArea=new JTextArea();
        jTextArea.setBounds(100,20,350,200);
        jTextArea.setBackground(Color.ORANGE);
        jTextArea.setForeground(Color.BLACK);
        add(jTextArea);
        //
        jButton=new JButton();
        jButton.setText("Apply");
        jButton.setBounds(20,120,80,30);
        jButton.setBackground(Color.CYAN);
        add(jButton);
    }
}
