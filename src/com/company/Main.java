package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        int size;
        int[] arr;
        do {
            System.out.println("nhap vao so luong cac sinh vien");
            size = scanner.nextInt();

            if (size>30) {
                System.out.println("qua gioi han");
            }
        } while (size >30);

        arr = new int[size];
        System.out.println("Nhap vao diem");
        for (int i=0;i< arr.length;i++) {
            System.out.println("nhap diem sinh vien thu " + (i+1));
            arr[i] = scanner.nextInt();
        }

        int count = 0;
        System.out.println("Danh sach diem");
        for (int j = 0; j<arr.length; j++) {
            System.out.println(arr[j]);
            if (arr[j]>=5 && arr[j] <=10) {
                count++;
            }
        }
        System.out.println("so sinh vien do la: "+count);
    }
}
