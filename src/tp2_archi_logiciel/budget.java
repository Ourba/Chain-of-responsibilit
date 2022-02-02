package tp2_archi_logiciel;

import java.util.Observable;
import java.util.Observer;

public   class budget implements Observer {

	private long budget_global ;
	private long blocked_budget ;
	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		
	}
	
	
	public long getBudget_global() {
		return budget_global;
	}
	/**
	 * @param budget_global the budget_global to set
	 */
	public void setBudget_global(long budget_global) {
		this.budget_global = budget_global;
	}
	/**
	 * @return the blocked_budget
	 */
	public long getBlocked_budget() {
		return blocked_budget;
	}
	/**
	 * @param blocked_budget the blocked_budget to set
	 */
	public void setBlocked_budget(long blocked_budget) {
		this.blocked_budget = blocked_budget;
	}

}
