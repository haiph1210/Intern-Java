package com.haiph;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
       BeforeMain main = new BeforeMain();

        System.out.println("1. Cài đặt danh sách liên kết (linked list) có các phần tử có giá trị số nguyên,\" +\n" +
                "cài đặt hàm xóa những phần tử khỏi danh sách liên kết có giá trị bằng giá trị a cho trước." +
                "( Tự cài đặt toàn bộ, không sử dụng thư viện)");

        main.addDataAndRemoveWithPosition();

        System.out.println("2. Cho trước 2 danh sách liên kết (linked list) gồm các số nguyên đã được sắp xếp tăng dần, \" +\n"+
                " cài đặt hàm trả về 1 danh sách liên kết chứa tất cả các số nguyên trong 2 danh sách trên theo thứ tự tăng dần.");

        main.createTwoLinkedListAndMerge();

        System.out.println("3. (Bài không bắt buộc, sẽ là điểm cộng nếu ứng viên làm được) Cho trước 32 danh sách liên kết (linked list) \" +\n" +
                "gồm các số nguyên đã được sắp xếp tăng dần, cài đặt hàm trả về 1 danh sách liên kết chứa tất cả các số \" +\n " +
                "nguyên trong 32 danh sách trên theo thứ tự tăng dần.");

        main.createThirtyTwoLinkedListAndMerge();
    }
}