package com.warlearning.abstractfactory.domain.concrete;

import com.warlearning.abstractfactory.domain.TomographyMachine;

/**
 * Tommography Scan with European Union specifications
 */
public class EUTomographyMachine implements TomographyMachine {
	
	private String marking;
	/**
	 * Electro Magnetic Compatibility
	 */
	private String emc;
	private String clinicalEvaluation;
	/**
	 * Times the surveillance is done every year
	 */
	private int postSurveillanceFollowUp;

	@Override
	public void assemble() {
		this.marking = "CE Mark";
		this.emc = "IEC 60601-1-2";
		this.clinicalEvaluation = "European 1987 convention";
		this.postSurveillanceFollowUp = 2;
		this.printAssembleSpecifications();
	}
	
	private void printAssembleSpecifications() {
		System.out.println("Building tomography machine according to UE standards...");
		System.out.println(String.format("Marking = %s, EMC = %s, Clinical Evaluation Criteria = %s, Post Surveillance per Year = %s", 
				this.marking, this.emc, this.clinicalEvaluation, this.postSurveillanceFollowUp));
		System.out.println("\n");
	}

}
