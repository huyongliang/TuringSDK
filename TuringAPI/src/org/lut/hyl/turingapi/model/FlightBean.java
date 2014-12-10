package org.lut.hyl.turingapi.model;

import java.util.ArrayList;
import java.util.List;

public class FlightBean extends BaseBean {
	protected List<FlightBeanItem> list = new ArrayList<FlightBean.FlightBeanItem>();

	public List<FlightBeanItem> getList() {
		return list;
	}

	public void setList(List<FlightBeanItem> list) {
		this.list = list;
	}

	public static class FlightBeanItem {
		public FlightBeanItem() {
			super();
		}

		public FlightBeanItem(String flight, String route, String starttime,
				String endtime, String state, String detailurl, String icon) {
			super();
			this.flight = flight;
			this.route = route;
			this.starttime = starttime;
			this.endtime = endtime;
			this.state = state;
			this.detailurl = detailurl;
			this.icon = icon;
		}

		private String flight;

		private String route;

		private String starttime;

		private String endtime;

		private String state;

		private String detailurl;

		private String icon;

		public String getFlight() {
			return flight;
		}

		public void setFlight(String flight) {
			this.flight = flight;
		}

		public String getRoute() {
			return route;
		}

		public void setRoute(String route) {
			this.route = route;
		}

		public String getStarttime() {
			return starttime;
		}

		public void setStarttime(String starttime) {
			this.starttime = starttime;
		}

		public String getEndtime() {
			return endtime;
		}

		public void setEndtime(String endtime) {
			this.endtime = endtime;
		}

		public String getState() {
			return state;
		}

		public void setState(String state) {
			this.state = state;
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
			return "FilghtBeanItem [flight=" + flight + ", route=" + route
					+ ", starttime=" + starttime + ", endtime=" + endtime
					+ ", state=" + state + ", detailurl=" + detailurl
					+ ", icon=" + icon + "]";
		}

	}
}
