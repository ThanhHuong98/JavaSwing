package GUI;

import Sort.Sort;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SortPanel extends Panel {
    private JLabel lbListNumber;
    private JLabel lbResult;
    private JTextField tfInputListNumber;
    private JTextField tfOutputResult;
    private JButton jBtnSort;

    public SortPanel(){
        initPanel();
        addComps();
        addEvents();
    }
    private void initPanel(){
        setBackground(Color.WHITE);
        setLayout(null);
    }
    private void addEvents(){
        jBtnSort.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String strNumber = tfInputListNumber.getText();
                try{
                    Sort sort = new Sort();
                    sort.setItemSort(strNumber);
                    sort.sort();
                    String strResult = sort.toString();
                    tfOutputResult.setText(strResult);

                }catch (NumberFormatException|NullPointerException e){

                }
            }
        });

    }
    private void addComps(){
        lbListNumber=new JLabel();
        lbListNumber.setBounds(20,20,50,30);
        lbListNumber.setText("Dãy số");
        lbListNumber.setForeground(Color.BLUE.darker());
        lbListNumber.setFont(new Font("Arial",Font.PLAIN,16));
        add(lbListNumber);
        //
        lbResult=new JLabel();
        lbResult.setBounds(20,60,70,30);
        lbResult.setText("Kết quả");
        lbResult.setForeground(Color.BLUE.darker());
        lbResult.setFont(new Font("Arial",Font.PLAIN,16));
        add(lbResult);
        //
        tfInputListNumber=new JTextField();
        tfInputListNumber.setBounds(100,20,350,30);
        tfInputListNumber.setForeground(Color.BLUE.darker());
        Font font =new Font("Arial",Font.PLAIN,16);
        tfInputListNumber.setFont(font);
        add(tfInputListNumber);
        //
        tfOutputResult=new JTextField();
        tfOutputResult.setBounds(100,60,350,30);
        tfOutputResult.setForeground(Color.BLUE.darker());
        tfOutputResult.setFont(new Font("Arial",Font.PLAIN,16));
        add(tfOutputResult);
        //
        jBtnSort=new JButton();
        jBtnSort.setText("Sort");
        jBtnSort.setBounds(180,100,70,30);
        jBtnSort.setBackground(Color.YELLOW);
        jBtnSort.setFont(font);
//        FontMetrics fontMetrics=getFontMetrics(font);
//        int height = fontMetrics.getHeight();
//        int width = fontMetrics.stringWidth(jBtnSort.getText());
//        jBtnSort.setSize(width,height);
        add(jBtnSort);
    }
}
