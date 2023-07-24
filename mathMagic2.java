public class mathMagic2 {

    public static void main(String[] args) {

        int myNumber = 20; // Can be any number
        int magicNumber = myNumber * myNumber;
        magicNumber += myNumber;
        magicNumber /= myNumber;
        magicNumber += 17;
        magicNumber -= myNumber;
        magicNumber /= 6;

        System.out.println(magicNumber);
    }
}
