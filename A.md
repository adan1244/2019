

# 1. char charAt(int)

* 지정된 인덱스에있는 문자를 리턴합니다.
* 문자열 인덱스는 0부터 시작합니다.

~~~
	String s ="charAt";
	char result = s.charAt(4);
	System.out.println("Return Value :"+result);
~~~

* 결과

~~~
Return Value :A
~~~



# 2. int compareTo (Object)

* String을 다른 Object와 비교합니다.

~~~
	String str1 = "compareTo";
	String str2 = new String("bompareTo");

	int result = str1.compareTo(str2);
	System.out.println("Return Value :"+result);
~~~

* 결과

~~~
Return Value :1
~~~


# 3. int compareTo (String)

* 대문자와 소문자를 구별하고, 2개의 문자열 자체를 사전적으로 비교합니다.

~~~
	String str1 = "compareTo";
	String str2 = "bompareTo";

	int result = str1.compareTo(str2);
	System.out.println("Return Value :"+result);
~~~

* 결과

~~~
Return Value :1
~~~


# 4. int compareToIgnoreCase (String)

* 두 문자열을 사전적으로 비교합니다.

~~~
	String str1 = "compareTo_IgnoreCase";
	String str2 = "bompareTo_iGNOREcASE";

	int result = str1.compareToIgnoreCase(str2);
	System.out.println("Return Value :"+result);
~~~

* 결과

~~~
Return Value :1
~~~


# 5. String concat(String)

* 하나의 String을 다른 String의 끝에 추가합니다.

~~~	
	String str = "con";
	str = str.concat("cat");
	System.out.println("Return Value :"+str);
~~~

* 결과

~~~
Return Value :concat
~~~


# 6. boolean contentEquals(StringBuffer sb)

* String과 StringBuffer가 같은 문자 순서를 가지는지 비교
* 같은 문자 순서를 나타내는 경우, true값을 반환합니다.

~~~
	String str1 = "StringBuffer";
	String str2 = "String";

	boolean result = str1.contentEquals(str2);
	System.out.println("Return Value :"+result);
~~~

* 결과

~~~
Return Value :false
~~~

# 7. static String copyValueOf(char[] data)

* 지정된 배열 내의 문자 순서를 나타내는 String을 반환합니다.

~~~
	char[] Str1 = { 'c', 'o', 'p', 'y', 'V', 'a', 'l', 'u', 'e', 'O', 'f' };
	String Str2 = "";
	Str2 = String.copyValueOf(Str1);
	System.out.println("Returned String: " + Str2);
~~~

* 결과

~~~
Returned String: copyValueOf
~~~

# 8. static String copyValueOf(char[] data, int offset, int count)

* 지정된 배열 내의 문자 시퀀스를 나타내는 String을 반환합니다.

~~~
	char[] Str1 = { 'c', 'o', 'p', 'y', 'V', 'a', 'l', 'u', 'e', 'O', 'f' };
	String Str2 = "";
	Str2 = String.copyValueOf(Str1, 2, 6);
	System.out.println("Returned String: " + Str2);
~~~

* 결과

~~~
Returned String: pyValu
~~~

# 9. boolean endsWith (String suffix)

* 문자열이 지정된 접미사로 끝나는 지 여부를 테스트합니다.
* 같으면 true를 반환합니다.
* 대소문자 구분

~~~
	String str = new String("endsWith");
	boolean retVal;
	retVal = str.endsWith("With");
		
	System.out.println("Returned Value : " + retVal);
~~~

* 결과

~~~
Returned Value : true
~~~

# 10. boolean equals (Object anObject)

* 문자열을 지정된 객체와 비교합니다.
* 인수가 null가 아니고, 이 객체와 String 객체가 같을경우 true 반환
* 대소문자 구분

~~~
	String Str1 = new String("equals");
	String Str2 =new String("EQUALS");
	boolean retVal;

	retVal = Str1.equals(Str2);
	System.out.println("Returned Value : " + retVal);
~~~

* 결과

~~~
Returned Value : false
~~~

# 11. boolean equalsIgnoreCase(String anotherString)

* String를 다른 String와 비교합니다.
* 동일하면 true를 반환합니다.

~~~
	String Str1 = new String("equlsIgnoreCase");
	String Str2 =new String("EQUALSIGNORECASE");
	boolean retVal;

	retVal = Str1.equalsIgnoreCase(Str2);
	System.out.println("Returned Value : " + retVal);
~~~

* 결과

~~~
Returned Value : true
~~~

# 12. byte getBytes ()

* String을 바이트 순서에 encode 해서, 결과를 새로운 바이트 배열에 포함합니다.
* getByte() 는 try~catch 구문을 필수로 필요로 한다.

~~~
	String Str1 = new String("getByte");

	try {
		String Str2 = new String(Str1.getBytes("UTF-8"));
		System.out.println("Returned Value :" + Str2);
	} catch (UnsupportedEncodingException e) {
		System.out.println("지원하지 않는 문자 값입니다.");
	}
~~~

* 결과

~~~
Returned Value :getByte
~~~

# 13. byte[] getBytes(String)

* 문자열을 byte배열로 리턴해준다.

~~~
	String S1 = "getBytes";
	byte[] arr = S1.getBytes();
	for (int a = 0; a < arr.length; ++a) {
		System.out.println(arr[a]);
	}
~~~

* 결과

~~~
103
101
116
66
121
116
101
115
~~~

# 14. public void getChars(int Begin, int End, char[] dst, int dstBegin)

* 문자열의 문자를 대상 문자 배열에 복사한다.

~~~
	String Str1 = new String("getChars");
	char[] Str2 = new char[7];

	Str1.getChars(2, 6, Str2, 0);
	System.out.println("Return Value :"+Str2);
~~~

* 결과

~~~
Return Value :tCha
~~~

# 15. int hashCode()

* 대상 문자열의 해쉬코드값을 리턴해준다.

~~~
	String Str = new String("hashCode");
	System.out.println("Return Value :"+ Str.hashCode() );
~~~

* 결과

~~~
Return Value :147696667
~~~

# 16. public int indexOf(char)

* 문자열에서 지정된 문자가 최초로 검출된 위치의 인덱스값을 리턴해준다.
* 문자가 발견되지 않는 경우는 -1을 리턴해준다.

~~~
	String Str = new String("indxOf");
	System.out.print("Return Value :" );
	System.out.println(Str.indexOf( 'd' ));
~~~

* 결과

~~~
Return Value :2
~~~

# 17. public in indexOf(char ch, int fromIndex)

* 문자열 안에서 지정된 문자의 최초의 출현 위치의 인덱스를 리턴해준다. (왼쪽에서 오른쪽방향으로)
* 지정된 인덱스에서 검색을 시작하며, 문자가 발견되지 않는 경우는 -1을 리턴해준다.

~~~
	String Str = new String("indxOf");
	System.out.print("Return Value :");
	System.out.println(Str.indexOf('O', 3));
~~~

* 결과

~~~
Return Value :4
~~~

# 18. int indexOf(String str)

* 문자열에서 지정된 하위 문자열의 첫 번째 문자 인덱스를 리턴해준다. (왼쪽에서 오른쪽방향으로)
* 지정된 문자열이 발견되지 않으면 -1이 리턴된다.

~~~
	String Str = new String("indexOf");

	String SubStr1 = new String("de");
	System.out.println("Return Value :" + Str.indexOf(SubStr1));

~~~

* 결과

~~~
Return Value :2
~~~

# 19. int indexOf(String str, int fromIndex)

* 문자열에서 지정된 인덱스에서 시작하여 지정된 하위 문자열의 첫 번째 문자 인덱스를 리턴한다. (왼쪽에서 오른쪽방향으로)
* 지정된 문자열이 발견되지 않으면 -1이 리턴된다.

~~~
	String Str = new String("index Of");
	String SubStr1 = new String("n");
	String SubStr2 = new String("Of");

	System.out.println("Return Value :" + Str.indexOf(SubStr1, 2));
	System.out.println("Return Value :" + Str.indexOf(SubStr2, 2));
~~~

* 결과

~~~
Return Value :-1
Return Value :6
~~~

# 20. public String intern()

* 문자열 객체에 대한 표준 표현을 반환합니다.
* 두 개의 문자열 s1 와 s2 에 대해 s.equals (s)가 참인 경우에만
* s1.intern () == s2.intern ()이 참이됩니다.

~~~
	String Str1 = new String("intern");
	String Str2 = new String("INTERN");
		
	System.out.print("Return Value :" );
	System.out.println(Str1.intern());
	System.out.print("Return Value :" );
	System.out.println(Str2.intern());
~~~

* 결과

~~~
Return Value :intern
Return Value :INTERN
~~~

# 21. int lastIndexOf(int ch)
* 문자열에서 지정된 문자의 인덱스를 리턴한다. (오른쪽에서 왼쪽방향으로)
* 지정된 문자가 존재하지 않는 경우에는 -1을 리턴한다.

~~~
	String Str = new String("lastIndexOf");

	System.out.print("Return Value :" );
	System.out.println(Str.lastIndexOf( 'n' ));
~~~

* 결과

~~~
Return Value :5
~~~

# 22. int lastIndexOf(int ch, int fromIndex)

* 문자열에서 지정된 인덱스에서 시작하여 지정된 하위 문자열이 처음 나타나는
* 인덱스를 리턴한다.(오른쪽에서 왼쪽방향으로)
* 지정된 문자가 존재하지 않는 경우에는 -1을 리턴한다.

~~~
	String Str = new String("lastIndexOf_Index");

	System.out.print("Return Value :");
	System.out.println(Str.lastIndexOf('n', 7));
~~~

* 결과

~~~
Return Value :5
~~~

# 23. int lastIndexOf(String str)

* 문자열에서 지정된 하위 문자열의 첫 번째 문자 인덱스를 리턴해준다.
* 지정된 문자열이 존재하지 않는 경우에는 -1을 리턴한다. (오른쪽에서 왼쪽방향으로)

~~~
	String Str = new String("lastIndexOf");
	String SubStr1 = new String("n" );

	System.out.print("Return Value :" );
	System.out.println( Str.lastIndexOf( SubStr1 ));
~~~

* 결과

~~~
Return Value :5
~~~

# 24. int lastIndexOf(String str, int fromIndex)

* 문자열에서 지정된 인덱스에서 시작하여 지정된 하위 문자열의 첫 번째 문자 인덱스를 리턴한다.
* 지정된 문자열이 존재하지 않는 경우에는 -1을 리턴한다.

~~~
	String Str = new String("lastIndexOf_Index");
	String SubStr1 = new String("n" );

	System.out.print("Return Value :" );
	System.out.println( Str.lastIndexOf( SubStr1, 8 ));
~~~

* 결과

~~~
Return Value :5
~~~





# 25. int length()

* 캐릭터 라인의 길이를 돌려줍니다. - 띄어쓰기 포함, 영어 한글 1byte

~~~
      String Str1 = new String("int length");
      String Str2 = new String("int" );
      
      System.out.printf("String Length : %d\n" , Str1.length());
      System.out.printf("String Length : %d\n", Str2.length());
~~~
  

* 결과

~~~
String Length : 10

String Length : 3
~~~


# 26. boolean matches(String)

* 캐릭터 라인이, 지정된 정규 표현에 일치할지 어떨지를 판단합니다.
* 문자열이 주어진 정규 표현식과 일치하는지 여부를 알려줌 -true, false

~~~	
	String Str = new String("boolean matches");

	System.out.printf("Return Value : %s\n" , Str.matches("boolean"));

	System.out.printf("Return Value : %s\n" , Str.matches("boolean(.*)"));
~~~

* 결과


~~~
Return Value : false

Return Value : true
~~~

# 27. boolean regionMatches(boolean, int a, String, int x, int y)

* 2 개의 string 영역이 동일한 지 어떤지를 판정합니다.

* boolean - true 경우, 문자의 비교 시에 대문자와 소문자는 구별되지 않는다
	
* a - 이 캐릭터 라인내의 부분 영역의 개시 오프셋(offset)
	
* String - 캐릭터 라인 인수
	
* x - 캐릭터 라인 인수내의 부분 영역의 개시 오프셋(offset)
	
* y - 비교 대상의 문자수


~~~
	String Str1 = new String("boolean regionMatches");
	String Str2 = new String("REGION");

	System.out.printf("Return Value : %s", 	Str1.regionMatches(true, 8, Str2, 0, 6));
~~~
	
  

* 결과

~~~
Return Value :true
~~~

# 28. boolean regionMatches(int toffset, String other, int ooffset, int len)

* 2 개의 string 영역이 동일한 지 어떤지를 판정합니다.
* -toffset -이 캐릭터 라인 내의 부분 영역의 개시 오프셋 (offset)
* -other - 캐릭터 라인 인수
* -ooffset - 캐릭터 라인 인수의 부분 영역의 개시 오프셋 (offset)
* -len - 비교하는 문자 수

~~~
      String Str1 = new String("Welcome to Tutorialspoint.com");
      String Str2 = new String("Tutorials");
      String Str3 = new String("TUTORIALS");

      System.out.print("Return Value :" );
      System.out.println(Str1.regionMatches(11, Str2, 0, 9));

      System.out.printf("Return Value : %s" , 	Str1.regionMatches(11, Str3, 0, 9));
~~~

* 결과

~~~
Return Value :true
Return Value :false
~~~

# 29. String replace(char c1, char c2)

* 문자c1을 c2로 대체합니다.

~~~
	String Str = new String("replace");

	System.out.printf("Return Value : %s\n" , Str.replace('o', 'T'));

	System.out.printf("Return Value : %s" , Str.replace('l', 'D'));
~~~


* 결과

~~~
Return Value : rTplacT
Return Value : replDce
~~~

# 30. String replaceAll(String s1, String s2)

* 문자열 s1을 문자열 s2로 대체합니다

~~~
	String Str = new String("replaceAll");

	System.out.print("Return Value :");
	System.out.println(Str.replaceAll("(.*)place(.*)", "AMROOD"));
~~~

* 결과

~~~
Return Value :AMROOD
~~~
 
# 31. String replaceFirst(String s1, String s2)

* s1의 표현식과 일치하는 문자열의 첫번째 부분 문자열을 s2로 대체합니다

~~~
	String Str = new String("replaceFirst");

	System.out.printf("Return Value : %s", Str.replaceFirst("e", "AMROOD"));
~~~

* 결과

~~~
Return Value : rAMROODplaceFirst
~~~

# 32. String[] split(String)

* 이 문자열을 주어진 정규식과 일치하는 부분으로 나눕니다.

~~~
	String Str = new String("s-pl-it");
	System.out.println("Return Value :");

	for (String retval : Str.split("-")) {
		System.out.println(retval);
	}
~~~


* 결과

~~~
Return Value :
s
pl
it
~~~

# 33. String[] split(String, int)

* 이 문자열을 주어진 정규식과 일치하는 부분으로 나눕니다.
* 이 문자열을 주어진 정규 표현식의 일치 부분으로 분할하여 계산 된 문자열 배열을 반환합니다.

~~~
	String Str = new String("s-pl-it");
		
	System.out.printf("Return Value : %d", Arrays.toString(Str.split("-",2)));
~~~


* 결과

~~~
Return Value :
s
pl-it
~~~

# 34. boolean startsWith(String prefix)

* 접두사 인 경우는 true, 그렇지 않은 경우는 false를 돌려줍니다.

~~~
	String Str = new String("startWith");

	System.out.print("Return Value :");
	System.out.println(Str.startsWith("start"));

	System.out.print("Return Value :");
	System.out.println(Str.startsWith("With"));
~~~


* 결과

~~~
Return Value :true
Return Value :false
~~~

# 35. boolean startsWith(String, int)

* int 번째의 문자열이 String이랑 동일하면 true, 그렇지 않은 경우는 false를 돌려줍니다

~~~
	String Str = new String("startsWith");

	System.out.print("Return Value :");
	System.out.println(Str.startsWith("With", 6));
~~~


* 결과

~~~
Return Value :true
~~~

# 36. CharSequence subSequence(int a, int b)

* 이 순서의 서브 순서 인 새로운 문자 순서를 돌려줍니다.
* a부터 b까지의 문자열을 반환합니다.

~~~
	String Str = new String("CharSequence subSequence");

	System.out.print("Return Value :");
	System.out.println(Str.subSequence(0, 10));

	System.out.print("Return Value :");
	System.out.println(Str.subSequence(10, 15));
~~~


* 결과

~~~
Return Value :CharSequen
Return Value :ce su
~~~

# 37. String substring(int)
* int 번째의 문자부터 끝까지의 값을 반환합니다

~~~
	String Str = new String("subString");
	
	System.out.print("Return Value :");
	System.out.println(Str.substring(4));
~~~

* 결과

~~~
Return Value :tring
~~~

# 38. String substring(int a, int b)

* a번째 문자부터 b번째 문자까지의 값을 반환합니다.

~~~
	String Str = new String("subString");

	System.out.print("Return Value :");
	System.out.println(Str.substring(3, 8));
~~~

* 결과

~~~
Return Value :Strin
~~~

# 39. char[] toCharArray()

* string 문자열을 char 배열로 전환하는 메소드
* 배열을 생성해야 하므로 처리속도가 느려지는 것에 유의해야 합니다.

~~~
	String word = "toCharArray";
	char[] array = word.toCharArray();

	System.out.print("Return Value : ");
	for (int i = 0; i < array.length; i++) {
		System.out.printf("%s ",array[i]);

	}
~~~

* 결과

~~~
Return Value : t o C h a r A r r a y 
~~~

# 40. String toLowerCase()

* 기본 설정된 문자열의 모든 문자를 소문자로 변환합니다.

~~~
String Str = new String("TOLOWERCASE");

System.out.print("Return Value :");
System.out.println(Str.toLowerCase());
~~~

* 결과

~~~
Return Value :tolowercase
~~~

# 41. String toLowerCase(Locale locale)

* 지정된 Locale의 규칙을 사용하여 이 문자열의 모든 문자를 소문자로 변환합니다.

~~~
	String Str1 = new String("TOLOWERCASE");

	System.out.print("Return Value :");
	System.out.println(Str1.toLowerCase(Locale.CANADA));

~~~

* 결과

~~~
Return Value :tolowercase
~~~

# 42. String toString()

* "toString" 메소드는 객체가 가지고 있는 정보나 값들을 문자열로 만들어 리턴하는 메소드.
* toString 사용시 오버로딩을 하지 않으면 객체의 참조정보값이 출력됩니다.

~~~
	public class Student1 {
		String s;
	}
~~~
~~~
	public class Student2 {
		String s;

		public String toString() {
			return String.format(s);
		}
	}
~~~
~~~
	Student1 s1 = new Student1();
	s1.s = "toString";
	System.out.printf("Return Value :%s",s1.toString());
~~~

* 결과

~~~
Return Value1 :main$Student1@15db9742
Return Value2 :toString
~~~

# 43. String toUpperCase()

* 기본 로케일의 규칙을 사용하여 이 문자열의 모든 문자를 대문자로 변환한다.

~~~
	String Str = new String("toUpperCase");

	System.out.print("Return Value :");
	System.out.println(Str.toUpperCase() );
~~~

* 결과

~~~
Return Value :TOUPPERCASE
~~~

# 44. String toUpperCase(Locale locale)

* 직접 선택한 로케일의 규칙을 사용하여 이 문자열의 모든 문자를 대문자로 변환한다.

~~~
	String Str = new String("toUpperCase");

	System.out.print("Return Value :");
	System.out.println(Str.toUpperCase(Locale CANADA) );
~~~

* 결과

~~~
Return Value :TOUPPERCASE
~~~

# 45. String trim()
* 선행 및 후행 공백이 생략된 문자열 사본을 반환합니다.

~~~
	String Str = new String("string trim ");

	System.out.print("Return Value :");
	System.out.println(Str.trim() );
~~~

* 결과

~~~
Return Value :string trim
~~~

# 46. static String valueOf(primitive data type x)

* 전달된 데이터 형식 인수의 문자열 표현을 반환합니다.

~~~
	double d = 4.6;
	boolean b = true;
	char[] arr = {'v', 'a', 'l', 'u', 'e', 'O','f' };

	System.out.println("Return Value :");
	System.out.println(String.valueOf(d));
	System.out.println(String.valueOf(b));
	System.out.println(String.valueOf(arr));
~~~

* 결과

~~~
Return Value :
8.8
true
valueOf
~~~

# 47. contains()

* 문자열 안에 해당 문자열이 포함되어 있는지 검사하는 함수
* 대소문자를 구분한다.

~~~
	String p = "contains a";
	if (p.contains("a")) {
		System.out.println("Return Value :contains");
	} else {
		System.out.println("Return Value :not contains");
	}

~~~

* 결과

~~~
Return Value :contains
~~~