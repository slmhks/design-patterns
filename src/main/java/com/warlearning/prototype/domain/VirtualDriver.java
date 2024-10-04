package com.warlearning.prototype.domain;

import com.warlearning.prototype.interfaces.Prototype;

import lombok.AllArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Setter
@ToString
public class VirtualDriver implements Prototype<VirtualDriver> {

	private String simulatedDevice;
	private String purpose;		

	@Override
	public VirtualDriver clone() {
		return new VirtualDriver(simulatedDevice, purpose);
	}

}
