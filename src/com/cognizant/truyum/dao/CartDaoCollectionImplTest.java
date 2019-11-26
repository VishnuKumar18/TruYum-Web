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
public class CartDaoCollectionImplTest {
	/**
	 * @param args
	 */
	public static void main(String[] args) throws CartEmptyException {
		// TODO Auto-generated method stub

		testAddCartItem();
		testRemoveCartItem();
		testGetAllCartItems();

	}

	static void testAddCartItem() throws CartEmptyException {

		CartDaoCollectionImpl cartDaoCollectionImpl = new CartDaoCollectionImpl();
		CartDao cartDao = cartDaoCollectionImpl;
		cartDao.addCartItem((long) 2, (long) 4);
		cartDao.addCartItem((long) 2, (long) 3);
		List<MenuItem> menuItemList = cartDao.getAllCartItems((long) 2);
		System.out.println("MenuItem list :" + menuItemList);

	}

	static void testGetAllCartItems() throws CartEmptyException {
		CartDaoCollectionImpl cartDaoCollectionImpl = new CartDaoCollectionImpl();
		CartDao cartDao = cartDaoCollectionImpl;

		List<MenuItem> menuItemList = cartDao.getAllCartItems((long) 2);
		System.out.println("MenuItem list :" + menuItemList);
	}

	static void testRemoveCartItem() throws CartEmptyException {
		CartDaoCollectionImpl cartDaoCollectionImpl = new CartDaoCollectionImpl();
		CartDao cartDao = cartDaoCollectionImpl;

		try {
			cartDao.removeCartItem((long) 2, (long) 4);
			List<MenuItem> menuItemList = cartDao.getAllCartItems((long) 2);
			System.out.println("MenuItem list after removed:" + menuItemList);
		} catch (Exception e) {
			throw new CartEmptyException("Cart is empty");
		}

	}

}
