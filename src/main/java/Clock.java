import java.util.Objects;

class Clock {
    private int hour;
    private int minute;

    public Clock(int hour, int minute) {
        this.hour = hour;
        this.minute = minute;

        int numberOfHours = minute / 60;
        this.hour += numberOfHours;
        if (this.hour < 0) {
            this.hour = 24 + this.hour % 24;
        }
        if (this.hour > 24) {
            this.hour = this.hour - 24;
        }
        this.minute = minute % 60;

        if (this.minute < 0) {
            this.hour--;
            if (this.hour < 0) {
                this.hour = 24 + this.hour % 24;
            }
            this.minute += 60;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Clock clock = (Clock) o;
        return this.toString().equals(clock.toString());
    }


    public void add(int minute) {
        int numberOfHours = minute / 60;
        this.hour += numberOfHours;
        this.minute += minute % 60;
        if (this.minute < 0) {
            this.hour--;
            this.minute = 60 + this.minute;
        }
        if (this.hour < 0) {
            this.hour += 24;
        }
        if (this.minute > 60) {
            this.hour += 1;
            if (this.hour > 24) {
                this.hour -= 24;
            }
            this.minute -= 60;
        }

    }

    @Override
    public String toString() {
        int hourRemainder = hour % 24;
        String hourString = "";
        String minuteString = "";
        if (hourRemainder < 10) {
            hourString = "0";
        }
        if (minute < 10) {
            minuteString = "0";
        }
        hourString = hourString + hourRemainder;
        return hourString + ":" + minuteString + minute;
    }

    private String toTimeString(int number) {
        return "";
    }

}
