package edu.umn.msse.busbuddy.common;

/**
 * This is a utility class to handle message delivery, such as through email or SMS.
 */
public class MessageDeliveryUtility {
	private MessageDeliveryUtility() {
		super();
	}

	/**
	 * This method sends an HTML e-mail.
	 * 
	 * @param to
	 *            recipient address
	 * @param from
	 *            sender address
	 * @param subject
	 *            subject line
	 * @param htmlBody
	 *            HTML body of the message
	 * @throws BusBuddyInternalException
	 *             This exception is thrown if there is an error sending the e-mail.
	 */
	public static void sendEmail(String to, String from, String subject, String htmlBody)
			throws BusBuddyInternalException {
		/* TODO */
	}

	/**
	 * This method sends an SMS text message.
	 * 
	 * @pre The mobile number must be a String consisting entirely of digits.
	 * @param countryCode
	 *            country code for the recipient
	 * @param mobileNumber
	 *            mobile number to send to
	 * @param message
	 *            body of the message to send
	 * @throws BusBuddyInternalException
	 *             This exception is thrown if there is an error sending the message.
	 */
	public static void sendSms(short countryCode, String mobileNumber, String message) {
		/* TODO */
	}
}
