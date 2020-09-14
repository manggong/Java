package array;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();

		list.add("aaa");
		list.add("bbb");
		list.add("ccc");

		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(str);
			// 배열의 길이는 배열의 길이, 사이즈는 배열의 요소 갯
		}
		
		for(String s : list) {
			System.out.println(s);
		}
	}

}
