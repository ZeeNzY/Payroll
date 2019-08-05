package ac.za.cput.project.domain;

public class Gender {

    private String gender;

    private Gender(){

    }

    public String getGender() {
        return gender;
    }

    private Gender(Builder builder){
        this.gender = builder.gender;
    }

    public static class Builder{

        private String gender;

        public Gender.Builder gender(String gender){
            this.gender = gender;
            return this;
        }

        public Gender build(){
            return new Gender(this);
        }
    }
}
