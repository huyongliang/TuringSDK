package org.lut.hyl.turingapi.model;

import java.util.ArrayList;
import java.util.List;

public class DownloadBean extends BaseBean {
	protected List<DownloadItem> list = new ArrayList<DownloadBean.DownloadItem>();

	public List<DownloadItem> getList() {
		return list;
	}

	public void setList(List<DownloadItem> list) {
		this.list = list;
	}

	public static class DownloadItem {
		private String name;
		private String count;
		private String detailurl;
		private String icon;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getCount() {
			return count;
		}

		public void setCount(String count) {
			this.count = count;
		}

		public String getDetailurl() {
			return detailurl;
		}

		public void setDetailurl(String detailurl) {
			this.detailurl = detailurl;
		}

		public String getIcon() {
			return icon;
		}

		public void setIcon(String icon) {
			this.icon = icon;
		}

		@Override
		public String toString() {
			return "DownloadItem [name=" + name + ", count=" + count
					+ ", detailurl=" + detailurl + ", icon=" + icon + "]";
		}

	}
	
	@Override
	public String toString() {
		return this.code+"->"+this.text+this.list;
	}
}
