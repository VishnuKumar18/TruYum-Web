/**
 * 
 */
package com.cognizant.truyum.dao;

import java.text.ParseException;
import java.util.List;

import com.cognizant.truyum.model.MenuItem;
import com.cognizant.truyum.util.DateUtil;

/**
 * @author VishnuKumar
 *
 */
public class MenuItemDaoCollectionImplTest {

	// private static MenuItemDaoCollectionImpl menuItemDao;
	/**
	 * @param args
	 * @throws ParseException
	 */
	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		// testGetMenuItemListAdmin();
		// testGetMenuItemListCustomer();
		testModifyMenuItem();

	}

	public static void testGetMenuItemListAdmin() {
		MenuItemDaoCollectionImpl menuItemDaoCollectionImpl = new MenuItemDaoCollectionImpl();
		System.out.println("Menu Item List:\n"
				+ menuItemDaoCollectionImpl.getMenuItemListAdmin());
		List<MenuItem> menuItems = menuItemDaoCollectionImpl
				.getMenuItemListAdmin();
		for (MenuItem menuItem : menuItems) {
			System.out.println(menuItem.toString());
		}

	}

	public static void testGetMenuItemListCustomer() {
		MenuItemDaoCollectionImpl menuItemDaoCollectionImpl = new MenuItemDaoCollectionImpl();
		System.out.println("Menu Item List:"
				+ menuItemDaoCollectionImpl.getMenuItemListCustomer());
		List<MenuItem> menuItems = menuItemDaoCollectionImpl
				.getMenuItemListCustomer();
		for (MenuItem menuItem : menuItems) {
			System.out.println(menuItem.toString());
		}

	}

	public static void testModifyMenuItem() throws ParseException {
		MenuItem menuItem = new MenuItem(2, "Cake", 129.00f, true,
				DateUtil.convertToDate("11/12/2019"), "Main course", false);

		MenuItemDaoCollectionImpl menuItemCollection = new MenuItemDaoCollectionImpl();

		MenuItemDao menuItenDao = menuItemCollection;

		menuItenDao.modifyMenuItem(menuItem);
		System.out.println("Modification details are: "
				+ menuItenDao.getMenuItem((long) 2));

	}

	public void testGetMenuItem() {

	}

}
