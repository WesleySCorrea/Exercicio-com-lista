import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class application {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int n;
        double percent = 0;

        List<employee> employeeList = new ArrayList<>();

        System.out.print("How many employees will be registration: ");
        n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("What number Id? ");
            int id = sc.nextInt();
            System.out.print("What name? ");
            String name = sc.next();
            System.out.print("What salary? ");
            Double salary = sc.nextDouble();
            employee employee = new employee(id , name , salary);
            employeeList.add(employee);
        }

        System.out.print("Enter the employee id that will have a salary increase: ");
        int idIncrease = sc.nextInt();
        Integer valuePosition = null;

        for (int i = 0; i< employeeList.size(); i++) {
            if (idIncrease == employeeList.get(i).getId()) {
                valuePosition = i;
            }
        }
        if (valuePosition == null) {
            System.out.println("This Id does not exist!");
        }
        else {
            System.out.print("How many percent would you like to increase the salary? ");
            percent = sc.nextDouble();
            double newSalary = employeeList.get(valuePosition).getSalary() * (1 + (percent / 100));
            employeeList.get(valuePosition).setSalary(newSalary);

            System.out.println("Employees:");
            for (int i = 0; i < employeeList.size(); i++){
                System.out.println(employeeList.get(i).toString());
            }
        }
        }
    }

