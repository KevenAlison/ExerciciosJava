package services;

import java.util.Calendar;
import java.util.Date;

import entities.Contract;
import entities.Installment;

public class ContractService {
	private OnlinePaymentService onlinePaymentService;

	public ContractService(OnlinePaymentService onlinePaymentService) {
		this.onlinePaymentService = onlinePaymentService;
	}
	
	public void processContract(Contract contract, int months) {
		double parcela = contract.getTotalValues()/months;
		for(int i=1;i<=months;i++) {
			double parcelaComJuros1 = parcela + onlinePaymentService.interest(parcela, i);
			double parcelaFinal = parcelaComJuros1 + onlinePaymentService.paymentFee(parcelaComJuros1);
			
			Date dueDate =  addMonths(contract.getDate(), i);
			contract.getInstallments().add(new Installment(dueDate, parcelaFinal));
		}
	}
	
	private Date addMonths(Date date, int n){
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		
		calendar.add(Calendar.MONTH, n);
		return calendar.getTime();
	}
}
