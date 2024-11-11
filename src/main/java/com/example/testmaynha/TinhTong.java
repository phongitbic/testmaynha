package com.example.testmaynha;

public class TinhTong {
    public static String tinhTong(String a, String b) {
        if (!checkDuLieu(a)) {
            return "Số a phải là số";
        }

        if (!checkDuLieu(b)) {
            return "Số b phải là số";
        }

        int soA = Integer.parseInt(a);
        int soB = Integer.parseInt(b);

        if (soA < 0 || soA > 100) {
            //
            return "Số a phải >=0 và <= 100";
        }

        if (soB < 0 || soB > 100) {
            return "Số b phải >=0 và <= 100";
        }

        return "Tổng = " + (soA + soB);
    }

    private static boolean checkDuLieu(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(tinhTong("10", "20"));
    }

}
