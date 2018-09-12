package maylor.system.model;

public class User {
	private int id;
	private String login_id;
	private int is_admin;
	private String name;
	private String pass;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIs_admin() {
		return is_admin;
	}

	public String getName() {
		return name;
	}

	public String getPass() {
		return pass;
	}



	public void setIs_admin(int isAdmin) {
		is_admin = isAdmin;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getLogin_id() {
		return login_id;
	}

	public void setLogin_id(String login_id) {
		this.login_id = login_id;
	}


	@Override
	public String toString() {
		return "\n"+"用户流水号："+id+"\n\n"+"用户ID："+login_id+"\n\n"+"用户名称："+name+"\n\n"
		+"用户密码："+pass+"\n\n"+"管理员："+is_admin;
	}
}
