package com.sheridan.forrm_binding.beans;

public enum School {
    
    COMPUTING_SCHOOL("COMPUTING_CENTER"),
    GENERAL_SCHOOL("GENERAL_SCHOOL");

    private String name;

    private School(String name) {
        this.setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    
}
