/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.toanvu.mathutil.core.test;

import com.toanvu.mathutil.core.MathUtility;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

/**
 *
 * @author ToanVu
 */
public class MathUtilityDDTTest {
    
    //ta cần cbi bộ data để đưa ào cái hàm qua 2 tham sô đã chừa sẵn
    //kĩ thuật này gọi là tách data kiểm thử ra khỏi câu lệnh so sánh
    // để data ở riêng 1 chỗ, từ từ fill vào hàm so sánh
    // kĩ thuật này gọi là DDT Data driven testing
    // data thường sẽ để ở mảng 2 chiều
    // 1 cái là đầu vào N, 1 cái là đầu ra Expected
    // và có nhiều cặp như thế
    // kĩ thuật này gọi là tham số hóa kiểm thử
    // đưa data vào qua tham số hàm
    //mảng 2 chiều này sẽ nhồi vào hàm ở dưới
    
    public static Object[][] initData(){
        Object[][] dataSet = {{0,1},
                              {1,1},
                              {2,2},
                              {3,6},
                              {4,24},
                              {5,120}};
            return dataSet;
        }
    
    @ParameterizedTest
    @MethodSource("initData")
        public void verifyFactorialGeivenRightArgument0ReturnOK(int n, long expedted){
        assertEquals(expedted, MathUtility.getFactorial(n));
        }
}
