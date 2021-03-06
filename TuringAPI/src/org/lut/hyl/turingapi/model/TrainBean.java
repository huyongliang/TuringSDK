package org.lut.hyl.turingapi.model;

import java.util.ArrayList;
import java.util.List;

public class TrainBean extends BaseBean {
	protected List<TrainBeanItem> list = new ArrayList<TrainBean.TrainBeanItem>();

	public List<TrainBeanItem> getList() {
		return list;
	}

	public void setList(List<TrainBeanItem> list) {
		this.list = list;
	}

	public static class TrainBeanItem {
		public TrainBeanItem() {
			super();
		}

		public TrainBeanItem(String trainnum, String start, String terminal,
				String starttime, String endtime, String detailurl, String icon) {
			super();
			this.trainnum = trainnum;
			this.start = start;
			this.terminal = terminal;
			this.starttime = starttime;
			this.endtime = endtime;
			this.detailurl = detailurl;
			this.icon = icon;
		}

		private String trainnum;

		private String start;

		private String terminal;

		private String starttime;

		private String endtime;

		private String detailurl;

		private String icon;

		public String getTrainnum() {
			return trainnum;
		}

		public void setTrainnum(String trainnum) {
			this.trainnum = trainnum;
		}

		public String getStart() {
			return start;
		}

		public void setStart(String start) {
			this.start = start;
		}

		public String getTerminal() {
			return terminal;
		}

		public void setTerminal(String terminal) {
			this.terminal = terminal;
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
			return "TrainBeanItem [trainnum=" + trainnum + ", start=" + start
					+ ", terminal=" + terminal + ", starttime=" + starttime
					+ ", endtime=" + endtime + ", detailurl=" + detailurl
					+ ", icon=" + icon + "]";
		}

	}

	@Override
	public String toString() {
		return "TrainBean [list=" + list + ", code=" + code + ", text=" + text
				+ "]";
	}

}
