package com.warlearning.prototype;

import java.util.List;

import com.warlearning.prototype.domain.DeviceDriver;
import com.warlearning.prototype.domain.Hypervisor;
import com.warlearning.prototype.domain.VirtualDriver;
import com.warlearning.prototype.interfaces.implementation.VirtualMachine;
import com.warlearning.prototype.registry.VirtualMachineRegistry;

public class PrototypeApplication {

	public static void main(String[] args) {
		// First, let's create some virtual machines

		VirtualMachine windowsMachine = new VirtualMachine("Windows", 10, 16, 50, 
				List.of(
						new DeviceDriver("Storage", "Intel"),
						new DeviceDriver("Graphics", "NVIDIA")
						),
				List.of(
						new VirtualDriver("NIC", "Network card to connect VM to the network"),
						new VirtualDriver("VHD", "Simulated device that stores VM's data")
						), 
				new Hypervisor("VirtualBox", "Intel VTX", true));

		VirtualMachine linuxMachine = new VirtualMachine("Linux", 10, 32, 100, 
				List.of(
						new DeviceDriver("Storage", "AMD"),
						new DeviceDriver("Graphics", "NVIDIA")
						),
				List.of(
						new VirtualDriver("NIC", "Network card to connect VM to the network"),
						new VirtualDriver("Linux Kernel", "Built-in drivers for common devices")
						), 
				new Hypervisor("VM Workstation", "AMD", true));

		VirtualMachineRegistry registry = new VirtualMachineRegistry();
		registry.registerVirtualMachine("Windows", windowsMachine);
		registry.registerVirtualMachine("Linux", linuxMachine);

		// Second, let's clone some machines and adjust some values.
		VirtualMachine clonedWindowsVM = registry.createVirtualMachine("Windows")
				.withCpuCores(24)
				.withDiskSize(100);

		VirtualMachine clonedLinuxVM = registry.createVirtualMachine("Linux")
				.withCpuCores(36)
				.withDiskSize(200);

		// Finally, the cloned machines' details are printed.
		System.out.println(clonedWindowsVM);
		System.out.println(clonedLinuxVM);

	}

}
