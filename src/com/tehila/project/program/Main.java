package com.tehila.project.program;

import com.tehila.project.entities.HourlyEmployee;

public class Main {
    public static void main(String[] args) {
        HourlyEmployee employee = new HourlyEmployee("tehila","benezra",9,18,120.8);
        System.out.println("the best employee is: \n" + employee);
    }
}
