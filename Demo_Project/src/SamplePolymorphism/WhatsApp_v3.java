package SamplePolymorphism;

import SamplePolymorphism.WhatsApp_v2;

public class WhatsApp_v3 extends WhatsApp_v2 {

    @Override
    public void Status() {
        System.out.println("Status with text, images and video");
    }

    public static void main(String[] args) {
        WhatsApp_v3 w = new WhatsApp_v3();
        w.Status();

    }
}