package designPatterns.builder;

import designPatterns.builder.exception.InvalidGradyearException;
import designPatterns.builder.exception.InvalidPspException;
import designPatterns.builder.exception.InvalidYoeException;

public class Student {
    private int id;
    private String name;
    private int yoe;
    private int gradYear;
    private double psp;
    private String batchName;

    private Student(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.yoe = builder.yoe;
        this.gradYear = builder.gradYear;
        this.psp = builder.psp;
        this.batchName = builder.batchName;
    }

    public static Builder builder() {
        Builder builder = new Builder();
        return builder;
    }

    static class Builder {
        int id;
        String name;
        int yoe;
        int gradYear;
        double psp;
        String batchName;


        public Builder setId(int id) {
            this.id = id;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setYoe(int yoe) {
            this.yoe = yoe;
            return this;
        }

        public Builder setGradYear(int gradYear) {
            this.gradYear = gradYear;
            return this;
        }

        public Builder setPsp(double psp) {
            this.psp = psp;
            return this;
        }

        public Builder setBatchName(String batchName) {
            this.batchName = batchName;
            return this;
        }

        public Student build() {
            //validations
            if(yoe < 1) {
                throw new InvalidYoeException("Invalid years of experience");
            }
            if(gradYear > 2022) {
                throw new InvalidGradyearException("invalid grad year exception");
            }
            if(psp < 75) {
                throw new InvalidPspException("invalid PSP exception");
            }
            Student student = new Student(this);
            return student;
        }
    }
}
