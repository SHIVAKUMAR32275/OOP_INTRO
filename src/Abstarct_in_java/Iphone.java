package Abstarct_in_java;

public abstract class Iphone implements Mobile{

//
//    @Override
//    public void MakeACall() {
//        System.out.println(" Iphone makes a call ");
//    }
//
//    @Override
//    public void SendSMS() {
//        System.out.println(" Iphone sends a message");
//    }
//
    public abstract void MakeACall();
    public abstract void SendSMS();



    public void PlayMusic() {
        System.out.println(" Iphone plays music ");
    }

    public void PlayGames() {
        System.out.println(" Iphone has games ");
    }

    public void OpenCamera() {
        System.out.println(" Iphone has a camera");
    }
}
