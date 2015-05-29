/**
 * 
 */
package com.ian.util;

/**
 * @author Ian
 *
 */
public enum PitchPosition {
	
	GOALKEEPER("GK"), 
	LEFT_FULLBACK("LFB"), RIGHT_FULLBACK("RFB"), 
	LEFT_WINGBACK("LWB"), RIGHT_WINGBACK("RWB"),
	CENTREBACK("CB"),
	DEFENSIVE_MIDFIELD("DM"),
	CENTRE_MIDFIELD("CM"),
	LEFT_WINGER("LW"), RIGHT_WINGER("RW"),
	CENTRE_ATTACKING_MIDFIELD("CAM"),
	LEFT_ATTACKING_MIDFIELD("LAM"), RIGHT_ATTACKING_MIDFIELD("RAM"),
	CENTRE_FORWARD("CF"),
	LEFT_FORWARD("LF"), RIGHT_FORWARD("RF"),
	STRIKER("S"); 
	
	private String pitchPosition;
	
	private PitchPosition(String pitchPosition) {
		this.pitchPosition = pitchPosition;
	}

	public String getPitchPosition() {
		return pitchPosition;
	}

}
