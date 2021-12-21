package Solve;

public class EasterSunday {
    public String Easter(int year){
        int a = year%19;
        int b = year/100;
        int c = year%100;
        int d = b/4;
        int e = b%4;
        int g = (8*b+13)/25;
        int h = (19*a+b-d-g+15)%30;
        int j = c/4;
        int k = c%4;
        int m = (a+11*h)/319;
        int r = (2*e+2*j-k-h+m+32)%7;
        int n = (h-m+r+90)/25;
        int p = (h-m+r+n+19)%32;


        String result="";
        switch(n){
            case 1:
                result = "January";
                break;
            case 2:
                result = "February";
                break;
            case 3:
                result = "March";
                break;
            case 4:
                result = "April";
                break;
            case 5:
                result = "May";
                break;
            case 6:
                result = "June";
                break;
            case 7:
                result = "July";
                break;
            case 8:
                result = "August";
                break;
            case 9:
                result = "September";
                break;
            case 10:
                result = "October";
                break;
            case 11:
                result = "November";
                break;
            case 12:
                result = "December";
                break;
        }
        return result + " " + p;

    }

    public static void main(String[] args) {
        EasterSunday e = new EasterSunday();
        String ans = e.Easter(1800);
        System.out.println("The month of Easter sunday is: "+ans);
    }
}
