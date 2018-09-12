package Network;

public class Cityname {
	String[] Cityname = { "����", "���", "�Ϻ�", "����", "���ͺ���", "��³ľ��", "����", "����", "����", "������", "����", "����", "ʯ��ׯ", "֣��",
			"����", "̫ԭ", "����", "����", "����", "�ɶ�", "�人", "�Ϸ�", "�Ͼ�", "����", "����", "�ϲ�", "��ɳ", "����", "����", "����", "����" };
	String[] Citynames = { "����", "���", "�Ϻ�", 
			"����","���ɹ�������-���ͺ���","�½�ά�����������-��³ľ��","����-����","���Ļ���������-����",
			"����׳��������-����", "������-������","����-����", "����-����",
			"�ӱ�-ʯ��ׯ", "����-֣��", "ɽ��-����","ɽ��-̫ԭ","����-����", 
			"����-����","�ຣ-����","�Ĵ�-�ɶ�","����-�人", "����-�Ϸ�", "����-�Ͼ�",
			"�㽭-����", "����-����", "����-�ϲ�","����-��ɳ",  
			"����-����",	"����-����",  "�㶫-����","����-����",  
			 };
	int num = 31;
	String CityNumber[] = new String[31];

	public Cityname() {
		for (int i = 0; i <num; ++i) {
			CityNumber[i]=new String("c"+i);
		}
	}

	public Cityname(int a)
	{
		if(a<0||a>=31)System.exit(0);
		for(int i=a;i<num-1;++i)
		{	
			Cityname[i]=Cityname[i+1];
		}
		--num;
	}
	
	void display() {
		for (int i = 0; i <num; ++i)
			System.out.println(i + ":" + Cityname[i]);
		System.out.println();
	}

	void displays() {
		for (int i = 0; i <num; ++i)
			System.out.println(i + ":" + Citynames[i]);
		System.out.println();
	}

	public int getCityNumber(String city) {
		for (int i = 0; i <num; ++i) {
			if(CityNumber[i].equals(city))return i;
		}
		return 100;	
	}	
	
}
