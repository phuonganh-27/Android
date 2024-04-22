import java.util.*;
import java.io.*;
public class employee {
	private int id;
	private String name;
	private int age;
	private String department;
	private String code;
	private double salaryrate;

	public employee(int id, String name, int age, String department, String code, double salaryrate) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.department = department;
		this.code = code;
		this.salaryrate = salaryrate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public double getSalaryrate() {
		return salaryrate;
	}

	public void setSalaryrate(double salaryrate) {
		this.salaryrate = salaryrate;
	} 
	
	@Override
	public String toString() {
		return "employee [id=" + id + ", name=" + name + ", age=" + age + ", department=" + department + ", code="
				+ code + ", salaryrate=" + salaryrate + "]";
	}

	public static void main(String []args) {
		initializeEmployees();
		showEmployee();
		addEmployee();
		deleteEmployee();
	}
	
	private static ArrayList<employee> employeeList = new ArrayList<>();
	private static Scanner scanner = new Scanner(System.in);
	
	private static void setupEmployee(int id, String name, int age, String department, String code, double salaryrat) {
        employee newEmployee = new employee(id, name, age, department, code,  salaryrat);
        employeeList.add(newEmployee);

    }
	private static void initializeEmployees() {
        setupEmployee(1, "Phanh", 18, "CNTT", "271102", 1000);
        setupEmployee(2, "Phanh2", 19, "CNTT", "720211", 2000);
        setupEmployee(3, "Phanh3", 21, "CNTT", "110227", 3000);
        setupEmployee(4, "Phanh4", 31, "CNTT", "211702", 4000);
        setupEmployee(5, "Phanh5", 22, "CNTT", "172102", 5000);
        setupEmployee(6, "Phanh6", 25, "CNTT", "122071", 6000);
        setupEmployee(7, "Phanh7", 24, "CNTT", "123456", 7000);
        setupEmployee(8, "Phanh8", 22, "CNTT", "999999", 8000);
        setupEmployee(9, "Phanh9", 21, "CNTT", "888888", 9000);
        setupEmployee(10, "Phanh10", 19, "CNTT", "2222222", 10000);
    }
	
	private static void showEmployee() {
		for(int i=0; i<employeeList.size(); i++) {
			employee newEmployee = new employee(employeeList.get(i).id,employeeList.get(i).name,employeeList.get(i).age,employeeList.get(i).department,employeeList.get(i).code,employeeList.get(i).salaryrate);
		    System.out.println(newEmployee.toString());
		}
	}
	
	private static void addEmployee() {
	      System.out.println("\nAdding a new employee:");
	      System.out.print("Enter employee id: ");
	      int id = scanner.nextInt();
	      System.out.print("Enter employee name: ");
	      String name = scanner.nextLine();
	      System.out.print("Enter employee age: ");
	      int age = scanner.nextInt();
	      scanner.nextLine();
	      System.out.print("Enter employee department: ");
	      String department = scanner.nextLine();
	      System.out.print("Enter employee code: ");
	      String code = scanner.nextLine();
	      System.out.print("Enter employee salary rate: ");
	      double salaryRate = scanner.nextDouble();
	      scanner.nextLine(); 
	      
	      employee newEmployee = new employee(id, name, age, department, code, salaryRate);
	      employeeList.add(newEmployee);
	      System.out.println("New employee added successfully.");
	}
	
	private static void deleteEmployee() {
		System.out.print("\nEnter the ID of the employee to remove: ");
		int idToRemove = scanner.nextInt();
		scanner.nextLine(); 
		for(int i=0; i<employeeList.size(); i++) {
			employee newEmployee = new employee(employeeList.get(i).id,employeeList.get(i).name,employeeList.get(i).age,employeeList.get(i).department,employeeList.get(i).code,employeeList.get(i).salaryrate);
		   if (newEmployee.getId() == idToRemove) {
                employeeList.remove(newEmployee);
                System.out.println("Employee removed successfully.");
                return;
            }
		}
      
        System.out.println("Employee with ID " + idToRemove + " not found.");
    
	}
	
	
	
}
