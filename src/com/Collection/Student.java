package com.Collection;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Student {
    List studentNames;
    Set countryNames;
    Map topCities;
    Properties cash;

    public Set getCountryNames() {
        return countryNames;
    }

    public void setCountryNames(Set countryNames) {
        this.countryNames = countryNames;
    }

    public Map getTopCities() {
        return topCities;
    }

    public void setTopCities(Map topCities) {
        this.topCities = topCities;
    }

    public Properties getCash() {
        return cash;
    }

    public void setCash(Properties cash) {
        this.cash = cash;
    }

    public List getStudentNames() {
        return studentNames;
    }

    public void setStudentNames(List studentNames) {
        this.studentNames = studentNames;
    }
}
