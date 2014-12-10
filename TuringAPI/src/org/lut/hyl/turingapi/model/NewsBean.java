package org.lut.hyl.turingapi.model;

import java.util.ArrayList;
import java.util.List;

public class NewsBean extends BaseBean {

	protected List<ArticleTulingApi> list = new ArrayList<ArticleTulingApi>();

	public NewsBean() {
		super();
	}

	public List<ArticleTulingApi> getList() {
		return list;
	}

	public void setList(List<ArticleTulingApi> list) {
		this.list = list;
	}

	public static class ArticleTulingApi {
		private String article;
		private String source;
		private String detailurl;
		private String icon;

		public String getArticle() {
			return article;
		}

		public void setArticle(String article) {
			this.article = article;
		}

		public String getSource() {
			return source;
		}

		public void setSource(String source) {
			this.source = source;
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

	}
}
