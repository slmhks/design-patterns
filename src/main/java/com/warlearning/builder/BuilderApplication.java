package com.warlearning.builder;

import com.warlearning.builder.director.CloudSolutionDirector;
import com.warlearning.builder.pojo.DynamicWebSiteCloudSolution;
import com.warlearning.builder.pojo.MicroservicesCloudSolution;
import com.warlearning.builder.pojo.StaticWebSiteCloudSolution;

public class BuilderApplication {

	public static void main(String[] args) {
		// Create the static web site cloud solution
		StaticWebSiteCloudSolution.Builder staticWebSiteBuilder = new StaticWebSiteCloudSolution.Builder();
		CloudSolutionDirector director = new CloudSolutionDirector(staticWebSiteBuilder);

		StaticWebSiteCloudSolution staticWebSite = director.createStaticWebSite();
		System.out.println("Static web site solution created = " + staticWebSite.toString());

		// Create the dynamic web site cloud solution
		DynamicWebSiteCloudSolution.Builder dynamicWebSiteBuilder = new DynamicWebSiteCloudSolution.Builder();
		director = new CloudSolutionDirector(dynamicWebSiteBuilder);

		DynamicWebSiteCloudSolution dynamicWebSite = director.createDynamicStaticWebSite();
		System.out.println("Dynamic web site solution created = " + dynamicWebSite.toString());

		// Create the microservices solution
		MicroservicesCloudSolution.Builder microservicesBuilder = new MicroservicesCloudSolution.Builder();
		director = new CloudSolutionDirector(microservicesBuilder);

		MicroservicesCloudSolution microservices = director.createMicroservices();
		System.out.println("Microservices solution created = " + microservices.toString());

	}

}
