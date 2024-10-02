package com.warlearning.abstractfactory.domain.concrete;

import com.warlearning.abstractfactory.domain.TomographyMachine;

/**
 * Tommography Scan with North American market specifications
 */
public class NATomographyMachine implements TomographyMachine {
	
	private String radiationStandard;
	/**
	 * Electro Safety Standard
	 */
	private String ess	;
	private String environmentalStandards;

	@Override
	public void assemble() {
		this.radiationStandard = "FDA CFR Title 21";
		this.ess = "UL 60601-1";
		this.environmentalStandards = "RoHS";
		this.printAssembleSpecifications();
	}
	
	private void printAssembleSpecifications() {
		System.out.println("Building tomography machine according to NA standards...");
		System.out.println(String.format("Radiation Standard = %s, EMC = %s, Electro Safey Standards = %s, Environmental Standards = %s", 
				this.radiationStandard, this.ess, this.environmentalStandards));
	}

}
