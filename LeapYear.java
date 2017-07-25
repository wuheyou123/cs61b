public class LeapYear{
    
    public static void main(String[] args){
        int year = 20020;
        boolean isleap;
        if(year % 400 ==0 || (year % 4 == 0 && year % 100 != 0)) 
            System.out.println(year+" is a leap year!");
        else System.out.println(year+" is NOT a leap year!");
    }
}
        