package regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp1 {
	public static void main(String[] args) {
		String[] data = {"bat","baby","c.","car","combat","count","c#",
				"c.,","c2","cA","date","disc","ba"};
		String[] pattern= {
				".*",  // 모든 문자열
				"c[a-z]*", // c로 시작하는  영단어(소문자,, 글자수는 관계없음)
				"c[a-z]", // c로 시작하는 2글자 영단어(소문자)
				"c[a-zA-Z]", // c로 시작하는2글자  영단어(대소문자 관계없음)
				"c[a-zA-Z0-9]", // c로 시작하고 숫자와 영어로 조합된 2글자 
				"c\\w", // c로 시작하고 숫자와 영어로 조합된 2글자(위와 동일함)
				"c.",  // c로 시작하는 2글자(기호 포함)
				"c.*", // c로 시작하는 모든 문자열(기호 포함)
				"c\\.", // escape 문자로 글자 그대로
				"c\\d", // c 와 숫자로 구성된 두자리 문자열. decimal 10진수 
				"c[0-9]", // c 와 숫자로 구성된 두자리 문자열(위와 동일)
				"c.*t", // c 로 시작하고 t로 끝나는 모든 문자열
				"[b|c].*", // b 또는 c 로 시작하는 문자열
				"[bc].*", // (위와 동일)
				"[b-c].*", // (위와 동일)
				".*a.*", // a를 포함하는 모든 문자열    * : 0또는 그 이상의 문자, null포함
				".*a.+", // a를 포함하는 모든 문자열   + : 1 또는 그 이상의 문자, null 허용하지 않음
						// a 뒤에 반드시 한개 이상의 문자가 와야 하므로 a 로 끝나는 단어는제외
				"[b|c].{2}", // b 또는 c 로 시작하는 세자리 문자열
				"[^b|c].*" // b 또는 c 로 시작하지 않는 문자열
		};
		for (int i = 0; i < pattern.length; i++) {
			Pattern p = Pattern.compile(pattern[i]);  // Shallow copy 얕은 카피
			System.out.println();
			for (int j = 0; j < data.length; j++) {
				Matcher m = p.matcher(data[j]);
				if (m.matches()) {
					System.out.print(data[j]+"\t");
				}
			}
			System.out.println();
		}
	}
}











