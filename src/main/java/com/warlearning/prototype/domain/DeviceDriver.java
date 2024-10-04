package com.warlearning.prototype.domain;

import com.warlearning.prototype.interfaces.Prototype;

import lombok.AllArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Setter
@ToString
public class DeviceDriver implements Prototype<DeviceDriver>{

	private String hardwareAbstractionLayer;
	private String brand;	
	
	@Override
	public DeviceDriver clone() {
		return new DeviceDriver(this.hardwareAbstractionLayer, this.brand);
	}

}
