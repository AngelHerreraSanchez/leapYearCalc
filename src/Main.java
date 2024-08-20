public class Main {
    public static void main(String[] args) {
        // int result=
        System.out.println(isLeapYear(10));
        System.out.println(isLeapYear(9998));
        System.out.println(isLeapYear(400));
        System.out.println(isLeapYear(800));
        System.out.println(isLeapYear(900));
    }


    public static boolean isLeapYear(int year) {
        if (year >= 1 && year <= 9999) {
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    //    /400
                    return year % 400 == 0;
                } else {
                    return true;
                    //     /100
                }
            } else {
                return false;
                //     /4
            }
        }
        return false;
    }
}


