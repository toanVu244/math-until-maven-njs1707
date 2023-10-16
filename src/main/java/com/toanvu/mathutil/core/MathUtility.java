/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.toanvu.mathutil.core;

/**
 *
 * @author ToanVu
 */
// class này sẽ chứa các tool dùng chung cho các nơi khác, nó chỉ nhận info trả info và không lưu trữ gì cả, cái đó gọi là Static , class nào dc dc gọi là static thì có thể gọi trực tiếp qua tên class
// ko bh gọi static qua con đường new!!
public class MathUtility {
    public static final double Pi = 3.14;
    // ko canaf chữ static mà vẫn là nếu có từ khóa const 
    
    //hàm tính n!=1,2,3,4,5
    //ko có giai thừa số âm
    //n quá lớn trên kiểu long(18 số)
    //20! viawf đỉ 18 số 0, ko tính giai thừa 21 trở đi
    // 0! 1! = 1
    
//    public static long getFactorial(int n){
//        if(n<0 || n>20 ){
//            throw new IllegalArgumentException("Invalid N, N must be in 0-20");
//        }
//        if(n==0|| n==1){
//            return 1; //nếu có thể kết thúc sớm thì kết thúc ngay
//        }
//        //sống sót đến chỗ này, auto n= 2..20. vì nếu chết dọc dg ở cụm if ở trên rồi, ko cần else nếu trc đó có return
//        
//        long result = 1;
//        for (int i = 2; i <= n; i++) {
//            result *= i;
//        }
//        return result;
//    }
    
       public static long getFactorial(int n){
       //Đệ quy là gọi lại chính mình với quy mô nhỏ hơn
       //(5! = 1*2*3*4*5) == (5! =   4!*5)
       //(n! = 1*2*....n) == (n! =(n-1)!*5)
        if(n<0 || n>20 ){
            throw new IllegalArgumentException("Invalid N, N must be in 0-20");
        }
        if(n==0|| n==1){
            return 1; //nếu có thể kết thúc sớm thì kết thúc ngay
        }
        return n * getFactorial(n-1);
    }
       //kĩ thuật kiểm thử hồi quy test lại những thứ đã từng test để xác nhận nó còn ổn ko
       // tại sao lại phải test lại?
       //Code theo thời gian sẽ có thay đổi, thay đổi vì 
       //1. Anh em fix bug thì sẽ có thay đổi code
       //2. Anh em tối ưu, chỉnh sửa code đẻ code đẹp hơn, chạy tốt hơn nhanh hơn
       //3. Anh em thêm hàm mới, method mới
       
       // Khi sửa code phải test lại để đảm bảo nó vẫn ngon, vẫn xanh
       // Nếu test = tay cực kì mất sức, coi chừng sai sót
       // nếu có test Scirpt, ta chỉ việc run, và nhìn màu đưa ra
       // nếu có màu xanh, cs chỉnh sửa ổn, vì thỏa Expedted == Actual
       // Nếu màu đỏ, code ko ổn, sửa tiếp cho đến khi nào ổn
       // ta test lại mà chỉ cần nhìn màu -> nhanh, ko bao , chính xác
       // miễn đủ test case, test scirpt
       
       //Test tay những thứ đã từng test gọi là test hồi quy 
}
