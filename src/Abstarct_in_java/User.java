package Abstarct_in_java;

public class User {
    public static void main(String[] args) {
        System.out.println();


        Mobile mobile = new Realme();
        mobile.MakeACall();
        mobile.SendSMS();
        mobile.PlayGames();
        mobile.OpenCamera();
        mobile.PlayMusic();

        System.out.println();

        Mobile mobile1 = new Nokia();
        mobile1.MakeACall();
        mobile1.SendSMS();
        mobile1.PlayMusic();
        mobile1.OpenCamera();
        mobile1.PlayGames();

        System.out.println();
        Nokia nokia = new Nokia();
        nokia.MakeACall();
        nokia.SendSMS();
        nokia.Repair();
        nokia.OpenCamera();
        nokia.PlayMusic();
        nokia.PlayGames();


    }
}
