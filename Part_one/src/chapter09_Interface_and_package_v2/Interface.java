package chapter09_Interface_and_package_v2;

interface ListException {
    int UnsupportedOperationException = 0;
}

interface abc extends ListException{

     default int multiplication(int a, int b, int c) {
        return a * b * c;
    }

    void printABC(int a, int b, int c);

     default int Exception() {
        return UnsupportedOperationException;
     }
}

class CallMe implements ListException {
    static void answer(int result) {
        switch (result) {
            case UnsupportedOperationException:
                System.out.println("UnsupportedOperationException");
                break;

        }
    }

}
