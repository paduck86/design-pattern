package quiz.logisticsCenter_v1;

public class LogisticsCenterTestDrive {
	public static void main(String[] args) {
		/*
		 * ������
		 * 1) A * 10 �̸�?
		 * 2) A*3 + E*1 + A*3 �ΰ�� ?
		 */
		LogisticsCenter logisticsCenter = new LogisticsCenter();
		logisticsCenter.packing("A", 3);
		logisticsCenter.packing("B", 1);
		logisticsCenter.packing("A", 2);
		
		logisticsCenter.printBoxes();
	}
}
