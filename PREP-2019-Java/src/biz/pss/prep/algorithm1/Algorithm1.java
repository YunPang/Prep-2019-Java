package biz.pss.prep.algorithm1;

import java.util.regex.Pattern;

public class Algorithm1 {
	
	/* 
	 * ①　以下のinputを正規表現式を利用してoutputを出力してください。 
	 * input:  String inputData[] = {"1","A",".","2","B",".","3","C",".",""};
	 * output:  123
	 *              ABC
	 *              ...
	 *  ※正規表現式は以下を利用してください。
	 *  String regexNum = "[0-9]";
	 *  String regexStr = "[A-Z]";
	 **/
	public static void main(String[] arg) {
		String regexNum = "[0-9]";
		String regexStr = "[A-Z]";
		String inputData[] = {"1","A",".","2","B",".","3","C",".",""};
		for(int i = 0; i < inputData.length; i++) {
			if(Pattern.matches(regexNum, inputData[i]) == true) {//regexNumへ当たる数値を出力
				System.out.print(inputData[i]);
			}
		}
		System.out.println();//行を改めるための空欄
		for(int i = 0; i < inputData.length; i++) {
			if(Pattern.matches(regexStr, inputData[i]) == true) {//regexStrへ当たる数値を出力
				System.out.print(inputData[i]);
			}
		}
		System.out.println();
		for(int i = 0; i < inputData.length; i++) {
			if((Pattern.matches(regexStr, inputData[i]) || Pattern.matches(regexNum, inputData[i])) == false) {//両条件に当たらない．を出力
				System.out.print(inputData[i]);
			}
		}

	}
}
