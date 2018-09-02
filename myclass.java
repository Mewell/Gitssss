
// 信1603 20163664 赵永真 2017/11/30

import java.io.*;
import java.util.*;

class ErrorException extends Exception {

	public ErrorException(String s) {
		super(s);
	}

}

abstract class ApplicantInterface {

	private String applicantname;
	private String applicantsex;
	private String applicanttitle;
	private String applicantwork;
	private String company;

	public String getApplicantname() {
		return applicantname;
	}

	public void setApplicantname(String applicantname) {
		this.applicantname = applicantname;
	}

	public String getApplicantsex() {
		return applicantsex;
	}

	public void setApplicantsex(String applicantsex) {
		this.applicantsex = applicantsex;
	}

	public String getApplicanttitle() {
		return applicanttitle;
	}

	public void setApplicanttitle(String applicanttitle) {
		this.applicanttitle = applicanttitle;
	}

	public String getApplicantwork() {
		return applicantwork;
	}

	public void setApplicantwork(String applicantwork) {
		this.applicantwork = applicantwork;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public void showapplicant() {
		System.out.println("申请人姓名：" + applicantname);
		System.out.println("申请人性别：" + applicantsex);
		System.out.println("申请人职称：" + applicanttitle);
		System.out.println("申请人承担工作：" + applicantwork);
		System.out.println("申请人所在单位：" + company);

	}
}

//
class HighInfomation extends ApplicantInterface {

	private String highnumber;
	private String highname;
	private String highcontent;
	private double highsum;
	private int highstate;
	private int highyear;
	private String highuser;

	public HighInfomation() {
	}

	public HighInfomation(String highnumber, String highname, String highcontent, double highsum, int highstate,
			int highyear, String highuser) {

		this.highnumber = highnumber;
		this.highname = highname;
		this.highcontent = highcontent;
		this.highsum = highsum;
		this.highstate = highstate;
		this.highyear = highyear;
		this.highuser = highuser;
	}

	public String getHighnumber() {
		return highnumber;
	}

	public void setHighnumber(String highnumber) {
		this.highnumber = highnumber;
	}

	public String getHighname() {
		return highname;
	}

	public void setHighname(String highname) {
		this.highname = highname;
	}

	public String getHighcontent() {
		return highcontent;
	}

	public void setHighcontent(String highcontent) {
		this.highcontent = highcontent;
	}

	public double getHighsum() {
		return highsum;
	}

	public void setHighsum(double highsum) {
		this.highsum = highsum;
	}

	public int getHighstate() {
		return highstate;
	}

	public void setHighstate(int highstate) {
		this.highstate = highstate;
	}

	public int getHighyear() {
		return highyear;
	}

	public void setHighyear(int highyear) {
		this.highyear = highyear;
	}

	public String getHighuser() {
		return highuser;
	}

	public void setHighuser(String highuser) {
		this.highuser = highuser;
	}

}

class menu {

	menu() {

		System.out.println("***************************************************************");
		System.out.println("             欢迎使用河北省高新产业信息调查系统");
		System.out.println("***************************************************************");
		System.out.println("石家庄铁道大学信息科学与技术学院软件工程系软件精英小组制作");
		System.out.println("版本：V1.0");
		System.out.println("小组成员：指导教师：王建民；信1603班 20163664 赵永真");
		System.out.println("****************************************************************");
	}

}

class login {

	void lo() {

		try {
			System.out.println("用户名20163664 密码 20163664");
			System.out.println(" 请输入用户名： ");
			String username = new Scanner(System.in).next();
			System.out.println(" 请输入密码：  ");
			String password = new Scanner(System.in).next();
			if (username.equals("20163664") && password.equals("20163664"))
				new mainMenu().Menu();
			else if (!username.equals("20163664")) {
				throw new ErrorException("用户名错误！");
			} else if (!password.equals("20163664"))
				throw new ErrorException("密码错误！");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

class mainMenu {

	private HighInfomation HI[] = new HighInfomation[20];
	int len = 0;

	public void Menu() {

		System.out.println("***************************************************************");
		System.out.println("                河北省高新产业信息统计调查系统");
		System.out.println("****************************************************************");
		System.out.println("1、 录入高新技术信息；");
		System.out.println("2、 删除高新技术信息；");
		System.out.println("3、 审核高新技术信息");
		System.out.println("4、 显示高新技术信息");
		System.out.println("5、 查询高新技术信息");
		System.out.println("6、 查询高新技术投资");
		System.out.println("7、 统计高新技术信息；");
		System.out.println("8、 高新技术年度统计");
		System.out.println("***************************************************************");

		int a = new Scanner(System.in).nextInt();
		switch (a) {
		case 1:
			addHighInfomation();
			break;
		case 2:
			System.out.println("请输入要删除的编号：");
			String str = new Scanner(System.in).next();
			deleteHighInfomation(str);
			break;
		case 3:
			System.out.println("请输入要选择的编号：");
			String str1 = new Scanner(System.in).next();
			examHighInfomation(str1);
			break;
		case 4:
			showHighInfomation();
			break;
		case 5:
			selectHighramtion();
			break;
		case 6:
			System.out.println("请输入金额：");
			double dou = new Scanner(System.in).nextDouble();
			selectHighramtion(dou);
			break;
		case 7:
			countHighInfomation();
			break;
		case 8:
			System.out.println("请输入统计的年份：");
			int year = new Scanner(System.in).nextInt();
			countHighInfomation(year);
			break;
		}
	}

	public void addHighInfomation() {
		try {
			HighInfomation hi = new HighInfomation();
			System.out.println("高新技术编号：");
			String nu=new Scanner(System.in).next();
			if(!nu.contains("2017"))throw new ErrorException("高新技术编号格式错误");
			hi.setHighnumber(nu);

			System.out.println("高新技术名称：");
			hi.setHighname(new Scanner(System.in).next());
			System.out.println("高新技术内容：");
			String st=new Scanner(System.in).next();
			if (st.length() > 20)throw new ErrorException("录入内容超过最大字符限制");
			hi.setHighcontent(st);
			
			System.out.println("高新技术金额：");
			hi.setHighsum(new Scanner(System.in).nextDouble());
			System.out.println("高新技术年份：");
			hi.setHighyear(new Scanner(System.in).nextInt());
			System.out.println("高新技术状态：");
			hi.setHighstate(new Scanner(System.in).nextInt());
			System.out.println("填报人：");
			hi.setHighuser(new Scanner(System.in).next());
			// HI[len] = hi;
			System.out.println("请录入申请人信息");
			System.out.println("申请人姓名：");
			hi.setApplicantname(new Scanner(System.in).next());
			System.out.println("申请人性别：");
			String se=new Scanner(System.in).next();
			if (se.equals("男") || se.equals("女"))hi.setApplicantsex(se);
			else throw new ErrorException("应输入男或女！");
			
			System.out.println("申请人职称：");
			hi.setApplicanttitle(new Scanner(System.in).next());
			System.out.println("申请人承担工作：");
			hi.setApplicantwork(new Scanner(System.in).next());
			System.out.println("申请人所在单位：");
			hi.setCompany(new Scanner(System.in).next());
			HI[len] = hi;
			len++;
			new FileRW(hi);
			System.out.println("信息保存成功，是否继续录入信息？按Y继续，按任意键回主界面");
			String nex = new Scanner(System.in).next();
			if (nex.equals("Y")) {
				addHighInfomation();
			} else
				Menu();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void deleteHighInfomation(String highnumber) {
		System.out.println("你是否删除该条信息");
		String nex = new Scanner(System.in).next();
		if (nex.equals("Y")) {

			for (int k = 0; k < len; k++) {
				if (HI[k].getHighnumber().equals(highnumber)) {
					for (; k < len - 1; k++) {
						HI[k] = HI[k + 1];

					}
					System.out.println("删除成功！");
					len = len - 1;
					break;
				}
			}
		}
		Menu();
	}

	public void examHighInfomation(String highnumber) {

		for (int k = 0; k < len; k++) {
			if (HI[k].getHighnumber().equals(highnumber)) {
				if (HI[k].getHighstate() == 1)
					System.out.println("该信息已通过审核");
				if (HI[k].getHighstate() == 2)
					System.out.println("该信息已被退回");
				if (HI[k].getHighstate() == 0) {

					System.out.println("***************************************************************");
					System.out.println("                        审核高新技术信息");
					System.out.println("***************************************************************");
					System.out.println("1、 返回主界面；");
					System.out.println("2、 通过审核；");
					System.out.println("3、 退回审核；");
					System.out.println("高新技术编号：");
					System.out.println("高新技术名称：");
					System.out.println("高新技术简介：");
					System.out.println("高新技术投资金额；");
					System.out.println("高新技术年份：");
					System.out.println("填报人：");
					System.out.println("申请人姓名：");
					System.out.println("申请人性别：");
					System.out.println("申请人职称：	");
					System.out.println("申请人承担工作:");
					System.out.println("申请人所在单位：");
					System.out.println("****************************************************************");
					System.out.println("选择 1：返回系统主界面；");
					System.out.println("选择 2：修改该编号的高新技术状态，将状态由 0 改为 1，其余不变；");
					System.out.println("选择 3：修改该编号的高新技术状态，将状态由 0 改为 2，其余不变；");
					int a = new Scanner(System.in).nextInt();
					if (a == 1) {
						Menu();
					} else if (a == 2) {
						HI[k].setHighstate(1);
						Menu();
					} else if (a == 3) {
						HI[k].setHighstate(2);
						Menu();
					}
				}
			}
			break;

		}
	}

	public void showHighInfomation() {

		for (int k = 0; k < len; k++) {
			HighInfomation hi = HI[k];
			System.out.println(" 高新技术编号：  " + hi.getHighnumber());
			System.out.println("  高新技术名称： " + hi.getHighname());
			System.out.println(" 高新技术内容：  " + hi.getHighcontent());
			System.out.println("  高新技术金额： " + hi.getHighsum());
			System.out.println("  高新技术年份： " + hi.getHighyear());
			System.out.print("  高新技术状态： " + hi.getHighstate());
			if (hi.getHighstate() == 0)
				System.out.println(" 未审核");
			else if (hi.getHighstate() == 1)
				System.out.println(" 通过审核");
			else if (hi.getHighstate() == 2)
				System.out.println(" 未通过审核");
			System.out.println();
			System.out.println("  填报人： " + hi.getHighuser());
			hi.showapplicant();
			System.out.println();

		}
		Menu();
	}

	public void selectHighramtion() {
		System.out.println("请输入高新技术信息编号：");
		String nu = new Scanner(System.in).next();
		for (int k = 0; k < len; k++) {
			if (HI[k].getHighnumber().equals(nu)) {
				HighInfomation hi = HI[k];
				System.out.println(" 高新技术编号：  " + hi.getHighnumber());
				System.out.println("  高新技术名称： " + hi.getHighname());
				System.out.println(" 高新技术内容：  " + hi.getHighcontent());
				System.out.println("  高新技术金额： " + hi.getHighsum());
				System.out.println("  高新技术年份： " + hi.getHighyear());
				System.out.print("  高新技术状态： " + hi.getHighstate());
				System.out.println();
				if (hi.getHighstate() == 0)
					System.out.println(" 未审核");
				else if (hi.getHighstate() == 1)
					System.out.println(" 通过审核");
				else if (hi.getHighstate() == 2)
					System.out.println(" 未通过审核");
				System.out.println();
				System.out.println("  填报人： " + hi.getHighuser());
				hi.showapplicant();
			}
			break;
		}
		Menu();
	}

	public void selectHighramtion(double investment) {
		for (int k = 0; k < len; k++) {
			if (HI[k].getHighsum() >= investment) {
				HighInfomation hi = HI[k];
				System.out.println(" 高新技术编号：  " + hi.getHighnumber());
				System.out.println("  高新技术名称： " + hi.getHighname());
				System.out.println(" 高新技术内容：  " + hi.getHighcontent());
				System.out.println("  高新技术金额： " + hi.getHighsum());
				System.out.println("  高新技术年份： " + hi.getHighyear());
				System.out.print("  高新技术状态： " + hi.getHighstate());
				if (hi.getHighstate() == 0)
					System.out.println(" 未审核");
				else if (hi.getHighstate() == 1)
					System.out.println(" 通过审核");
				else if (hi.getHighstate() == 2)
					System.out.println(" 未通过审核");
				System.out.println();
				System.out.println("  填报人： " + hi.getHighuser());
				hi.showapplicant();
				System.out.println();
			}

		}

		Menu();
	}

	public void countHighInfomation() {
		System.out.println("未审核的技术信息：");
		for (int k = 0; k < len; k++) {
			if (HI[k].getHighstate() == 0) {
				HighInfomation hi = HI[k];
				System.out.println(" 高新技术编号：  " + hi.getHighnumber());
				System.out.println("  高新技术名称： " + hi.getHighname());
				System.out.println(" 高新技术内容：  " + hi.getHighcontent());
				System.out.println("  高新技术金额： " + hi.getHighsum());
				System.out.println("  高新技术年份： " + hi.getHighyear());
				System.out.print("  高新技术状态： " + hi.getHighstate());
				if (hi.getHighstate() == 0)
					System.out.println(" 未审核");
				else if (hi.getHighstate() == 1)
					System.out.println(" 通过审核");
				else if (hi.getHighstate() == 2)
					System.out.println(" 未通过审核");
				System.out.println();
				System.out.println("  填报人： " + hi.getHighuser());
				hi.showapplicant();
				System.out.println();
			}

		}
		System.out.println();
		System.out.println("通过审核的技术信息：");
		for (int k = 0; k < len; k++) {
			if (HI[k].getHighsum() == 1) {
				HighInfomation hi = HI[k];
				System.out.println(" 高新技术编号：  " + hi.getHighnumber());
				System.out.println("  高新技术名称： " + hi.getHighname());
				System.out.println(" 高新技术内容：  " + hi.getHighcontent());
				System.out.println("  高新技术金额： " + hi.getHighsum());
				System.out.println("  高新技术年份： " + hi.getHighyear());
				System.out.print("  高新技术状态： " + hi.getHighstate());
				if (hi.getHighstate() == 0)
					System.out.println(" 未审核");
				else if (hi.getHighstate() == 1)
					System.out.println(" 通过审核");
				else if (hi.getHighstate() == 2)
					System.out.println(" 未通过审核");
				System.out.println();
				System.out.println("  填报人： " + hi.getHighuser());
				hi.showapplicant();
				System.out.println();
			}

		}
		System.out.println();
		System.out.println("未通过审核的技术信息：");
		for (int k = 0; k < len; k++) {
			if (HI[k].getHighsum() == 2) {
				HighInfomation hi = HI[k];
				System.out.println(" 高新技术编号：  " + hi.getHighnumber());
				System.out.println("  高新技术名称： " + hi.getHighname());
				System.out.println(" 高新技术内容：  " + hi.getHighcontent());
				System.out.println("  高新技术金额： " + hi.getHighsum());
				System.out.println("  高新技术年份： " + hi.getHighyear());
				System.out.print("  高新技术状态： " + hi.getHighstate());
				if (hi.getHighstate() == 0)
					System.out.println(" 未审核");
				else if (hi.getHighstate() == 1)
					System.out.println(" 通过审核");
				else if (hi.getHighstate() == 2)
					System.out.println(" 未通过审核");
				System.out.println();
				System.out.println("  填报人： " + hi.getHighuser());
				hi.showapplicant();
				System.out.println();
			}

		}
		Menu();
	}

	public void countHighInfomation(int year) {
		int sum = 0;
		double s = 0;
		for (int k = 0; k < len; k++) {
			if (HI[k].getHighyear() == year) {
				sum = sum + 1;
				s = s + HI[k].getHighsum();
			}

		}
		System.out.println(year + "年高新技术领域共申请" + sum + " 项高新技术成果，获得投资总金额  " + s + "元。");
		Menu();
	}
}

class FileRW {
	FileRW(HighInfomation s) {
		try {
			File f = new File(" TechHighrmation.txt");
			FileWriter fw = new FileWriter(f, true);
			fw.write(" 高新技术编号：" + s.getHighnumber() + "  \r\n");
			fw.write("  高新技术名称： " + s.getHighname() + "\r\n");
			fw.write(" 高新技术内容：  " + s.getHighcontent() + " \r\n");
			fw.write("  高新技术金额： " + s.getHighsum() + " \r\n");
			fw.write("  高新技术年份： " + s.getHighyear() + " \r\n");
			fw.write("  高新技术状态： " + s.getHighstate() + "");
			if (s.getHighstate() == 0)
				fw.write(" 未审核"+"\r\n");
			else if (s.getHighstate() == 1)
				fw.write(" 通过审核"+"\r\n");
			else if (s.getHighstate() == 2)
				fw.write(" 未通过审核"+"\r\n");
			System.out.println();
			fw.write("  填报人：  " + s.getHighuser() + "\r\n");
			fw.write("  申请人姓名： " + s.getApplicantname() + " \r\n");
			fw.write("  申请人性别： " + s.getApplicantsex() + " \r\n");
			fw.write("  申请人职称： " + s.getApplicanttitle() + " \r\n");
			fw.write(" 申请人承担工作： " + s.getApplicantwork() + " \r\n");
			fw.write("申请人所在单位： " + s.getCompany() + " \r\n");
			fw.write("\r\n");

			fw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

public class myclass {

	public static void main(String args[]) {
		new menu();
		System.out.println("按下任意键进入登录页面：");
		String s = new Scanner(System.in).next();
		while (s != null) {

			new login().lo();
		}
	}

}
