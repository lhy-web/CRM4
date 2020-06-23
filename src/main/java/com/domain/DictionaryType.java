package com.domain;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.HashSet;
import java.util.Set;

public class DictionaryType {
    private Integer dataTypeId;
    private String dataTypeName;
    private Set dictionaryTypeInfos = new HashSet(0);

    public Set getDictionaryTypeInfos() {
        return dictionaryTypeInfos;
    }

    public void setDictionaryTypeInfos(Set dictionaryTypeInfos) {
        this.dictionaryTypeInfos = dictionaryTypeInfos;
    }

    public DictionaryType() {
    }

    public DictionaryType(Integer dataTypeId, String dataTypeName) {
        this.dataTypeId = dataTypeId;
        this.dataTypeName = dataTypeName;
    }



    public Integer getDataTypeId() {
        return dataTypeId;
    }

    public void setDataTypeId(Integer dataTypeId) {
        this.dataTypeId = dataTypeId;
    }

    public String getDataTypeName() {
        return dataTypeName;
    }

    public void setDataTypeName(String dataTypeName) {
        this.dataTypeName = dataTypeName;
    }
}
