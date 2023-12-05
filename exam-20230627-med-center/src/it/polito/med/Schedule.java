package it.polito.med;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Schedule {
	
	private Map<String, Integer> numOfSlots = new HashMap<>();
	
	private Map<String, Map<SlotHours, Boolean>> slotTable = new HashMap<>();
	
	public Schedule(String date, String start, String end, int duration) {
				
		assignSlots(date,start,end,duration);
	}

	
	public int getNumOfSlots(String date) {
		return (int)numOfSlots.get(date);
	}
	
	public void assignSlots(String date, String start, String end, int duration) {
	
		Time startTime = new Time(start);
		Time endTime = new Time(end);
		this.numOfSlots.put(date, endTime.compareTo(startTime) / duration);

		Map<SlotHours, Boolean> tempMap = new HashMap<>();
		
		Time s = new Time(start);

		for(int i = 0; i < numOfSlots.get(date); i++) {
			String t = "";
			if(s.getM() >= 60-duration) {
				t = String.format("%02d", s.getH()+1) 
						+ ":"
						+ String.format("%02d", s.getM()-(60-duration));

				tempMap.put(new SlotHours(s.toString(), t), true);
				s = new Time(t);
			}else {
				t = String.format("%02d", s.getH())
						+ ":"
						+String.format("%02d", s.getM()+duration);

				tempMap.put(new SlotHours(s.toString(), t), true);
				s = new Time(t);
			}
			
		}
		slotTable.put(date, tempMap);		
	}
	
	public List<String> getSchedulesPerDay(String day){
		if(slotTable.keySet().contains(day)) {
		return slotTable.get(day).keySet().stream()
				                          .filter(s -> slotTable.get(day).get(s))
				                          .map(SlotHours::toString)
				                          .toList();
		}
		else return null;
	}
	
	public void setSlotState(String date, SlotHours slot, Boolean state) {
		slotTable.get(date).replace(slot, state);
	}
	
	public boolean checkDate(String day) {
		if(slotTable.keySet().contains(day)) return true;
		else return false;
	}
	
	public Map<String, Map<SlotHours, Boolean>> getSlotTable(){
		return slotTable;
	}

}
