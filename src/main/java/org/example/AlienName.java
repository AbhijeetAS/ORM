package org.example;

import javax.persistence.Embeddable;

@Embeddable
public class AlienName {

    private String fName;
    private String mName;
    private String lName;

    public AlienName() {
    }

    public AlienName(String fName, String mName, String lName) {
        this.fName = fName;
        this.mName = mName;
        this.lName = lName;
    }

    @Override
    public String toString() {
        return "AlienName{" +
                "fName='" + fName + '\'' +
                ", mName='" + mName + '\'' +
                ", lName='" + lName + '\'' +
                '}';
    }
}
