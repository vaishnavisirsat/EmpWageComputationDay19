class employeeCheckComputation {
    double check = Math.floor(Math.random() * 10) % 2;
    void isPresent(){
        if ( check == 1)
            System.out.println("Employee is Present !");
        else
            System.out.println("Employee is Absent !");
    }
}

public class empCheck {
    public static void main(String[] args){
        employeeCheckComputation employee = new employeeCheckComputation();
        System.out.println("Welcome to employee wage computation");
        employee.isPresent();
    }
}
