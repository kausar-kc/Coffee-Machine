class Clock {

    int hours = 12;
    int minutes = 0;

    void next() {
        // implement me
        if (minutes < 59) {
            minutes++;
        } else {
            minutes = 0;
            if (hours < 12) {
                hours++;
            } else {
                hours = 1;
            }
        }
    }

    /*public static void main (String[] args) {
        Clock clock = new Clock();
        clock.hours = 12;
        clock.minutes = 59;
        // time is 10:59

        clock.next(); // time is 11:00
        System.out.println(clock.hours + ":" + clock.minutes);
    }*/
}