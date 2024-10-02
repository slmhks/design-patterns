package com.warlearning.abstractfactory.factory.concrete;

import com.warlearning.abstractfactory.domain.TomographyMachine;
import com.warlearning.abstractfactory.domain.UltrasoundMachine;
import com.warlearning.abstractfactory.domain.XRayMachine;
import com.warlearning.abstractfactory.domain.concrete.NATomographyMachine;
import com.warlearning.abstractfactory.domain.concrete.NAUltrasoundMachine;
import com.warlearning.abstractfactory.domain.concrete.NAXRayMachine;
import com.warlearning.abstractfactory.factory.MachineFactory;

public class NAMachineFactory implements MachineFactory {

	@Override
	public XRayMachine createXrayMachine() {
		return new NAXRayMachine();
	}

	@Override
	public UltrasoundMachine createUltrasoundMachine() {
		return new NAUltrasoundMachine();
	}

	@Override
	public TomographyMachine createTomographyMachine() {
		return new NATomographyMachine();
	}

}
