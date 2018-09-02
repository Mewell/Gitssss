
// ��1603 20163664 ������ 2017/11/30

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
		System.out.println("������������" + applicantname);
		System.out.println("�������Ա�" + applicantsex);
		System.out.println("������ְ�ƣ�" + applicanttitle);
		System.out.println("�����˳е�������" + applicantwork);
		System.out.println("���������ڵ�λ��" + company);

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
		System.out.println("             ��ӭʹ�úӱ�ʡ���²�ҵ��Ϣ����ϵͳ");
		System.out.println("***************************************************************");
		System.out.println("ʯ��ׯ������ѧ��Ϣ��ѧ�뼼��ѧԺ�������ϵ�����ӢС������");
		System.out.println("�汾��V1.0");
		System.out.println("С���Ա��ָ����ʦ����������1603�� 20163664 ������");
		System.out.println("****************************************************************");
	}

}

class login {

	void lo() {

		try {
			System.out.println("�û���20163664 ���� 20163664");
			System.out.println(" �������û����� ");
			String username = new Scanner(System.in).next();
			System.out.println(" ���������룺  ");
			String password = new Scanner(System.in).next();
			if (username.equals("20163664") && password.equals("20163664"))
				new mainMenu().Menu();
			else if (!username.equals("20163664")) {
				throw new ErrorException("�û�������");
			} else if (!password.equals("20163664"))
				throw new ErrorException("�������");

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
		System.out.println("                �ӱ�ʡ���²�ҵ��Ϣͳ�Ƶ���ϵͳ");
		System.out.println("****************************************************************");
		System.out.println("1�� ¼����¼�����Ϣ��");
		System.out.println("2�� ɾ�����¼�����Ϣ��");
		System.out.println("3�� ��˸��¼�����Ϣ");
		System.out.println("4�� ��ʾ���¼�����Ϣ");
		System.out.println("5�� ��ѯ���¼�����Ϣ");
		System.out.println("6�� ��ѯ���¼���Ͷ��");
		System.out.println("7�� ͳ�Ƹ��¼�����Ϣ��");
		System.out.println("8�� ���¼������ͳ��");
		System.out.println("***************************************************************");

		int a = new Scanner(System.in).nextInt();
		switch (a) {
		case 1:
			addHighInfomation();
			break;
		case 2:
			System.out.println("������Ҫɾ���ı�ţ�");
			String str = new Scanner(System.in).next();
			deleteHighInfomation(str);
			break;
		case 3:
			System.out.println("������Ҫѡ��ı�ţ�");
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
			System.out.println("�������");
			double dou = new Scanner(System.in).nextDouble();
			selectHighramtion(dou);
			break;
		case 7:
			countHighInfomation();
			break;
		case 8:
			System.out.println("������ͳ�Ƶ���ݣ�");
			int year = new Scanner(System.in).nextInt();
			countHighInfomation(year);
			break;
		}
	}

	public void addHighInfomation() {
		try {
			HighInfomation hi = new HighInfomation();
			System.out.println("���¼�����ţ�");
			String nu=new Scanner(System.in).next();
			if(!nu.contains("2017"))throw new ErrorException("���¼�����Ÿ�ʽ����");
			hi.setHighnumber(nu);

			System.out.println("���¼������ƣ�");
			hi.setHighname(new Scanner(System.in).next());
			System.out.println("���¼������ݣ�");
			String st=new Scanner(System.in).next();
			if (st.length() > 20)throw new ErrorException("¼�����ݳ�������ַ�����");
			hi.setHighcontent(st);
			
			System.out.println("���¼�����");
			hi.setHighsum(new Scanner(System.in).nextDouble());
			System.out.println("���¼�����ݣ�");
			hi.setHighyear(new Scanner(System.in).nextInt());
			System.out.println("���¼���״̬��");
			hi.setHighstate(new Scanner(System.in).nextInt());
			System.out.println("��ˣ�");
			hi.setHighuser(new Scanner(System.in).next());
			// HI[len] = hi;
			System.out.println("��¼����������Ϣ");
			System.out.println("������������");
			hi.setApplicantname(new Scanner(System.in).next());
			System.out.println("�������Ա�");
			String se=new Scanner(System.in).next();
			if (se.equals("��") || se.equals("Ů"))hi.setApplicantsex(se);
			else throw new ErrorException("Ӧ�����л�Ů��");
			
			System.out.println("������ְ�ƣ�");
			hi.setApplicanttitle(new Scanner(System.in).next());
			System.out.println("�����˳е�������");
			hi.setApplicantwork(new Scanner(System.in).next());
			System.out.println("���������ڵ�λ��");
			hi.setCompany(new Scanner(System.in).next());
			HI[len] = hi;
			len++;
			new FileRW(hi);
			System.out.println("��Ϣ����ɹ����Ƿ����¼����Ϣ����Y���������������������");
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
		System.out.println("���Ƿ�ɾ��������Ϣ");
		String nex = new Scanner(System.in).next();
		if (nex.equals("Y")) {

			for (int k = 0; k < len; k++) {
				if (HI[k].getHighnumber().equals(highnumber)) {
					for (; k < len - 1; k++) {
						HI[k] = HI[k + 1];

					}
					System.out.println("ɾ���ɹ���");
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
					System.out.println("����Ϣ��ͨ�����");
				if (HI[k].getHighstate() == 2)
					System.out.println("����Ϣ�ѱ��˻�");
				if (HI[k].getHighstate() == 0) {

					System.out.println("***************************************************************");
					System.out.println("                        ��˸��¼�����Ϣ");
					System.out.println("***************************************************************");
					System.out.println("1�� ���������棻");
					System.out.println("2�� ͨ����ˣ�");
					System.out.println("3�� �˻���ˣ�");
					System.out.println("���¼�����ţ�");
					System.out.println("���¼������ƣ�");
					System.out.println("���¼�����飺");
					System.out.println("���¼���Ͷ�ʽ�");
					System.out.println("���¼�����ݣ�");
					System.out.println("��ˣ�");
					System.out.println("������������");
					System.out.println("�������Ա�");
					System.out.println("������ְ�ƣ�	");
					System.out.println("�����˳е�����:");
					System.out.println("���������ڵ�λ��");
					System.out.println("****************************************************************");
					System.out.println("ѡ�� 1������ϵͳ�����棻");
					System.out.println("ѡ�� 2���޸ĸñ�ŵĸ��¼���״̬����״̬�� 0 ��Ϊ 1�����಻�䣻");
					System.out.println("ѡ�� 3���޸ĸñ�ŵĸ��¼���״̬����״̬�� 0 ��Ϊ 2�����಻�䣻");
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
			System.out.println(" ���¼�����ţ�  " + hi.getHighnumber());
			System.out.println("  ���¼������ƣ� " + hi.getHighname());
			System.out.println(" ���¼������ݣ�  " + hi.getHighcontent());
			System.out.println("  ���¼����� " + hi.getHighsum());
			System.out.println("  ���¼�����ݣ� " + hi.getHighyear());
			System.out.print("  ���¼���״̬�� " + hi.getHighstate());
			if (hi.getHighstate() == 0)
				System.out.println(" δ���");
			else if (hi.getHighstate() == 1)
				System.out.println(" ͨ�����");
			else if (hi.getHighstate() == 2)
				System.out.println(" δͨ�����");
			System.out.println();
			System.out.println("  ��ˣ� " + hi.getHighuser());
			hi.showapplicant();
			System.out.println();

		}
		Menu();
	}

	public void selectHighramtion() {
		System.out.println("��������¼�����Ϣ��ţ�");
		String nu = new Scanner(System.in).next();
		for (int k = 0; k < len; k++) {
			if (HI[k].getHighnumber().equals(nu)) {
				HighInfomation hi = HI[k];
				System.out.println(" ���¼�����ţ�  " + hi.getHighnumber());
				System.out.println("  ���¼������ƣ� " + hi.getHighname());
				System.out.println(" ���¼������ݣ�  " + hi.getHighcontent());
				System.out.println("  ���¼����� " + hi.getHighsum());
				System.out.println("  ���¼�����ݣ� " + hi.getHighyear());
				System.out.print("  ���¼���״̬�� " + hi.getHighstate());
				System.out.println();
				if (hi.getHighstate() == 0)
					System.out.println(" δ���");
				else if (hi.getHighstate() == 1)
					System.out.println(" ͨ�����");
				else if (hi.getHighstate() == 2)
					System.out.println(" δͨ�����");
				System.out.println();
				System.out.println("  ��ˣ� " + hi.getHighuser());
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
				System.out.println(" ���¼�����ţ�  " + hi.getHighnumber());
				System.out.println("  ���¼������ƣ� " + hi.getHighname());
				System.out.println(" ���¼������ݣ�  " + hi.getHighcontent());
				System.out.println("  ���¼����� " + hi.getHighsum());
				System.out.println("  ���¼�����ݣ� " + hi.getHighyear());
				System.out.print("  ���¼���״̬�� " + hi.getHighstate());
				if (hi.getHighstate() == 0)
					System.out.println(" δ���");
				else if (hi.getHighstate() == 1)
					System.out.println(" ͨ�����");
				else if (hi.getHighstate() == 2)
					System.out.println(" δͨ�����");
				System.out.println();
				System.out.println("  ��ˣ� " + hi.getHighuser());
				hi.showapplicant();
				System.out.println();
			}

		}

		Menu();
	}

	public void countHighInfomation() {
		System.out.println("δ��˵ļ�����Ϣ��");
		for (int k = 0; k < len; k++) {
			if (HI[k].getHighstate() == 0) {
				HighInfomation hi = HI[k];
				System.out.println(" ���¼�����ţ�  " + hi.getHighnumber());
				System.out.println("  ���¼������ƣ� " + hi.getHighname());
				System.out.println(" ���¼������ݣ�  " + hi.getHighcontent());
				System.out.println("  ���¼����� " + hi.getHighsum());
				System.out.println("  ���¼�����ݣ� " + hi.getHighyear());
				System.out.print("  ���¼���״̬�� " + hi.getHighstate());
				if (hi.getHighstate() == 0)
					System.out.println(" δ���");
				else if (hi.getHighstate() == 1)
					System.out.println(" ͨ�����");
				else if (hi.getHighstate() == 2)
					System.out.println(" δͨ�����");
				System.out.println();
				System.out.println("  ��ˣ� " + hi.getHighuser());
				hi.showapplicant();
				System.out.println();
			}

		}
		System.out.println();
		System.out.println("ͨ����˵ļ�����Ϣ��");
		for (int k = 0; k < len; k++) {
			if (HI[k].getHighsum() == 1) {
				HighInfomation hi = HI[k];
				System.out.println(" ���¼�����ţ�  " + hi.getHighnumber());
				System.out.println("  ���¼������ƣ� " + hi.getHighname());
				System.out.println(" ���¼������ݣ�  " + hi.getHighcontent());
				System.out.println("  ���¼����� " + hi.getHighsum());
				System.out.println("  ���¼�����ݣ� " + hi.getHighyear());
				System.out.print("  ���¼���״̬�� " + hi.getHighstate());
				if (hi.getHighstate() == 0)
					System.out.println(" δ���");
				else if (hi.getHighstate() == 1)
					System.out.println(" ͨ�����");
				else if (hi.getHighstate() == 2)
					System.out.println(" δͨ�����");
				System.out.println();
				System.out.println("  ��ˣ� " + hi.getHighuser());
				hi.showapplicant();
				System.out.println();
			}

		}
		System.out.println();
		System.out.println("δͨ����˵ļ�����Ϣ��");
		for (int k = 0; k < len; k++) {
			if (HI[k].getHighsum() == 2) {
				HighInfomation hi = HI[k];
				System.out.println(" ���¼�����ţ�  " + hi.getHighnumber());
				System.out.println("  ���¼������ƣ� " + hi.getHighname());
				System.out.println(" ���¼������ݣ�  " + hi.getHighcontent());
				System.out.println("  ���¼����� " + hi.getHighsum());
				System.out.println("  ���¼�����ݣ� " + hi.getHighyear());
				System.out.print("  ���¼���״̬�� " + hi.getHighstate());
				if (hi.getHighstate() == 0)
					System.out.println(" δ���");
				else if (hi.getHighstate() == 1)
					System.out.println(" ͨ�����");
				else if (hi.getHighstate() == 2)
					System.out.println(" δͨ�����");
				System.out.println();
				System.out.println("  ��ˣ� " + hi.getHighuser());
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
		System.out.println(year + "����¼�����������" + sum + " ����¼����ɹ������Ͷ���ܽ��  " + s + "Ԫ��");
		Menu();
	}
}

class FileRW {
	FileRW(HighInfomation s) {
		try {
			File f = new File(" TechHighrmation.txt");
			FileWriter fw = new FileWriter(f, true);
			fw.write(" ���¼�����ţ�" + s.getHighnumber() + "  \r\n");
			fw.write("  ���¼������ƣ� " + s.getHighname() + "\r\n");
			fw.write(" ���¼������ݣ�  " + s.getHighcontent() + " \r\n");
			fw.write("  ���¼����� " + s.getHighsum() + " \r\n");
			fw.write("  ���¼�����ݣ� " + s.getHighyear() + " \r\n");
			fw.write("  ���¼���״̬�� " + s.getHighstate() + "");
			if (s.getHighstate() == 0)
				fw.write(" δ���"+"\r\n");
			else if (s.getHighstate() == 1)
				fw.write(" ͨ�����"+"\r\n");
			else if (s.getHighstate() == 2)
				fw.write(" δͨ�����"+"\r\n");
			System.out.println();
			fw.write("  ��ˣ�  " + s.getHighuser() + "\r\n");
			fw.write("  ������������ " + s.getApplicantname() + " \r\n");
			fw.write("  �������Ա� " + s.getApplicantsex() + " \r\n");
			fw.write("  ������ְ�ƣ� " + s.getApplicanttitle() + " \r\n");
			fw.write(" �����˳е������� " + s.getApplicantwork() + " \r\n");
			fw.write("���������ڵ�λ�� " + s.getCompany() + " \r\n");
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
		System.out.println("��������������¼ҳ�棺");
		String s = new Scanner(System.in).next();
		while (s != null) {

			new login().lo();
		}
	}

}
