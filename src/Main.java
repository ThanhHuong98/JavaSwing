import GUI.GUI;

import javax.swing.*;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        //1 - DemoUI
        try {
            UIManager.setLookAndFeel(NimbusLookAndFeel.class.getName());
        }catch (Exception e){
            e.printStackTrace();
        }
        GUI gui = new GUI("Chuong trinh giai PTB2");
        gui.setVisible(true);
        //2 - Demo GridLayout
        //GridLayoutDemo gridLayoutDemo=new GridLayoutDemo("Grid layout");
        //3 - UI PTB2


    }

}
