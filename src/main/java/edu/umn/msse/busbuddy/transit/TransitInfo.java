package edu.umn.msse.busbuddy.transit;

import java.net.URL;

/**
 * The Class TransitInfo.
 */
public class TransitInfo {

	private String transitAuthorityName;
	
	private URL website;
	
	private byte[] logo;

	public String getTransitAuthorityName() {
		return transitAuthorityName;
	}

	public void setTransitAuthorityName(String transitAuthorityName) {
		this.transitAuthorityName = transitAuthorityName;
	}

	public URL getWebsite() {
		return website;
	}

	public void setWebsite(URL website) {
		this.website = website;
	}

	public byte[] getLogo() {
		return logo;
	}

	public void setLogo(byte[] logo) {
		this.logo = logo;
	}
	
}
