package javaPackage;

public class MethodOverLoading_Program2 {
	String EmpName,EmpCity,EmpDesignation;
	int ID,Incentive,Extra_hours_worked;
	Float Salary;
	long Phoneno;
	
	public void Employee()
	{
		System.out.println("EmpName"+"EmpCity"+"EmpDesignation"+"ID"+"Incentive"+"Extra_hours_worked"+"Salary"+"Phoneno");
	}
	public void Employee(String EmpName)
	{
		System.out.println(EmpName);
		}
	public void Employee(String EmpName, String EmpCity)
	{
		System.out.println("Employee_name  = " + EmpName+ " " + "Employee_City = " + EmpCity);
		}
	public void Employee(String EmpName, String EmpCity, String EmpDesignation)
	{
		System.out.println("Employee_name  = " + EmpName+ " " + "Employee_City = " + EmpCity+ " " + "Employee_Designation = " + EmpDesignation);
	}
	public void Employee(String EmpName, String EmpCity, String EmpDesignation, int ID)
	{
		System.out.println("Employee_name  = " + EmpName+ " " + "Employee_City = " + EmpCity+ " " + "Employee_Designation = " + EmpDesignation+ " " + "Employee_ID = " + ID);
	}
	public void Employee(String EmpName, String EmpCity, String EmpDesignation, int ID, int Incentive)
	{
		System.out.println("Employee_name  = " + EmpName+ " " + "Employee_City = " + EmpCity+ " " + "Employee_Designation = " + EmpDesignation+ " " + "Employee_ID = " + ID+ " " + "Employee_Incentive = " + Incentive);
}
	public void Employee(String EmpName, String EmpCity, String EmpDesignation, int ID, int Incentive, int Extra_hours_worked)
	{
		System.out.println("Employee_name  = " + EmpName+ " " + "Employee_City = " + EmpCity+ " " + "Employee_Designation = " + EmpDesignation+ " " + "Employee_ID = " + ID+ " " + 
							"Employee_Incentive = " + Incentive+ " " + "Employee_Extra_Hours_Worked = " + Extra_hours_worked);
}
	
	public void Employee(String EmpName, String EmpCity, String EmpDesignation, int ID, int Incentive, int Extra_hours_worked, Float Salary)
	{
		System.out.println("Employee_name  = " + EmpName+ " " + "Employee_City = " + EmpCity+ " " + "Employee_Designation = " + EmpDesignation+ " " + "Employee_ID = " + ID+ " " + 
				"Employee_Incentive = " + Incentive+ " " + "Employee_Extra_Hours_Worked = " + Extra_hours_worked+ " " + "Employee_Salary = " + Salary);
	}
	public void Employee(String EmpName, String EmpCity, String EmpDesignation, int ID, int Incentive, int Extra_hours_worked, Float Salary, long Phoneno)
	{
		System.out.println("Employee_name  = " + EmpName+ " " + "Employee_City = " + EmpCity+ " " + "Employee_Designation = " + EmpDesignation+ " " + "Employee_ID = " + ID+ " " + 
				"Employee_Incentive = " + Incentive+ " " + "Employee_Extra_Hours_Worked = " + Extra_hours_worked+ " " + "Employee_Salary = " + Salary+ " " + "Employee_Phoneno = " + Phoneno);
	}
	public static void main(String[] args)
	{
		MethodOverLoading_Program2 E = new MethodOverLoading_Program2();
		E.Employee();
		E.Employee("Rahul");
		E.Employee("Rahul", "pune");
		E.Employee("Rahul", "pune", "Software Engineer");
		E.Employee("Rahul", "pune", "Software Engineer", 101);
		E.Employee("Rahul", "pune", "Software Engineer", 101, 1000);
		E.Employee("Rahul", "pune", "Software Engineer", 101, 1000,5);
		E.Employee("Rahul", "pune", "Software Engineer", 101, 1000, 5,  54000.12f);
		E.Employee("Rahul", "pune", "Software Engineer", 101, 1000, 5,  54000.12f ,9689473424l);
		
	}
	
}