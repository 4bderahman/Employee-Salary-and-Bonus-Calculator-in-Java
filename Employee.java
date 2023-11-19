public class Employee {
    private String name;
    private double baseSalary;
    private int bonusHrs;
    private double sales;

    public Employee(String name, double baseSalary, int bonusHrs, double sales) {
        this.name = name;
        this.baseSalary = baseSalary;
        this.bonusHrs = bonusHrs;
        this.sales = sales;
    }

    public double calculateNetSalary() {
        double bonus = this.bonusHrs * 10;
        return this.baseSalary + bonus + (this.sales * 0.05);
    }

    public void info() {
        double netSalary = this.calculateNetSalary();
        System.out.println("The employee " + this.name + " has a base salary of " + this.baseSalary +
                           " DHS, sales of " + this.sales + ", and a net salary of " + netSalary + " DHS");
    }
}
