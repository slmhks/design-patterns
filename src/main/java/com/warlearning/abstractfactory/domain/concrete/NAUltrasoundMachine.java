package com.warlearning.abstractfactory.domain.concrete;

import com.warlearning.abstractfactory.domain.UltrasoundMachine;

/**
 * Ultrasound machine for North American markets (USA and Canada)
 */
public class NAUltrasoundMachine implements UltrasoundMachine {
	
	private String radiationStandard;
	private String softwareStandard;
	/**
	 * Electromagnetic Compatibility
	 */
	private String emc;

	@Override
	public void assemble() {
		this.radiationStandard = "IEC 60601-2-37";
		this.softwareStandard = "IEC 62304";
		this.emc = "IEC 60601-1";
		this.assembleUSMachine();
	}
	
	private void assembleUSMachine() {
		System.out.println("Bulding ultrasound machine according to NA standards...");
		System.out.println("Starting...");
		System.out.println("Radiation Standard = " + this.radiationStandard);
		System.out.println("Software Standard = " + this.softwareStandard);
		System.out.println("Electromagnetic Compatibility = " + this.emc);
		System.out.println("\n");
	}

}
