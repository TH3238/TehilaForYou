package com.tehila.project.entities;

import java.util.Objects;

public class CommissionEmployee extends Employee{

    float grossSales;
    int commision;

    public CommissionEmployee(String firstName, String lastName, int id, float grossSales, int commision) {
        super(firstName, lastName, id);
        setGrossSales(grossSales);
        setCommision(commision);
    }

    public CommissionEmployee() {
        setCommision(0);
        setGrossSales(0);
    }


    public float getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(float grossSales) {
        if(grossSales<0)
            throw new IllegalArgumentException("gross sales cannot be negative");
        this.grossSales=grossSales;
    }

    public int getCommision() {
        return commision;
    }

    public void setCommision(int commision) {
        if(commision<0)
            throw new IllegalArgumentException("commision cannot be negative");
        this.commision = commision;
    }

    public CommissionEmployee(float grossSales, int commision) {
        this.grossSales = grossSales;
        this.commision = commision;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        CommissionEmployee that = (CommissionEmployee) o;
        return Float.compare(that.grossSales, grossSales) == 0 && commision == that.commision;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), grossSales, commision);
    }

    /**
     *
     * @return salary for a specific employee
     */
    @Override
    public float earnings() {
        return grossSales*(commision/100);
    }

    @Override
    public String toString() {
        return "CommissionEmployee{" +
                super.toString().substring(9,super.toString().lastIndexOf('}'))+", "+
                "grossSales=" + grossSales +
                ", commision=" + commision +
                '}';
    }
}
