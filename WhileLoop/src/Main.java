public class Main {
    public static void main(String[] args) {
//        for (int i = 1; i <= 5 ; i++ ) {
//            System.out.println(i);
//        }
//        int j = 1;
//
//        while (j <= 5) {
//            System.out.println(j);
//            j++;
//        }
//        int number = 0;
//        while (number < 50) {
//            number += 5;
//            if (number % 25 == 0) {
//                continue;
//            }
//            System.out.println(number + "_");
//
//        }
//        int start = 4 ;
//        int evenFound = 0;
//        int oddFound = 0;
//        while (start <= 20) {
//            start++;
//
//            if (evenFound == 5) {
//                break;
//            }
//            if (isEvenNumber(start)) {
//                evenFound++;
//                System.out.println(start + " is even");
//                continue;
//            }
//            oddFound++;
//        }
//        System.out.println(evenFound + " evens found");
//        System.out.println(oddFound + " odds found");
//        int number1 = 125;
//        int number2 = 1000;
//        int number3 = 4321;
//        int number4 = 0;
//        int number5 = -1234;
//        int number6 = 4;
//        System.out.println("The Sum Digits for number " + number1 + " is " + sumDigits(number1));
//        System.out.println("The Sum Digits for number " + number2 + " is " + sumDigits(number2));
//        System.out.println("The Sum Digits for number " + number3 + " is " + sumDigits(number3));
//        System.out.println("The Sum Digits for number " + number4 + " is " + sumDigits(number4));
//        System.out.println("The Sum Digits for number " + number5 + " is " + sumDigits(number5));
//        System.out.println("The Sum Digits for number " + number6 + " is " + sumDigits(number6));

//        boolean isit = isPalindrome(-121);
//        System.out.println(isit);
//        int sum = sumFirstAndLastDigit(-10);
//        System.out.println(sum);

//        int sum = getEventDigitSum(111);
//        System.out.println(sum);
//        boolean has = hasSharedDigit(12, 13);
//        System.out.println(has);

//        boolean has = hasSameLastDigit(777, 771, 77);
//        System.out.println(has);

//        printFactors(-1);
//        int great = GreatestCommonDivisor(81, 153);
//        System.out.println(great);

//        boolean perfect = isPerfectNumber(6);
//        System.out.println(perfect);

//        String reverse = reverse(100);
//        System.out.println(reverse);

        int sum = getDigitCount(100);
        System.out.println(sum);

    }



//    public static boolean isEvenNumber (int number) {
//        return number % 2 == 0;
//    }

    public static boolean isPalindrome(int number) {
        int reverse = 0;
        int temp = number;
        if (temp < 0) {
            temp *= -1;
            number *= -1;
        }

        while (temp >= 0) {
            int lastDigit = temp % 10;

            reverse *= 10;
            reverse += lastDigit;
            temp /= 10;
            if (temp == 0)  {
                break;
            }

        }
        return number == reverse;
    }

    public static void checkRemainder(int number1) {
        int remainder = number1 % 100;
        System.out.println(remainder);
    }

    public static int sumFirstAndLastDigit (int number) {
        if (number < 0) {
            return  -1;
        }
        int temp = number;
        int lastDigit = temp % 10;
        int firstDigit = 0;
        while (temp > 0) {
            firstDigit = temp;
            temp /= 10;
            if (temp == 0) {
                break;
            }
        }

        return  lastDigit + firstDigit;
    }

    public static int getEventDigitSum (int number) {
        if (number < 0) {
            return  -1;
        }
        int sum = 0;
        while ( number > 0) {
            int lastDigit = number % 10;
            number /= 10;
            if (lastDigit % 2 == 0) {
                sum += lastDigit;
            }
            if (number == 0) {
                break;
            }
        }

        return  sum;
    }

    public static boolean hasSharedDigit(int number1, int number2) {

        if (((number1 < 10) || (number1 > 99)) || (number2 < 10) || (number2 > 99)) {
            return false;
        }
        while (number1 > 0) {

            int comparatorDigit = number1 % 10;
            int modifiedNumber2 = number2;
            number1 /= 10;
            while (modifiedNumber2 > 0) {

                int currentDigit = modifiedNumber2 % 10;

                modifiedNumber2 /= 10;

                if (comparatorDigit == currentDigit) {
                    return true;
                }
                if (modifiedNumber2 == 0) {
                    break;
                }

            }
            if (number1 == 0) {
                break;
            }
        }
        return false;
    }

    public static boolean hasSameLastDigit(int number1, int number2, int number3) {
        if (!isValid(number1) || !isValid(number2) || !isValid(number3)) {
            return false;
        }
        int number1LastDigit = number1 % 10;
        int number2LastDigit = number2 % 10;
        int number3LastDigit = number3 % 10;

        return (number1LastDigit == number2LastDigit) || (number1LastDigit == number3LastDigit) || (number2LastDigit == number3LastDigit);
    }

    public static boolean isValid (int number) {
        return (number >= 10 && number <= 1000);
    }

    public static void printFactors(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        }
        int iterator = 1;
        String statement = "";

        while (iterator <= number) {
            if (number % iterator == 0) {
                statement = statement + " " + iterator;
            }
            iterator++;
        }

        System.out.println(statement);
    }

    public static int GreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) {
            return -1;
        }

        int firstDivisor = 1;
        int secondDivisor = 1;
        int firstIterator = 1;
        int secondIterator = 1;
        int greatestCommonDivisor = 0;


        while (firstIterator <= first) {
            if (first % firstIterator == 0) {
                firstDivisor = firstIterator;
            }
            while (secondIterator <= second) {
                if (second % secondIterator == 0) {
                    secondDivisor = secondIterator;
                }
                if (firstDivisor == secondDivisor) {
                    greatestCommonDivisor = firstDivisor;
                }
                secondIterator++;
            }
            secondIterator = 1;
            firstIterator++;
        }
        return greatestCommonDivisor;
    }

    public static boolean isPerfectNumber(int number) {

        if (number <= 0) {
            return false;
        }
        int iterator = 1;
        int divisorsSum = 0;
        while (iterator < number) {
            if (number % iterator == 0) {
                divisorsSum += iterator;
            }
            iterator++;
        }
        return divisorsSum == number;
    }

    public static int getDigitCount (int number) {
        // if number is negative return invalid value
//        if (number < 0) {
//            return -1;
//        }
        int reversedNumber = 0;

//        while (number > 0) {
//            number /= 10;
//            reversedNumber += reverse(number);
//        }

//        int reversedNumber = reverse(number);
//        System.out.println(reversedNumber);
        int numberOfDigits = 0;

        return reverse(number);



        // switch (reversedNumber.charAt(i)) {
        //                case '0':
        //                    System.out.println("Zero");
        //                case '1':
        //                   System.out.println("One");
        //                   break;
        //                case '2':
        //                    System.out.println("Two");
        //                    break;
        //                case '3':
        //                    System.out.println("Three");
        //                    break;
        //                case '4':
        //                    System.out.println("Four");
        //                    break;
        //                case '5':
        //                    System.out.println("Five");
        //                    break;
        //                case '6':
        //                    System.out.println("Six");
        //                break;
        //                case '7':
        //                    System.out.println("Seven");
        //                    break;
        //                case '8':
        //                    System.out.println("Eight");
        //                    break;
        //                case '9':
        //                    System.out.println("Nine");
        //                    break;
        //                default:
        //                    System.out.println("Invalid Value");
        //
        //            }



//        for (int i = reversedNumber.length(); i > 0; i--) {
//
//        }
//
//        return reversedNumber.length();

    }

    /**
     * This method returns the reverse of the number given
     * ex: 100 -> 001
     * @param number int
     * @return int
     */
    public static int reverse(int number) {
        int reversedNumber = 0;
        int temp = number;
        if (temp < 0) {
            temp = -number;
        }

        while (temp > 0) {
            int lastDigit = temp % 10;
            reversedNumber = reversedNumber * 10 + lastDigit;
            temp /= 10;
        }
        if (number < 0) {
            reversedNumber = -reversedNumber;
        }
        return reversedNumber;
    }
}
