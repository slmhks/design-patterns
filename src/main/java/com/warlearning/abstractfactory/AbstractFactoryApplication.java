package com.warlearning.abstractfactory;

import com.warlearning.abstractfactory.application.MachineAssembler;
import com.warlearning.abstractfactory.factory.MachineFactory;
import com.warlearning.abstractfactory.factory.concrete.EUMachineFactory;
import com.warlearning.abstractfactory.factory.concrete.NAMachineFactory;

public class AbstractFactoryApplication {
	
	public static void main(String[] args) {
//		String market = args[0];
		String market = "EU";
		MachineFactory factory;
		
		if (market.equals("NA")) {
			factory = new NAMachineFactory();
		} else if (market.equals("EU")) {
			factory = new EUMachineFactory();
		} else {
			throw new RuntimeException("This is an invalid market");
		}
		
		MachineAssembler assembler = new MachineAssembler(factory);
		assembler.assembleMachines();
	}

}
