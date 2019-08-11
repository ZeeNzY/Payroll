package ac.za.cput.project.Factory;

import ac.za.cput.project.domain.Gender;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class GenderFactoryTest {

    @Test
    public void getGender() {

        String gen = "female";

        Gender gender = GenderFactory.getGender(gen);


        Assert.assertNotEquals(gender, gen);
    }

}