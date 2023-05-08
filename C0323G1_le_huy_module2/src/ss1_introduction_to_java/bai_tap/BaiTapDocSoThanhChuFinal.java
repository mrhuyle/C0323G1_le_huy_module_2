package ss1_introduction_to_java.bai_tap;

import java.util.Scanner;

public class BaiTapDocSoThanhChuFinal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number: ");
        int number = scanner.nextInt();
        String result = "";
        String number11to19Str = "";
        int hundreds, tens, ones;
        hundreds = number / 100;
        tens = (number - hundreds * 100) / 10;
        ones = number - hundreds * 100 - tens * 10;
        String hundredsStr = "";
        String tensStr = "";
        String onesStr = "";
        switch (ones) {
            case 0:
                onesStr = "";
                break;
            case 1:
                onesStr = "one";
                break;
            case 2:
                onesStr = "two";
                break;
            case 3:
                onesStr = "three";
                break;
            case 4:
                onesStr = "four";
                break;
            case 5:
                onesStr = "five";
                break;
            case 6:
                onesStr = "six";
                break;
            case 7:
                onesStr = "seven";
                break;
            case 8:
                onesStr = "eight";
                break;
            case 9:
                onesStr = "nine";
                break;
            case 10:
                onesStr = "ten";
                break;
        }
        switch (tens) {
            case 2:
                tensStr = "twenty";
                break;
            case 3:
                tensStr = "thirty";
                break;
            case 4:
                tensStr = "fourty";
                break;
            case 5:
                tensStr = "fifty";
                break;
            case 6:
                tensStr = "sixty";
                break;
            case 7:
                tensStr = "seventy";
                break;
            case 8:
                tensStr = "eighty";
                break;
            case 9:
                tensStr = "ninety";
                break;
        }
        switch (hundreds) {
            case 0:
                hundredsStr = "";
                break;
            case 1:
                hundredsStr = "one hundred";
                break;
            case 2:
                hundredsStr = "two hundred";
                break;
            case 3:
                hundredsStr = "three hundred";
                break;
            case 4:
                hundredsStr = "four hundred";
                break;
            case 5:
                hundredsStr = "five hundred";
                break;
            case 6:
                hundredsStr = "six hundred";
                break;
            case 7:
                hundredsStr = "seven hundred";
                break;
            case 8:
                hundredsStr = "eight hundred";
                break;
            case 9:
                hundredsStr = "nine hundred";
                break;
        }
        if (tens == 1) {
            switch (ones) {
                case 0:
                    number11to19Str = "ten";
                    break;
                case 1:
                    number11to19Str = "eleven";
                    break;
                case 2:
                    number11to19Str = "twelve";
                    break;
                case 3:
                    number11to19Str = "thirteen";
                    break;
                case 4:
                    number11to19Str = "fourteen";
                    break;
                case 5:
                    number11to19Str = "fifteen";
                    break;
                case 6:
                    number11to19Str = "sixteen";
                    break;
                case 7:
                    number11to19Str = "seventeen";
                    break;
                case 8:
                    number11to19Str = "eighteen";
                    break;
                case 9:
                    number11to19Str = "nighteen";
                    break;
            }
        }
        if (number < 0 || number > 999) {
            result = "invalid result";
        } else if (number == 0) {
            result = "zero";
        } else {
            if (hundreds == 0 && tens == 0) {
                result = onesStr;
            } else if (hundreds == 0 && tens == 1) {
                result = number11to19Str;
            } else if (hundreds != 0 && tens == 0 && ones != 0) {
                result = hundredsStr + " and " + onesStr;
            } else if (hundreds != 0 && tens == 1) {
                result = hundredsStr + " and " + number11to19Str;
            } else if (hundreds == 0) {
                result = tensStr + " " + onesStr;
            } else if (tens == 0) {
                result = hundredsStr;
            } else {
                result = hundredsStr + " and " + tensStr + " " + onesStr;
            }
        }
        System.out.println(result);
    }
}