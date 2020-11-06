

public abstract class Worker {

    String firstName;
    String lastName;
    int id;
    int salary;
    double hoursWorked;
    int standardWorkHoursInMonth = 160;

    public Worker(String firstName, String lastName, int id, int salary, int hoursWorked) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.salary = salary;
        this.hoursWorked = hoursWorked;
    }

    public double hoursWorkedInPercents() {
        return hoursWorked / standardWorkHoursInMonth * 100;
    }

    public abstract double monthlySalary();

    public String info(){
        return firstName+" "+lastName+" ";
    }



    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public void setStandardWorkHoursInMonth(int standardWorkHoursInMonth) {
        this.standardWorkHoursInMonth = standardWorkHoursInMonth;
    }
}
