package org.lut.hyl.turingapi.utils;

import java.io.IOException;

import org.apache.http.ParseException;
import org.junit.Test;
import org.lut.hyl.turingapi.model.BaseBean;

public class TuringUtilTest {
	private TuringUtil util;
	{
		this.util = TuringUtil.getInstance(
				"http://www.tuling123.com/openapi/api",
				"5b0a070cead4b60d1cfa71c8d42b71db");
		TuringUtil.setErrorsMap(TuringUtil.defaultErrorMap);
	}

	@Test
	public void testGetJsonString() throws ParseException, IOException {
		System.out.println(this.util.getJsonString("Ŵ������ʳ��"));
		System.out.println(this.util.getJsonString("���ݹ�����1·"));
	}

	@Test
	public void testGetJsonObject() throws Exception {
		BaseBean baseBean = this.util.getJsonObject("Ŵ������ʳ��");
		System.out.println(baseBean);
		baseBean = this.util.getJsonObject("");
//		baseBean = this.util.getJsonObject("���ݵ�����T27");
		System.out.println(baseBean);
	}

}
