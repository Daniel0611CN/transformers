package org.iesvdm.transformer;

public class AddMessage implements Transformer<String> {

    private String msg;
    private int opt;

    public AddMessage(String m, int opt) {msg = m; this.opt = opt;}

    public String transform(String m) {
        if (opt == 1) {
            var a1 = msg+" "+m;
            return a1;
        } else if (opt == 2) {
            var a2 = m+" "+msg;
            return a2;
        } else {
            return "Error";
        }
    }
}

