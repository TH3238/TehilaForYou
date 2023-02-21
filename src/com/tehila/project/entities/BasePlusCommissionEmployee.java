package com.tehila.project.entities;

import java.util.Objects;

public class BasePlusCommissionEmployee extends Employee{

    float baseSalary;
    float grossSales;
    int commision;

    public BasePlusCommissionEmployee(String firstName, String lastName, int id, float baseSalary, float grossSales, int commision) {
        super(firstName, lastName, id);
        setBaseSalary(baseSalary);
        setCommision(commision);
        setGrossSales(grossSales);
    }

    public BasePlusCommissionEmployee() {
        setGrossSales(0);
        setCommision(0);
        setBaseSalary(0);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        BasePlusCommissionEmployee that = (BasePlusCommissionEmployee) o;
        return Float.compare(that.baseSalary, baseSalary) == 0 && Float.compare(that.grossSales, grossSales) == 0 && commision == that.commision;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), baseSalary, grossSales, commision);
    }

    public float getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(float baseSalary) {
        if (baseSalary<0)
            throw new IllegalArgumentException("base salary cannot be negative");
        this.baseSalary = baseSalary;
    }

    public float getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(float grossSales) {
        if (grossSales<0)
            throw new IllegalArgumentException("gross sales cannot be negative");
        this.grossSales = grossSales;
    }

    public int getCommision() {
        return commision;
    }

    public void setCommision(int commision) {
        if (commision<0)
            throw new IllegalArgumentException("commision cannot be negative");
        this.commision = commision;
    }

    /**
     *
     * @return salary for a specific employee
     */
    @Override
    public float earnings() {
        return baseSalary+commision/100*grossSales;
    }

    @Override
    public String toString() {
        return "BasePlusCommissionEmployee{" +
                super.toString().substring(0,super.toString().lastIndexOf('}'))+", "+
                "baseSalary=" + baseSalary +
                ", grossSales=" + grossSales +
                ", commision=" + commision +
                '}';
    }
}
