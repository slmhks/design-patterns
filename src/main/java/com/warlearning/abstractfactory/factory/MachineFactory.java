package com.warlearning.abstractfactory.factory;

import com.warlearning.abstractfactory.domain.TomographyMachine;
import com.warlearning.abstractfactory.domain.UltrasoundMachine;
import com.warlearning.abstractfactory.domain.XRayMachine;

public interface MachineFactory {
	
	XRayMachine createXrayMachine();
	UltrasoundMachine createUltrasoundMachine();
	TomographyMachine createTomographyMachine();
	

}
