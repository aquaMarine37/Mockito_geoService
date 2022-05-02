import org.junit.jupiter.api.Test;
import ru.netology.entity.Country;
import ru.netology.i18n.LocalizationServiceImpl;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LocalizationServiceImplTest {
    @Test
    public void greetingRussiaTest() {
        LocalizationServiceImpl sut = new LocalizationServiceImpl();
        Country country = Country.RUSSIA;
        String expected = "Добро пожаловать";
        String result = sut.locale(country);
        assertEquals(expected, result);
    }
}
