
package com.company.json;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Valute {

    @SerializedName("Date")
    @Expose
    private String date;
    @SerializedName("PreviousDate")
    @Expose
    private String previousDate;
    @SerializedName("PreviousURL")
    @Expose
    private String previousURL;
    @SerializedName("Timestamp")
    @Expose
    private String timestamp;
    @SerializedName("Valute")
    @Expose
    private Valute_ valute;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Valute() {
    }

    /**
     * 
     * @param date
     * @param valute
     * @param previousURL
     * @param previousDate
     * @param timestamp
     */
    public Valute(String date, String previousDate, String previousURL, String timestamp, Valute_ valute) {
        super();
        this.date = date;
        this.previousDate = previousDate;
        this.previousURL = previousURL;
        this.timestamp = timestamp;
        this.valute = valute;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getPreviousDate() {
        return previousDate;
    }

    public void setPreviousDate(String previousDate) {
        this.previousDate = previousDate;
    }

    public String getPreviousURL() {
        return previousURL;
    }

    public void setPreviousURL(String previousURL) {
        this.previousURL = previousURL;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public Valute_ getValute() {
        return valute;
    }

    public void setValute(Valute_ valute) {
        this.valute = valute;
    }

    @Override
    public String toString() {
        return "Valute{" +
                "date='" + date + '\'' +
                ", previousDate='" + previousDate + '\'' +
                ", previousURL='" + previousURL + '\'' +
                ", timestamp='" + timestamp + '\'' +
                ", valute=" + valute +
                '}';
    }


}
