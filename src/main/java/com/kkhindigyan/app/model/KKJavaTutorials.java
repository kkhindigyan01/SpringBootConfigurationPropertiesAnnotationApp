package com.kkhindigyan.app.model;

import java.util.List;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "myapp")
//@Component
public class KKJavaTutorials {

	private Integer channelId;
	private String channelName;
	private String websiteUrl;
	
	private Company company;
	private List<String> topics;
	private Map<String,String> stockPrices;
	
	public Integer getChannelId() {
		return channelId;
	}
	public void setChannelId(Integer channelId) {
		this.channelId = channelId;
	}
	public String getChannelName() {
		return channelName;
	}
	public void setChannelName(String channelName) {
		this.channelName = channelName;
	}
	public String getWebsiteUrl() {
		return websiteUrl;
	}
	public void setWebsiteUrl(String websiteUrl) {
		this.websiteUrl = websiteUrl;
	}
	
	public Company getCompany() {
		return company;
	}
	public void setCompany(Company company) {
		this.company = company;
	}
	public List<String> getTopics() {
		return topics;
	}
	public void setTopics(List<String> topics) {
		this.topics = topics;
	}
	public Map<String, String> getStockPrices() {
		return stockPrices;
	}
	public void setStockPrices(Map<String, String> stockPrices) {
		this.stockPrices = stockPrices;
	}
	@Override
	public String toString() {
		return "KKJavaTutorials [channelId=" + channelId + ", channelName=" + channelName + ", websiteUrl=" + websiteUrl
				+ ", company=" + company + ", topics=" + topics + ", stockPrices=" + stockPrices + "]";
	}
}
