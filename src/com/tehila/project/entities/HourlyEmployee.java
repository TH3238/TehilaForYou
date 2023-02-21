package com.tehila.project.entities;

import java.util.Objects;

public class HourlyEmployee extends Employee {
    private int hours;
    private double wage;

    public HourlyEmployee(String firstName, String lastName, int id, int hours, double wage) {
        super(firstName, lastName, id);
        setHours(hours);
        setWage(wage);
    }

    public HourlyEmployee() {
        setHours(0);
        setWage(0);
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        if (hours < 0)
            throw new IllegalArgumentException("hours cannot be negative");
        this.hours = hours;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        if (wage <= 0)
            throw new IllegalArgumentException("wage cannot be <=0");
        this.wage = wage;
    }

    @Override
    public double earnings() {
        return hours * wage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        HourlyEmployee that = (HourlyEmployee) o;
        return hours == that.hours && Double.compare(that.wage, wage) == 0;
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
