import java.util.Objects;

class Clock {
    private int minutes;

    public Clock(int hour, int minute) {
        this.minutes = hour * 60 + minute;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Clock clock = (Clock) o;
        return this.toString().equals(clock.toString());
    }


    public void add(int minute) {
        this.minutes += minute;

    }

    @Override
    public String toString() {
        int minute = minutes % 60;
        int hourSubtract = 0;
        if (minute < 0){
            hourSubtract --;
            minute = 60 + minute;
        }
        int hour = (24 + (minutes /60) + hourSubtract)% 24;
        if (hour < 0){
            hour = 24 + hour;
        }

        String hourString = "";
        String minuteString = "";
        if (hour < 10) {
            hourString = "0";
        }
        if (minute < 10) {
            minuteString = "0";
        }
        hourString = hourString + hour;
        return hourString + ":" + minuteString + minute;
    }

    private String toTimeString(int number) {
        return "";
    }

}
