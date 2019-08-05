package ac.za.cput.project.domain;

public class Employee {

    private String empd_id;
    private String first_name;
    private String last_name;
    private Race race;
    private Gender gender;

    public Race getRace() {
        return race;
    }

    public Gender getGender() {
        return gender;
    }

    public String getEmpd_id() {
        return empd_id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    private Employee(){

    }

    private Employee(Builder builder) {
        this.first_name = builder.first_name;
        this.empd_id = builder.emp_id;
        this.last_name = builder.last_name;
        this.race = builder.race;
        this.gender = builder.gender;
    }

    public static class Builder{

        private String emp_id;
        private String first_name;
        private String last_name;
        private Race race;
        private Gender gender;

        public Employee.Builder first_name(String first_name){
            this.first_name = first_name;
            return this;
        }

        public Employee.Builder emp_id(String emp_id){
            this.emp_id = emp_id;
            return this;
        }

        public Employee.Builder last_name(String last_name){
            this.last_name = last_name;
            return this;
        }

        public Employee.Builder race(Race race){
            this.race = race;
            return this;
        }

        public Employee.Builder gender(Gender gender){
            this.gender = gender;
            return this;
        }

        public Employee build() {
            return new Employee(this);
        }
    }
}
