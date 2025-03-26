package oop.labor05.Model;

public class DateUtil {
    public static boolean leapYear(int year){
        if (year % 4 ==0 && year % 100 != 0 || year % 400 ==0){
            return true;
        }
        return false;
    }
    public static boolean isValidDate(int year,int month,int day){
        if (year >2025 || year <=0){
            return false;
        }
        if(month >12 || month <= 0){
            return false;
        }
        if(leapYear(year) && month == 2 && day == 29){
            return true;
        }
        if( day <=0){
            return false;
        }
        if(month == 2 && day > 28){
            return false;
        }
        if((month == 3 || month == 1 || month == 5 || month == 7 || month == 8 || month ==10 || month==12) && day >31){
            return false;
        }
        if(( month == 4 || month == 6 || month == 9 || month== 11) && day >30){
            return false;
        }
        return true;
    }


}
