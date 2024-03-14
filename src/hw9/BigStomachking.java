package hw9;

class BigStomachking extends Thread {

	private String name;

	public BigStomachking(String name) {
		this.name = name;
	}

	public void run() {
		int rice = 1;
		

		while (rice <= 10) {

			try {
				System.out.println(name + "正在吃第" + rice + "碗飯了");
				
				Thread.sleep((int)(Math.random()*2500)+500);
				rice+=1;
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
		System.out.println(name + "吃完了");

	}
	
	public static void main(String[] args) {
		BigStomachking bs=new BigStomachking("詹姆士");
		BigStomachking bs2=new BigStomachking("饅頭人");
		bs.start();
		bs2.start();
	}

}
