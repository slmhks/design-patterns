package com.warlearning.prototype.interfaces.implementation;

import java.util.List;
import java.util.stream.Collectors;

import com.warlearning.prototype.domain.DeviceDriver;
import com.warlearning.prototype.domain.Hypervisor;
import com.warlearning.prototype.domain.VirtualDriver;
import com.warlearning.prototype.interfaces.Prototype;

import lombok.Setter;
import lombok.ToString;

@Setter
@ToString
public class VirtualMachine implements Prototype<VirtualMachine> {

	private String os;
	private int cpuCores;
	private int ramSize;
	private int diskSize;
	private List<DeviceDriver> deviceDrivers;
	private List<VirtualDriver> virtualDrivers;
	private Hypervisor hypervisor;

	public VirtualMachine(String os, int cpuCores, int ramSize, int diskSize, List<DeviceDriver> deviceDrivers,
			List<VirtualDriver> virtualDrivers, Hypervisor hypervisor) {
		this.os = os;
		this.cpuCores = cpuCores;
		this.ramSize = ramSize;
		this.diskSize = diskSize;
		this.deviceDrivers = deviceDrivers;
		this.virtualDrivers = virtualDrivers;
		this.hypervisor = hypervisor;
	}

	public VirtualMachine(VirtualMachine vm) {
		this.os = vm.os;
		this.cpuCores = vm.cpuCores;
		this.ramSize = vm.ramSize;
		this.diskSize = vm.diskSize;

		this.deviceDrivers = vm.deviceDrivers.stream().map(DeviceDriver::clone).collect(Collectors.toList());
		this.virtualDrivers = vm.virtualDrivers.stream().map(VirtualDriver::clone).collect(Collectors.toList());
		this.hypervisor = vm.hypervisor;
	}
	
	public VirtualMachine withCpuCores(int cpuCores) {
		this.cpuCores = cpuCores;
		return this;
	}
	
	public VirtualMachine withDiskSize(int diskSize) {
		this.diskSize = diskSize;
		return this;
	}
	

	@Override
	public VirtualMachine clone() {
		return new VirtualMachine(this);
	}

}
