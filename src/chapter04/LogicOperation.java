package chapter04;

public class LogicOperation {
    boolean m_a = true; //  � ������� �� ������ ��������� ������ true/false
    boolean m_b = false;
    public void test(boolean a, boolean b)
    {
        this.m_a = a;
        this.m_b = b;
        System.out.println(m_a & m_b ? "true" : "false"); //  ���������� �
        System.out.println(m_a |m_b ? "true" : "false"); //  ���������� ���
        System.out.println(m_a & !m_b ? "true" : "false");
        System.out.println(m_a ^ m_b ? "true" : "false");
        // ��� ����������� � �++
        System.out.println(m_a && m_b ? "true" : "false"); //  ����������� ���������� �������� (�)
        System.out.println(m_a || m_b ? "true" : "false"); //  ����������� ���������� �������� (���)

    }

}
