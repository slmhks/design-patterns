package com.warlearning.abstractfactory.domain.concrete;

import com.warlearning.abstractfactory.domain.XRayMachine;

public class NAXRayMachine implements XRayMachine {
	
	private String fdaClassification;
	private String qualitySystem;
	private String labellingStandard;

	@Override
	public void assemble() {
		this.fdaClassification = "Class II";
		this.qualitySystem = "ISO 13485";
		this.labellingStandard = "21 CFR Part 801";
		this.asssembleNAXrayMachine();
	}
	
	private void asssembleNAXrayMachine() { 
		System.out.println("Building XRay machine according to NA standards...");
		System.out.println(String.format("Criteria set: FDA Classification = %s, Quality System = %s, Labelling Standards = %s", 
				this.fdaClassification, this.qualitySystem, this.labellingStandard));
		System.out.println("\n");
	}

}
