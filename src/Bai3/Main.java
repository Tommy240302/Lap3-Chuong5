package Bai3;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AddressValidator usaAddressValidator = new USAAddress();
        boolean isUSAAddressValid = usaAddressValidator.isValidAddress("123 Man Thiện St, New York, USA");
        if (isUSAAddressValid){
            System.out.println("Địa chỉ Mỹ hợp lệ!");
        }
        else {
            System.out.println("Địa chỉ Mỹ không hợp lệ!");
        }
        AddressValidator vnAddressValidator = new VNAddress();
        boolean isVNAddressValid = vnAddressValidator.isValidAddress("98 Man Thiện, quận 9");
        if (isVNAddressValid){
            System.out.println("Địa chỉ VIệt Nam hợp lệ!");
        }
        else {
            System.out.println("Địa chỉ Việt Nam không hợp lệ");
        }
    }
}
