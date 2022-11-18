record Emp(int EmpId, String name, String Dept, float salary) {
	Employee(){
	this(1,"AVR","IT dept",50000f);}
	
	public static void main(String args[]) {
		Employee e=new Employee(1,"AVR","IT dept",50000f);
		Employee e1=new Employee(2,"NTR","PRO dept",75000f);
		System.out.println(e);
		System.out.println(e1);
	}
}	