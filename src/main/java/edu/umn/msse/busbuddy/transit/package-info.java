/**
 * The Transit Module is an interface to get {@link Route}/{@link Fare}/{@link Detour} information 
 * from a {@link TransitProvider}.
 * The main module interface, the {@link TransitService}, provides a consistent interface for the
 * application logic to query for this information.
 * 
 * From a design perspective, there are two main tasks performed by the Transit Module:
 * Consuming Transit Information from a {@link TransitProvider}, and Providing Transit Information to
 * {@link edu.umn.msse.busbuddy.user.User User}s.
 */
package edu.umn.msse.busbuddy.transit;