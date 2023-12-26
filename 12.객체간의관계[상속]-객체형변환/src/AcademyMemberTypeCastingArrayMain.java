
public class AcademyMemberTypeCastingArrayMain {

	public static void main(String[] args) {
		/*
		AcademyMember m=new AcademyMember(0,"누구우");
		*/
		AcademyMember[] members= {
				new AcademyStudent(1, "KIM", "JAVA"),
				new AcademyStudent(2, "LIM", "DESIGN"),
				new AcademyStudent(3, "MIN", "ANDROID"),
				new AcademyGangsa(4, "OIM", "JAVA"),
				new AcademyGangsa(5, "PIM", "ANDROID"),
				new AcademyStaff(6, "QIM", "ACCOUNTING"),
				new AcademyStaff(7, "EIM", "MARKETING")
		};
		
		AcademyMember[] recvMembers=members;
		
		System.out.println("-----AcademyMember전체출력---------");
		for(int i=0;i<recvMembers.length;i++) {
			recvMembers[i].print();
		}
		System.out.println("-----enahnced for-----");
		for (AcademyMember academyMember : recvMembers) {
			academyMember.print();
		}
		System.out.println("---------instanceof----------");
		/*
		 * 연산자 : instanceof
		 *  - 형태  참조변수 instanceof 클래스이름(type)
		 *  - 연산결과 :true or false
		 *  - ex> AcademyMember m = new AcademyStudent(1,"김","리눅스");
		 *        boolean isStudentObject = m instanceof AcademyStudent;
		 */
		
		AcademyMember m=new AcademyStaff(90,"김학생","정보처리");
		if(m instanceof AcademyStudent) {
			AcademyStudent tempStudent = (AcademyStudent)m;
			String ban=tempStudent.getBan();
			System.out.println("학생반:"+ban);
		}
		System.out.println("---AcademyMember배열에있는 객체들중에 AcademyGangsa 객체판별후 강사과목 출력-------");
		for (AcademyMember academyMember : recvMembers) {
			if(academyMember instanceof AcademyGangsa) {
				AcademyGangsa tempGangsa=(AcademyGangsa)academyMember;
				String tempSubject=tempGangsa.getSubject();
				System.out.println("강사과목:"+tempSubject);
				academyMember.print();
			}
		}
		
	}

}













