package ac.za.cput.project.domain;

public class EmployeeGender {

    private String gender_id;
    private String emp_id;

    private EmployeeGender() {
    }

    private EmployeeGender(Builder builder) {
        this.gender_id = builder.gender_id;
        this.emp_id = builder.emp_id;
    }

    public String getGenderID() {
        return gender_id;
    }

    public String getEmpNum() {
        return emp_id;
    }

    public static class Builder {
        private String gender_id, emp_id;

        public Builder gender_id(String gender_id) {
            this.gender_id = gender_id;
            return this;
        }

        public Builder emp_id(String emp_id) {
            this.emp_id = emp_id;
            return this;
        }

        public EmployeeGender build() {
            return new EmployeeGender(this);
        }
    }

}
