package Network;

import java.io.*;
import java.util.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;

public class Network_b {
	
	int distance[][] = new int[31][31];// �����������еľ���
	int distance_b[][]=new int[30][30];
	int ds1[] = new int[31];// ��űߵ�һ���������
	int ds2[] = new int[31];// �����һ���ߵĶ������
	int[] F = new int[1000];// ��Žڵ�
	Cityname ct = new Cityname();
	
	public  void readDistance(int d[][])// ��ȡÿ��������֮��ľ���
	{
		System.out.println("���ڶ�ȡ����...");
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
			for (int i = 0; i < data.length; i++)// ��datas��������ά�������� distance
			{
				datas[i] = Integer.parseInt(data[i]);
				int j = i / 31;
				int k = i % 31;
				d[j][k] = datas[i];
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("���ݶ�ȡ��ϣ�");

	}

	public  void readLocation(int a[], int b[]) //��ȡÿ�����е�����
{

		System.out.println("���ڶ�ȡ����...");
		
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

		System.out.println("���ݶ�ȡ��ϣ�");

	}
	
	public  void start(int distance[][]) //��ʼ��
	{
		for (int i = 0; i <= 30; i++) {// ��ʼ��
			for (int j = 0; j <= 30; j++) {
				if (distance[i][j] == 0)
					distance[i][j] = 99999;
			}
		}
	}

	public  void start(int distance[][],int a,int b) //ȥ��ĳһ��·�ĳ�ʼ��
	{
		for (int i = 0; i <= 30; i++) {// ��ʼ��
			for (int j = 0; j <= 30; j++) {
				if (distance[i][j] == 0)
					distance[i][j] = 99999;
			}
		}
		distance[a][b]=99999;
		distance[b][a]=99999;
	}

	public  void start_a(int distance[][]) //��ʼ��
	{
		for (int i = 0; i <30; i++) {// ��ʼ��
			for (int j = 0; j <30; j++) {
				if (distance[i][j] == 0)
					distance[i][j] = 99999;
			}
		}	
	}	
	
	public  void toprim(int w[][], int f[], int n) //prim
	{
		int d[] = new int[99999];// ��Žڵ��Ȩֵ
		int k = 0;
		int m;

		for (int j = 0; j < n; j++) {
			d[j] = (j == 1 ? 0 : w[1][j]);
			f[j] = 1;
		}
		/*
		 * ��ʼ��
		 * �ӵڶ�������� �ѵ�һ������ţ�0����F���������С�������ĵ�һ���ڵ�
		 * d[]�����ʾ	 �ڶ��������1 ���������е�ľ���  ������ͨ�����ֵ99999��ʾ
		 * ������d[]���ҳ���0�ڵ���С����ĵ�k ������ѡ������ m�����С�������� ֻҪ��mС�͸���m��
		 * �ѵ�k��������F ��ʾ���ҵ���С����������һ���ڵ�
		 * ��Ϊ�������µĽڵ�������Сֵ�����ѻ�
		 * ��������d[]������û�м���F��������нڵ㣬�Ƚϣ�ÿ���ڵ㵽�¼���ڵ�ľ��룩w[j][k]�ͣ��õ굽֮ǰ���нڵ�������Сֵ��d[j]
		 * �����н�С��ֵ����d[]��ɸ���
		 * 
		 * ѭ��n-1�� ����F�е���ż���С����������ţ���˳��
		 * 
		*/
		
		for (int i = 1; i < n; i++) {
			m = 99999;//��Ÿýڵ����С����
			// �����뵱ǰ��������ӵĸ�������Ȩֵ���ҳ�������СȨֵ�Ľ��
			for (int j = 1; j < n; j++) {
				if (d[j] <= m && d[j] != 0) {
					m = d[j];
					k = j;//��¼��С��������
				}
			}
			// �������ҵ��Ľ����뵽������
			d[k] = 0;
			// ���¸�d[]����k���������������ӵ���СȨֵ�Ž�d[j]��
			for (int j = 0; j < n; j++) {
				if (d[j] > w[k][j] && d[j] != 0) {
					d[j] = w[k][j];
					f[j] = k;
				}
			}
		}

	}

	public  void graph(int ds1[], int ds2[], int F[],Cityname ct,int d[][]) //��ͼ��ӡ���
	{
		JFrame jFrame = new JFrame();// ��������
		JPanel jpanel = new JPanel() {// ���кţ���ʡ�ԣ�
			private static final long serialVersionUID = 1L;

			@Override
			public void paint(Graphics graphics) { // ��дpaint����
				super.paint(graphics); // �����ȵ��ø����paint����
				for (int i = 0; i < 31; ++i) {
					graphics.drawOval(ds1[i], ds2[i], 5, 5);
					graphics.drawString(ct.Cityname[i]+i, ds1[i], ds2[i]);
					graphics.drawLine(ds1[i], ds2[i], ds1[F[i]], ds2[F[i]]);
				}
			}
		};
		jFrame.add(jpanel);// ������С��ͼ��Ļ���Ƕ�뵽�����
		jFrame.setSize(1080, 810);// ���û����С����ȣ��߶ȣ���Ĭ�϶�Ϊ
		jFrame.setVisible(true);// ������չʾ������true���ÿɼ���Ĭ��Ϊfalse����
		int sum=0;//�ܳ���
		for (int i = 0; i < 31; i++) {
			int k = F[i];
			System.out.println(ct.Cityname[i] + "------>" + ct.Cityname[k]+" ���룺"+d[i][k]);
			sum+=d[i][k];
		}
		System.out.println("�ܳ��ȣ�"+sum);	
	}
	
	public  void graph_a(int ds1[], int ds2[], int F[],Cityname ct,int d[][],int a,int q,int w) //��ͼ��ӡ���
	{
		JFrame jFrame = new JFrame();// ��������
		JPanel jpanel = new JPanel() {// ���кţ���ʡ�ԣ�
			private static final long serialVersionUID = 1L;

			@Override
			public void paint(Graphics graphics) { // ��дpaint����
				super.paint(graphics); // �����ȵ��ø����paint����
				for (int i = 0; i < 30; ++i) {
					graphics.drawOval(ds1[i], ds2[i], 5, 5);
					graphics.drawString(ct.Cityname[i]+i, ds1[i], ds2[i]);
					graphics.drawLine(ds1[i], ds2[i], ds1[F[i]], ds2[F[i]]);
				}
				graphics.drawOval(q, w, 5, 5);
				graphics.drawString(new Cityname().Cityname[a], q, w);
			}
		};
		
		jFrame.add(jpanel);// ������С��ͼ��Ļ���Ƕ�뵽�����
		jFrame.setSize(1080, 810);// ���û����С����ȣ��߶ȣ���Ĭ�϶�Ϊ
		jFrame.setVisible(true);// ������չʾ������true���ÿɼ���Ĭ��Ϊfalse����
		int sum=0;//�ܳ���
		for (int i = 0; i < 30; i++) {
			int k = F[i];
			System.out.println(ct.Cityname[i] + "------>" + ct.Cityname[k]+" ���룺"+d[i][k]);
			sum+=d[i][k];
		}
		System.out.println("�ܳ��ȣ�"+sum);	
	}	
	
	
	
	
	public void show()//������ʾ
 {	
		readDistance(distance);
		//start(distance);
		toprim(distance,F,31);
		readLocation(ds1, ds2);
		graph(ds1, ds2, F,ct,distance);
	}
	
	public void show(int a,int b)//ĳһ��·�ٻ�
	{	
		readDistance(distance);
		start(distance,a,b);
		toprim(distance, F, 31);
		readLocation(ds1, ds2);
		graph(ds1, ds2, F,ct,distance);
	}
	
	public void show(int a)//ĳһ��ٻ�
	{
		Cityname c=new Cityname(a);
		readDistance(distance);
		for(int i=a;i<=29;++i)//�ѵ�i��ȡ��
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