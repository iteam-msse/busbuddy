package edu.umn.msse.busbuddy.transit;

import java.net.URL;

/**
 * An immutable Value Object describing metadata about a {@link TransitService}.
 * Each {@link TransitService} is required to supply the following information.
 */
public class TransitInfo {

	/**
	 * The name of the governing body of the associated {@link TransitService}.
	 * This can be a Federal, State, or Local governing body responsible for
	 * the transit activity associated with the {@link TransitService}.
	 */
	private String transitAuthorityName;
	
	/**
	 * A resolvable URL reference to the official Transit Authority web site.
	 * Where possible, this site should contain contact info and links to 
	 * policy, specialized transit requirements, or other information.
	 */
	private URL website;
	
	/**
	 * A byte array of the Transit Authority logo, if any. Allowed formats
	 * are unspecified, as image format parsing/conversion is beyond the 
	 * scope of this project.
	 */
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
