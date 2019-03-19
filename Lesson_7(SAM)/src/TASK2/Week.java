package TASK2;

public enum Week {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;

    public String getAbreviation() {
        switch (this) {
            case MONDAY:
                return "Mon";
            case TUESDAY:
                return "Tue";
            case WEDNESDAY:
                return "Wed";
            case THURSDAY:
                return "Thu";
            case FRIDAY:
                return "Fri";
            case SATURDAY:
                return "Sat";
            case SUNDAY:
                return "Sun";
            default:
                return "";
        }
    }

    public String getText() {
        return this.name();
    }

    public boolean isWeekend() {
        if ((this.ordinal() >= 5) && (this.ordinal() <= 6))
            return true;
        else return false;
    }
}
