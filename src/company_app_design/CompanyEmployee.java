package company_app_design;

import java.util.ArrayList;

public class CompanyEmployee extends EmployeeInfo {

    /** INSTRUCTIONS
     *  This class has a main method where you will be able to create instances of the EmployeeInfo class in order
     *  to use attributes and methods.
     *
     *  Demonstrate as many methods as possible here. Feel free to show off what you've learned so far.
     *
     *  The goal of this application is to provide basic employee information services
     *  Try to think like a Software Developer
     */

    public static void main(String[] args) {

        EmployeeInfo e1 = new EmployeeInfo("Abdi", 1, "Janitor", "abdi@netflix.com",
                "Cleaning", 2_500_000);

        System.out.println("Name: " + e1.employeeName());
        System.out.println("Company: " + companyName);
        System.out.println("Dept: " + e1.getDepartment());
        System.out.println("Emp Salary: " + e1.calculateSalary() + "\n");

        e1.assignDepartment("Sales");

        System.out.println("New Dept: " + e1.getDepartment());

        System.out.println("Employee Bonus: " + EmployeeInfo.calculateAnnualBonus(125_000, 5) + "\n");

        e1.printSlogan();
    }

    public CompanyEmployee(String name, int employeeId, String employeePosition) {
        super(name, employeeId, employeePosition);
    }

    public CompanyEmployee(String name, int employeeId, String employeePosition, String email, String department, int salary) {
        super(name, employeeId, employeePosition, email, department, salary);
    }


}