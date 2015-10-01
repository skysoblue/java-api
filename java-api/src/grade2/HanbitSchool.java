package grade2;

import java.util.Scanner;

public class HanbitSchool {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		GradeService service = new GradeServiceImpl();
		while (true) {
			System.out.println("1:성적등록 2:학적부리스트보기 3:학번으로검색 4:이름으로검색 5:성적순위출력 6:이름순출력 7:종료");
			
			switch (scanner.nextInt()) {
			case 1: 
				System.out.println("학번,이름,국어,영어,수학");
				service.input(scanner.next(), scanner.next(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt()); break;
			case 2:
				System.out.println(service.getList()); break;
			case 3:break;
			case 4:break;
			case 5:break;
			case 6:break;
			case 7:return;
			default:break;
			}
		}
	}
}
