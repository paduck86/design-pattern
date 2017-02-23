package quiz.logisticsCenter_v1.creator;

import quiz.logisticsCenter_v1.products.A;
import quiz.logisticsCenter_v1.products.B;
import quiz.logisticsCenter_v1.products.C;
import quiz.logisticsCenter_v1.products.D;
import quiz.logisticsCenter_v1.products.E;
import quiz.logisticsCenter_v1.products.Item;

public class LogisticsFactory {
	public Item createItem(String itemName) {
		Item item = null;
		/*
		 * reflection ÇØº¸±â
		 */
		if (itemName.equals("A")) {
			item = new A();
		} else if (itemName.equals("B")) {
			item = new B();
		} else if (itemName.equals("C")) {
			item = new C();
		} else if (itemName.equals("D")) {
			item = new D();
		} else if (itemName.equals("E")) {
			item = new E();
		}
		return item;
	}
}
