/**
 * This package contains client layer classes that facilitates the call to other modules.mWe use client layer to
 * communicate and gather information from external system. This layer contains method that can make REST call to other
 * modules and get back appropriate response. Currently, it is only making REST calls, but we can add new classes to
 * make SOAP or any other type of external request. Hence, it abstracts the interaction with outer system and separates
 * that concern to itself.
 */
package edu.umn.msse.busbuddy.alert.client;