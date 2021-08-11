package com.bridgelabz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeePayrollService {
    private List<EmployeePayrollData> employeePayrollDataList = new ArrayList<>();

    public EmployeePayrollService() {

    }

    public EmployeePayrollService(List<EmployeePayrollData> employeePayrollDataList) {
        this.employeePayrollDataList = employeePayrollDataList;
    }

    /**
     * taking input from user
     * @param sc scanner obj
     */
    private void readEmployeePayrollData(Scanner sc) {
        System.out.println("Enter Employee ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter employee name: ");
        String name = sc.nextLine();
        System.out.println("Enter Employee salary: ");
        double salary = sc.nextDouble();
        employeePayrollDataList.add(new EmployeePayrollData(name, id, salary));

    }

    private void writeEmployeePayrollData() {
        System.out.println("Writing employee payroll to console\n" + employeePayrollDataList);
    }

    public static void main(String[] args) {
        ArrayList<EmployeePayrollData> employeePayrollDataList = new ArrayList<EmployeePayrollData>();
        EmployeePayrollService employeePayrollService = new EmployeePayrollService(employeePayrollDataList);
        Scanner sc = new Scanner(System.in);
        employeePayrollService.readEmployeePayrollData(sc);
        employeePayrollService.writeEmployeePayrollData();
    }
}
