package bulut.com.week5.enums;

public class Main {
    public static void main(String[] args) {
        System.out.println( WorkLog.SUNDAY + " " + WorkLog.SUNDAY.getWorkTime());
        System.out.println(WorkLog.MONDAY + " " +  WorkLog.MONDAY.getWorkTime());
        System.out.println(WorkLog.TUESDAY +" " + WorkLog.TUESDAY.getWorkTime());
        System.out.println(WorkLog.WEDNESDAY +" " + WorkLog.WEDNESDAY.getWorkTime());
        System.out.println(WorkLog.THURSDAY +" " + WorkLog.THURSDAY.getWorkTime());
        System.out.println(WorkLog.FRIDAY +" " + WorkLog.FRIDAY.getWorkTime());
        System.out.println(WorkLog.SATURDAY +" " + WorkLog.SATURDAY.getWorkTime());
    }
}
