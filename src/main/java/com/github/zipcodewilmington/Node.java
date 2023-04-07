package com.github.zipcodewilmington;

public class Node {

    String value;

    String key;

    Node next;

    public Node(String key ,String value){
        this.value= value;
        this.key = key;
        next = null;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }


    public Node getNext(){
        return next;
    }

    public void setNext(Node node){
        this.next = node;
    }

    public String getData() {
        return value;
    }


}
