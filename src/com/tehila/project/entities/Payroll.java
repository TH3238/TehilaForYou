package com.tehila.project.entities;
import com.tehila.project.entities.HourlyEmployee;
import com.tehila.project.entities.CommissionEmployee;
import com.tehila.project.entities.BasePlusCommissionEmployee;


public class Payroll {
    /**
     * creating an array that contains 3 different kinds of employees and printing their details and salary
     * @param args
     */
   public static void main(String[] args) {
       Employee[] array;
       array=new Employee[3];
       array[0]=new HourlyEmployee("tehila","benezra",12345,3,23.5f);
       array[1]=new CommissionEmployee("yair","benezra",6789,140,60);
       array[2]=new BasePlusCommissionEmployee("avi","avrahami",13579,100,239,50);
       for (int i = 0; i < 3; i++) {
           if(i==2){
            float afterBonus=(array[i].earnings()*1.1f);
               System.out.println(array[i].toString().substring(0,array[i].toString().lastIndexOf('}'))+", salary="+afterBonus+'}');
           }
           else{
               System.out.println(array[i].toString().substring(0,array[i].toString().lastIndexOf('}'))+", salary="+array[i].earnings()+'}');
           }

       }
   }
}
