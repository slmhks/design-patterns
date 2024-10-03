package com.warlearning.builder.pojo;

public class DynamicWebSiteCloudSolution extends CloudSolution {
	
	private String relationalDatabase;
	private String security;
	private String loadBalancer;

	public DynamicWebSiteCloudSolution(Builder builder) {
		super(builder);
		this.relationalDatabase = builder.relationalDatabase;
		this.security = builder.security;
		this.loadBalancer = builder.loadBalancer;
	}
	
	public static class Builder extends CloudSolution.Builder<Builder> {
		private String relationalDatabase;
		private String security;
		private String loadBalancer;
		
		public Builder setRelationDatabase(String relationalDatabase) {
			this.relationalDatabase = relationalDatabase;
			return this;
		}
		
		public Builder setSecurity(String security) {
			this.security = security;
			return this;
		}
		
		public Builder setLoadBalancer(String loadBalancer) {
			this.loadBalancer = loadBalancer;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}
	}
	
	public String toString() {
		return new StringBuilder("Dynamic Web Site Solution is composed by: \n")
				.append("server = " + this.server + "\n")
				.append("storage = " + this.storage + "\n")
				.append("relational database = " + this.relationalDatabase + "\n")
				.append("security = " + this.security + "\n")
				.append("load balancer = " + this.loadBalancer)
				.toString();
	}
}
