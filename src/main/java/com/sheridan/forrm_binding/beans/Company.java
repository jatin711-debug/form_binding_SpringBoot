package com.sheridan.forrm_binding.beans;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import lombok.*;
@Data
@NoArgsConstructor
public class Company implements CompanyList {

    public String name;
    public List<Company> objectList = new CopyOnWriteArrayList<Company>();

    @Override
    public List<Company> getCompanyList() {
        return objectList;
    }

    @Override
    public void addToCompanyList(Company object) {
        objectList.add(object);
    }
}
