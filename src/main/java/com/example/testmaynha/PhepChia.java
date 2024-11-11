package com.example.testmaynha;

public class PhepChia {
    public static String phepChia(int soA, int soB){
        if(soB == 0){
            return "Không chia được cho số 0";
        }

        if(soA <0 || soA>100){
            return "Số a phải <= 100";
        }


        if(soB == 0){
            return "Không thể chia cho 0";
        }

        int ketQua = soA/soB;

        if(soA % soB == 00 ){
            return String.valueOf(ketQua);
        }else {
            return String.format("%.2f",(double) soA/soB);
        }
    }

    public static void main(String[] args) {
        System.out.println(phepChia(10,2));
    }
}
