package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please decide between 1, 2, or 3");
        String decider = input.nextLine();
        String allParam = "first";
        String threeParam = "second";
        String fourParam = "third";
        if(decider.contentEquals(allParam)) {
            System.out.println("enter width");
            double width = input.nextInt();
            input.nextLine();
            System.out.println("enter height");
            double height = input.nextInt();
            input.nextLine();
            System.out.println("enter Area that can be covered per bucket");
            int areaPerBucket = input.nextInt();
            input.nextLine();
            System.out.println("enter extra buckets, if any");
            int extraBucket = input.nextInt();
            input.nextLine();
            int answer = getBucketCount(width, height, areaPerBucket, extraBucket);
            System.out.println("you need " + answer + " buckets to paint this area");
        }
// a single bucket can cover an area of 1.5 and bob has two extra buckets at home.
    }
   public static int getBucketCount(double width, double height, int areaPerBucket, int extraBuckets){
        if (width <= 0 || height <= 0 || areaPerBucket <= 0){
            return -1;
        }
        double area = width * height;
        int bucketsNeeded = (int)((area/areaPerBucket) - extraBuckets);
        return bucketsNeeded;
   }
    public static int getBucketCount(double width, double height, double areaPerBucket){
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 ){
            return -1;
        }
        double area = width * height;
        int bucketsNeeded = (int)(area/areaPerBucket);
        return bucketsNeeded;
    }
    public static int getBucketCount( double area, double areaPerBucket){
        int bucketsNeeded = (int)(area/areaPerBucket);
        return bucketsNeeded;
    }
}
