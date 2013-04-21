package edu.umn.msse.busbuddy.transit;

import java.math.BigDecimal;

import edu.umn.msse.busbuddy.tracking.TransitVehicle;

/**
 * An immutable Value Object representing the cost, or 'fare,' required to ride
 * a {@link TransitVehicle} on a particular {@link Route}.
 */
public class Fare {
	
	/**
	 * The normally applied fare.
	 */
	private BigDecimal regularFare;
	
	/**
	 * A discounted fare for children, elderly, or other adjustment criteria as
	 * supplied by the {@link TransitProvider}.
	 */
	private BigDecimal discountedFare;

	public BigDecimal getRegularFare() {
		return regularFare;
	}

	/**
	 * @pre \paramname{regularFare} >= 0
	 */
	public void setRegularFare(BigDecimal regularFare) {
		this.regularFare = regularFare;
	}

	public BigDecimal getDiscountedFare() {
		return discountedFare;
	}

	/**
	 * @pre \discountedFare{regularFare} >= 0
	 */
	public void setDiscountedFare(BigDecimal discountedFare) {
		this.discountedFare = discountedFare;
	}
	
}
