package com.burakkutbay.model;

import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.List;

/**
 * Created by hasanburakkutbay on 19.05.2017.
 */
@Component
public class Altin implements Serializable {

    private String selling;
    private String update_date;
    private String gold;
    private String source;
    private String buying;
    private String change_rate;
    private String name;
    private String full_name;
    private String short_name;
    private String source_name;
    private String source_full_name;
    private List<Altin> ek;

    public String getSelling() {
        return selling;
    }

    public void setSelling(String selling) {
        this.selling = selling;
    }

    public String getUpdate_date() {
        return update_date;
    }

    public void setUpdate_date(String update_date) {
        this.update_date = update_date;
    }

    public String getGold() {
        return gold;
    }

    public void setGold(String gold) {
        this.gold = gold;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getBuying() {
        return buying;
    }

    public void setBuying(String buying) {
        this.buying = buying;
    }

    public String getChange_rate() {
        return change_rate;
    }

    public void setChange_rate(String change_rate) {
        this.change_rate = change_rate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public String getShort_name() {
        return short_name;
    }

    public void setShort_name(String short_name) {
        this.short_name = short_name;
    }

    public String getSource_name() {
        return source_name;
    }

    public void setSource_name(String source_name) {
        this.source_name = source_name;
    }

    public String getSource_full_name() {
        return source_full_name;
    }

    public void setSource_full_name(String source_full_name) {
        this.source_full_name = source_full_name;
    }

    public List<Altin> getEk() {
        return ek;
    }

    public void setEk(List<Altin> ek) {
        this.ek = ek;
    }
}
