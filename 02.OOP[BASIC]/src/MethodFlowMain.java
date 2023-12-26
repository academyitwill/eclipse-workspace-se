
public class MethodFlowMain {

	public static void main(String[] args) {
		/*
		//계산1
		int a=1;
		int b=2;
		System.out.println(a+"+"+b+" 연산수행");
		int sum1 = a+b;
		System.out.println("결과1 출력:"+sum1);
		
		//계산2
		int x=10;
		int y=20;
		System.out.println(x+"+"+y+" 연산수행");
		int sum2 = a+b;
		System.out.println("결과1 출력:"+sum2);
		*/
		System.out.println("---add메쏘드 호출(call,invoke)-----");
		int sum1= add(1,2);
		System.out.println("결과출력1 sum1:"+sum1);
		System.out.println("---add메쏘드 호출(call,invoke)-----");
		int sum2=add(10,20);
		System.out.println("결과출력2 sum2:"+sum2);
		
		return;
	}
	
	public static int add(int a,int b){
		System.out.println(a+"+"+b+" 연산수행");
		int sum = a+b;
		//System.out.println("결과 출력:"+sum);
		return sum;
	}
	

}












