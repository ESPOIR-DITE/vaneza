package com.company;

import com.company.factory.NameFactory;

public class Main {

    public static void main(String[] args) {
	Names names = NameFactory.getName("va","si","kjd","034906823059676");
	Doctor doctor = new Doctor("89278",names);

    }
}
