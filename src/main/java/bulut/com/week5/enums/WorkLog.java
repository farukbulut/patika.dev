package bulut.com.week5.enums;

public enum WorkLog {
    SUNDAY(),
    MONDAY("8:00", "19:00"),
    TUESDAY("6.30", "12.50"),
    WEDNESDAY("9:00", "17:00"),
    THURSDAY("9:00", "17:00"),
    FRIDAY("9:00", "17:00"),
    SATURDAY();

    private String workTime;
    WorkLog(String startTime, String endTime) {
        this.workTime = "Başlangıç Saati " + startTime + " Bitiş saati : " + endTime;
    }

    WorkLog(){
        this.workTime = "Bugün tatillll.";
    }


    public String getWorkTime() {
        return workTime;
    }
}
