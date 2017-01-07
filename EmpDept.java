class Dept{
	private int deptno;
	private String dname;
	private String loc;
	private Emp[] emp;
	public Dept(int deptno,String dname,String loc){
		this.deptno = deptno;
		this.dname = dname;
		this.loc = loc;
	}
	public void setEmp(Emp[] emp){
		this.emp = emp;
	}
	public Emp[] getEmp(){
		return this.emp;
	}
	public String getInfo(){
		return "deptno: "+this.deptno+", dname: "+this.dname+", loc: "+this.loc;
	}
}

class Emp{
	private int empno;
	private String ename;
	private String job;
	private double sal;
	private double comm;
	private Dept dept;
	private Emp mgr;
	public Emp(int empno,String ename,String job,double sal,double comm){
		this.empno = empno;
		this.ename = ename;
		this.job = job;
		this.sal = sal;
		this.comm = comm;	}
	public void setMgr(Emp mgr){
		this.mgr = mgr;
	}
	public Emp getMgr(){
		return this.mgr;
	}
	public void setDept(Dept dept){
		this.dept = dept;
	}
	public Dept getDept(){
		return this.dept;
	}
	public String getInfo(){
		return "empno: "+this.empno+", ename: "+this.ename+", job: "+this.job+", sal: "+this.sal+", comm: "+this.comm;
	}
}

public class EmpDept{
	public static void main(String[] args){
		Dept d = new Dept(250,"ACCOUNTING","New York");
		Emp ea = new Emp(1,"alice","programmer",100.0,2000.0);
		Emp eb = new Emp(2,"bob","manager",500.0,5000.0);
		Emp ec = new Emp(3,"cindy","chairman",1000.0,20000.0);
		ea.setDept(d);
		eb.setDept(d);
		ec.setDept(d);
		ea.setMgr(eb);
		eb.setMgr(ec);
		d.setEmp(new Emp[] {ea,eb,ec});
		System.out.println(ea.getInfo());
		for (int i=0; i<d.getEmp().length; i++) {
			System.out.println(d.getEmp()[i].getInfo());
		}
	}
}