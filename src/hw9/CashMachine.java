package hw9;

class Deposit {
	private int deposit = 0;

	synchronized public void into(int comeMoney) {
		while (deposit > 3000) {
			System.out.println("存款超過3000,已暫停匯款");
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		deposit += comeMoney;
		System.out.println("存入" + comeMoney + "存款為:" + deposit);
		notify();
	}

	synchronized public void takeOut(int takeMoney) {
		while (deposit < takeMoney) {
			System.out.println("餘額不足!");

			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		deposit -= takeMoney;
		System.out.println("提款金額為:" + takeMoney + "存款為:" + deposit);
		if (deposit < 2000) {
			Thread.yield();
			System.out.println("兒子要餓死了,請物理支援");
			notify();
		}
	}

}

class BusinessIn extends Thread {
	Deposit depo;

	public BusinessIn(Deposit depo) {
		this.depo = depo;
	}
	
	public void run() {
		for (int i = 1; i <= 10; i++) {
			depo.into(2000);// 媽媽每次存入2000
		}
	}

}

class BusinessOut extends Thread {
	Deposit depo;

	public BusinessOut(Deposit depo) {
		this.depo = depo;
	}

	public void run() {
		for (int i = 1; i <= 10; i++) {
			depo.takeOut(1000);// 每次提款1000
		}
		
	}
}

public class CashMachine {

	public static void main(String[] args) {
		Deposit depot = new Deposit();
		BusinessIn bi = new BusinessIn(depot);
		BusinessOut bo = new BusinessOut(depot);
		bo.start();
		bi.start();
		
		try {
			
			bo.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if (!bo.isAlive()) {
			bi.stop();
		}
		System.out.println("兒子長大了,媽媽不用匯錢了");

	}

}
