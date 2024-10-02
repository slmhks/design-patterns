package com.warlearning.abstractfactory.domain.concrete;

import com.warlearning.abstractfactory.domain.XRayMachine;

public class EUXRayMachine implements XRayMachine {
	
	private String radiationSafetyStandard;
	private String clinicalEvaluationStandard;
	private String softwareAspects;

	@Override
	public void assemble() {
		this.radiationSafetyStandard = "IEC 60601-2-28";
		this.clinicalEvaluationStandard = "ISO 14155";
		this.softwareAspects = "IEC 62304";
		this.asssembleUEXrayMachine();
	}
	
	private void asssembleUEXrayMachine() { 
		System.out.println("Building XRay machine according to EU standards...");
		System.out.println(String.format("Criteria set: Radiation Standard = %s, Clinical Evaluation = %s, Software Aspects = %s", 
				this.radiationSafetyStandard, this.clinicalEvaluationStandard, this.softwareAspects));
		System.out.println("\n");
	}

}
