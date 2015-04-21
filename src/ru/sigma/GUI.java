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
        JFrame mainFrame = new JFrame("My First GUI");//�������� ������� � ���������
        mainFrame.setBounds(200, 200, 300, 250);// ������ ������ � �������

        //BorderLayout �������� ���������� - 5 ��������� �� �������� �����
        //GridLayout
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//���������� ��������� ��� �������� ����
       GridLayout grid = new GridLayout(1,2);


       northButton = new JButton("CLEAR");//���������� ������
       copyButton = new JButton("COPY");
      //  westButton = new JButton("WEST");
       // eastButton = new JButton("EAST");
       // centerButton = new JButton("CENTER");
        rightTextArea = new JTextArea("");
       // leftTextArea = new JTextArea("      ");


       /* northButton.addActionListener(new ActionListener() {//���������� ������� - ������� �� ������
            @Override
            public void actionPerformed(ActionEvent e) {
                northButton.setText(Integer.toString(++count));// ���� String.valueOf(count) ���� ""+count
            }
        });*/
copyButton.addActionListener(new ClearButtonActionListener()); //2� ������ - ������� ������ ����������� ������
    // @Override
    //   public void actionPerformed(ActionEvent e) {
    //      leftTextArea.setText(rightTextArea.getText());
    //      rightTextArea.setText(" ");
    //  }
//});

JPanel panel = new JPanel(); // ������ ����
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


    mainFrame.setVisible(true);//������� �� �����, ���������
}
    private class ClearButtonActionListener implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e) {
        rightTextArea.setText(" ");

    }
}
}
