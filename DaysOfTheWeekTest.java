package DaysOfTheWeekFromDate;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class DaysOfTheWeekTest {

    @BeforeClass
    public static void yearValidOrNotValidChecked() {
        DaysOfTheWeek yearvalid = new DaysOfTheWeek();
        System.out.println("------ Year Valid or Not Valid ------\n");
        String str4 = yearvalid.YearValidOrNotValidChecked("10/10/2022");//Return a String 
        assertEquals("10/10/2022", str4);

        String str6 = yearvalid.YearValidOrNotValidChecked("15/12/yyyy");
        assertNotEquals("12/10/2022", str6);

    }

    @BeforeClass
    public static void monthValidOrNotValidChecked() {
        DaysOfTheWeek monthvalid = new DaysOfTheWeek();
        System.out.println("------ Month Valid or Not Valid ------\n");
        String str4 = monthvalid.MonthValidOrNotValidChecked("10/10/2022");
        assertEquals("10/10/2022", str4);

        String str6 = monthvalid.MonthValidOrNotValidChecked("15/mm/2022");//return a string
        assertNotEquals("12/10/2022", str6);


    }

    @BeforeClass
    public static void daysValidOrNotValidChecked() {
        DaysOfTheWeek dayvalid = new DaysOfTheWeek();
        System.out.println("------ Day Valid or Not Valid ------\n");
        String str4 = dayvalid.DaysValidOrNotValidChecked("10/10/2022");
        assertEquals("10/10/2022", str4);

        String str5 = dayvalid.DaysValidOrNotValidChecked("dd/10/2022");
        assertNotEquals("12/10/2022", str5);


    }

    @Test
    public void dateCheckedLeapOrNotAndCheckedMonthValidation() {
        DaysOfTheWeek datecheck = new DaysOfTheWeek();
        System.out.println("------ Date Checked Leap or Not Leap Year and Month Date Validation------\n");
        boolean date = datecheck.DateCheckedLeapOrNotAndCheckedMonthValidation(31, 01, 2022);
        String str = Boolean.toString(date);
        System.out.println(str + "   Date Checked is Validated");
        assertEquals("true", str);

        boolean date1 = datecheck.DateCheckedLeapOrNotAndCheckedMonthValidation(32, 01, 2022);
        String str1 = Boolean.toString(date1);
        System.out.println(str1 + "   Date is Not Validated");
        assertNotEquals("true", str1);

        boolean date2 = datecheck.DateCheckedLeapOrNotAndCheckedMonthValidation(31, 04, 2022);
        String str2 = Boolean.toString(date2);
        System.out.println(str1 + "   Date is Not Validated\n");
        assertNotEquals("true", str2);
    }

    @Test
    public void dateFormatChecked() {
        DaysOfTheWeek datefmt = new DaysOfTheWeek();
        System.out.println("\n------ Date Format Match or Not Match (DD/MM/YYYY) Format Checked ------ \n");
        String str3 = datefmt.DateFormatChecked("10/01/2022");
        assertEquals("10/01/2022", str3);

        String str4 = datefmt.DateFormatChecked("10:01;2022");
        assertNotEquals("10/01/2022", str4);

    }

    @Test
    public void datePatternTotalDigitsLimitChecked() {
        DaysOfTheWeek datepat = new DaysOfTheWeek();
        System.out.println("------ Date Pattern Total Limit Checked ------\n");
        String str1 = datepat.DatePatternTotalDigitsLimitChecked("10/01/2022");
        assertEquals("10/01/2022", str1);

        String strr = datepat.DatePatternTotalDigitsLimitChecked("10/01/20");
        assertNotEquals("10/01/2022", strr);

        String str2 = datepat.DatePatternTotalDigitsLimitChecked("10/01/2022342");
        assertNotEquals("10/01/2022", str2);
    }

    @AfterClass
    public static void displayedHolidaysList() {
        DaysOfTheWeek holidaylist= new DaysOfTheWeek();
        System.out.println("\n------ Holidays Listed  ------ \n");
        String str = holidaylist.DisplayedHolidaysList("01/05/2022");
        assertEquals("01/05/2022", str);
    }

    @AfterClass
    public static void displayedWeekdaysList() {
        DaysOfTheWeek displayweekday = new DaysOfTheWeek();
        System.out.println("------ WeekDays List ------\n");
        boolean date = displayweekday.DisplayedWeekdaysList(07, 06, 2022);
        String str = Boolean.toString(date);
        assertEquals("true", str);

    }

}
