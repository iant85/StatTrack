/**
 * 
 */
package com.ian.util;

/**
 * @author Ian
 *
 */
public enum Foot {

	LEFT('L'), RIGHT('R'), BOTH('B');

	private Character foot;

	private Foot(Character foot) {
		this.foot = foot;
	}

	public Character getFoot() {
		return foot;
	}

}
