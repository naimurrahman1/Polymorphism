class Manager extends Employee {
    private String department;

    public Manager(String name, String department) {
        super(name);
        this.department = department;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Role: Manager");
        System.out.println("Department: " + department);
    }
}