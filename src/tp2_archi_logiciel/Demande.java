package tp2_archi_logiciel;

import java.util.Observable;

@SuppressWarnings("deprecation")
public  class Demande extends Observable {

	private long amount;
	private String etat ;
	/**
	 * @return the amount
	 */
	public long getAmount() {
		return amount;
	}
	/**
	 * @param amount the amount to set
	 */
	public void setAmount(long amount) {
		this.amount = amount;
	}
	/**
	 * @return the etat
	 */
	public String getEtat() {
		return etat;
	}
	/**
	 * @param etat the etat to set
	 */
	public void setEtat(String etat) {
		this.etat = etat;
	}
}
