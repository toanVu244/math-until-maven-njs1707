/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import com.toanvu.mathutil.core.MathUtility;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author ToanVu
 */
public class MathUtilityTest {
        // test case #1: Verify getFactorial(with n=0)
        // steps/procedures
        //          1.Given =0
        //          2.Call/invoke getFactorial(n=0)
        // Expected result:
        //          The method must return as the result of 0! = 1
        // Status: PASSED | FAILED cho lúc chạy hàm mới biết trạng thái đúng sai
        
        @Test
        public void verifyFactorialGeivenRightArgument0ReturnOK(){
        assertEquals(1, MathUtility.getFactorial(0));
        }
        
        @Test
        public void verifyFactorialGeivenRightArgument1ReturnOK(){
        assertEquals(1, MathUtility.getFactorial(1));
        }
        
        @Test
        public void verifyFactorialGeivenRightArgument5ReturnOK(){
        assertEquals(120, MathUtility.getFactorial(5));
        }
    
    
}
