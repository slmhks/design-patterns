package com.warlearning.builder.director;

import com.warlearning.builder.pojo.CloudSolution;
import com.warlearning.builder.pojo.DynamicWebSiteCloudSolution;
import com.warlearning.builder.pojo.MicroservicesCloudSolution;
import com.warlearning.builder.pojo.StaticWebSiteCloudSolution;

public class CloudSolutionDirector {
	
	private CloudSolution.Builder<?> builder;
	
	public CloudSolutionDirector(CloudSolution.Builder<?> builder) {
		this.builder = builder;
	}
	
	public StaticWebSiteCloudSolution createStaticWebSite() {
		if (this.builder instanceof StaticWebSiteCloudSolution.Builder) {
			StaticWebSiteCloudSolution.Builder staticWebSiteBuilder = (StaticWebSiteCloudSolution.Builder) this.builder;
			return new StaticWebSiteCloudSolution(staticWebSiteBuilder
					.setServer("Apache")
					.setStorage("1GB")
					.setDomainManagement(true)
					);
		}
		throw new IllegalArgumentException("The builder is not for static web site solutions.");
	}
	
	public DynamicWebSiteCloudSolution createDynamicStaticWebSite() {
		if (this.builder instanceof DynamicWebSiteCloudSolution.Builder) {
			DynamicWebSiteCloudSolution.Builder dynamicWebSiteBuilder = (DynamicWebSiteCloudSolution.Builder) this.builder;
			return new DynamicWebSiteCloudSolution(dynamicWebSiteBuilder
					.setServer("WebLogic")
					.setStorage("20GB")
					.setSecurity("SSL Certificate")
					.setRelationDatabase("Oracle")
					.setLoadBalancer("Nginx")
					);
		}
		throw new IllegalArgumentException("The builder is not for dynamic web site solutions.");
	}
	
	public MicroservicesCloudSolution createMicroservices() {
		if (this.builder instanceof MicroservicesCloudSolution.Builder) {
			MicroservicesCloudSolution.Builder microservicesBuilder = (MicroservicesCloudSolution.Builder) this.builder;
			return new MicroservicesCloudSolution(microservicesBuilder
					.setServer("WebLogic")
					.setStorage("20GB")
					.setEdgeServer("Spring Cloud Gateway")
					.setContainerTechnology("Docker")
					.setOrchestration(true)
					);
		}
		throw new IllegalArgumentException("The builder is not for dynamic web site solutions.");
	}

}
