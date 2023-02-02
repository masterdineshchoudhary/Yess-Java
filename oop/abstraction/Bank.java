package abstraction;

abstract class Bank {
	abstract int getROI();
}

class SBI extends Bank {
	int getROI() {
		return 7;
	}
}

class HDFC extends Bank {
	int getROI() {
		return 8;
	}
}
