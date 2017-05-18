package OOP2.Them4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;


/**
 * Created by Den on 06.04.2017.
 */
 public  class MyApplication extends JFrame  {

     private String name;
     private int size1;
     private int size2;
     private int location1;
     private int location2;
     private boolean visible;


     public MyApplication(String name, int size1, int size2, int location1, int location2, boolean visible) {
        this.name = name;
        this.size1 = size1;
        this.size2 = size2;
        this.location1 = location1;
        this.location2 = location2;
        this.visible = visible;
        this.setFrame();

    }
    void modifyTotal(Object ... args) {}


    private void setFrame() {
        JFrame frame = new JFrame(name);



        JPanel panel = new JPanel(new  FlowLayout() );

        String[] items = {
                "Элемент списка 1",
                "Элемент списка 2",
                "Элемент списка 3"
        };



        JComboBox comboBox = new JComboBox(items);


            comboBox.setSize(50,100);
            //comboBox.setLocation();



            JButton button = new JButton("кликни меня");
            button.setSize(50, 50);
            button.setLocation(50, 50);

        frame.add(panel);

        panel.add(button);
        panel.add(comboBox);


        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                System.out.println("нажали");
            }
        });
        comboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });



        frame.setSize(size1,size2);
        frame.setVisible(visible);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



    }
}
