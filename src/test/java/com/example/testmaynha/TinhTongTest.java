package com.example.testmaynha;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TinhTongTest {
    TinhTong tinhTong;

    String actual, expected;
    @BeforeEach
    void setUp() {
        tinhTong = new TinhTong();
    }

    @AfterEach
    void tearDown() {
        tinhTong = null;
    }

    // Min 0 Max 100

    @Test
    void testTinhTongBienDuoiSoALa0() {
        // Kiểm thử biên dưới hợp lệ (a = 0, b = 20)
        actual = TinhTong.tinhTong("0","20");
        expected = "Tổng = 20";
        assertEquals(expected,actual);
    }


    @Test
    void testTinhTongBienTrenSoBLa100() {
        // Kiểm thử biên trên hợp lệ (a = 0, b = 20)
        actual = TinhTong.tinhTong("0","100");
        expected = "Tổng = 100";
        assertEquals(expected,actual);
    }


    @Test
    void testTinhTongBienDuoiSoALaAm1() {
        // Kiểm thử dưới không hợp lệ (a = -1, b = 20)
        actual = TinhTong.tinhTong("-1","20");
        expected = "Số a phải >=0";
        assertEquals(expected,actual);
    }


    @Test
    void testTinhTongBienTrenSoALa101() {
        // Kiểm thử cận biên trên không hợp lệ (a = 101, b = 50)
        actual = TinhTong.tinhTong("101", "50");
        expected = "Số a phải >=0 và <= 100";
        assertEquals(expected, actual);
    }


    @Test
    void testTinhTongBienTrenSoALa99() {
        // Kiểm thử cận biên trên hợp lệ (a = 99, b = 50)
        actual = TinhTong.tinhTong("99", "50");
        expected = "Tổng = 149";
        assertEquals(expected, actual);
    }


    @Test
    void testTinhTongBienTrenSoALa100() {
        // Kiểm thử biên trên hợp lệ (a = 100, b = 50)
        actual = TinhTong.tinhTong("99", "50");
        expected = "Tổng = 150";
        assertEquals(expected, actual);
    }






}