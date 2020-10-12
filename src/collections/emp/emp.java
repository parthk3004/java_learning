package collections.emp;

public class emp {
    private int empid;
    private String employeename;
    private String employeedesignation;
    private Double employeesalary;

    public emp(int empid, String employeename, String employeedesignation, Double employeesalary) {
        super();
        this.empid = empid;
        employeename = employeename;
        this.employeedesignation = employeedesignation;
        employeesalary = employeesalary;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + empid;
        return result;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        emp other = (emp) obj;
        if (empid != other.empid)
            return false;
        return true;
    }


    public int getempid() {
        return empid;
    }

    public void setempid(int empid) {
        this.empid = empid;
    }

    public String getemployeename() {
        return employeename;
    }

    public void setemployeename(String employeename) {
        employeename = employeename;
    }

    public String getemployeedesignation() {
        return employeedesignation;
    }

    public void setemployeedesignation(String employeedesignation) {
        this.employeedesignation = employeedesignation;
    }

    public Double getemployeesalary() {
        return employeesalary;
    }

    public void setemployeesalary(Double employeesalary) {
        employeesalary = employeesalary;
    }
}