/**
 * 
 */
package com.cognizant.truyum.dao;

import java.util.List;

import com.cognizant.truyum.model.MenuItem;

/**
 * @author VishnuKumar
 *
 */
public interface CartDao {

	/**
	 * @param userId
	 * @return
	 * @throws CartEmptyException
	 */
	List<MenuItem> getAllCartItems(Long userId) throws CartEmptyException;

	/**
	 * @param userId
	 * @param menuItemId
	 */
	void removeCartItem(Long userId, Long menuItemId);

	/**
	 * @param userId
	 * @param menuItemId
	 */
	void addCartItem(Long userId, Long menuItemId);

}
