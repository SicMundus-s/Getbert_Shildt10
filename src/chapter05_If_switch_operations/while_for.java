package chapter05_If_switch_operations;

public class while_for {
    char choice = 1;
    public void chois(char choice) {
        this.choice = choice;
        do {
            System.out.println("C�pa��a �� ���������:");
            System.out.println(" 1. if");
            System.out.println(" 2. switch");
            System.out.println(" 3. while");
            System.out.println(" 4. do-while");
            System.out.println(" 5. for\n");
            System.out.println("B��ep��e ������ �����:");
        } while (choice < '1' || choice > '5');

        System.out.println("\n");

        switch (choice) {
            case '1':
                System.out.println("if: \n");
                System.out.println("if(yc�o��e) ��������;");
                System.out.println("else ��������;");
                break;
            case '2':
                System.out.println("switch:\n");
                System.out.println("swit�h(���������) {");
                System.out.println(" case ���������:");
                System.out.println(" ������������������ ����������");
                System.out.println(" break;");
                System.out.println(" / / ... ");
                System.out.println("}");
                break;
            case '3':
                System.out.println("while:\n");
                System.out.println("while(yc�o��e) ��������;");
                break;
            case '4':
                System.out.println("do-while:\n");
                System.out.println("do {");
                System.out.println(" ��������;");
                System.out.println("} while (�������);");
                break;
            case '5':
                System.out.println("for:\n");
                System.out.println("for(������������� �������; ��������)");
                System.out.println(" ��������;");
                break;

        }
    }
}