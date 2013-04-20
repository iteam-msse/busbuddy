package edu.umn.msse.busbuddy.user;

class UserRepository {
	User createUser(String username, String password) {
		return new User();
	}
	
	User getUserById(int userId) {
		return new User();
	}
	
	User getUserByUsername(String username) {
		return new User();
	}
	
	User getUserByEmail(String email) {
		return new User();
	}
	
	User getUserByMobile(short countryCode, long mobile) {
		return new User();
	}
	
	void updateUser(User newUserData) {
		
	}
	
	void deleteUser(User userToDelete) {
		
	}
}
