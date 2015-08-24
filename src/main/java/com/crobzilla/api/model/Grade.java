package com.crobzilla.api.model;

import java.util.Date;

/**
 * Created by crobinson on 8/20/15.
 */
public class Grade {

    private Date date;
    private String grade;
    private int score;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
