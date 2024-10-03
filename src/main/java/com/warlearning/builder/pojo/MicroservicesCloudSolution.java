package com.warlearning.builder.pojo;

public class MicroservicesCloudSolution extends CloudSolution {
	
	private final String edgeServer;
	private final String containerTechnology;
	private final boolean orchestration;

	public MicroservicesCloudSolution(Builder builder) {
		super(builder);
		this.edgeServer = builder.edgeServer;
		this.containerTechnology = builder.containerTechnology;
		this.orchestration = builder.orchestration;
	}
	
	public static class Builder extends CloudSolution.Builder<Builder> {
		private String edgeServer;
		private String containerTechnology;
		private boolean orchestration;
		
		public Builder setEdgeServer(String edgeServer) {
			this.edgeServer = edgeServer;
			return this;
		}
		
		public Builder setContainerTechnology(String containerTechnology) {
			this.containerTechnology = containerTechnology;
			return this;
		}
		
		public Builder setOrchestration(boolean orchestration) {
			this.orchestration = orchestration;
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
				.append("edge server = " + this.edgeServer + "\n")
				.append("container technology = " + this.containerTechnology + "\n")
				.append("orchestration = " + this.orchestration)
				.toString();
	}
}
