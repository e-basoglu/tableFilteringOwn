package com.example.demo;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class MyData {
    private final StringProperty columnA;
    private final StringProperty columnB;
    private final StringProperty columnC;
    private final StringProperty columnD;
    private final StringProperty columnE;

    public MyData(String a, String b, String c, String d, String e) {
        this.columnA = new SimpleStringProperty(a);
        this.columnB = new SimpleStringProperty(b);
        this.columnC = new SimpleStringProperty(c);
        this.columnD = new SimpleStringProperty(d);
        this.columnE = new SimpleStringProperty(e);
    }

    public String getColumnA() {
        return columnA.get();
    }

    public void setColumnA(String a) {
        this.columnA.set(a);
    }

    public StringProperty columnAProperty() {
        return columnA;
    }

    public String getColumnB() {
        return columnB.get();
    }

    public void setColumnB(String b) {
        this.columnB.set(b);
    }

    public StringProperty columnBProperty() {
        return columnB;
    }

    public String getColumnC() {
        return columnC.get();
    }

    public void setColumnC(String c) {
        this.columnC.set(c);
    }

    public StringProperty columnCProperty() {
        return columnC;
    }

    public String getColumnD() {
        return columnD.get();
    }

    public void setColumnD(String d) {
        this.columnD.set(d);
    }

    public StringProperty columnDProperty() {
        return columnD;
    }

    public String getColumnE() {
        return columnE.get();
    }

    public void setColumnE(String e) {
        this.columnE.set(e);
    }

    public StringProperty columnEProperty() {
        return columnE;
    }
}


