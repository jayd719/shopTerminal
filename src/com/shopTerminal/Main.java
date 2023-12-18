/**
 *
 */
package com.shopTerminal;

import java.awt.BorderLayout;

import javax.swing.JFrame;

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

	JFrame f = new JFrame();

	f.setSize(1500, 1000);
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	f.setLayout(new BorderLayout());
	f.setVisible(true);

    }

}
