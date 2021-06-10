package com.sheridan.forrm_binding.beans;
import java.util.List;
import lombok.*;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Company implements CompanyList {

    public String name;

    @Override
    public List<Company> getCompanyList() {
        return null;
    }

    @Override
    public void setCompanyList(List<Company> object) {
       
    }
}
