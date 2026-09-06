    class _01Return {
    public static void main(String[] args) {
        int num = sumTwoNumber(7,4);
        System.out.println(num);
           // OR
        System.out.println(sumTwoNumber(7,4));
        System.out.println(sumTwoNumber(02,25));
        System.out.println(sumTwoNumber(13,25));
    }
    public static int sumTwoNumber(int a,int b) {
        System.out.println("enter first number received: " + a);
        System.out.println("enter second number received: " + b);
        int sum = a + b;
        System.out.println("sum of the two numbers is: " + sum);
        return sum;
    }
}