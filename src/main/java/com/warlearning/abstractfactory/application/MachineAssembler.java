package com.warlearning.abstractfactory.application;

import com.warlearning.abstractfactory.domain.TomographyMachine;
import com.warlearning.abstractfactory.domain.UltrasoundMachine;
import com.warlearning.abstractfactory.domain.XRayMachine;
import com.warlearning.abstractfactory.factory.MachineFactory;

public class MachineAssembler {
	
	private XRayMachine xrayMachine;
	private UltrasoundMachine ultrasoundMachine;
	private TomographyMachine tomographyMachine;
	
	public MachineAssembler(MachineFactory factory) {
		this.xrayMachine = factory.createXrayMachine();
		this.ultrasoundMachine = factory.createUltrasoundMachine();
		this.tomographyMachine = factory.createTomographyMachine();
	}
	
	public void assembleMachines() {
		this.xrayMachine.assemble();
		this.ultrasoundMachine.assemble();
		this.tomographyMachine.assemble();
	}
}
