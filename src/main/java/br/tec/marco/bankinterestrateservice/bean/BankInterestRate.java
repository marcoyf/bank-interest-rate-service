/**
 * 
 */
package br.tec.marco.bankinterestrateservice.bean;

/**
 * @author marcoyf
 *
 */
public class BankInterestRate {

	private String bankName;
	private double interestRate;
	
	/**
	 * 
	 */
	public BankInterestRate() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param bankName
	 * @param interestRate
	 */
	public BankInterestRate(String bankName, double interestRate) {
		super();
		this.bankName = bankName;
		this.interestRate = interestRate;
	}
	/**
	 * @return the bankName
	 */
	public String getBankName() {
		return bankName;
	}
	/**
	 * @param bankName the bankName to set
	 */
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	/**
	 * @return the interestRate
	 */
	public double getInterestRate() {
		return interestRate;
	}
	/**
	 * @param interestRate the interestRate to set
	 */
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	@Override
	public String toString() {
		return "BankInterestRate [bankName=" + bankName + ", interestRate=" + interestRate + "]";
	}
}
