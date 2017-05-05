/**
 * 
 */

/**
 * @author Meenakshi
 *
 */
public enum DiscountType {
	
	CHASE_CC(0.02),
	DISCOVER_CC(0.05),
	CAR_DISCOUNT(0.03);
	
	private double discountPercent;
	
	DiscountType(double discountPercent){
		this.discountPercent = discountPercent;
	}
	
	public double getDiscountPercent(){
		return discountPercent;
	}

}
