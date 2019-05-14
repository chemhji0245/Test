package test;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class RunMe {
	/**
	 * 1 Equals
	 * 2 true true false true
	 * 3 <script>window.onload=function(){alert("Hello world!");}</script>
	 * 4 输出enter finally,返回100
	 * 5 for(int i=0;i<a.length-1;i++){//外层循环控制排序趟数
　　　　　　for(int j=0;j<a.length-1-i;j++){//内层循环控制每一趟排序多少次
　　　　　　　　if(a[j]>a[j+1]){
　　　　　　　　　　int temp=a[j];
　　　　　　　　　　a[j]=a[j+1];
　　　　　　　　　　a[j+1]=temp;
　　　　　　　　}
　　　　　　}
　　　　} 
	 * 6 peopleNum-1
	 * 	 cnt2++
	 *   0
	 *   cnt1=0
	 *   circle[i]!=0
	 * 7 #10.1
		select name as 姓名,course as 科目,score 得分
		from student left outer join score
		on stdent.oid=score.oid
		#10.2
		select name as '姓名',
		max(case when course='c1' when score end  )as '科目1成绩',
		max(case when course='c2' when score end  )as '科目2成绩'
		from student left outer join score
		on stdent.oid=score.oid
		group by name
		
		(1)select student_name,course_name,score from student left join score on student.studentid=score.studentid
		(2)select student_name from student s where student_id in all (select student_id from score where score>=80 and score.student_id=s.student_id)
		(3)select score from score where score.student_id not in(select student_id from student)
	 */
	String s = "aa";
	char[] c = {'a','a'};
	void ch(String s,char[] c) {
		s = "bb";
		c[0] = 'b';
	}
	public static void main(String[] args) {
		RunMe r= new RunMe();
		r.ch(r.s, r.c);
		System.out.println(r.s);
		System.out.println(r.c);
//		Thread t = new Thread() {
//			public void run() {
//				System.out.println("ping");
//			}
//		};
//		t.run();
//
//		System.out.println("pong");
		
		
		
		
//		int circle[] = new int[11];
//		for(int i=0;i<circle.length;i++) {
//			circle[i]=i+1;
//		}
//		int cnt1 = 0;
//		int cnt2 = 0;//1 2 3
//		int cnt3 = 0;//退出人数
//		while(cnt3<10) {
//			if(circle[cnt1]!=0) {
//				cnt2++;
//			}
//			if(cnt2==3) {
//				circle[cnt1]=0;
//				cnt2 = 0;
//				cnt3++;
//			}
//			cnt1++;
//			if(cnt1==11) {
//				cnt1=0;
//			}
//		}
//		for(int i=0;i<circle.length;i++) {
//			if(circle[i]!=0) {
//				System.out.println(circle[i]);
//			}
//		}
//		try {
//			return 100;
//		}catch(Exception e) {
//			
//		}finally {
//			
//		}
//		return 0;
//		String s1 = "aa";
//		String s2 = new String("aa");
//		String s3 = "aa";
//		System.out.println(s1.hashCode()==s2.hashCode());
//		System.out.println(s1.equals(s2));
//		System.out.println(s1==s2);
//		System.out.println(s1==s3);
//		String s1 = new String("s");
//		String s2 = new String("s");
//		System.out.println(s1==s2);
//		System.out.println(s1.equals(s2));
	}

	public static void main1(String[] args) {
		int[] a = {2,3,4};
		int[] b = {1,3,4};
		int[] c= {2,4};
		int[] d= {1,2,3};
		
		for(int i=1;i<=4;i++) {//号码
			System.out.print(i+"号可能是第");
			for(int j=1;j<=4;j++) {//名次
				if(i!=j) {
					if(i!=3 || i==3&&j!=1) {
						System.out.print(j+" ");
					}
				}
			}
			System.out.println("名");
		}

	}

}
