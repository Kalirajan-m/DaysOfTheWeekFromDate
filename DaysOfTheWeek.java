package DaysOfTheWeekFromDate;

import java.text.SimpleDateFormat;
import java.util.*;
public class DaysOfTheWeek {

    SimpleDateFormat dformat = new SimpleDateFormat("dd-MM-yyyy");
    private String str;
    private int day;
    private int month;
    private int year;
    static int monthN[] = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private Throwable iae;

    public String DatePatternTotalDigitsLimitChecked(String str) {
        try {
            if (str.length() > 10) {
                throw new IllegalArgumentException(str + " ....Date Pattern Digits is Greater than Default Date pattern Digits");

            } else if (str.length() < 10) {
                throw new IllegalArgumentException(str + " ....Date Pattern Digits is Less Than Default Date pattern Digits");
            } else {
                throw new IllegalArgumentException(str + " ....Date Pattern Digits is Correct Format");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        return str;
    }

    public String DateFormatChecked(String str) {
        try {
            if (str.charAt(2) == '/' || str.charAt(5) == '/') {
                throw new IllegalArgumentException(str + "....You are Using Slash (/) 3rd and 6th Position because, Date Format (DD/MM/YYYY) is Correct Format");

            } else if (str.charAt(2) != '/' || str.charAt(5) != '/') {
                throw new IllegalArgumentException(str + "....Date Format is Not Correct Format,Because You are Using Slash (/) of (DD/MM/YYYY) This Correct Format\n");

            } else {
                throw new IllegalArgumentException(str + "....You Will Check Correct Date Format (DD/MM/YYYY\n");
            }
        } catch (IllegalArgumentException ea) {
            System.out.println(ea.getMessage());
        }
        return str;
    }

    public String DaysValidOrNotValidChecked(String str) {
        try {
            for (int i = 0; i < 2; i++) {
                if (Character.isDigit(str.toCharArray()[i])) {
                    throw new IllegalArgumentException(str + "  ====> Day is Validated , You are using Only Digits Date Format (Day) Value is Correct");
                }
            }
            for (int i = 0; i < 2; i++) {

                if (Character.isLetter(str.toCharArray()[i])) {
                    throw new IllegalArgumentException(str + "  ====> Day is Not validated, You are Not using Digits Date Format is Not Correct Please Using Must Be All Digits\n");
                }

            }
        } catch (IllegalArgumentException iae) {
            System.out.println(iae.getMessage());
        }
        return str;
    }

    public String MonthValidOrNotValidChecked(String str) {
        try {
            for (int i = 3; i < 5; i++) {
                if (Character.isDigit(str.toCharArray()[i])) {
                    throw new IllegalArgumentException(str + "  ====> Month is Validated , You are using Only Digits Date Format (Month) Value is Correct");
                }
            }
            for (int i = 3; i < 5; i++) {

                if (Character.isLetter(str.toCharArray()[i])) {
                    throw new IllegalArgumentException(str + "  ====> Month is Not validated,Please enter Must be all digits \n");
                }

            }
        } catch (IllegalArgumentException iae) {
            System.out.println(iae.getMessage());
        }
        return str;
    }

    public String YearValidOrNotValidChecked(String str) {
        try {
            for (int i = 6; i < 10; i++) {
                if (Character.isDigit(str.toCharArray()[i])) {
                    throw new IllegalArgumentException(str + "  ====> Year is Validated , You are using Only Digits Date Format (Month) Value is Correct");
                }
            }
            for (int i = 6; i < 10; i++) {

                if (Character.isLetter(str.toCharArray()[i])) {
                    throw new IllegalArgumentException(str + "  ====> Year is Not validated,Please enter Must be all digits \n");
                }

            }
        } catch (IllegalArgumentException iae) {
            System.out.println(iae.getMessage());
        }
        return str;
    }

    public boolean DateCheckedLeapOrNotAndCheckedMonthValidation(int days, int months, int years) {
        try {
            if (days < 1 || months < 1 || years < 1 || months > 12) {

                return false;
            }
            else if (months == 2) {
                return days <= 29;
            }
            else {
                return days <= monthN[months];
            }
        }


        catch (IllegalArgumentException ex) {
            System.out.println("Date Checked");
        }

        return false;
    }

    public boolean DisplayedWeekdaysList(int days, int months, int years) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(years, months - 1, days);
        String[] weekdays = new String[]{"saturday", "sunday", "monday", "tuesday", "wednesday", "thursday", "friday"};
        int week = calendar.get(calendar.DAY_OF_WEEK);

        for (int i = 0; i < weekdays.length; i++) {
            try {
                String weekday = weekdays[week % 6];
                days++;
                week++;
                throw new IllegalArgumentException(days-1 + "/" + months + "/" + years + " " + weekday);

            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        return true;
    }

    public String DisplayedHolidaysList(String str) {
        HashMap<String, String> Holiday = new HashMap();

        Holidays.put("01/01/2022", "New Year");
        Holidays.put("14/01/2022", "Pongal");
        Holidays.put("15/01/2022", "Makar Sankranti");
        Holidays.put("26/01/2022", "Republic Day");

        Holidays.put("01/02/2022", "Lunar New Year");
        Holidays.put("05/02/2022", "Vasant Panchami");
        Holidays.put("14/02/2022", "Valentine's Day");

        Holidays.put("01/03/2022", "Shivaratri");
        Holidays.put("17/03/2022", " Holika DaHana");
        Holidays.put("18/03/2022", "Holi");
        Holidays.put("20/03/2022", "March Equinox");

        Holidays.put("02/04/2022", "Chaitra Sukhladi");
        Holidays.put("02/04/2022", " Ugadi");
        Holidays.put("14/04/2022", "Mahavir Jayanti");
        Holidays.put("15/03/2022", "Good Friday");

        Holidays.put("01/05/2022", "Worker's Day");
        Holidays.put("03/05/2022", "Ramzan");
        Holidays.put("18/05/2022", "MOther's Day");
        try {
            for (Map.Entry<String, String> entry : Holidays.entrySet()) {
                String getholiday = entry.getKey();
                if (Objects.equals(getholiday, str)) {
                    throw new IllegalArgumentException(entry.getKey() + " " + entry.getValue() + " Holiday\n");
                }
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        return str;
    }


    static boolean isvalidate(String day, String month, String year, String str, int days, int months, int years) {

        if (days < 1 || months < 1 || years < 1 || months > 12)
            return false;
        else if (months == 2)
            return days <= 29;
        else
            return days <= monthN[months];
    }

    public void daysoftheweek(String day, String month, String year, String str, int days, int months, int years) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(years, months - 1, days);
        String[] weekdays = new String[]{"saturday", "sunday", "monday", "tuesday", "wednesday", "thursday", "friday"};
        int week = calendar.get(calendar.DAY_OF_WEEK);

        String str1 = "";
        str1 += String.valueOf(day);
        str1 += String.valueOf("/");
        str1 += String.valueOf(month);
        str1 += String.valueOf("/");
        str1 += String.valueOf(year);
        HashMap<String, String> Holidays = new HashMap();

        Holidays.put("01/01/2022", "New Year");
        Holidays.put("14/01/2022", "Pongal");
        Holidays.put("15/01/2022", "Makar Sankranti");
        Holidays.put("26/01/2022", "Republic Day");

        Holidays.put("01/02/2022", "Lunar New Year");
        Holidays.put("05/02/2022", "Vasant Panchami");
        Holidays.put("14/02/2022", "Valentine's Day");

        Holidays.put("01/03/2022", "Shivaratri");
        Holidays.put("17/03/2022", " Holika DaHana");
        Holidays.put("18/03/2022", "Holi");
        Holidays.put("20/03/2022", "March Equinox");

        Holidays.put("02/04/2022", "Chaitra Sukhladi");
        Holidays.put("02/04/2022", " Ugadi");
        Holidays.put("14/04/2022", "Mahavir Jayanti");
        Holidays.put("15/03/2022", "Good Friday");

        Holidays.put("01/05/2022", "Worker's Day");
        Holidays.put("03/05/2022", "Ramzan");
        Holidays.put("18/05/2022", "MOther's Day");

        for (int i = 0; i < weekdays.length; i++) {
            String weekday = weekdays[week % 6];

            System.out.println(days + "/" + months + "/" + years + "   " + weekday);
            days++;
            week++;
        }

        for (Map.Entry<String, String> entry : Holidays.entrySet()) {
            String getholiday = entry.getKey();
                if (Objects.equals(getholiday, str1)) {
                    System.out.println(entry.getKey() + " " + entry.getValue() + " Holiday");
                }
        }
    }



    public static void main(String[] args) {


        Scanner date = new Scanner(System.in);
        String str;

        System.out.println("Enter the Date (dd:mm:yyyy):");
        str = date.nextLine();

       if(str.length()>10){
            System.out.println("Date Patttern is Limited");
            System.exit(0);
        }
        if (str.charAt(2) != '/' && str.charAt(5) != '/') {
            System.out.println("....Pattern Matching But Missing colon (/) Please use dd:mm:yyyy format\n");
            System.exit(0);
        }

        for (int i = 0; i < 2; i++) {
            if (Character.isDigit(str.toCharArray()[i])) {
                System.out.println("....Day is Validated \n");
            } else
                System.out.println(str + "  ====> Day is Not validated,Please enter Must be all digits\n");
            break;
        }

        for (int i = 3; i < 5; i++) {
            if (Character.isDigit(str.toCharArray()[i])) {
                System.out.println("....Month is Validated \n");
            } else
                System.out.println(str + "  ====>  Month is Not validated,Please enter Must be all digits\n");
            break;
        }

        for (int i = 6; i < 10; i++) {
            if (Character.isDigit(str.toCharArray()[i])) {
                System.out.println("....Year is Validated\n");
            } else
                System.out.println(str + "  ====>  Year is Not validated,Please enter Must be all digits\n");
            break;
        }


        String strPattern = "^\\d{2}/\\d{2}/\\d{4}$";
        if (str.matches(strPattern)) {
            System.out.println("\t\t\t\t" + str + " =>  Matching Date Format\n");
        } else {
            System.out.println("\t\t\t\t" + str + " =>  Not Matching Date Format\n12");
            System.exit(0);
        }

        String day = String.valueOf(str.substring(0, 2));
        String month = String.valueOf(str.substring(3, 5));
        String year = String.valueOf(str.substring(6, 10));
        int days = Integer.parseInt(str.substring(0, 2));
        int months = Integer.parseInt(str.substring(3, 5));
        int years = Integer.parseInt(str.substring(6, 10));

        if (isvalidate(day, month, year, str,days,months,years)) {
            System.out.println("\t\t\t\t" + str + " =>  This Date is Considered\n");
            DaysOfTheWeek dow = new DaysOfTheWeek();
            dow.daysoftheweek(day, month, year, str,days,months,years);

        } else
            System.out.println("\t\t\t\t" + str + " =>  This Date is Not Considered\n");
        System.exit(0);
    }
}
