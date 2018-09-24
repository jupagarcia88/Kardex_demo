package kardex.demo.entity;

import java.math.BigDecimal;
import java.util.Date;

public class Kardex {
	
	private Date date;
	private Sale output;
	private Purchase input;
	private BigDecimal balance;
	
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Sale getOutput() {
		return output;
	}
	public void setOutput(Sale output) {
		this.output = output;
	}
	public Purchase getInput() {
		return input;
	}
	public void setInput(Purchase input) {
		this.input = input;
	}
	public BigDecimal getBalance() {
		return balance;
	}
	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}

}
