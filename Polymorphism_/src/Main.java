class Main {
    public static void main(String[] args) {
        Employee employee1 = new Developer("John Doe", "Java");
        Employee employee2 = new Manager("Jane Smith", "Sales");

        employee1.displayInfo(); //
        System.out.println("-----------------------");
        employee2.displayInfo();
    }
}