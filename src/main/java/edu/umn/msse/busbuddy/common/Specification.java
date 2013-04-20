package edu.umn.msse.busbuddy.common;

/**
 * A Generic Specification to be used for chaining business validation 
 * rules together.
 *
 * @param <T> The candidate Type accepted by the Specification.
 */
public interface Specification<T> {
	
	/**
	 * Checks if the given candidate satisfies the specification.
	 *
	 * @param candidate The candidate
	 * @return true, if is satisfied by the candidate
	 */
	public boolean isSatisfiedBy(T candidate);
	
	/**
	 * Returns a Specification representing the 'OR' boolean operation
	 * of the Specifications.
	 *
	 * @param specification The Specification to apply the 'OR' operation to.
	 * @return The 'OR' Specification
	 */
	public Specification<T> or(Specification<T> specification);
	
	/**
	 * Returns a Specification representing the 'AND' boolean operation
	 * of the Specifications.
	 *
	 * @param specification The Specification to apply the 'AND' operation to.
	 * @return The 'AND' Specification
	 */
	public Specification<T> and(Specification<T> specification);

	/**
	 * Returns a Specification representing the 'NOT' boolean operation
	 * of the Specifications.
	 *
	 * @param specification The Specification to apply the 'NOT' operation to.
	 * @return The 'NOT' Specification
	 */
	public Specification<T> not(Specification<T> specification);

}
