package org.lut.hyl.turingapi.model;

public class LinkBean extends BaseBean {
	protected String url;

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String toString() {
		return "LinkJsonObject [url=" + url + ", code=" + code + ", text="
				+ text + "]";
	}

}
