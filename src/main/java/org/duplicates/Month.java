package org.duplicates;

import java.util.Objects;

public class Month {
    private String name;

    public Month(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    // Required for HashSet to detect duplicates correctly
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Month)) return false;
        Month month = (Month) o;
        return name.equals(month.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
