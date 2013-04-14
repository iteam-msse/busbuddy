package edu.umn.msse.busbuddy.transit;

import java.io.InputStream;
import java.io.OutputStream;

public class JSONResponseRenderer implements ResponseRenderer {

	public void render(InputStream inputStream, OutputStream response) {
		throw new UnsupportedOperationException();
	}

	protected InputStream toJson(InputStream inputStream){
		throw new UnsupportedOperationException();
	}
}
