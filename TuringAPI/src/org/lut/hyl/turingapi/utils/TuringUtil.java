package org.lut.hyl.turingapi.utils;

import java.io.IOException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

import org.apache.http.HttpResponse;
import org.apache.http.ParseException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.codehaus.jackson.map.ObjectMapper;
import org.json.JSONObject;
import org.lut.hyl.turingapi.model.BaseBean;
import org.lut.hyl.turingapi.model.CookbookBean;
import org.lut.hyl.turingapi.model.DownloadBean;
import org.lut.hyl.turingapi.model.FlightBean;
import org.lut.hyl.turingapi.model.GrogshopBean;
import org.lut.hyl.turingapi.model.LinkBean;
import org.lut.hyl.turingapi.model.NewsBean;
import org.lut.hyl.turingapi.model.PriceBean;
import org.lut.hyl.turingapi.model.TextBean;
import org.lut.hyl.turingapi.model.TrainBean;

/**
 * ͼ��API������
 * 
 * @author HuYongliang
 *
 */
public class TuringUtil {
	public static Map<Integer, String> getErrorsMap() {
		return errorsMap;
	}

	public static TuringUtil getInstance(String address, String key) {
		return new TuringUtil(address, key);
	}

	public static TuringUtil getInstance(String address, String key,
			String encoding) {
		return new TuringUtil(address, key, encoding);
	}

	public static void setErrorsMap(Map<Integer, String> errorsMap) {
		TuringUtil.errorsMap = errorsMap;
	}

	private static Map<Integer, Class<? extends BaseBean>> map = new HashMap<Integer, Class<? extends BaseBean>>();
	private static Map<Integer, String> errorsMap = new HashMap<Integer, String>();
	/**
	 * Ϊ�û��ṩ���쳣������Ĵ���������ѡ
	 */
	public static Map<Integer, String> defaultErrorMap = new HashMap<Integer, String>();

	private String encoding = "UTF-8";

	private String key = "5b0a070cead4b60d1cfa71c8d42b71db";

	private String dest;

	private String url;

	static {
		map.put(100000, TextBean.class);
		map.put(200000, LinkBean.class);
		map.put(302000, NewsBean.class);
		map.put(304000, DownloadBean.class);
		map.put(305000, TrainBean.class);
		map.put(306000, FlightBean.class);
		map.put(308000, CookbookBean.class);
		map.put(309000, GrogshopBean.class);
		map.put(311000, PriceBean.class);

		defaultErrorMap.put(40001, "key�ĳ��ȴ���");
		defaultErrorMap.put(40002, "����Ϊ��");
		defaultErrorMap.put(40003, "�˺��쳣");
		defaultErrorMap.put(40004, "����������");
		defaultErrorMap.put(40005, "�ݲ�֧��");
		defaultErrorMap.put(40006, "������������...");
		defaultErrorMap.put(40007, "���������ݸ�ʽ�쳣");
		defaultErrorMap.put(50000, "default answer");
	}

	private TuringUtil(String address, String key) {
		this.url = address;
		this.key = key;
		this.update();
	}

	private TuringUtil(String address, String key, String encoding) {
		this.url = address;
		this.key = key;
		this.encoding = encoding;
		this.update();
	}

	/**
	 * �����ص�Json�ַ�����װΪ��Ӧ�Ķ��󷵻أ����ʵ�����ǿ��ת��
	 * 
	 * @param msg
	 * @return {@link BaseBean}�ľ�������
	 * @throws Exception
	 */
	public BaseBean getJsonObject(String msg) throws Exception {

		// this.requestUrl += "&info=" + URLEncoder.encode(msg, "UTF-8");
		String s = this.dest + URLEncoder.encode(msg, this.encoding);
		HttpGet request = new HttpGet(s);
		HttpResponse response = HttpClients.createDefault().execute(request);
		String result = "";
		if (response.getStatusLine().getStatusCode() == 200) {
			result = EntityUtils.toString(response.getEntity());
			JSONObject jsonObject = new JSONObject(result);
			int code = jsonObject.getInt("code");
			Class<? extends BaseBean> clazz = map.get(code);
			if (clazz == null) {
				if (errorsMap != null && errorsMap.size() > 0) {
					String r = errorsMap.get(code);
					if (r != null)
						return new TextBean(code, r);
				}
				return new TextBean(code, jsonObject.getString("text"));
			} else {
				BaseBean baseJsonObject = new ObjectMapper().readValue(result,
						map.get(code));
				return baseJsonObject;
			}
		}
		return new TextBean(100000, "��ʱ�޷�����");
	}

	public String getJsonString(String msg) throws ParseException, IOException {
		String s = this.dest + URLEncoder.encode(msg, this.encoding);
		System.out.println(s);
		HttpGet request = new HttpGet(s);
		HttpResponse response = HttpClients.createDefault().execute(request);
		String result = "";
		if (response.getStatusLine().getStatusCode() == 200) {
			result = EntityUtils.toString(response.getEntity());
			return result;
		}
		return null;
	}

	public String getKey() {
		return key;
	}

	public String getUrl() {
		return url;
	}

	public void setKey(String key) {
		this.key = key;
		this.update();
	}

	public void setUrl(String url) {
		this.url = url;
		this.update();
	}

	private void update() {
		this.dest = this.url + "?key=" + this.key + "&info=";
	}

}
