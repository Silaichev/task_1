public class Programmer extends Worker {
    public Programmer(String firstName, String lastName, int id, int salary, int hoursWorked) {
        super(firstName, lastName, id, salary, hoursWorked);
    }

    @Override
    public double monthlySalary() {
        return salary * hoursWorkedInPercents() / 100;
    }
}
