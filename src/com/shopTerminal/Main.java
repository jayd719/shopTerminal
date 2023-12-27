/**
 *
 */
package com.shopTerminal;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

/**
 * Main
 */
public class Main {

    private static JLabel titleLabel() {
	JLabel tL = new JLabel("Work Order Tacker");
	// tL - Title Label
	tL.setFont(new Font(Font.SERIF, Font.BOLD, 17));
	tL.setBorder(new EmptyBorder(2, 40, 1, 1));

	return tL;
    }

    private static JMenuBar menuBar() {
	JMenuBar menuBar = new JMenuBar();

	JMenu functions = new JMenu("Functions");

	JMenuItem updateLive = new JMenuItem("Update CBB Live Excel File");

	updateLive.addActionListener(new ActionListener() {

	    @Override
	    public void actionPerformed(ActionEvent e) {
		try {
		    Desktop.getDesktop().open(new File(GetFiles.DATAFILES + "workorders.txt"));
		} catch (IOException e1) {
		    // TODO Auto-generated catch block
		    e1.printStackTrace();
		}

	    }
	});
	functions.add(updateLive);
	functions.add(new JMenuItem("Start Data Sync"));
	functions.add(new JMenuItem("Function"));

	menuBar.add(functions);
	return menuBar;
    }

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
	panel.setLayout(new GridLayout(2, 2));
	panel.setBorder(new EmptyBorder(10, 10, 10, 10));
	panel.setSize(100, 200);
	panel.setBackground(Color.gray);
	panel.add(new JLabel(String.format("%-30s%s", "Working Directory:", GetFiles.DEFAULT_ADDRESS)));
	panel.add(new JLabel(String.format("%-33s%s", "Files Directory:", GetFiles.getFilesDirectory())));

	JPanel displayPanel = new JPanel();
	displayPanel.setLayout(new GridLayout(30, 2));
	displayPanel.setBorder(new EmptyBorder(10, 10, 10, 10));

	for (WorkOrder wo : GetFiles.getWorkOrders()) {
	    JPanel rowPanel = new JPanel();
	    rowPanel.add(new JLabel(wo.getJobNumber()));
	    rowPanel.add(new JLabel(wo.getCustomer()));
	    rowPanel.add(new JLabel(wo.getDueDate()));
	    displayPanel.add(rowPanel);
	}

	f.setJMenuBar(menuBar());
	f.add(titleLabel(), BorderLayout.NORTH);
	f.add(displayPanel, BorderLayout.CENTER);
	f.add(panel, BorderLayout.SOUTH);
//	GetFiles.getWorkOrders();

	new WorkOrder(null, null, null);

	f.setVisible(true);

    }

}
