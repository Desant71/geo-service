package ru.netology.geo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.entity.Country;
import ru.netology.entity.Location;

import static org.junit.jupiter.api.Assertions.*;

class GeoServiceImplTest {

    @Test
    public void testByRussia() {
        GeoService gS = new GeoServiceImpl();
        Country actual = gS.byIp("172.").getCountry();
        Country expected = new Location(null, Country.RUSSIA, null, 0).getCountry();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testByUSA() {
        GeoService gS = new GeoServiceImpl();
        Country actual = gS.byIp("96.").getCountry();
        Country expected = new Location(null, Country.USA, null, 0).getCountry();

        Assertions.assertEquals(expected, actual);
    }


}