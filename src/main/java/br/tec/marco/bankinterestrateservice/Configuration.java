/**
 * 
 */
package br.tec.marco.bankinterestrateservice;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author marcoyf
 *
 */
@Component
@ConfigurationProperties("bank-interest-rate-service")
public class Configuration {
	
	private double bb;
	private double santander;
	private double itau;
	private double bradesco;
	private double defaultRate;
	
	/**
	 * @return the bb
	 */
	public double getBb() {
		return bb;
	}
	/**
	 * @param bb the bb to set
	 */
	public void setBb(double bb) {
		this.bb = bb;
	}
	/**
	 * @return the santander
	 */
	public double getSantander() {
		return santander;
	}
	/**
	 * @param santander the santander to set
	 */
	public void setSantander(double santander) {
		this.santander = santander;
	}
	/**
	 * @return the itau
	 */
	public double getItau() {
		return itau;
	}
	/**
	 * @param itau the itau to set
	 */
	public void setItau(double itau) {
		this.itau = itau;
	}
	/**
	 * @return the bradesco
	 */
	public double getBradesco() {
		return bradesco;
	}
	/**
	 * @param bradesco the bradesco to set
	 */
	public void setBradesco(double bradesco) {
		this.bradesco = bradesco;
	}
	/**
	 * @return the defaultRate
	 */
	public double getDefaultRate() {
		return defaultRate;
	}
	/**
	 * @param defaultRate the defaultRate to set
	 */
	public void setDefaultRate(double defaultRate) {
		this.defaultRate = defaultRate;
	}

}
