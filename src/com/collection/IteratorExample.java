package com.collection;

import java.util.*;

public class IteratorExample {

	public static void main(String[] args) {

		List<IteratoeEmployee> emp = new ArrayList<>();

		emp.add(new IteratoeEmployee(101, "sri", 20000));

		emp.add(new IteratoeEmployee(102, "sujee", 30000));

		emp.add(new IteratoeEmployee(103, "hari", 40000));

		emp.add(new IteratoeEmployee(104, "saro", 500000));

		System.out.println(emp);

		Iterator<IteratoeEmployee> e = emp.iterator();

//		System.out.println(e.hasNext()); //data

//		System.out.println(e.next().empName);

		while (e.hasNext()) {

			IteratoeEmployee employee = e.next();

			System.out.println(employee.empno +" "+ employee.empName +" z"+ employee.salary);

		}

	}

}
