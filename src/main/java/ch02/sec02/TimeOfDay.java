package ch02.sec02;

public record TimeOfDay(int hour, int minute) {
    public TimeOfDay(int hour, int minute) {
        int extraHours = minute / 60;
        this.hour = (hour + extraHours) % 24;
        this.minute = minute % 60;
    }

    TimeOfDay plusMinutes(int minutes) {
        return new TimeOfDay(this.hour, (this.minute + minutes));
    }

    int minutesFrom (TimeOfDay other) {
        int otherMinutes = other.hour * 60 + other.minute;
        int thisMinutes = this.hour * 60 + this.minute;
        return Math.abs(thisMinutes - otherMinutes);
    }


    @Override
    public String toString() {
        return "TimeOfDay{" +
                "hour=" + hour +
                ", minute=" + minute +
                '}';
    }
}
