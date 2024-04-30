@RunWith(Parameterized.class) // Напиши аннотацию для параметризованных тестов
public class CheckIsAdultTest {

    private final int age;
    private final boolean result;

    public CheckIsAdultTest(int age, boolean result) {
        this.age = age;
        this.result = result;
    }

    @Parameterized.Parameters// Пометь метод аннотацией для параметров
    public static Object[][] getTextData() {
        return new Object[][] {
                { 18, true},
                { 19, true},
                { 20, true},
                { 21, true},// Заполни массив тестовыми данными и ожидаемым результатом
        };
    }

    @Test
    public void checkIsAdultWhenAgeThenResult() {
        Program program = new Program();
        // Передай сюда возраст пользователя
        boolean isAdult = program.checkIsAdult(age);
        // Сравни полученный и ожидаемый результаты, не забудь про сообщение об ошибке 11111
        assertEquals("Неверный текст ошибки!", result, isAdult );
    }


}