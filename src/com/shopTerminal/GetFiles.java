package com.shopTerminal;

import java.util.ArrayList;
import java.util.Arrays;

public class GetFiles {

    static String DEFAULT_ADDRESS = System.getProperty("user.dir");

    public GetFiles() {
	// TODO Auto-generated constructor stub
    }

    public static String getFilesDirectory() {

	String[] workingDir = DEFAULT_ADDRESS.split("/");
	ArrayList<String> dir = new ArrayList<String>(Arrays.asList(workingDir));

	String path_ = dir.remove(0) + "/" + dir.remove(0) + "/" + dir.remove(0);

//	System.out.println(path);
	return path_;
    }

    public static ArrayList<String> getWorkOrders() {
	ArrayList<String> dir = new ArrayList<String>();

	System.out.print(dir);
	return dir;
    }

}
