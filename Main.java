class Employee {
    String name;
    int id;
    double salary;
    String address;
    public Employee(String name,int id ,double salary,String address){
        this.name=name;
        this.id=id;
        this.salary=salary;
        this.address=address;
    }

    public void displayInfo(){
        System.out.println("employee id:"+id); 
        System.out.println("employee name:"+name);
        System.out.println("employee salary:"+salary);
        System.out.println("employee address:"+address);
    }
    

    public static void main(String[] args) {
        Employee emp1= new Employee("xyz", 101, 50000.0,"Hubli");
        emp1.displayInfo();
    }
}
