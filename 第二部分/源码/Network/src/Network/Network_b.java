package Network;

import java.io.*;
import java.util.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;

public class Network_b {
	
	int distance[][] = new int[31][31];// 任意两个城市的距离
	int distance_b[][]=new int[30][30];
	int ds1[] = new int[31];// 存放边的一个顶点序号
	int ds2[] = new int[31];// 存放另一个边的顶点序号
	int[] F = new int[1000];// 存放节点
	Cityname ct = new Cityname();
	
	public  void readDistance(int d[][])// 读取每两个城市之间的距离
	{
		System.out.println("正在读取数据...");
		try {
			BufferedReader br = new BufferedReader(new FileReader("distance.txt"));
			String S = "";
			String s;
			while ((s = br.readLine()) != null) {
				S += s;
			}
			br.close();
			String data[] = S.split(" ");
			int[] datas = new int[data.length];
			for (int i = 0; i < data.length; i++)// 把datas数组存入二维距离数组 distance
			{
				datas[i] = Integer.parseInt(data[i]);
				int j = i / 31;
				int k = i % 31;
				d[j][k] = datas[i];
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("数据读取完毕！");

	}

	public  void readLocation(int a[], int b[]) //读取每个城市的坐标
{

		System.out.println("正在读取数据...");
		
		try {
			BufferedReader br = new BufferedReader(new FileReader("dst.txt"));
			String S = "";
			String s;
			while ((s = br.readLine()) != null) {
				S += s;
			}
			br.close();
			String data[] = S.split(" ");
			int k = 0;
			for (int i = 0; i < data.length; i = i + 2) {

				int j = i + 1;
				a[k] = Integer.parseInt(data[i]);
				b[k] = Integer.parseInt(data[j]);
				++k;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("数据读取完毕！");

	}
	
	public  void start(int distance[][]) //初始化
	{
		for (int i = 0; i <= 30; i++) {// 初始化
			for (int j = 0; j <= 30; j++) {
				if (distance[i][j] == 0)
					distance[i][j] = 99999;
			}
		}
	}

	public  void start(int distance[][],int a,int b) //去掉某一线路的初始化
	{
		for (int i = 0; i <= 30; i++) {// 初始化
			for (int j = 0; j <= 30; j++) {
				if (distance[i][j] == 0)
					distance[i][j] = 99999;
			}
		}
		distance[a][b]=99999;
		distance[b][a]=99999;
	}

	public  void start_a(int distance[][]) //初始化
	{
		for (int i = 0; i <30; i++) {// 初始化
			for (int j = 0; j <30; j++) {
				if (distance[i][j] == 0)
					distance[i][j] = 99999;
			}
		}	
	}	
	
	public  void toprim(int w[][], int f[], int n) //prim
	{
		int d[] = new int[99999];// 存放节点的权值
		int k = 0;
		int m;

		for (int j = 0; j < n; j++) {
			d[j] = (j == 1 ? 0 : w[1][j]);
			f[j] = 1;
		}
		/*
		 * 初始化
		 * 从第二个点出发 把第一个点序号：0放入F数组代表最小二叉树的第一个节点
		 * d[]数组表示	 第二个点序号1 到其他所有点的距离  若不连通用最大值99999表示
		 * 从数组d[]中找出到0节点最小距离的点k （类似选择排序 m存放最小距离的序号 只要比m小就更新m）
		 * 把点k放入数组F 表示已找到最小二叉树的下一个节点
		 * 以为加入了新的节点所以最小值发生裱花
		 * 更新数组d[]，遍历没有加入F数组的所有节点，比较（每个节点到新加入节点的距离）w[j][k]和（该店到之前所有节点距离的最小值）d[j]
		 * 把其中较小的值存入d[]完成更新
		 * 
		 * 循环n-1次 数组F中的序号即最小二叉树的序号（有顺序）
		 * 
		*/
		
		for (int i = 1; i < n; i++) {
			m = 99999;//存放该节点的最小距离
			// 遍历与当前结点相连接的各个结点的权值并找出具有最小权值的结点
			for (int j = 1; j < n; j++) {
				if (d[j] <= m && d[j] != 0) {
					m = d[j];
					k = j;//记录最小距离的序号
				}
			}
			// 将上面找到的结点加入到集合中
			d[k] = 0;
			// 更新父d[]，将k结点与其它结点连接的最小权值放进d[j]中
			for (int j = 0; j < n; j++) {
				if (d[j] > w[k][j] && d[j] != 0) {
					d[j] = w[k][j];
					f[j] = k;
				}
			}
		}

	}

	public  void graph(int ds1[], int ds2[], int F[],Cityname ct,int d[][]) //画图打印结果
	{
		JFrame jFrame = new JFrame();// 创建画板
		JPanel jpanel = new JPanel() {// 序列号（可省略）
			private static final long serialVersionUID = 1L;

			@Override
			public void paint(Graphics graphics) { // 重写paint方法
				super.paint(graphics); // 必须先调用父类的paint方法
				for (int i = 0; i < 31; ++i) {
					graphics.drawOval(ds1[i], ds2[i], 5, 5);
					graphics.drawString(ct.Cityname[i]+i, ds1[i], ds2[i]);
					graphics.drawLine(ds1[i], ds2[i], ds1[F[i]], ds2[F[i]]);
				}
			}
		};
		jFrame.add(jpanel);// 将绘有小人图像的画板嵌入到相框中
		jFrame.setSize(1080, 810);// 设置画框大小（宽度，高度），默认都为
		jFrame.setVisible(true);// 将画框展示出来。true设置可见，默认为false隐藏
		int sum=0;//总长度
		for (int i = 0; i < 31; i++) {
			int k = F[i];
			System.out.println(ct.Cityname[i] + "------>" + ct.Cityname[k]+" 距离："+d[i][k]);
			sum+=d[i][k];
		}
		System.out.println("总长度："+sum);	
	}
	
	public  void graph_a(int ds1[], int ds2[], int F[],Cityname ct,int d[][],int a,int q,int w) //画图打印结果
	{
		JFrame jFrame = new JFrame();// 创建画板
		JPanel jpanel = new JPanel() {// 序列号（可省略）
			private static final long serialVersionUID = 1L;

			@Override
			public void paint(Graphics graphics) { // 重写paint方法
				super.paint(graphics); // 必须先调用父类的paint方法
				for (int i = 0; i < 30; ++i) {
					graphics.drawOval(ds1[i], ds2[i], 5, 5);
					graphics.drawString(ct.Cityname[i]+i, ds1[i], ds2[i]);
					graphics.drawLine(ds1[i], ds2[i], ds1[F[i]], ds2[F[i]]);
				}
				graphics.drawOval(q, w, 5, 5);
				graphics.drawString(new Cityname().Cityname[a], q, w);
			}
		};
		
		jFrame.add(jpanel);// 将绘有小人图像的画板嵌入到相框中
		jFrame.setSize(1080, 810);// 设置画框大小（宽度，高度），默认都为
		jFrame.setVisible(true);// 将画框展示出来。true设置可见，默认为false隐藏
		int sum=0;//总长度
		for (int i = 0; i < 30; i++) {
			int k = F[i];
			System.out.println(ct.Cityname[i] + "------>" + ct.Cityname[k]+" 距离："+d[i][k]);
			sum+=d[i][k];
		}
		System.out.println("总长度："+sum);	
	}	
	
	
	
	
	public void show()//正常显示
 {	
		readDistance(distance);
		//start(distance);
		toprim(distance,F,31);
		readLocation(ds1, ds2);
		graph(ds1, ds2, F,ct,distance);
	}
	
	public void show(int a,int b)//某一线路毁坏
	{	
		readDistance(distance);
		start(distance,a,b);
		toprim(distance, F, 31);
		readLocation(ds1, ds2);
		graph(ds1, ds2, F,ct,distance);
	}
	
	public void show(int a)//某一点毁坏
	{
		Cityname c=new Cityname(a);
		readDistance(distance);
		for(int i=a;i<=29;++i)//把第i行取消
		{		
			for(int j=0;j<=30;j++){
				distance[i][j]=distance[i+1][j];				
			}
		}
		
		for(int i=a;i<=29;i++)
		{
			for(int j=0;j<=29;j++) {
				distance[j][i]=distance[j][i+1];
			}		
		}
		start_a(distance);
		toprim(distance,F,30);
		readLocation(ds1, ds2);
		int q=ds1[a];
		int w=ds2[a];
		for(int i=a;i<=29;++i)
		{
			ds1[i]=ds1[i+1];
			ds2[i]=ds2[i+1];		
		}
		graph_a(ds1, ds2, F,c,distance,a,q,w);	
	}
	

}