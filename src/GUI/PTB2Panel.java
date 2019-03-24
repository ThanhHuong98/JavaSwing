package GUI;

import PTB2.GiaiPTB2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PTB2Panel extends JPanel {
    private JLabel lbTitile, lbNumberA, lbNumberB,lbNumberC;
    private JTextField tfInputA, tfInputB, tfInputC;
    private JTextArea tfResult;
    private JButton jbDone;

    public PTB2Panel(){
        initPanel();
        addComps();
        addEvents();
    }
    private void initPanel(){
        setBackground(Color.WHITE);
        setLayout(null);
    }
    private void addEvents(){
        //Event for button
        jbDone.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                double a = Integer.parseInt(tfInputA.getText());
                double b = Integer.parseInt(tfInputB.getText());
                double c = Integer.parseInt(tfInputC.getText());
                GiaiPTB2 giaiPTB2 = new GiaiPTB2(a,b,c);
                giaiPTB2.ResolvePT();
                String strResult = giaiPTB2.getStrResult();
                tfResult.setText(strResult);
            }
        });
    }
    private void addComps(){
        //add JComponents: textFile,textAre, button;
        lbTitile=new JLabel("PTB2: ax^2 + bx + c = 0");
            //lbTitile.setText("PTB2: ax^2 + bx + c = 0");
        lbTitile.setBounds(20,10,500,500);
        lbTitile.setForeground(Color.BLUE.darker());
        lbTitile.setFont(new Font("Arial",Font.PLAIN,30));
        add(lbTitile);

        lbNumberA=new JLabel();
        lbNumberA.setText("Number a:");
        lbNumberA.setBounds(20,80,300,50);
        lbNumberA.setForeground(Color.BLUE.darker());
        lbNumberA.setFont(new Font("Arial",Font.PLAIN,16));
        add(lbNumberA);

        lbNumberB=new JLabel();
        lbNumberB.setText("Number b:");
        lbNumberB.setBounds(20,120,300,50);
        lbNumberB.setForeground(Color.BLUE.darker());
        lbNumberB.setFont(new Font("Arial",Font.PLAIN,16));
        add(lbNumberB);

        lbNumberC=new JLabel();
        lbNumberC.setText("Number c:");
        lbNumberC.setBounds(20,160,300,50);
        lbNumberC.setForeground(Color.BLUE.darker());
        lbNumberC.setFont(new Font("Arial",Font.PLAIN,16));
        add(lbNumberC);

        tfInputA=new JTextField();
        tfInputA.setBounds(100,90,100,30);
        tfInputA.setForeground(Color.BLUE.darker());
        tfInputA.setFont(new Font("Arial",Font.PLAIN,16));
        add(tfInputA);

        tfInputB=new JTextField();
        tfInputB.setBounds(100,130,100,30);
        tfInputB.setForeground(Color.BLUE.darker());
        tfInputB.setFont(new Font("Arial",Font.PLAIN,16));
        add(tfInputB);

        tfInputC=new JTextField();
        tfInputC.setBounds(100,170,100,30);
        tfInputC.setForeground(Color.BLUE.darker());
        tfInputC.setFont(new Font("Arial",Font.PLAIN,16));
        add(tfInputC);

        jbDone=new JButton();
        jbDone.setText("Done");
        jbDone.setBounds(220,90,120,30);
        jbDone.setBackground(Color.YELLOW);
        jbDone.setFont(new Font("Arial",Font.PLAIN,16));
        add(jbDone);

        tfResult=new JTextArea();
        tfResult.setBackground(Color.ORANGE);
        tfResult.setForeground(Color.WHITE);
        tfResult.setWrapStyleWord(true);
        tfResult.setEditable(false);
        tfResult.setLineWrap(true);
        tfResult.setFont(new Font("Arial",Font.PLAIN,16));
        JScrollPane jScrollPane=new JScrollPane(tfResult);
        jScrollPane.setBounds(220,130,250,70);
        add(jScrollPane);
    }
}
