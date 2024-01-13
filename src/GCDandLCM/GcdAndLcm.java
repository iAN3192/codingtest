package GCDandLCM;

public class GcdAndLcm {
    public static void main(String[] args) {
        int num1 = 60;
        int num2 = 30;

        //최대공약수는 항상 큰 수를 작은 수로 나누어야 함.
        int gcd = getGCD(num1, num2);

        int lcm = (num1 * num2) / gcd;

        System.out.println("the greatest common denominator : " + gcd);
        System.out.println("the lowest common multiple : " + lcm);
    }

    public static int getGCD(int num1, int num2) {
        if (num1 % num2 == 0) {
            return num2;
        }
        return getGCD(num2, num1%num2);
    }
}
