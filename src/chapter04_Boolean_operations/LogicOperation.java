package chapter04_Boolean_operations;

public class LogicOperation {
    boolean m_a = true; //  В отличие от плюсов принимает только true/false
    boolean m_b = false;
    public void test(boolean a, boolean b)
    {
        this.m_a = a;
        this.m_b = b;
        System.out.println(m_a & m_b ? "true" : "false"); //  Логическая и
        System.out.println(m_a |m_b ? "true" : "false"); //  Логическая или
        System.out.println(m_a & !m_b ? "true" : "false");
        System.out.println(m_a ^ m_b ? "true" : "false");
        // Обе отсутствуют в С++
        System.out.println(m_a && m_b ? "true" : "false"); //  Укороченная Логическая операция (и)
        System.out.println(m_a || m_b ? "true" : "false"); //  Укороченная Логическая операция (или)

    }

}
