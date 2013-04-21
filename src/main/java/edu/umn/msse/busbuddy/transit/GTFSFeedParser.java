package edu.umn.msse.busbuddy.transit;

import java.io.InputStream;
import java.util.Set;

/**
 * A {@link AbstractFeedParserTemplate} implementation designed to parse
 * <a href="https://developers.google.com/transit/gtfs/">GTFS</a> format ZIP files
 * into {@link Route}s.
 */
public class GTFSFeedParser extends AbstractFeedParserTemplate {

	/**
	 * Parse the <a href="https://developers.google.com/transit/gtfs/">GTFS</a> 
	 * format ZIP files into {@link Route}s.
	 * 
	 * @see AbstractFeedParserTemplate#parseFeed(InputStream)
	 */
	@Override
	protected Set<Route> parseFeed(InputStream feed) {
		throw new UnsupportedOperationException();
	}

}
