package orderManagement;

import java.util.List;

public class LocationValidity {
	boolean valid;
	List<String> errors;
	Order order;
	
	public LocationValidity(Order order, boolean valid, List<String> errors) {
		setOrder(order);
		setValid(valid);
		setErrors(errors);
	}
	
	public boolean isValid() {
		return valid;
	}
	public void setValid(boolean valid) {
		this.valid = valid;
	}
	public List<String> getErrors() {
		return errors;
	}
	public void setErrors(List<String> errors) {
		this.errors = errors;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}
}
