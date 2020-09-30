package com.gu;
import javax.swing.*;
import static com.gu.base.hascreate.degenerate;
public class Main {
    public static void main(String[] args) throws Exception {
        JFrame f =  new JFrame("Project Trash");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton b = new JButton("Create");
        JTextField a = new JTextField(20);
        JTextField a2 = new JTextField(20);

        a.setText("Количество файлов");
        a2.setText("Размер Файлов");

        b.setBounds(10,80,300,20);
        a.setBounds(10,20,300, 20);
        a2.setBounds(10,50,300, 20);

        b.addActionListener(actionEvent -> {
            try {
                degenerate(Integer.parseInt(a.getText()),Integer.parseInt(a2.getText()));
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        f.add(b);
        f.add(a2);
        f.add(a);
        f.setSize(320,200);
        f.setLayout(null);
        f.setVisible(true);
    }

}
