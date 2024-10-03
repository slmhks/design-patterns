package com.warlearning.builder.pojo;

public class StaticWebSiteCloudSolution extends CloudSolution {
	
	private final boolean domainManagement;
	
	public StaticWebSiteCloudSolution(Builder builder) {
		super(builder);
		this.domainManagement = builder.domainManagement;
	}
	
	public static class Builder extends CloudSolution.Builder<Builder> {
		private boolean domainManagement;
		
		public Builder setDomainManagement(boolean domainManagement) {
			this.domainManagement = domainManagement;
			return this;
		}
		
		@Override
		public Builder self() {
			return this;
		}
		
		public StaticWebSiteCloudSolution build() {
			return new StaticWebSiteCloudSolution(this);
		}
		
	}
	
	public String toString() {
		return new StringBuilder("Dynamic Web Site Solution is composed by: \n")
				.append("server = " + this.server + "\n")
				.append("storage = " + this.storage + "\n")
				.append("domain management = " + this.domainManagement)
				.toString();
	}
}
