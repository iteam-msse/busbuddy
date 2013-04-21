package edu.umn.msse.busbuddy.common;

/**
 * This is a utility class to handle secure hashes.
 * 
 * @author jawitthuhn
 * 
 */
public class HashUtility {
	private HashUtility() {
		super();
	}

	/**
	 * This is a method that will take an input string, securely hash it, and return the hashed String using the SHA-512
	 * algorithm.
	 * 
	 * @param input
	 * @return
	 */
	public static String hash(String input) {
		/* TODO : Write a secure hash function instead of using this prototype. */
		return String.valueOf(input.hashCode());
	}
}
