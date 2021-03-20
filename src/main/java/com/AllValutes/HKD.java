
package com.AllValutes;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class HKD {

    @SerializedName("ID")
    @Expose
    private String iD;
    @SerializedName("NumCode")
    @Expose
    private String numCode;
    @SerializedName("CharCode")
    @Expose
    private String charCode;
    @SerializedName("Nominal")
    @Expose
    private Integer nominal;
    @SerializedName("Name")
    @Expose
    private String name;
    @SerializedName("Value")
    @Expose
    private Double value;
    @SerializedName("Previous")
    @Expose
    private Double previous;

    /**
     * No args constructor for use in serialization
     * 
     */
    public HKD() {
    }

    /**
     * 
     * @param nominal
     * @param previous
     * @param numCode
     * @param name
     * @param charCode
     * @param iD
     * @param value
     */
    public HKD(String iD, String numCode, String charCode, Integer nominal, String name, Double value, Double previous) {
        super();
        this.iD = iD;
        this.numCode = numCode;
        this.charCode = charCode;
        this.nominal = nominal;
        this.name = name;
        this.value = value;
        this.previous = previous;
    }

    public String getID() {
        return iD;
    }

    public void setID(String iD) {
        this.iD = iD;
    }

    public String getNumCode() {
        return numCode;
    }

    public void setNumCode(String numCode) {
        this.numCode = numCode;
    }

    public String getCharCode() {
        return charCode;
    }

    public void setCharCode(String charCode) {
        this.charCode = charCode;
    }

    public Integer getNominal() {
        return nominal;
    }

    public void setNominal(Integer nominal) {
        this.nominal = nominal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public Double getPrevious() {
        return previous;
    }

    public void setPrevious(Double previous) {
        this.previous = previous;
    }

    @Override
    public String toString() {
        return "HKD{" +
                "iD='" + iD + '\'' +
                ", numCode='" + numCode + '\'' +
                ", charCode='" + charCode + '\'' +
                ", nominal=" + nominal +
                ", name='" + name + '\'' +
                ", value=" + value +
                ", previous=" + previous +
                '}';
    }
}
