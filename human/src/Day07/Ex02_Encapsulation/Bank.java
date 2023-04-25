package Day07.Ex02_Encapsulation;



public class Bank {
	public static void main(String[] args) {
		Encapsulation ec = new Encapsulation(0,"국민은행", "110-439-709069", "한성호");
		
		
		// ec.deposit = 10000000;
		ec.setDeposit(10000000);
		
		
		int money = ec.getDeposit();
		System.out.println(ec);
		System.out.println("계좌 잔액 : " + money);
	}
	

}
