package Collections_InterfaceList;

import java.util.List;

public class ArrayListTest {
    public static void main(String args[]) {
        // ��� � � �++. ��� �������� �������� �������� ����� ������ � ��� �������� �� ������� ����������� � �����.
        // ��� �� ��� ���������� ������ ��������� ����������� ���� ����� � 2 ����.
        List<Integer> listInt = new java.util.ArrayList<>(); // ���������: List = ArrayList

        for(int i = 0; i < 100; i++) {
            listInt.add(i); // �������� �������
        }

        System.out.println(listInt); // ������� �������� (toString)

        System.out.println(listInt.get(50)); // �������� ���������� �������
        System.out.println(listInt.get(99));

        listInt.remove(50); // ������� ������� ��� �������� n
        System.out.println(listInt.get(50));
    }
}
