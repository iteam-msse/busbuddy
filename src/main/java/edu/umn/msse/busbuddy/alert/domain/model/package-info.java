/**
 * This package contains entity and aggregate needed for domain layer in Alert Module. Domain layer models are database
 * representation of the alert model. It contains a root aggregate through which we can enforce business rules and get
 * access to information about its child objects. In the future, if we have to add more fields for alert we can probably
 * implement bridge pattern to provide more flexible structure.
 */
package edu.umn.msse.busbuddy.alert.domain.model;