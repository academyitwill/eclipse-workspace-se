
public class CarMemberFieldMain {
	
	public static void main(String[] args) {
		/*
		 * 1.차량번호 1234번차량 12시입차 
		 */
		//차객체의 데이타를 저장 Car클래스타입의 변수선언
	   
		Car car1;
		//Car클래스를사용해서 차객체를 생성한후 차객체데이타가 car1변수에 대입
		car1 = new  Car();
		
		car1.no ="1234";//차객체(car1)의 멤버필드 no 에 "1234"값대입 
		car1.inTime=12;//차객체(car1)의 멤버필드 inTime 에 12값대입
		
		/*
		 * 2.car1객체 16시출차
		 */
		
		/*
		 * 2-1.출차시간 대입
		 */
		car1.outTime=16;//차객체(car1)의 멤버필드(outTime)에 16을 대입
		/*
		 * 2-2.주차요금계산
		 */
		car1.fee = (car1.outTime-car1.inTime)*1000;
		/*
		 * 차객체(car1)의 멤버필드fee에 차객체의(car1)의 
		 * outTime,inTime 멤버필드를 사용해서 주차요금계산후 대입
		 */
		
		/*
		 * 2-3.주차요금영수증출력
		 */
		System.out.printf("---------------------------------------\n");
		System.out.printf("%s %s %s %s\n","차량번호","입차시간","출차시간","주차요금");
		System.out.printf("---------------------------------------\n");
		System.out.printf("%7s %8d %8d   ￦%4d",car1.no,car1.inTime,car1.outTime,car1.fee);
		
		
		return;
		/*
		 return  <<호출한 클래스(객체)에게 반환할값(변수,리터럴,연산의결과)>>
		  	- 호출한곳으로 실행흐름(쓰레드) 반환
		  	- 호출한곳으로 데이타반환
		  	- 반환할 데이타가없는 경우에는(void)	return문 생략가능하다. 
		  	- 반환할 데이타가있는 경우에는 		return문 반드시기술하여야 한다. 
      */
	}

}
