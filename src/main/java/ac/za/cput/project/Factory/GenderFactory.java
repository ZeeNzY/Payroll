package ac.za.cput.project.Factory;

import ac.za.cput.project.domain.Gender;

public class GenderFactory {

    public static Gender getGender(String gender){
        return new Gender.Builder().gender(gender)
                .build();
    }
}
