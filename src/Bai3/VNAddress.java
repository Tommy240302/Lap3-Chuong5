package Bai3;

import java.util.regex.Pattern;

public class VNAddress implements AddressValidator{
    public static boolean checkVietnamese(String address){
        return Pattern.matches(".*[àáạảãằắặẳẵèéẹẻẽềếệểễìíịỉĩòóọỏõồốộổỗờớợởỡùúụủũừứựửữỳýỵỷỹđ].*", address);
    }
    @Override
    public boolean isValidAddress(String address) {
        boolean check = false;
        for (int i = 0; i < address.length(); i++) {
            if (checkVietnamese(address)){
                check = true;
                break;
            }
        }
        if (check == false){
            return false;
        }
        return true;
    }
}
