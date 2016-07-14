package com.nanda.sectionedrecyclerview.models;

import java.util.List;

public class DataModel {


    private String headerTitle;
    private List<String> allItemsInSection;


    public DataModel() {

    }

    public String getHeaderTitle() {
        return headerTitle;
    }

    public void setHeaderTitle(String headerTitle) {
        this.headerTitle = headerTitle;
    }

    public List<String> getAllItemsInSection() {
        return allItemsInSection;
    }

    public void setAllItemsInSection(List<String> allItemsInSection) {
        this.allItemsInSection = allItemsInSection;
    }


}
