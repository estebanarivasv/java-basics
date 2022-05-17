package com.erivas.topic2OOP.Enumerations;


/*
Enums are constants and are immutable as such.
- They can however define fields, that can have state.
    - If you have fields in your enums, you should make them final and provide getters only.
    - If the fields are not immutable themselves, provide defensive copies
* */
public enum Days {
    MONDAY (1),
    TUESDAY (2),
    WEDNESDAY (3),
    THURSDAY (4),
    FRIDAY (5),
    SATURDAY (6),
    SUNDAY (7);

    private int position;

    Days(int position) {
        this.position = position;
    }

    public int getPosition() {
        return position;
    }

    public static Days getDayName(int position) {
        Days days[] = Days.values();
        return days[position - 1];
    }
}
