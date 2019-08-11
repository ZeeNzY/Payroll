package ac.za.cput.project.Factory;

import ac.za.cput.project.domain.Race;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class RaceFactoryTest {

    @Test
    public void getGender() {

        String r = "coloured";

        Race race = RaceFactory.getRace(r);


        Assert.assertNotEquals(race, r);
    }
}