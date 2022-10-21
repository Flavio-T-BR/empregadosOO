package entities;

import java.util.ArrayList;
import java.util.List;

public class Department {
	
	private String deptName;
	private Integer payDay;
	
	private Address address;
	private List<Employee> employee = new ArrayList<>();
	
	public Department() {
	}

	public Department(String deptName, Integer payDay, Address address) {
		this.deptName = deptName;
		this.payDay = payDay;
		this.address = address;
	}

	public String getdeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public Integer getPayDay() {
		return payDay;
	}

	public void setPayDay(Integer payDay) {
		this.payDay = payDay;
	}

	public List<Employee> getEmployee() {
		return employee;
	}
	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public void addEmployee (Employee employee) {
		this.employee.add(employee);
	}
	
	public void removeEmployee (Employee employee) {
		this.employee.remove(employee);
	}
	
	public double payroll() {
		double sum = 0;
		for (Employee emp : employee) {
		sum += emp.getSalary();
	}
		return sum;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Departamento Vendas = R$ ");
		sb.append(String.format("%.2f", payroll()) + "\n");
		sb.append("Pagamento realizado no dia ");
		sb.append(payDay + "\n");
		sb.append("Funcionários: \n");
		for (Employee emp : employee) {
			sb.append(emp.getName() + "\n");
		}
		sb.append("Para dúvidas favor entrar em contato: ");
		sb.append(address.getEmail());
		return sb.toString();
	}
	
}


