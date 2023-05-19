package com.coderhouse.clase11.ApiRest.PostmanII.model;

public class RequestInvoice {

    private int client_id;

    //Luego añadiremos los details que serán añadidos.
    private String otra_prop;

    public RequestInvoice(int client_id, String otra_prop) {
        this.client_id = client_id;
        this.otra_prop = otra_prop;
    }

    public int getClient_id() {
        return client_id;
    }

    public void setClient_id(int client_id) {
        this.client_id = client_id;
    }

    public String getOtra_prop() {
        return otra_prop;
    }

    public void setOtra_prop(String otra_prop) {
        this.otra_prop = otra_prop;
    }

    @Override
    public String toString() {
        return "RequestInvoice{" +
                "client_id=" + client_id +
                ", otra_prop='" + otra_prop + '\'' +
                '}';
    }
}
