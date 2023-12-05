package it.polito.med;

public class SlotHours implements Comparable<SlotHours> {
	private final Time startTime;
	private final Time endTime;
	private String start;
	private String end;
	
	public SlotHours(String start, String end){
		this.startTime  = new Time( start);	
		this.endTime = new Time( end);		
		this.start  = start;	
		this.end = end;	
	}
	
	public SlotHours(String start_end) {
		String[] temp = start_end.split("-");
		this.startTime  = new Time( temp[0]);	
		this.endTime = new Time( temp[1]);		
		this.start  = temp[0];	
		this.end = temp[1];	
	}


	public boolean includes(Time t) {
		return (startTime.compareTo(t) <= 0) && (endTime.compareTo(t) >= 0);
	}
	
	public Time getStart() {
		return startTime;
	}
	public Time getEnd() {
		return endTime;
	}
	public String getStartString() {
		return start;
	}
	
	public int compareTo(SlotHours s) {
		// TODO Auto-generated method stub
		return startTime.compareTo(s.startTime);
	}
	public String toString() {
		return start+"-"+end;
	}


}
