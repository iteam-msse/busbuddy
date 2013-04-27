package edu.umn.msse.busbuddy.transit;

import edu.umn.msse.busbuddy.common.Specification;

/**
 * A Specification Pattern class for validating a {@link Route}. Validation
 * can happen in this class, or business rules can be combined using the 
 * and, or, or not methods of separate {@link common.Specification}s. 
 * 
 * This Specification is necessary because {@link Route}s aren't necessarily created
 * by a controlled Factory, but as a result of parsing of input files via subclasses 
 * of the {@link AbstractFeedParserTemplate}. Because creation of {@link Route}s isn't
 * centralized, it is necessary to centralize the validation rules so that subclasses
 * of {@link AbstractFeedParserTemplate} have access to it.
 * 
 * This Specification must validate the following conditions:
 * -# Each {@link Route} has an non-null {@link Route#routeId routeId}
 * -# Each {@link Route} has an non-blank {@link Route#routeName routeName}
 * -# Each {@link Route} has two or more {@link Route#stops Stops}
 */
public class RouteSpecification implements Specification<Route> {

	/**
	 * Validates the given {@link Route} with the appropriate validation
	 * rules of this Specification.
	 * 
	 * @param candidate The {@link Route} to be validated
	 * @return True if a valid {@link Route}, False if not
	 */
	@Override
	public boolean isSatisfiedBy(Route candidate) {
		throw new UnsupportedOperationException();
	}

	@Override
	public Specification<Route> or(Specification<Route> specification) {
		throw new UnsupportedOperationException();
	}

	@Override
	public Specification<Route> and(Specification<Route> specification) {
		throw new UnsupportedOperationException();
	}

	@Override
	public Specification<Route> not(Specification<Route> specification) {
		throw new UnsupportedOperationException();
	}

}
