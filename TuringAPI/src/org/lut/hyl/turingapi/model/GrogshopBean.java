package org.lut.hyl.turingapi.model;

import java.util.ArrayList;
import java.util.List;

/**
 * æ∆µÍ¿‡
 * 
 * @author HuYongliang
 *
 */
public class GrogshopBean extends BaseBean {
	protected List<GrogshopBeanItem> list = new ArrayList<GrogshopBean.GrogshopBeanItem>();

	public List<GrogshopBeanItem> getList() {
		return list;
	}

	public void setList(List<GrogshopBeanItem> list) {
		this.list = list;
	}

	public static class GrogshopBeanItem {

		public GrogshopBeanItem() {
			super();
		}

		public GrogshopBeanItem(String name, String price, String satisfaction,
				String count, String detailurl, String icon) {
			super();
			this.name = name;
			this.price = price;
			this.satisfaction = satisfaction;
			this.count = count;
			this.detailurl = detailurl;
			this.icon = icon;
		}

		private String name;

		private String price;

		private String satisfaction;

		private String count;

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

		public String getSatisfaction() {
			return satisfaction;
		}

		public void setSatisfaction(String satisfaction) {
			this.satisfaction = satisfaction;
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
			return "GrogshopBeanItem [name=" + name + ", price=" + price
					+ ", satisfaction=" + satisfaction + ", count=" + count
					+ ", detailurl=" + detailurl + ", icon=" + icon + "]";
		}

	}

	@Override
	public String toString() {
		return "GrogshopBean [list=" + list + ", code=" + code + ", text="
				+ text + "]";
	}

}
