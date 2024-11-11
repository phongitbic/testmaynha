package com.example.testmaynha;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PhepChiaTest {

    PhepChia phepChia;
    String actual, expected;
    @BeforeEach
    void setUp() {
        phepChia = new PhepChia();
    }

    @AfterEach
    void tearDown() {
        phepChia = null;
    }

    @Test
    void testPhepChiaBienDuoiSoALa0() {
        // Kiểm thử biên dưới hợp lệ (a = 0, b = 20)
        actual = PhepChia.phepChia(0, 20);
        expected = "0";
        assertEquals(expected, actual);
    }

    @Test
    void testPhepChiaBienTrenSoBLa100() {
        // Kiểm thử biên trên hợp lệ (a = 100, b = 100)
        actual = PhepChia.phepChia(100, 100);
        expected = "1";
        assertEquals(expected, actual);
    }

    @Test
    void testPhepChiaBienDuoiSoALaAm1() {
        // Kiểm thử cận biên dưới không hợp lệ (a = -1, b = 20)
        actual = PhepChia.phepChia(-1, 20);
        expected = "Số a phải <= 100";
        assertEquals(expected, actual);
    }

    @Test
    void testPhepChiaBienTrenSoALa101() {
        // Kiểm thử cận biên trên không hợp lệ (a = 101, b = 50)
        actual = PhepChia.phepChia(101, 50);
        expected = "Số a phải <= 100";
        assertEquals(expected, actual);
    }

    @Test
    void testPhepChiaTuongDuongHopLeGiaTriTrungBinh() {
        // Kiểm thử tương đương hợp lệ (giá trị trung bình a = 50, b = 50)
        actual = PhepChia.phepChia(50, 50);
        expected = "1";
        assertEquals(expected, actual);
    }

    @Test
    void testPhepChiaTuongDuongKhongHopLeSoA() {
        // Kiểm thử tương đương không hợp lệ (a là giá trị không hợp lệ, ví dụ a = 0)
        actual = PhepChia.phepChia(0, 20);
        expected = "0";
        assertEquals(expected, actual);
    }

    @Test
    void testPhepChiaTuongDuongKhongHopLeSoB() {
        // Kiểm thử tương đương không hợp lệ (b là số 0)
        actual = PhepChia.phepChia(20, 0);
        expected = "Không chia được cho số 0";
        assertEquals(expected, actual);
    }

    @Test
    void testPhepChiaBienDuoiKhongHopLeSoBLa0() {
        // Kiểm thử biên dưới không hợp lệ (a = 10, b = 0)
        actual = PhepChia.phepChia(10, 0);
        expected = "Không chia được cho số 0";
        assertEquals(expected, actual);
    }

    @Test
    void testPhepChiaHopLeGanGioiHanTren() {
        // Kiểm thử giá trị hợp lệ gần giới hạn trên (a = 99, b = 1)
        actual = PhepChia.phepChia(99, 1);
        expected = "99";
        assertEquals(expected, actual);
    }

    @Test
    void testPhepChiaHopLeGiuaKhoang() {
        // Kiểm thử giá trị hợp lệ giữa khoảng (a = 50, b = 5)
        actual = PhepChia.phepChia(50, 5);
        expected = "10";
        assertEquals(expected, actual);
    }

    @Test
    void testPhepChiaHopLeChiaKieuThapPhan() {
        // Kiểm thử phép chia có kết quả là số thập phân (a = 7, b = 3)
        actual = PhepChia.phepChia(7, 3);
        expected = "2.33";
        assertEquals(expected, actual);
    }
}