package com.bridgelabz;

import com.newbridgelabz.EmployeePayroll;
import org.junit.Assert;
import org.junit.Test;
import java.util.Arrays;


public class EmployeePayrollServiceTest {
    @Test
    public void givenThreeEmployeesWhenWritten_ShouldMatchEmployeeEntries(){
        EmployeePayroll[] employeePayroll ={
                new EmployeePayroll(1,"Mukeshambani", 1000000),
                new EmployeePayroll(2,"Anandadani",1000000),
                new EmployeePayroll(3,"Adityabirla",5000000),
                new EmployeePayroll(4,"Mandeepsingh",1000000)
        };
        EmployeePayrollService employeePayrollService;
        employeePayrollService = new EmployeePayrollService(Arrays.asList(employeePayroll));
        employeePayrollService.writeEmployeePayroll(EmployeePayrollService.IOService.FILE_IO);
        employeePayrollService.printData(EmployeePayrollService.IOService.FILE_IO);
        int entries = employeePayrollService.countEntries(EmployeePayrollService.IOService.FILE_IO);
        Assert.assertEquals(4,entries);
    }
}
