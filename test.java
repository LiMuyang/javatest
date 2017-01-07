class staticTest{
	static String temp;
	public static String test(){
		return temp;
	}
}

class Outer{
	private String msg = "Hello World!";
	public String getMsg(){
		return this.msg;
	}
	public void func(){
		new Inner().print(this);
	}
}

class Inner{
	public void print(Outer out){
		System.out.println(out.getMsg());
	}
}

class Book{
	private String bname;
	private double bprice;
	public Book(String bname, double bprice){
		this.bname = bname;
		this.bprice = bprice;
	}
	public boolean compare(Book book){
		if(this == book){
			return true;
		}
		if(this.bname.equals(book.bname)&&this.bprice==book.bprice){
			return true;
		}
		else{
			return false;
		}
	}
}
class Car{
	private String cname;
	private Driver driver;
	public Car(String cname){
		this.cname = cname;
	}
	public void setDriver(Driver driver){
		this.driver = driver;
	}
	public Driver getDriver(){
		return this.driver;
	}
	public String getInfo(){
		return "id: "+this.cname;
	}
}

class Driver{
	private int mid;
	private String dname;
	private Car car;
	public Driver(int mid, String dname){
		this.mid = mid;
		this.dname = dname;
	}
	public void setCar(Car car){
		this.car = car;
	}
	public Car getCar(){
		return this.car;
	}
	public String getInfo(){
		return "id: "+this.mid+", driver's name: "+this.dname;
	}
}

class Message{
	private String str = "bbb";
	public Message(String str){
		this.str = str;
	}
	public void setNum(String str){
		this.str = str;
	}
	public String getNum(){
		return this.str;
	}
}

class Employee{
	private String name;
	private int age;
	private String gender;
	private double salary;
	public Employee(){}
	public Employee(String name,int age,String gender,double salary){
		this.name=name;
		this.age=age;
		this.gender=gender;
		this.salary=salary;
	}
	public  void setName(String name){
		this.name = name;
	}
	public  void setAge(int age){
		this.age = age;
	}
	public  void setGender(String gender){
		this.gender = gender;
	}
	public  void setSalary(double salary){
		this.salary = salary;
	}
	public  String getName(){
		return this.name;
	}
	public  int getAge(){
		return this.age;
	}
	public  String getGender(){
		return this.gender;
	}
	public  double getSalary(){  
		return this.salary;
	}
	public  String getInfo(){
		return "name: "+this.name+",age: "+this.age+",gender: "+this.gender+",salary: "+this.salary;
	}
}

public class test{
	public static void main(String args[]){
		int [] data = new int [] {1,7,9,0,4,6,2,3,8,5};
		int [][] data2D = new int[][]{{1,2,3,4},{4,5,6,7},{7,8,9,0},{0,1,2,3}};
		String str = new String("hELLO World");
		Employee empA = new Employee("Angus",22,"male",100000.00);
		Car c = new Car("BMW");
		Driver d = new Driver(1,"Angus");
		Book booka = new Book("Harry Potter",100.0);
		Book bookb = new Book("Harry Potter",100.0);
		Outer outClass = new Outer();
		staticTest.temp = "x is my son";
		System.out.print(staticTest.test());
		// Message msg = new Message("love");
		// func(msg);
		// System.out.println(msg.getNum());
		// String[] strarray = str.split("\\.");
		// for (int x=0; x<strarray.length;x++ ) {
		// 	System.out.println(strarray[x]);
		// }
		// System.out.println(isNum(str));
		// reverse2D(data2D);
		// print2D(data2D);
		// reverse(data);
		// print(data);
		// System.out.println();
		// reverse(data);
		// print(data);
	}

	public static void print(int[] temp){
		for (int i=0; i<temp.length; i++) {
			System.out.print(temp[i]);
		}		
	}
	public static void print2D(int[][] temp){
		for (int x=0; x<temp.length; x++) {
			for (int y=0; y<temp.length; y++) {
				System.out.print(temp[x][y]+"\t");
			}
		System.out.println();
		}
	}
	public static void bumble(int[] temp){
		int tmp=0;
		for (int i=temp.length-1; i>0; i--) {
			for (int j=0; j<i; j++) {
				if (temp[j]>temp[j+1]) {
					tmp = temp[j];
					temp[j]=temp[j+1];
					temp[j+1]=tmp;
				}
			}
		}
	}
	public static void reverse(int[] temp){
		int tmp=0;
		for (int i=0; i<temp.length/2;i++ ) {
			tmp=temp[i];
			temp[i]=temp[temp.length-1-i];
			temp[temp.length-1-i]=tmp;
		}
	}
	public static void reverse2D(int [][] temp){
		int tmp = 0;
		for (int x=0; x<temp.length; x++) {
			for (int y=0; y<x; y++) {
				tmp = temp[x][y];
				temp[x][y] = temp[y][x];
				temp[y][x] = tmp;
			}
		}
		}
	public static String upperCase(String str){
		char[] strchararray = str.toCharArray();
		for (int i=0; i<strchararray.length; i++) {
			strchararray[i] -= 32;
		}
		return (new String(strchararray));
	}

	public static boolean isNum(String str){
		char[] strchararray = str.toCharArray();
		for(int i=0; i<strchararray.length;i++){
			if (strchararray[i]<'0'||strchararray[i]>'9'){
				return false;
			}
		}
		return true;
	}
	public static String initCap(String str){
		return str.substring(0,1).toUpperCase()+str.substring(1);
	}
	public static void func(Message temp){
		temp.setNum("abc");
	}
}
