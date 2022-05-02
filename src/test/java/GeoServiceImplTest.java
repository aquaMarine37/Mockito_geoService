import org.junit.jupiter.api.Test;
import ru.netology.entity.Country;
import ru.netology.entity.Location;
import ru.netology.geo.GeoService;
import ru.netology.geo.GeoServiceImpl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class GeoServiceImplTest {
    GeoService sut = new GeoServiceImpl();
    @Test
    public void locationByIPTest() {

        Location expected = new Location("Moscow", Country.RUSSIA, "Lenina", 15);
        Location result = sut.byIp("172.0.32.11");
        assertEquals(expected.getCountry(), result.getCountry());
    }

    @Test
    public void exceptionTest() {
        assertThrows(RuntimeException.class, () -> sut.byCoordinates(1.2, 3.4));
    }
}
