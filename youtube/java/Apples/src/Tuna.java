
public class Tuna {
	
	private int hour;
	private int minute;
	private int second;
	
	private void setHour(int hour) {
		if (hour >= 0 && hour < 24) {
			this.hour = hour;
		} else {
			this.hour = 0;
		}
	}
	
	private void setMinute(int minute) {
		if (minute >= 0 && minute < 60) {
			this.minute = minute;
		} else {
			this.minute = 0;
		}
	}
	
	private void setSecond(int second) {
		if (second >= 0 && second < 60) {
			this.second = second;
		} else {
			this.second = 0;
		}
	}
	
	public Tuna() {
		this(0, 0, 0);
	}
	
	public Tuna(int hour) {
		this(hour, 0, 0);
	}
	
	public Tuna(int hour, int minute) {
		this(hour, minute, 0);
	}
	
	public Tuna(int hour, int minute, int second) {
		setTime(hour, minute, second);
	}
	
	private void setTime(int hour, int minute, int second) {
		setHour(hour);
		setMinute(minute);
		setSecond(second);
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
