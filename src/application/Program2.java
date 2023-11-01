package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("=== TEST 1: findById =======");
		Department department = departmentDao.findById(4);		
		System.out.println(department);
		
		System.out.println("=== TEST 2: findByAll =======");
		List<Department> list = departmentDao.findall();
		for(Department dep : list){			
			System.out.println(dep);			
		}
		
		/*System.out.println("=== TEST 3: Insert =======");
		Department dep = new Department(7, "Books");
		departmentDao.insert(dep);
		System.out.println("Inserted new Id: " +  dep.getId());*/
		
		System.out.println("=== TEST 4: Update =======");
		department = new Department(7,"Games");
		departmentDao.update(department);	
		System.out.println("update completed!");		
		
		System.out.println("=== TEST 5: Delete =======");
		int id = sc.nextInt();
		departmentDao.deleteById(id);
		System.out.println("delete completed!");
		
		sc.close();

	}
}
