package org.lut.hyl.turingapi.model;

public class TextBean extends BaseBean {

	@Override
	public String toString() {
		return "TextJsonObject [code=" + code + ", text=" + text + "]";
	}

	public TextBean() {
	}

	public TextBean(int code, String text) {
		this.code = code;
		this.text = text;
	}
}
