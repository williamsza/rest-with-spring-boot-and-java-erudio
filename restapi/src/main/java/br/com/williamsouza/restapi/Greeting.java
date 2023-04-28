package br.com.williamsouza.restapi;

public class Greeting {

    private final Long id;
    private final String content;

    public Greeting(long l, String content) {
        this.id = l;
        this.content = content;
    }

    public Long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

   
}
