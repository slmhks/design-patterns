package com.warlearning.abstractfactory.factory.concrete;

import com.warlearning.abstractfactory.domain.TomographyMachine;
import com.warlearning.abstractfactory.domain.UltrasoundMachine;
import com.warlearning.abstractfactory.domain.XRayMachine;
import com.warlearning.abstractfactory.domain.concrete.EUTomographyMachine;
import com.warlearning.abstractfactory.domain.concrete.EUUltrasoundMachine;
import com.warlearning.abstractfactory.domain.concrete.EUXRayMachine;
import com.warlearning.abstractfactory.factory.MachineFactory;

public class EUMachineFactory implements MachineFactory {

	@Override
	public XRayMachine createXrayMachine() {
		return new EUXRayMachine();
	}

	@Override
	public UltrasoundMachine createUltrasoundMachine() {
		return new EUUltrasoundMachine();
	}

	@Override
	public TomographyMachine createTomographyMachine() {
		return new EUTomographyMachine();
	}

}
