package com.alejandroaraya.ds.chicagoanalysis.models;

public class Person {
    protected String name;
    protected String lastname;

    public Person(final String name, final String lastname) {
        this.name = name.replace("\"", "").replace(" ","");
        this.lastname = lastname.replace("\"","");
    }//constructor

    public String toString(){
        return "{\"name\":\""+ this.name + "\", \"lastname\":\""+ this.lastname+"\"}";
    }// Method To String Ends -------------------------------------------------

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

}//Class person
