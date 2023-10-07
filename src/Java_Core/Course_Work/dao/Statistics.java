package Java_Core.Course_Work.dao;

import Java_Core.Course_Work.Employee;
import Java_Core.Course_Work.enums.Departments;

public interface Statistics {
    Employee minSalary();

    Employee minSalaryDepartment(Departments departments);

    Employee maxSalary();

    Employee maxSalaryDepartment(Departments departments);

    double amountWages();

    double amountWagesDepartment(Departments departments);

    double avg();

    double avgDepartment(Departments departments);

    void lessSalaryAll(double value);

    void moreSalaryAll(double value);

}
