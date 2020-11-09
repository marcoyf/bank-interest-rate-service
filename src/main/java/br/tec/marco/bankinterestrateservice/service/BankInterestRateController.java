/**
 * 
 */
package br.tec.marco.bankinterestrateservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

import br.tec.marco.bankinterestrateservice.Configuration;
import br.tec.marco.bankinterestrateservice.bean.BankInterestRate;

/**
 * @author marcoyf
 *
 */
@RestController
public class BankInterestRateController {
	
	@Autowired
	private Configuration configuration;
	
	@GetMapping("/bank-interest-rate/bankName/{bankName}")
	@HystrixCommand(fallbackMethod = "fallbackRetrieveBankInterestRate")
	public BankInterestRate retrieveBankInterestRate(@PathVariable String bankName) {
		
		double interestRate = -1;
		
		switch (bankName) {
		case "BB":
			interestRate = configuration.getBb();
			break;
		case "Santander":
			interestRate = configuration.getSantander();
			break;
		case "Itau":
			interestRate = configuration.getItau();
			break;
		case "Bradesco":
			interestRate = configuration.getBradesco();
			break;
		default:
			throw new RuntimeException("Bank name not available");
		}
		
		return new BankInterestRate(bankName, interestRate);
	}
	
	public BankInterestRate fallbackRetrieveBankInterestRate(@PathVariable String bankName) {
		return new BankInterestRate(bankName, configuration.getDefaultRate());
	}

}
