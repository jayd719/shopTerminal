package com.shopTerminal;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class GetFiles {

    static String DEFAULT_ADDRESS = System.getProperty("user.dir");
    static String DATAFILES = getFilesDirectory() + "Datafiles/";

    public GetFiles() {
	// TODO Auto-generated constructor stub
    }

    public static String getFilesDirectory() {

	String[] workingDir = DEFAULT_ADDRESS.split("/");
	ArrayList<String> dir = new ArrayList<String>(Arrays.asList(workingDir));

	String path_ = dir.remove(0) + "/" + dir.remove(0) + "/" + dir.remove(0);

//	System.out.println(path);
	return path_ + "/";
    }

    public static ArrayList<String> getWorkOrders() {
	ArrayList<String> dir = new ArrayList<String>();

	try {
	    Scanner scan = new Scanner(new File(DATAFILES + "workorders.txt"));
	    while (scan.hasNext()) {
		dir.add(scan.next());
	    }
	} catch (FileNotFoundException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	    System.out.println("DATA FILES NOT FOUTND\n");
	    dir.add("DATAFILES NOT FOUND");
	}

	System.out.print(dir);
	return dir;
    }

}
