import com.prasvenk.java.oops.encapsulation.Employee;

public class Main {
    public static void main(String[] args) {

        Employee employee = new Employee();
        employee.setAge(-34);

        System.out.println(employee.getAge());
    }
}