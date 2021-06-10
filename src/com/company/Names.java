package com.company;

public class Names {
    private String name;
    private String firstName;
    private String surName;
    private String contact;

    public Names(Builder builder) {
        this.contact= builder.contact;
        this.name = builder.name;
        this.firstName = builder.firstName;
        this.surName = builder.surName;
    }


    public String getName() {
        return name;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSurName() {
        return surName;
    }

    @Override
    public String toString() {
        return "Names{" +
                "name='" + name + '\'' +
                ", firstName='" + firstName + '\'' +
                ", surName='" + surName + '\'' +
                ", contact='" + contact + '\'' +
                '}';
    }

    public String getContact() {
        return contact;
    }
    public static class Builder{
        private String name;
        private String firstName;
        private String surName;
        private String contact;

        public Builder(String name){
            this.name = name;
        }
        public Builder buildFirstName(String firstName){
            this.firstName = firstName;
            return this;
        }
        public Builder buildSurName(String surName){
            this.surName = surName;
            return this;
        }
        public Builder builderContact(String contact){
            this.contact = contact;
            return this;
        }
        public Names build(){
            return new Names(this);
        }

    }
}
