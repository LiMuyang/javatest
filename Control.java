class Admin{
	private int aid;
	private String pass;
	private Role role;
	public Admin(int aid,String pass){
		this.aid = aid;
		this.pass = pass;
	}
	public void setRole(Role role){
		this.role = role;
	}
	public Role getRole(){
		return this.role;
	}
	public String getInfo(){
		return "aid: "+this.aid+", password: "+this.pass;
	}
}

class Role{
	private int rid;
	private String rname;
	private Admin[] admins;
	private Group[] groups;
	public Role(int rid,String rname){
		this.rid = rid;
		this.rname = rname;
	}
	public void setAdmins(Admin[] admins){
		this.admins = admins;
	}
	public Admin[] getAdmins(){
		return this.admins;
	}
	public void setGroups(Group[] groups){
		this.groups = groups;
	}
	public Group[] getGroups(){
		return this.groups;
	}
	public String getInfo(){
		return "rid: "+this.rid+", rname: "+this.rname;
	}
}

class Group{
	private int gid;
	private String gname;
	private Role[] roles;
	private Privilege[] privileges;
	public Group(int gid,String gname){
		this.gid = gid;
		this.gname = gname;
	}
	public void setRoles(Role[] roles){
		this.roles = roles;
	}
	public Role[] getRoles(){
		return this.roles;
	}
	public void setPrivileges(Privilege[] privileges){
		this.privileges = privileges;
	}
	public Privilege[] getPrivileges(){
		return this.privileges;
	}
	public String getInfo(){
		return "gid: "+this.gid+", gname: "+this.gname;
	}
}

class Privilege{
	private int pid;
	private String pname;
	private Group group;
	public Privilege(int pid,String pname){
		this.pid = pid;
		this.pname = pname;
	} 
	public void setGroup(Group group){
		this.group = group;
	}
	public Group getGroup(){
		return this.group;		
	}
	public String getInfo(){
		return "pid: "+this.pid+", pname: "+this.pname;
	}
}



public class Control{
	public static void main(String[] args){
		Admin a1 = new Admin()
	}
}