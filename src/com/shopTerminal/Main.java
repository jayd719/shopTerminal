/**
 *
 */
package com.shopTerminal;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

/**
 * Main
 */
public class Main {

    /**
     * @param
     */
    public static void main(String[] args) {

//	Items Database = new Items("/Users/jashan/Desktop/data.csv");
//
//	System.out.println(Database.getItemAt(3).toTxt("/Users/jashan/Desktop"));
//	new GetFiles();

//	System.out.println(GetFiles.getFilesDirectory());

	JFrame f = new JFrame();

	f.setSize(1500, 1000);
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	f.setLayout(new BorderLayout());

	JPanel panel = new JPanel();
	panel.setLayout(new GridLayout(2, 3));
	panel.setBorder(new EmptyBorder(10, 10, 10, 10));
	panel.setSize(100, 200);
	panel.setBackground(Color.gray);
	panel.add(new JLabel("Working Directory: "));
	panel.add(new JLabel(GetFiles.DEFAULT_ADDRESS));
	panel.add(new JLabel("File Directory"));
	panel.add(new JLabel(GetFiles.getFilesDirectory()));

	f.add(new JLabel("thi"), BorderLayout.NORTH);
	f.add(panel, BorderLayout.CENTER);
	GetFiles.getWorkOrders();

	f.setVisible(true);

    }

}
