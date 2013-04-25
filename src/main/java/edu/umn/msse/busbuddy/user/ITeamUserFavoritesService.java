package edu.umn.msse.busbuddy.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import edu.umn.msse.busbuddy.common.BusBuddyBadRequestException;
import edu.umn.msse.busbuddy.common.BusBuddyException;

/**
 * This is the iTeam's implementation of {@link UserFavoritesService}.
 */
@Controller
public class ITeamUserFavoritesService implements UserFavoritesService {
	@Autowired
	protected ITeamUserLoginService userLoginService;
	
	@Autowired
	protected UserFavoritesRepository userFavoritesRepository;

	/**
	 * @see UserFavoritesService.readFavorites
	 */
	@Override
	public UserFavoritesList readFavorites(String sessionToken) throws BusBuddyException {
		if (sessionToken == null || sessionToken.length() == 0)  {
			throw new BusBuddyBadRequestException();
		}
		User user = this.userLoginService.getUser(sessionToken);
		return this.userFavoritesRepository.getFavorites(user.getUserId());
	}

	/**
	 * @see UserFavoritesService.saveFavorites
	 */
	@Override
	public void saveFavorites(String sessionToken, UserFavoritesList favorites) throws BusBuddyException {
		if (sessionToken == null || sessionToken.length() == 0)  {
			throw new BusBuddyBadRequestException();
		}
		User user = this.userLoginService.getUser(sessionToken);
		
		if (user.getUserId() != favorites.getUserId())  {
			throw new BusBuddyBadRequestException();
		}
		
		this.userFavoritesRepository.updateFavorites(user.getUserId(), favorites);
	}

}
