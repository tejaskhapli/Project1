package my;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.cust.ojects.Employee;

class abc{
	int i = 9;
	public abc() {
		System.out.println("public constructor");
	}
}

interface I{
	void m1();
}

class Iclass implements I{

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		
	}
	
}


public class QuickCheck {

	
	public static void main(String[] args) {

		I i = new I() {
			
			@Override
			public
			void m1() {
				// TODO Auto-generated method stub
				
			}
		};
		
		//abc abc;
		//System.out.println(abc.i);
		
		
		Object o = 01;
		Object p = "ABCD";
		
		int arr1[] = { 11, 22, 33 }; 
	    int arr2[] = { 11, 22, 33, 44, 55 }; 
	    int ptr[]; 
		
	    QuickCheck qc = new QuickCheck();
		//qc.i = 99;
		
		System.out.println(o);
		System.out.println(p);
		
		System.out.println(o.getClass().getName());
		System.out.println(p.getClass().getName());
		
		/*List<Employee> elist = createEmployees();		
		List<Integer> ageList = elist.stream().map(e-> e.getAge()).collect(Collectors.toList());
		OptionalDouble i = elist.stream().mapToInt(e-> e.getAge()).average();		
		ageList.stream().forEach(System.out::println);*/

		List lst = createEmployees();		
		lst.stream().parallel();
		lst.parallelStream();
	}
	
	public static List<Employee> createEmployees() {
		// TODO Auto-generated method stub
		List<Employee> elist = new ArrayList<>();
		elist.add(new Employee(10, "TEJAS"));
		elist.add(new Employee(11, "Abhishek"));
		elist.add(new Employee(12, "Manoj"));
		elist.add(new Employee(9, "Anand"));
		elist.add(new Employee(10, "SHAILU"));
		
		return elist;
	}

	private static void asdf() {
		// TODO Auto-generated method stub
				try {
					System.out.println("try");
					//System.exit(0);
				}
				catch (Exception e) {
					// TODO: handle exception
					System.out.println("catch");
				}
				finally {
					System.out.println("fin");
				}
	}
		
	
}


/*
 * 
 * create table employee (
  name varchar2(10),
  salary number(10)
);
select * from employee;
insert into employee values ('Tejas', 15000);
insert into employee values ('Pravin', 11000);
insert into employee values ('Akshay', 12000);
insert into employee values ('Mayur', 16000);
insert into employee values ('Swanand', 10300);
insert into employee values ('Prabhu', 12000);
insert into employee values ('Amit', 14000);
--commit;

select * from employee;
select * from employee where ROWID = (select max(ROWID) from employee);
select * from employee where ROWID = (select min(ROWID) from employee);
select rowid from employee;
SELECT distinct salary FROM EMPLOYEE ;


Select distinct Salary from Employee e1 where 
  (   Select count(distinct Salary) from Employee e2 
      where e1.salary<=e2.salary  
  ) = 2 ;
select min(salary) from
    (   select distinct salary from employee order by salary desc  )
where rownum<=4;

select * from
    (   select distinct salary from employee order by salary desc  )
where rownum<=3;


Select * from Employee e where rownum <=5
union;
select * from (Select * from Employee e order by rowid desc) where rownum <=5;

Select * from(Select rownum as rno,E.* from Employee E) where Mod(rno,3)=1;







 * 
 * */
