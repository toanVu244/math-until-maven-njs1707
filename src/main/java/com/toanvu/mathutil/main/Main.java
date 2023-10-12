/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.toanvu.mathutil.main;
import com.toanvu.mathutil.core.MathUtility;

/**
 *
 * @author ToanVu
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    
    // dân dev viết code thì phải có trách nhiệm test code của mình
    // làm sao để test code của chính mình -> 3 cách
    // 1. in ra màn hình kết quả xử lí
    // 2. in ra log file
    // 3. dùng đồ chơi bên ngoài kiểm thử or thư viện
    // nhưng dù là kiểm thì cx gồm 3 công việc
    // thiết kế test case
    // thực thi test case -> test run
    // ghi bug nếu có - log bug
    // test case là bộ data để đưa vào app để so sánh vs expected value (là giá trị kì vọng)
    // kèm theo hướng dẫn sử dụng app vs data đưa vào
    // kèm theo trạng thái đúng sai
    
    // cấu trúc của test case như sau
    // test case ID || test descripsion || step/produres
    // expected value||| status(pass|| fail)
    // test case là 1 tình huống xài app vs bộ data đưa vào và giá trị kì vọng app phải trả về,
    // v nếu muốn viết hàm test app thì ta phải thiết kế các test case đẻ so sánh hàm trả về đúng ko
    

    // TEST CASE 1: verify getFactorial( with n=0)  check 0! ==1  true false
    // test step/ produres
    // 1, Given n=0
    // 2, call/invoke get Factorial(n =0)
    
     // TEST CASE 2: verify getFactorial( with n= 5)  check 5! == 120 true false
    // test step/ produres
    // 1, Given n=5
    // 2, call/invoke get Factorial(n =5)
    
    // Bài thi PE câu 3 viết ra khoảng 10 cái test case như trên
    public static void main(String[] args) {
        // test case 1 xem mô tả chi tiết ở ghi chú
        int n = 5; // tham số ktr
        long expected = 120; // kết quả dự kiến
        long actual = MathUtility.getFactorial(n);
        // so sánh giữa expected == actual or not
        System.out.println(n + "! -> expected: "+expected + " actual: " + actual);
    }
    
}
