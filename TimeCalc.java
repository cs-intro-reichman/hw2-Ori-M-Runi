public class TimeCalc {
    public static void main(String[] args) {
        // Replace this comment with your code

        // concocts the first and second digits of hours, than casts it to an int, *Does not necessarily keep the hh format
        int startHours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		// Does the same with the minutes part of the input.
		int startMinutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
        int minutesToAdd = Integer.parseInt(args[1]);

        // Converts the starting hours into minutes (multiplying by 60) and adds the starting minutes and the minutesToAdd to calc the end time minute total
        int totalEndMinutes = (startHours * 60) + startMinutes + minutesToAdd;
        int totalEndHours = totalEndMinutes / 60;
        int endHours = totalEndHours % 24; // Calculates the end time hours between 0-23 (inclusive)
        int endMinutes = totalEndMinutes % 60; // Calculates the end time minutes between 0-59 (inclusive)

        System.out.printf("%02d:%02d%n", endHours, endMinutes);
    }
}
