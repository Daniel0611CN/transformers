package org.iesvdm.transformer;

class AddMessage implements Transformer<String> {

    private String msg;

    public AddMessage(String m) {msg = m;}

    public String transform(String m) {return m+" "+msg;}
}
