/*
 *  정수 3개를 입력받아서 총점과 평균을 구하고 학점을 구하는 프로그램
        작성 ( 90이상이면 A,80이상이면 B, 70이상이면 C,60이상이면 D, 
        나머지는 F)

 */
public class 문제7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*double[] limit= {50,60,70,80,90};
        String[] grade={"F","D","C","B","A"};
        int[] score={100,95,88,89,52,78};
        ChoiceFormat form=new ChoiceFormat(limit,grade);
        for(int i=0;i<score.length;i++)
        {
        	System.out.println(score[i]+":"+form.format(score[i]));
        }*/
		int kor=(int)(Math.random()*101);
		int eng=(int)(Math.random()*101);
		int math=(int)(Math.random()*101);
		System.out.println("국어점수:"+kor);
		System.out.println("영어점수:"+eng);
		System.out.println("수학점수:"+math);
		
		System.out.println("총점:"+(kor+eng+math));
		System.out.printf("평균:%.2f\n",(kor+eng+math)/3.0);
		int temp=(kor+eng+math)/3;
		char ch='A';
		if(temp>=90 && temp<=100)
			ch='A';
		if(temp>=80 && temp<90)
			ch='B';
		if(temp>=70 && temp<80)
			ch='C';
		if(temp>=60 && temp<70)
			ch='D';
		// else
		if(temp<60)
			ch='F';
		System.out.println("학점:"+ch);
	}

}
