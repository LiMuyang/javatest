class Province{
	private int pid;
	private String pname;
	private City[] cities;
	public Province(int pid,String pname){
		this.pid = pid;
		this.pname = pname;
	}
	public void setCities(City[] cities){
		this.cities = cities;
	}
	public City[] getCities(){
		return this.cities;
	}
	public String getInfo(){
		return "pid: "+this.pid+", pname: "+this.pname;
	}
}

class City{
	private int cid;
	private String cname;
	private Province province;
	public City(int cid,String cname){
		this.cid = cid;
		this.cname = cname;
	}
	public void setProvince(Province province){
		this.province = province;
	}
	public Province getProvince(){
		return this.province;
	}
	public String getInfo(){
		return "cid: "+this.cid+", cname: "+this.cname;
	}
}

public class ProvinceCity{
	public static void main(String[] args) {
		Province sichuan = new Province(28,"Sichuan");
		City chengdu = new City(1,"chengdu");
		City guangyuan = new City(2,"guangyuan");
		City deyang = new City(3,"deyang");
		sichuan.setCities(new City[]{chengdu,guangyuan,deyang});
		chengdu.setProvince(sichuan);
		guangyuan.setProvince(sichuan);
		deyang.setProvince(sichuan);
		System.out.println(chengdu.getInfo());
		System.out.println("\t"+chengdu.getProvince().getInfo());
		System.out.println(guangyuan.getInfo());
		System.out.println("\t"+guangyuan.getProvince().getInfo());
		System.out.println(deyang.getInfo());
		System.out.println("\t"+deyang.getProvince().getInfo());
		for (int i=0; i<sichuan.getCities().length; i++) {
			System.out.println(sichuan.getCities()[i].getInfo());
		}
	}
}