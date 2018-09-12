package maylor.system.model;

public class Reader {
	private int incre_id;
	private int days_num;
	private String id;
	private String name;
	private String sex;
	private String type;

	public int getDays_num() {
		return days_num;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getSex() {
		return sex;
	}

	public String getType() {
		return type;
	}

	public void setDays_num(int days_num) {
		this.days_num = days_num;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public void setType(String type) {
		this.type = type;
	}
	public int getIncre_id() {
		return incre_id;
	}

	public void setIncre_id(int incre_id) {
		this.incre_id = incre_id;
	}
	
	@Override
	public String toString() {
		return "\n"+"流水号："+incre_id+"\n\n"+"编号：" + id +"\n\n"+ "姓名：" + name +"\n\n"+ "性别：" + sex+"\n\n"
				+ "类别：" + type +"\n\n"+ "可借天数：" + days_num ;
	}

}
