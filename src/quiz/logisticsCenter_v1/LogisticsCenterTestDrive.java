package quiz.logisticsCenter_v1;

import quiz.logisticsCenter_v1.creator.LogisticsCenter;

public class LogisticsCenterTestDrive {
	public static void main(String[] args) {
		/*
		 * 문제점
		 * 1) A * 10 이면?
		 * 2) A*3 + E*1 + A*3 인경우 ?
		 * 3) item name 이 없는경우?
		 */
		LogisticsCenter logisticsCenter = new LogisticsCenter();
		logisticsCenter.packing("A", 3);
		logisticsCenter.packing("B", 1);
		logisticsCenter.packing("A", 2);
		
		logisticsCenter.printBoxes();
	}
}
