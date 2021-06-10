package com.company.factory;

import com.company.Names;

public class NameFactory {
    public static Names getName(String name,String firstName,String surName,String contact){
        return new Names.Builder(name)
                .builderContact(contact)
                .buildFirstName(firstName)
                .buildSurName(surName)
                .build();
    }
}
