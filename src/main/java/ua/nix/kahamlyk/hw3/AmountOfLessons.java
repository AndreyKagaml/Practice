package ua.nix.kahamlyk.hw3;

public class AmountOfLessons
{

    public static String LastLessonTime(int lessons){
        int hours = 9, minutes = 0, lesson = 45, break1 = 5, break2 = 15;
        for (int i = 1; i <= lessons; i++) {
            minutes += 45;
            if (i != lessons) {
                // i%2==0 ? minutes+=15 : minutes+=5
                if (i % 2 == 0) minutes += 15;
                else minutes += 5;
            }
            if (minutes >= 60) {
                hours++;
                minutes -= 60;
            }
        }
        String resultOfHours = hours + " ";
        String resultOfMinutes = "" + minutes;
        if (minutes < 10){
             resultOfMinutes = "0" + minutes;
        }

      return resultOfHours + resultOfMinutes;

    }

}
