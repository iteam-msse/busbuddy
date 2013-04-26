/**
 * This package contains service layer classes needed for Alert Module. Service layer handles the workflow and
 * orchestrates the calls to process the request. Depending upon the modules initiating the call, service implementation
 * can invoke factory method in domain layer to create alert and can manipulate its properties. Also service layer can
 * execute the alert using different strategy. Service layer uses factory and strategy patterns to select appropriate
 * service implementation and strategy type.
 */
package edu.umn.msse.busbuddy.alert.service;