package com.warlearning.prototype.registry;

import java.util.HashMap;
import java.util.Map;

import com.warlearning.prototype.interfaces.implementation.VirtualMachine;

public class VirtualMachineRegistry {
	
	private Map<String, VirtualMachine> registry = new HashMap<String, VirtualMachine>();
	
	public void registerVirtualMachine(String key, VirtualMachine vm) {
		if (!this.registry.containsKey(key)) {
			this.registry.put(key, vm);	
		}
	}
	
	public VirtualMachine createVirtualMachine(String key) {
		VirtualMachine vm = this.registry.get(key);
		if (vm != null) {
			return vm.clone();
		}
		throw new IllegalArgumentException(String.format("There is no virtual machine template registered with the key %s.", vm));
	}

}
