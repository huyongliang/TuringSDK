package org.lut.hyl.turingapi.model;

import java.util.ArrayList;
import java.util.List;

public class CookbookBean extends BaseBean {
	protected List<CookbookBeanItem> list = new ArrayList<CookbookBean.CookbookBeanItem>();

	public List<CookbookBeanItem> getList() {
		return list;
	}

	public void setList(List<CookbookBeanItem> list) {
		this.list = list;
	}

	public static class CookbookBeanItem {

		public CookbookBeanItem() {
			super();
		}

		public CookbookBeanItem(String name, String info, String detailurl,
				String icon) {
			super();
			this.name = name;
			this.info = info;
			this.detailurl = detailurl;
			this.icon = icon;
		}

		private String name;

		private String info;

		private String detailurl;

		private String icon;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getInfo() {
			return info;
		}

		public void setInfo(String info) {
			this.info = info;
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
			return "CookbookBeanItem [name=" + name + ", info=" + info
					+ ", detailurl=" + detailurl + ", icon=" + icon + "]";
		}

	}

	@Override
	public String toString() {
		return "CookbookBean [list=" + list + ", code=" + code + ", text="
				+ text + "]";
	}

}
