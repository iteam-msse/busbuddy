package edu.umn.msse.busbuddy.transit;

import java.math.BigDecimal;

/**
 * An immutable Value Object representing the cost, or 'fare,' required to ride
 * a {@link edu.umn.msse.busbuddy.tracking.TransitVehicle TransitVehicle} 
 * on a particular {@link Route}.
 * 
 * Although BusBuddy does not specify explicit rules governing the {@link #regularFare}
 * and the {@link #discountedFare}, each {@link TransitProvider} must publicly state 
 * its Fare policies on a website or other public forum.
 * 
 * @invariant if {@link #discountedFare} exists, {@link #discountedFare} <=  {@link #regularFare}
 */
public class Fare {
	
	/**
	 * The normally applied fare. 
	 */
	private BigDecimal regularFare;
	
	/**
	 * A discounted fare for children, elderly, holidays,
	 * or other adjustment criteria as supplied by the {@link TransitProvider}.
	 * 
	 * This is optional. {@link TransitProvider}s are not required to 
	 * provide discounted Fares for any reason.
	 */
	private BigDecimal discountedFare;
	
	/**
	 * Instantiates a new Fare.
	 *
	 * @param regularFare The Regular Fare
	 */
	public Fare(BigDecimal regularFare){
		this(regularFare, null);
	}
	
	/**
	 * Instantiates a new Fare with both a regular fare and a discounted fare.
	 *
	 * @param regularFare The Regular Fare
	 * @param discountedFare The Discounted Fare
	 * 
	 * @pre \paramname{regularFare} >= 0 
	 * @pre \paramname{discountedFare} >= 0 
	 * @pre \paramname{discountedFare} <= \paramname{discountedFare} 
	 */
	public Fare(BigDecimal regularFare, BigDecimal discountedFare){
		super();
		this.regularFare = regularFare;
		this.discountedFare = discountedFare;
	};

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
	 * @pre \paramname{discountedFare} >= 0 AND \paramname{discountedFare} <= {@link #regularFare}
	 * if {@link #regularFare} exists.
	 */
	public void setDiscountedFare(BigDecimal discountedFare) {
		this.discountedFare = discountedFare;
	}
	
}
