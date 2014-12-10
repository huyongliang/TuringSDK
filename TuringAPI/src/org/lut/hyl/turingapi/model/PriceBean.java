package org.lut.hyl.turingapi.model;

import java.util.ArrayList;
import java.util.List;

public class PriceBean extends BaseBean {
	protected List<PriceBeanItem> list = new ArrayList<PriceBean.PriceBeanItem>();

	public List<PriceBeanItem> getList() {
		return list;
	}

	public void setList(List<PriceBeanItem> list) {
		this.list = list;
	}

	public static class PriceBeanItem {
		public PriceBeanItem() {
			super();
		}

		public PriceBeanItem(String name, String price, String detailurl,
				String icon) {
			super();
			this.name = name;
			this.price = price;
			this.detailurl = detailurl;
			this.icon = icon;
		}

		private String name;

		private String price;

		private String detailurl;

		private String icon;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getPrice() {
			return price;
		}

		public void setPrice(String price) {
			this.price = price;
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
			return "PriceBeanItem [name=" + name + ", price=" + price
					+ ", detailurl=" + detailurl + ", icon=" + icon + "]";
		}

	}

	@Override
	public String toString() {
		return "PriceBean [list=" + list + ", code=" + code + ", text=" + text
				+ "]";
	}

}
