package ac.za.cput.project.domain;

public class EmployeeRace {

    private String race_id;
    private String emp_id;

    private EmployeeRace() {
    }

    private EmployeeRace(Builder builder) {
        this.race_id = builder.race_id;
        this.emp_id = builder.emp_id;
    }

    public String getRace_id() {
        return race_id;
    }

    public String getEmpNum() {
        return emp_id;
    }

    public static class Builder {
        private String race_id, emp_id;

        public Builder race_id(String race_id) {
            this.race_id = race_id;
            return this;
        }

        public Builder emp_id(String emp_id) {
            this.emp_id = emp_id;
            return this;
        }

        public EmployeeRace build() {
            return new EmployeeRace(this);
        }
    }
}
