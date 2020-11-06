public class Test {

    public static void main(String[] args) {

        Accountant accountant = new Accountant();
        accountant.addWorker(new Programmer("Michael", "Silaichev", 1, 9000, 180));
        accountant.addWorker(new Programmer("Nikita","Pogiriliy", 2, 8000, 120));
        accountant.addWorker(new Manager("Yana","Bondarenko",  3, 10000, 60));
        accountant.addWorker(new Manager("Zoya", "Volkova", 4, 12000, 180));
        accountant.calculate();
    }
}
