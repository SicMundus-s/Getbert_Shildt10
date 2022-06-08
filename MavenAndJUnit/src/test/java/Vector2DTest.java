import org.junit.*;

public class Vector2DTest {
    private final double EPS = 1e-9;
    private Vector2D v1;

    //@After(После) Выполняется для очитски после использования @Before(Например при создании и зыкрытии файла)
    @Before //Вспомогательный метод
    //@BeforeClass Так будет создан один объект(Синглтон) и будет использоватся для всех тестовых методов
    public void createNewVector() { // Создание окружения для тестирования
    v1 = new Vector2D(); // Создание того, что в будет необходимо в дальнеёшем тестировании \
    } // Для каждой аннотации Test будет создаватся свой экземляр Vector2D

    @Test
    public void newVectorShouldHaveZeroLength() {
        //Vector2D v1 = new Vector2D(); // Action
        Assert.assertEquals(0, v1.length(), EPS); // assertion
    }

    @Test
    public void newVectorShouldHaveZeroX() {
        //Vector2D v1 = new Vector2D();
        Assert.assertEquals(0, v1.getX(), EPS);
    }

    @Test
    public void newVectorShouldHaveZeroY() {
        //Vector2D v1 = new Vector2D();
        Assert.assertEquals(0, v1.getY(), EPS);
    }
}
