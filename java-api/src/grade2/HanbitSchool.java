package grade2;

import java.util.Scanner;

public class HanbitSchool {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		GradeService service = new GradeServiceImpl();
		while (true) {
			System.out.println(
					"1:성적등록 2:학적부리스트보기 3:학번으로검색 4:이름으로검색 " + 
			"5:성적 상위순으로 순위출력 6:성적 하위순으로 순위출력(스왑) 7:이름 오름차순 출력  8:종료");

			switch (scanner.nextInt()) {
			case 1:
				System.out.println("학번,이름,국어,영어,수학");
				service.input(scanner.next(), scanner.next(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
				break;
			case 2:
				System.out.println(service.getList());
				break;
			case 3:
				System.out.println("학번을 입력해 주세요");
				String hak = scanner.next();
				System.out.println(service.searchByHak(hak));
				break;
			case 4:
				System.out.println("검색할 이름");
				String name = scanner.next();
				System.out.println(service.searchByName(name));
				break;
			case 5:
				service.descGradeByTotal();
				System.out.println(service.getList());
				break;
			case 6:
				service.ascGradeByTotal();
				System.out.println(service.getList());
				break;
			case 7:
				service.ascGradeByName();
				System.out.println(service.getList());
				break;
			case 8:
				return;
			default:
				break;
			}
		}
	}
}
