/**
 *
 */
package com.shopTerminal;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

/**
 *
 */
public class WorkOrder {
    private DateTimeFormatter DUEDATEFORMAT = DateTimeFormatter.ofPattern("dd-MMM-yy");

    private final String jobNumber;
    private final String customer;
    private LocalDate dueDate;
    private long days;

    /**
     * @param jobNumber
     * @param customer
     * @param dueDate
     */
    public WorkOrder(String jobNumber, String customer, LocalDate dueDate) {
	this.jobNumber = jobNumber;
	this.customer = customer;
	this.dueDate = dueDate;
	this.setDays(ChronoUnit.DAYS.between(LocalDate.now(), LocalDate.parse("2023-06-15")));

    }

    // Getters
    /**
     * @return
     */
    public String getCustomer() {
	return customer;
    }

    /**
     * @return
     */
    public String getJobNumber() {
	return jobNumber;
    }

    /**
     * @return
     */
    public String getDueDate() {
	return dueDate.format(DUEDATEFORMAT);
    }

    public long getDays() {
	return days;
    }

    public void setDays(long days) {
	this.days = days;
    }

}
