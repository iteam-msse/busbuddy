package edu.umn.msse.busbuddy.transit;

import java.io.InputStream;
import java.io.OutputStream;

public interface ResponseRenderer {
	
	public void render(InputStream inputStream, OutputStream response);

}
