package com.renzo.exercises.lessons.java;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.util.UUID;

class GenerateUid extends javax.swing.JFrame {

  GenerateUid() {

    var btnGenerate = new JButton("Generate");
    btnGenerate.setBounds(300,20,100,20);

    var txtGenerate = new JTextField();
    txtGenerate.setBounds(20,20,260,20);
    txtGenerate.setEditable(false);
    txtGenerate.setText(UUID.randomUUID().toString());

    btnGenerate.addActionListener(e ->
            txtGenerate.setText(UUID.randomUUID().toString())
    );

    var jPanel = new JPanel();
    jPanel.setLayout(null);

    jPanel.add(txtGenerate);
    jPanel.add(btnGenerate);

    add(jPanel);
    setTitle("GenerateUid UUID");
    setLocationRelativeTo(null);
    setSize(440, 100);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
  }

  public static void main(String[] args) {

    new GenerateUid().setVisible(true);

  }
}
