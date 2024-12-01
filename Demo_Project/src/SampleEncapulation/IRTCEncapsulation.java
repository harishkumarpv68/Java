package SampleEncapulation;

public class IRTCEncapsulation  {

    private String irtc_username;

    private String irtc_password;

    public String getIrtc_username() {
        return irtc_username;
    }

    public void setIrtc_username(String irtc_username) {
        this.irtc_username = irtc_username;
    }

    public String getIrtc_password() {
        return irtc_password;
    }

    public void setIrtc_password(String irtc_password) {
        this.irtc_password = irtc_password;
    }

    public static void main(String[] args) {

        IRTCEncapsulation a = new IRTCEncapsulation();


        //Set user name and password
        a.setIrtc_username("ABC");
        a.setIrtc_password("Abc@123");

        System.out.println("---------get user name and password------");
        //get user name and password
        System.out.println(a.getIrtc_username());
        System.out.println(a.getIrtc_password());


    }


}
