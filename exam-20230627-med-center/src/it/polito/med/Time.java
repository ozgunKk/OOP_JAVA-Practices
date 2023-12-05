package it.polito.med;

public class Time implements Comparable<Time> {
	private int h,m;

	Time(String time){
		String[] hm = time.split(":");
		this.h = Integer.parseInt(hm[0]);
		this.m = Integer.parseInt(hm[1]);
	}
	
	Time(int h, int m){
		this.h = h; this.m = m;
	}
	Time(){
	}
	
	public int getH() {
		return h;
	}

	public int getM() {
		return m;
	}

	@Override
	public int compareTo(Time o) {
		// TODO Auto-generated method stub
		return (60*h+m) - (60*o.h+o.m);
	}
	
	public String toString() {
		return String.format("%02d:%02d", h,m);
	}
}
