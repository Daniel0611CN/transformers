package org.iesvdm.transformer;

public class JoinSpace implements Joiner<String> {
    @Override
    public String join(String obj1, String obj2) {
        return obj1+" "+obj2;
    }
}
