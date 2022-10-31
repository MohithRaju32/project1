public class Datatypes {

    public static void main(String[] args) {
        int myValue = 10000;
        int myMintValue = Integer.MIN_VALUE;
        int myMaxValue = Integer.MAX_VALUE;
        System.out.println("Integer Min Value =" + myMintValue);
        System.out.println("Integer Max Value =" + myMaxValue);
        System.out.println("Busted Max Value =" + (myMaxValue + 1));
        System.out.println("busted Min Value =" + (myMintValue - 1));

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("my Byte Minimum value =" + myMinByteValue);
        System.out.println("my Byte Maximum value =" + myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("my Short Minimum value =" + myMinShortValue);
        System.out.println("my Short Maximum value =" + myMaxShortValue);

        long myLongValue = 100L;
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("my Long Minimum value =" + myMinLongValue);
        System.out.println("my Long Maximum value =" + myMaxLongValue);

        long myLongValuee = 5655L;
        long myMinLongValuee = Long.MIN_VALUE;
        long myMaxLongValuee = Long.MAX_VALUE;
        System.out.println("My Long min value =" + myMinLongValuee);
        System.out.println("My Long Max value =" + myMaxLongValuee);

        int myTotal = (myMintValue / 2);

        byte myNewMinByteValue = (byte) (myMinByteValue / 2);

        short myNewShortValue = (short) (myMinShortValue / 2);

    }
}
