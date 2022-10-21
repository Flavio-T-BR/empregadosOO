package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Address;
import entities.Department;
import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nome do departamento: ");
		String nameDept = sc.nextLine();
		System.out.print("Dia do pagamento: ");
		int payDay = sc.nextInt();
		
		System.out.println("Email: ");
		String email = sc.next();
		System.out.print("Telefone: ");
		int phone = sc.nextInt();
		
		Address address = new Address(email, phone);
		
		Department dept = new Department(nameDept, payDay, address);
		
		System.out.print("Quantos funcionários tem o departamento? ");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.println("Dados do funcionário " + i + ":");
			sc.nextLine();
			System.out.print("Nome: ");
			String name = sc.nextLine();
			System.out.print("Salário: ");
			double salary = sc.nextDouble();
			
			Employee employee = new Employee(name, salary);
			
			dept.addEmployee(employee);
		}
		
		System.out.println();
		System.out.println("FOLHA DE PAGAMENTO");
		showReport(dept);
		
		sc.close();
	}
	
	private static void showReport(Department dept) {
		 System.out.print(dept);
	}

}
