package com.example.quran.POJO;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class QuranData {



    @SerializedName("code")
    @Expose
    private int code;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("data")
    @Expose
    private Quran data;


    public QuranData() {
    }


    public QuranData(int code, String status, Quran data) {
        super();
        this.code = code;
        this.status = status;
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Quran getData() {
        return data;
    }

    public void setData(Quran data) {
        this.data = data;
    }

}