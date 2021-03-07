package FirstActivity;

import java.util.Arrays;

public class EmployeeSalary extends Employee{

    public static void main(String[] args) {

        Employee e = new Employee();
        e.setName("Egils Levits");
        e.setAge(65);
        e.setCompany("Republic of Latvia");
        e.setJobTitle("President");
        e.setSalary(6000);

        Employee f = new Employee();
        f.setName("Krisjanis Karins");
        f.setAge(56);
        f.setCompany("Republic of Latvia");
        f.setJobTitle("Prime Minister");
        f.setSalary(5000);

        Employee g = new Employee();
        g.setName("Janis Reirs");
        g.setAge(52);
        g.setCompany("Republic of Latvia");
        g.setJobTitle("Minister of Finances");
        g.setSalary(4000);

        double[] intArray = {e.getSalary(), f.getSalary(), g.getSalary()};

        System.out.printf("Original Array : %s", Arrays.toString(intArray));

        Arrays.sort(intArray);

        System.out.printf("\n\nSorted Array : %s", Arrays.toString(intArray));

    }

}
