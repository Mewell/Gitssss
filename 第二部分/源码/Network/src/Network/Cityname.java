package Network;

public class Cityname {
	String[] Cityname = { "北京", "天津", "上海", "重庆", "呼和浩特", "乌鲁木齐", "拉萨", "银川", "南宁", "哈尔滨", "长春", "沈阳", "石家庄", "郑州",
			"济南", "太原", "兰州", "西安", "西宁", "成都", "武汉", "合肥", "南京", "杭州", "福州", "南昌", "长沙", "贵阳", "昆明", "广州", "海口" };
	String[] Citynames = { "北京", "天津", "上海", 
			"重庆","内蒙古自治区-呼和浩特","新疆维吾尔族自治区-乌鲁木齐","西藏-拉萨","宁夏回族自治区-银川",
			"广西壮族自治区-南宁", "黑龙江-哈尔滨","吉林-长春", "辽宁-沈阳",
			"河北-石家庄", "河南-郑州", "山东-济南","山西-太原","甘肃-兰州", 
			"陕西-西安","青海-西宁","四川-成都","湖北-武汉", "安徽-合肥", "江苏-南京",
			"浙江-杭州", "福建-福州", "江西-南昌","湖南-长沙",  
			"贵州-贵阳",	"云南-昆明",  "广东-广州","海南-海口",  
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
