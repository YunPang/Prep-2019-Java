package biz.pss.prep.sample;

public class Sample1 {

	/*
	 * 1. 以下のメソッドを作成してください。
	 * 
	 * 出力フラグがtrueの場合 
	 * 	"Hello PSS"を返却する
	 * 
	 * 出力フラグがfalseの場合
	 * 	”挨拶の文言が出力できませんでした。”を返却する
	 * 
	 * 引数：出力フラグ 
	 * 戻り値：文字列
	 **/

    /**
     * 挨拶文言出力処理
     * 
     * @param printFlag 出力フラグ
     * @return true: 挨拶文言, false: エラーメッセージ
     * 
     */
    public String PrintHelloPss(boolean printFlag) {
        if (printFlag) {
            // 出力フラグがtrueの場合
            return "Hello PSS";
        } else {
            // 出力フラグがfalseの場合
            return "挨拶の文言が出力できませんでした。";
        }
    }

}