package Pages;

public class FindEvenAndOddAndAverage {

    public static void main(String[] args) {

        int[] number = {1,2,3,4,5,6,7,8,9,10};

        for //(int num : number ){
            //if(num % 2==0) {

        (int i = 0; i< number.length; i++){
            if (number[i]% 2==0) {


                System.out.println("Even Number : " + number[i]);
            }

            else  {
                System.out.println("Odd Number : " + number[i]);
            }

                }

            }
        }


