public class Manager extends Worker {
    public Manager(String firstName, String lastName, int id, int salary, int hoursWorked) {
        super(firstName, lastName, id, salary, hoursWorked);
    }

    @Override
    public double monthlySalary() {
        if (hoursWorkedInPercents() > 100) {
            return salary;
        } else {
            return salary * hoursWorkedInPercents() / 100;
        }
    }
}
