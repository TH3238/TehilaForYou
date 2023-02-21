package com.tehila.project.entities;

import java.util.Objects;

public class HourlyEmployee extends Employee {
    private int hours;
    private float wage;

    /**
     * constructor for hourly-employee
     * @param firstName firstname
     * @param lastName last name
     * @param id id
     * @param hours hours
     * @param wage wage
     */
    public HourlyEmployee(String firstName, String lastName, int id, int hours, float wage) {
        super(firstName, lastName, id);
        setHours(hours);
        setWage(wage);
    }

    /**
     * default constructor for hourly employee with the value '0' for all parameters
     */
    public HourlyEmployee() {
        setHours(0);
        setWage(0);
    }

    public int getHours() {
        return hours;
    }

    /**
     *
     * @param hours hours
     * @exception if hours are negative
     */
    public void setHours(int hours) {
        if (hours < 0)
            throw new IllegalArgumentException("hours cannot be negative");
        this.hours = hours;
    }

    public float getWage() {
        return wage;
    }

    /**
     *
     * @param wage wage
     * @exception if wage <=0
     */
    public void setWage(float wage) {
        if (wage <= 0)
            throw new IllegalArgumentException("wage cannot be <=0");
        this.wage = wage;
    }


    @Override
    public float earnings() {
        return hours * wage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        HourlyEmployee employee = (HourlyEmployee) o;
        return hours == employee.hours && Float.compare(employee.wage, wage) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), hours, wage);
    }

    @Override
    public String toString() {
        return  "HourlyEmployee{" +
                super.toString().substring(9, super.toString().lastIndexOf('}'))+ ", "+
                "hours=" + hours +
                ", wage=" + wage +
                '}';
    }
}
