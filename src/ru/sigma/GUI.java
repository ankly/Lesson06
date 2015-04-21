package ru.sigma;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Student08 on 21.04.2015.
 */
public class GUI {
    private JButton northButton;
    private JButton copyButton;
    private JButton westButton;
    private JButton eastButton;
    private JButton centerButton;
    private JTextArea rightTextArea;
    private JTextArea leftTextArea;
    int count=0;

    public void buildGUI() {
        JFrame mainFrame = new JFrame("My First GUI");//создание объекта с названием
        mainFrame.setBounds(200, 200, 300, 250);// задаем отступ и размеры

        //BorderLayout менеджер компановки - 5 элементов по сторонам света
        //GridLayout
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//завершение программы при закрытии окна
       GridLayout grid = new GridLayout(1,2);


       northButton = new JButton("CLEAR");//добавление кнопки
       copyButton = new JButton("COPY");
      //  westButton = new JButton("WEST");
       // eastButton = new JButton("EAST");
       // centerButton = new JButton("CENTER");
        rightTextArea = new JTextArea("");
       // leftTextArea = new JTextArea("      ");


       /* northButton.addActionListener(new ActionListener() {//обработчик событий - нажатия на кнопку
            @Override
            public void actionPerformed(ActionEvent e) {
                northButton.setText(Integer.toString(++count));// либо String.valueOf(count) либо ""+count
            }
        });*/
copyButton.addActionListener(new ClearButtonActionListener()); //2й способ - создать объект внутреннего класса
    // @Override
    //   public void actionPerformed(ActionEvent e) {
    //      leftTextArea.setText(rightTextArea.getText());
    //      rightTextArea.setText(" ");
    //  }
//});

JPanel panel = new JPanel(); // пустое поле
   // mainFrame.add(BorderLayout.NORTH, northButton);
   // mainFrame.add(BorderLayout.SOUTH, copyButton);
    // mainFrame.add(BorderLayout.EAST, eastButton);
    //  mainFrame.add(BorderLayout.WEST, westButton);
    mainFrame.add(BorderLayout.CENTER,rightTextArea);
    mainFrame.add(BorderLayout.SOUTH,panel);

        panel.setLayout(grid);
        panel.add(copyButton);
        panel.add(northButton);
   // mainFrame.add(BorderLayout.EAST,leftTextArea);
       // mainFrame.add(copyButton);
     //   mainFrame.add (panel);
      //  mainFrame.add(rightTextArea);
      //  mainFrame.add(northButton);
       // mainFrame.add(westButton);
       // mainFrame.add(eastButton);


    mainFrame.setVisible(true);//вывести на экран, видимость
}
    private class ClearButtonActionListener implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e) {
        rightTextArea.setText(" ");

    }
}
}
