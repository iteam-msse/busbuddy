/**
 * This package contains controller layer classes for Alert module which takes in REST request from external sources.
 * Controller acts like a facade to most of the modules as the methods are mapped to a certain URI. Other modules can
 * call the REST interface and controller will handle the request. Also, controller handles the session verification
 * depending upon type of encrypted token passed and provides the authorization and authentication. This is achieved by
 * using factory and strategy pattern.
 */
package edu.umn.msse.busbuddy.alert.controller;