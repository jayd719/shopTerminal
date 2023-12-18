package com.shopTerminal;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 */
public class Items {

    ArrayList<Item> items = new ArrayList<Item>();
    int count = 0;

    /**
     * @param fileLocation
     */
    public Items(final String fileLocation) {
	try {
	    Scanner data = new Scanner(new File(fileLocation));
	    while (data.hasNext()) {
		String info[] = data.nextLine().split(",");
		items.add(new Item(info[0], Integer.parseInt(info[1])));
		++count;
	    }
	} catch (FileNotFoundException e) {
	    System.out.println("File Not Found");
	}
	return;
    }

    /**
     * @param index
     * @return
     */
    private boolean isValidIndex(final int index) {
	boolean isValid = true;
	if (index < 0 && index > count) {
	    isValid = false;
	}
	return isValid;
    }

    /**
     * @param index
     * @return
     */
    public Item getItemAt(final int index) {
	if (isValidIndex(index) == true) {
	    return items.get(index);
	}
	return null;
    }

    /**
     * @param index
     * @return
     */
    public Item removeItemAt(final int index) {
	if (isValidIndex(index) == true) {
	    return items.remove(index);
	}
	return null;
    }
}
