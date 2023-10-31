package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {		

		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("=== TEST 1: findById =======");
		Department department = departmentDao.findById(4);		
		System.out.println(department);
		
		System.out.println("=== TEST 2: findByAll =======");
		List<Department> list = departmentDao.findall();
		for(Department dep : list){
			
			System.out.println(dep);
			
		}

	}
}
