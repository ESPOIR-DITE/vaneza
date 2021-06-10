package com.company;

public class Doctor {
    private String empNumber;
    private Names names;

    public Doctor(String empNumber, Names names) {
        this.empNumber = empNumber;
        this.names = names;
    }

    public String getEmpNumber() {
        return empNumber;
    }

    public void setEmpNumber(String empNumber) {
        this.empNumber = empNumber;
    }

    public Names getNames() {
        return names;
    }

    public void setNames(Names names) {
        this.names = names;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "empNumber='" + empNumber + '\'' +
                ", names=" + names.toString()+
                '}';
    }
}
