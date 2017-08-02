
public class Tuna {
	
	private int hour;
	private int minute;
	private int second;

	public void setTime(int h, int m, int s) {
		hour = (h >= 0 && h < 24) ? h : 0;
		minute = (m >= 0 && m < 60) ? m : 0;
		second = (s >= 0 && s < 60) ? s : 0;
	}
	
	public String getMilitaryTime() {
		
		return String.format("%02d:%02d:%02d", hour, minute, second);
		
	}
	
	public String getTime() {
		int formattedHour;
		if (hour == 0 || hour == 12) {
			formattedHour = 12;
		} else {
			formattedHour = hour % 12;
		}
		
		return String.format("%d:%02d:%02d %s", formattedHour, minute, second, (hour < 12 ? "AM" : "PM"));
		
	}

}
