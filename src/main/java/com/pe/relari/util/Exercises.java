//package com.pe.relari.example;
//
//import com.pe.relari.example.model.Employee;
//import com.pe.relari.example.repository.EmployeeRepository;
//
//import java.io.IOException;
//import java.util.Comparator;
//import java.util.List;
//
//public class Exercises {
//
//	static void separation() {
//		System.out.println("\n--------------------------------------\n");
//	}
//
//	public static void main(String[] args) throws IOException {
//
//		final List<Employee> employees = EmployeeRepository.employees();
//
//		// Obtener todos los trabajadores
//		employees.stream()
//				.forEach(System.out::println);
//		separation();
//
//		// Obtener todos los trabajadores que son developers
//		employees.stream()
//				.filter(y -> y.getPosition().equalsIgnoreCase("developer"))
//				.forEach(System.out::println);
//
//		separation();
//
//		// Obtener todos los trabajadores que son managers y son mujeres
//		employees.stream()
//				.filter(y -> y.getPosition().equals("manager") & y.getSex().equals("F"))
//				.forEach(System.out::println);
//
//		separation();
//		// Obtener el total en gastos de nomina
//
//		// Obtener el sueldo promedio
//
//		System.out.println(employees.stream()
//				.mapToDouble(p -> p.getSalary())
//				.average());
//
//		separation();
//
//		// Obtener el mayor sueldo
//		System.out.println(employees.stream()
//				.max((s1, s2) -> s1.getSalary() - s2.getSalary()));
//
//		separation();
//		// Saber si todos los sueldos son mayores a 1000
//		employees.stream()
//				.filter(p -> p.getSalary() > 1000)
//				.forEach(System.out::println);
//
//		separation();
//		// Saber si existe alg�n scrum-master dentro de los trabajadores
//		employees.stream()
//				.filter(p -> p.getPosition().equals("scrum-master"))
//				.forEach(System.out::println);
//
//		separation();
//		employees.stream()
//				.sorted(Comparator.comparing(Employee::getPosition))
//				.forEach(System.out::println);
//
//		separation();
//		employees.stream()
//				.filter(p -> p.getSex().equals("F"))
//				.forEach(System.out::println);
//	}
//}
