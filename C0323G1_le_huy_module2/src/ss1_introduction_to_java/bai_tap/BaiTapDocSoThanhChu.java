package ss1_introduction_to_java.bai_tap;

import java.util.Scanner;

public class BaiTapDocSoThanhChu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number: ");
        String numberStr = "";
        int hundreds, tens, ones;
        String hundredsStr = "";
        String tensStr = "";
        String onesStr = "";
        String numberStrfrom0to19 = "";
        int number = scanner.nextInt();
        if (number <= 12 && number >= 0) {
            switch (number) {
                case 0:
                    numberStr = "zero";
                    break;
                case 1:
                    numberStr = "one";
                    break;
                case 2:
                    numberStr = "two";
                    break;
                case 3:
                    numberStr = "three";
                    break;
                case 4:
                    numberStr = "four";
                    break;
                case 5:
                    numberStr = "five";
                    break;
                case 6:
                    numberStr = "six";
                    break;
                case 7:
                    numberStr = "seven";
                    break;
                case 8:
                    numberStr = "eight";
                    break;
                case 9:
                    numberStr = "nine";
                    break;
                case 10:
                    numberStr = "ten";
                    break;
                case 11:
                    numberStr = "eleven";
                    break;
                case 12:
                    numberStr = "twelve";
                    break;
                default:
                    numberStr = "out of ability";
            }
        } else if (number > 12 && number < 20) {
            ones = number - 10;
            switch (ones) {
                case 3:
                    numberStr = "thirteen";
                    break;
                case 4:
                    numberStr = "fourteen";
                    break;
                case 5:
                    numberStr = "fifteen";
                    break;
                case 6:
                    numberStr = "sixteen";
                    break;
                case 7:
                    numberStr = "seventeen";
                    break;
                case 8:
                    numberStr = "eightteen";
                    break;
                case 9:
                    numberStr = "nightteen";
                    break;
                default:
                    numberStr = "out of ability";
            }
        } else if (number >= 20 && number <= 999) {
            hundreds = number / 100;
            tens = (number - hundreds * 100) / 10;
            ones = number - hundreds * 100 - tens * 10;
            if (hundreds == 0) {
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
                        tensStr = "eightty";
                        break;
                    case 9:
                        tensStr = "ninety";
                        break;
                }
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
                }
                System.out.println(tensStr + " " + onesStr);
            } else if (hundreds != 0) {
                switch (hundreds) {
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
                }
            }
            System.out.println(hundredsStr + " and " + tensStr + " " + onesStr);
        }
        System.out.println(numberStr);
    }
}
