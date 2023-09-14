package array;

import java.util.Arrays;

public class Ex04 {
	public static void main(String[] args) {
		// 배열과 같이 사용하면 좋은 '클래스'가 있다
		boolean[] bos = new boolean[2];
		char[] chs = new char[5];
		int[] its = new int[8];
		double[] dbs = new double[3];
		String[] sts = new String[4];
		// 자료형 = 클래스(boolean, char, int ...) + 참조타입(String ...)
		
		System.out.println("bos = " + Arrays.toString(bos));
		// Arrays. 치고 컨트롤 + 스페이스하면 나옴
		
		
		System.out.println("chs = " + Arrays.toString(chs));
		System.out.println("its = " + Arrays.toString(its));
		System.out.println("dbs = " + Arrays.toString(dbs));
		System.out.println("sts = " + Arrays.toString(sts));
		
		
	}
}
