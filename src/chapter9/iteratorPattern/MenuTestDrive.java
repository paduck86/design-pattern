package chapter9.iteratorPattern;

import java.util.ArrayList;
import java.util.List;

import chapter9.iteratorPattern.iteratee.CafeMenu;
import chapter9.iteratorPattern.iteratee.DinerMenu;
import chapter9.iteratorPattern.iteratee.Menu;
import chapter9.iteratorPattern.iteratee.PancakeHouseMenu;

public class MenuTestDrive {
	public static void main(String[] args) {
		List menus = new ArrayList();
		Menu pancakeHouseMenu = new PancakeHouseMenu();
		Menu dinerMenu = new DinerMenu();
		Menu cafeMenu = new CafeMenu();
		menus.add(pancakeHouseMenu);
		menus.add(dinerMenu);
		menus.add(cafeMenu);
		
		Waitress waitress = new Waitress(menus);
		//Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu, cafeMenu);
		waitress.printMenu();
	}
}
