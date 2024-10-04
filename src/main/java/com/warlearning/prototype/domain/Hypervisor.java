package com.warlearning.prototype.domain;

import com.warlearning.prototype.interfaces.Prototype;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
public class Hypervisor implements Prototype<Hypervisor> {

	private String name;
	private String technology;
	private boolean scheduling;	
	
	@Override
	public Hypervisor clone() {
		return new Hypervisor(name, technology, scheduling);
	}

}
