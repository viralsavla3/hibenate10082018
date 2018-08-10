package lti.bank.bean;

public class Account {
	private int actno;
	private String holder;
	private double balance;
	private Transaction txns;
	

	public int getActNo() {
		return actno;
	}

	public void setActNo(int actNo) {
		this.actno = actNo;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public Transaction getTxns() {
		return txns;
	}

	public void setTxns(Transaction txns) {
		this.txns = txns;
	}

}
