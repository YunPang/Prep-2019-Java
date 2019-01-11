package biz.pss.prep.sample.test;

import static org.junit.Assert.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertSame;

import org.junit.Test;

import biz.pss.prep.sample.Sample1;

public class Sample1Tests {

	private Sample1 sample = new Sample1();

	/**
	 * テストに成功した場合
	 */
	@Test
	public void test1() {
		// 期待値とテスト結果が一致するのかを確認する
		assertSame("Hello PSS", sample.PrintHelloPss(true), "Result : ");
	}

	@Test
	public void test2() {
		// 期待値とテスト結果が一致しないのかを確認する		
		assertNotSame("Hello PSS", sample.PrintHelloPss(false), "Result : ");
	}

	/**
	 * テストに失敗した場合
	 */
	@Test
	public void test3() {
		assertSame("Hello PSS", sample.PrintHelloPss(false), "Result : ");
	}
}
