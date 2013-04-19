package edu.umn.msse.busbuddy.transit;

/**
 * A TransitProvider is a description of a company or organization that is the
 * producer of public transportation services.
 */
public class TransitProvider {

	/** 
	 * A unique identifier that globally identifies this TransitProvider. 
	 * 
	 * The actual identifier type is unspecified and left to implementations.
	 * It may be the same as the {@link #name}, if that is sufficient to provide
	 * uniqueness.
	 */
	private String providerId;
	
	/** 
	 * A text description of the TransitProvider. This is the text that will be
	 * displayed on guides, {@link Route} maps, and advertisements.
	 */
	private String name;

	public String getProviderId() {
		return providerId;
	}

	public void setProviderId(String providerId) {
		this.providerId = providerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
