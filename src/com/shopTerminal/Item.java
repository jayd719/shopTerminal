/**
 *
 */
package com.shopTerminal;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

/**
 *
 */
public class Item {

    // Constants
    /**
     *
     */
    public static String SECTIONS[] = { "AREA0", "AREA1", "AREA2", "AREA3", "AREA4" };

    // Attributes
    private String name = null;
    private int section = 0;

    public Item(final String name, final int section) {
	this.name = name;
	this.section = section;
	return;
    }

    /**
     * @return Name of section of item
     */
    public String sectionString() {
	return SECTIONS[section];
    }

    /**
     * to display the object information.
     */
    @Override
    public String toString() {
	String returnString = String.format("Name:		%s\nSection(INT):	%d\nSection(STR):	%s",
		name, section, SECTIONS[section]);
	return returnString;
    }

    /**
     * Makes sure file saved at same location irrespective of last //
     *
     * @param outputLocation
     * @return
     */
    private String checkLocation(final String outputLocation) {
	String location = "";
	if (outputLocation != null) {
	    if (outputLocation.charAt(outputLocation.length() - 1) == '/') {
		location = outputLocation.substring(0, (outputLocation.length() - 1));
	    } else {
		location = outputLocation;
	    }
	}
	return location;
    }

    /**
     * Saves Object Information in text file.
     *
     * @param outputLocation - where to save the file
     * @return written - true if written/ false if failed to write.
     */
    public boolean toTxt(String outputLocation) {
	boolean written = false;
	try {
	    PrintStream outputFile = new PrintStream(new File(checkLocation(outputLocation) + "/" + name + ".txt"));
	    outputFile.println(this.toString());
	    written = true;
	} catch (FileNotFoundException e) {
	    written = false;

	}

	return written;
    }

}
