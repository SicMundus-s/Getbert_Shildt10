package chapter3;
class Main {
    public static void main(String args[]) {
        int myArray[][] = new int[5][6];
        int[] a1 = new int[3];
        int k = 1;

        for (int count = 0; count < myArray.length; ++count)
            for (int countTwo = 0; countTwo < 6; ++countTwo) {
                myArray[count][countTwo] = k;
                ++k;
            }

        for (int count = 0; count < myArray.length; ++count) {
            for (int countTwo = 0; countTwo < 6; ++countTwo) {
                System.out.print(myArray[count][countTwo] + "\t");
            }
            System.out.println();
        }
    }
}
