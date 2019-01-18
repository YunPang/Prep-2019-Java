package biz.pss.prep.algorithm1;

import java.util.Arrays;

public class Algorithm2 {
	
	/* 
	 * ②　配列の中のデータを数値として整列し出力してください。
	 * 　　※　sortメソッドを使わないでください。
	 * input:	String inputData[] = {"10","4","1","55","3","8","3","5","0","111"};
	 * output:	 [0, 1, 3, 3, 4, 5, 8, 10, 55, 111]
	 * 
	 **/
	public static void main(String[] arg) {
		String inputData1[] = {"10","4","1","55","3","8","3","5","0","111"};
		int inputData[] = Arrays.stream(inputData1).mapToInt(Integer::parseInt).toArray(); //int形態に変換する
		int q = 0; //臨時??		
		for(int i = 0; i < inputData.length; i++) { //配列の長さだけ反復
			for(int j = i+1; j < inputData.length; j++) {
				if(inputData[i] > inputData[j]) {//前の数値が後の数値より大きい場合、両方を交換する
					q = inputData[i];
					inputData[i] = inputData[j];
					inputData[j] = q;
				}
			}
		} 
		int a;
		System.out.print("[");
		for(a = 0; a < 9; a++) {//配列を羅列する
		System.out.print(inputData[a]+",");
		}
		System.out.print(inputData[a]+"]");
	}
}
