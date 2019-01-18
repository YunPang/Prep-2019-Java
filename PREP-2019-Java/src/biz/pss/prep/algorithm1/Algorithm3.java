package biz.pss.prep.algorithm1;

public class Algorithm3 {

	/* 
	 * ③　315各桁の合計を求めて下さい。
	 * 
	 **/
	public static void main(String[] arg) {
		int a = 315; //入力値
		int result = 0;//結果が入る変数
		
		while( a != 0) { //aがゼロになるまで繰り返す。
			result += a%10;//?りの部分を結果に加える。
			a /= 10;//初期値を分ける。
		}
		System.out.println(result);//結果出力
	}
}
