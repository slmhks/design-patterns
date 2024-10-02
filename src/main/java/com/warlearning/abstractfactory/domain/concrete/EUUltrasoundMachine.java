package com.warlearning.abstractfactory.domain.concrete;

import com.warlearning.abstractfactory.domain.UltrasoundMachine;

/**
 * Ultrasound machine for European Union markets
 */
public class EUUltrasoundMachine implements UltrasoundMachine {
	
	/**
	 * Medical Device Regulation
	 */
	private String mdr;
	private String classification;
	private String electricalStandard;

	@Override
	public void assemble() {
		this.mdr = "Regulation (EU) 2017/745";
		this.classification = "Class IIa";
		this.electricalStandard = "IEC 60601-1";
		this.assembleUSMachine();
	}
	
	private void assembleUSMachine() {
		System.out.println("Bulding ultrasound machine according to UE standards...");
		System.out.println("Starting...");
		System.out.println("MDR defined = " + this.mdr);
		System.out.println("Classification set = " + this.classification);
		System.out.println("Electrical Standard confirmed = " + this.electricalStandard);
		System.out.println("\n");
	}

}
