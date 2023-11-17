package date;

import com.sun.istack.internal.Nullable;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.*;

public class FilterUtils {

    private static final DateTimeFormatter YYYYMMDD_FORMATTER = DateTimeFormatter.ofPattern("yyyyMMdd");
    private static final DateTimeFormatter YYYY_MM_DD_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    private static final DateTimeFormatter MM_DD_YYYY_FORMATTER = DateTimeFormatter.ofPattern("MM-yyyy-dd");
    private static final DateTimeFormatter ISO_LOCAL_DATE_TIME_FORMATTER = DateTimeFormatter.ISO_LOCAL_DATE_TIME.withZone(ZoneId.systemDefault());

    public static boolean isEqualOrBefore(@Nullable String dateToCheck, @Nullable String fixedDate){
        LocalDate fixedDate1 = getValidLocalDate(Objects.requireNonNull(fixedDate));
        return isEqualOrBefore(dateToCheck, fixedDate1);
    }

    public static boolean isEqualOrBefore(@Nullable String dateToCheck, @Nullable LocalDate fixedDate){
        try{
            LocalDate dateToCheck1 = getValidLocalDate(Objects.requireNonNull(dateToCheck));
            return dateToCheck1.isEqual(fixedDate) || dateToCheck1.isBefore(fixedDate);
        }catch(DateTimeParseException e){
            e.printStackTrace();
            throw e;
        }
    }

    private static LocalDate getValidLocalDate(String date) {
        Objects.requireNonNull(date, "date cannot be null");
        try{
            return LocalDate.parse(date, YYYY_MM_DD_FORMATTER);
        }catch(DateTimeParseException e){
            try{
                LocalDate.parse(date);
            }catch (Exception exp){
                exp.printStackTrace();
            }
            e.printStackTrace();
            throw e;
        }
    }

    public static boolean isEqualOrAfter(@Nullable String dateToCheck, @Nullable String fixedDate){
        LocalDate fixedDate1 = getValidLocalDate(Objects.requireNonNull(fixedDate));
        return isEqualOrAfter(dateToCheck, fixedDate1);
    }

    public static boolean isEqualOrAfter(@Nullable String dateToCheck, @Nullable LocalDate fixedDate){
        try{
            LocalDate dateToCheck1 = getValidLocalDate(Objects.requireNonNull(dateToCheck));
            return dateToCheck1.isEqual(fixedDate) || dateToCheck1.isAfter(fixedDate);
        }catch (DateTimeParseException e){
            e.printStackTrace();
            throw e;
        }
    }

    public static String getMaxDate(String ... dates){
        String maxDate = null;
        try{
            Optional<LocalDate> max = Arrays.stream(dates)
                    .filter(Objects::nonNull)
                    .map(FilterUtils::getValidLocalDate)
                    .max(LocalDate::compareTo);
            if(max.isPresent()){
                maxDate = max.get().toString();
            }
            return maxDate;
        }catch(DateTimeParseException e){
            e.printStackTrace();
            throw e;
        }
    }

    public static String getMinDate(String ... dates){
        String minDate = null;
        try{
            Optional<LocalDate> min = Arrays.stream(dates)
                    .filter(Objects::nonNull)
                    .map(FilterUtils::getValidLocalDate)
                    .min(LocalDate::compareTo);
            if(min.isPresent()){
                minDate = min.get().toString();
            }
            return minDate;
        }catch(DateTimeParseException e){
            e.printStackTrace();
            throw e;
        }
    }

    public static final String convertStringDateToUTC(String date) throws ParseException {
        String pattern = "yyyy-MM-dd'T'HH:mm:ss:SSS'Z'";
        Date newDate = new SimpleDateFormat(pattern).parse(date);

        Calendar currentDate = Calendar.getInstance();
        currentDate.setTime(newDate);
        DateFormat formatter = new SimpleDateFormat(pattern);
        TimeZone tz = TimeZone.getTimeZone("UTC");
        formatter.setTimeZone(tz);

        return formatter.format(currentDate.getTime());
    }

    public static String getMaximumLocalDateTime(List<String> localDateTimeList){
        return null;
    }

    public static void main(String[] args) {

        // isEqualOrBefore
        System.out.println("isEqualOrBefore");
        System.out.println("2023-05-01 2023-04-01 "+FilterUtils.isEqualOrBefore("2023-05-01", "2023-04-01"));
        System.out.println("2023-05-01 2023-04-01 "+FilterUtils.isEqualOrBefore("2023-05-01", "2023-05-01"));
        System.out.println("2023-05-01 2023-04-01 "+FilterUtils.isEqualOrBefore("2022-06-01", "2023-04-01"));

        // isEqualOrAfter
        System.out.println("isEqualOrAfter");
        System.out.println("2023-05-01 2023-04-01 " + FilterUtils.isEqualOrAfter("2023-05-01", "2023-04-01"));
        System.out.println("2023-05-01 2023-05-01 "+FilterUtils.isEqualOrAfter("2023-05-01", "2023-05-01"));
        System.out.println("2022-05-01 2023-04-01 "+FilterUtils.isEqualOrAfter("2022-06-01", "2023-04-01"));

        //getMaxDate
        System.out.println("2023-05-01 2023-04-01 2023-09-01 - maxDateResult " + FilterUtils.getMaxDate("2023-05-01", "2023-04-01", "2023-09-01"));

        //getMinDate
        System.out.println("2023-05-01 2023-04-01 2023-09-01 - mminDateResult " + FilterUtils.getMinDate("2023-05-01", "2023-04-01", "2023-09-01"));


    }
}
