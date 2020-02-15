package lv.olga.employee;

public class CommissionEmployee extends Employee {

	private static final Double BONUS_MULTIPLIER = 1.5;
	private Double grossComission = 0.0;
	

	public CommissionEmployee(String name, Integer bankAccount, Double grossWage) {
		super(name, bankAccount, grossWage);
		
	}

	@Override
	public Double grossPayment() {
		return grossWage + doCurrentComission() + doCurrentBonus();
	}
	
	private Double doCurrentComission(){
		Double comission = grossComission;
		grossComission = 0.0;
		return comission;
	}
	
	public void giveComission(Double amount){
		grossComission += amount; // equals grossComission = grossComission + amount;
		
		
	}
	@Override
	public void giveBonus(Double percentage) {
		currentBonus += grossWage * (percentage/100.00) * BONUS_MULTIPLIER;
		
	}
	
}
