package it.polito.med;

public class Appointment {
	private String code;
	private String ssn;
	private String name;
	private String surname;
	private String docId;
	private String date;
	private SlotHours slot;
	private boolean done;
	
	public Appointment(String code, String ssn, String name, String surname, String docId, String date, SlotHours slot) {
		this.code = code;
		this.ssn = ssn;
		this.name = name;
		this.surname = surname;
		this.docId = docId;
		this.date = date;
		this.slot = slot;
		this.done = false;
	}
	public String getCode() {
		return code;
	}
	public String getSsn() {
		return ssn;
	}
	public String getDocId() {
		return docId;
	}
	public String getDate() {
		return date;
	}
	public String getSlot() {
		return slot.toString();
	}
	
	public void setDone() {
		done = true;
	}
	
	public String toString() {
		return slot.getStartString()+"="+ssn;
	}
	
	

}
