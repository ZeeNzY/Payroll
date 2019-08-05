package ac.za.cput.project.domain;

public class Race {

    private String race;

    private Race(){

    }

    private Race (Builder builder){
        this.race = builder.race;
    }

    public String getRace() {
        return race;
    }

    public static class Builder{

        private String race;

        public Race.Builder race(String race){
            this.race = race;
            return this;
        }

        public Race build(){
            return new Race(this);
        }
    }
}
