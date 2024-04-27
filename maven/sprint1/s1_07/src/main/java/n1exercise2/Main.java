package n1exercise2;

public class Main {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        OnsiteWorker onsiteWorker = new OnsiteWorker("Juan", "Miguel", 20.0);
        OnlineWorker onlineWorker = new OnlineWorker("Julio", "Cezar", 25.0);

        double hoursWorked = 40.0;

        double onsiteSalary = onsiteWorker.calculateSalary(hoursWorked);
        System.out.println("Onsite Worker Salary: $" + onsiteSalary);

        double onlineSalary = onlineWorker.calculateSalary(hoursWorked);
        System.out.println("Online Worker Salary: $" + onlineSalary);

        onsiteWorker.calculateBonus(100);
        onlineWorker.calculateBonus(150);
    }
}

