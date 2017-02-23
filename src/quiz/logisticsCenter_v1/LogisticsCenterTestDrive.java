package quiz.logisticsCenter_v1;

public class LogisticsCenterTestDrive {
	public static void main(String[] args) {
		LogisticsCenter logisticsCenter = new LogisticsCenter();
		logisticsCenter.packing("A", 3);
		logisticsCenter.packing("B", 1);
		logisticsCenter.packing("A", 2);
		
		logisticsCenter.printBoxes();
	}
}
