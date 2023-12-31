package com.example.artwood.model;

import com.example.artwood.shared.Utils;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class Commande {
    private String uuid;
    private Timestamp dateAjoute;
    private Timestamp dateUpdate;
    private Client client;
    private CommandeStatus commandeStatus;
    private List<Produit> produitList;
    private float total_amount;
    private String clientID;



    public Commande(Timestamp dateAjoute, Timestamp dateUpdate, String clientID, CommandeStatus commandeStatus, float total_amount) {
        this.uuid = Utils.GenerateId();
        this.dateAjoute = dateAjoute;
        this.dateUpdate = dateUpdate;
        this.clientID = clientID;
        this.commandeStatus = commandeStatus;
        this.produitList = new ArrayList<>();
        this.total_amount = total_amount;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public Timestamp getDateAjoute() {
        return dateAjoute;
    }

    public void setDateAjoute(Timestamp dateAjoute) {
        this.dateAjoute = dateAjoute;
    }

    public Timestamp getDateUpdate() {
        return dateUpdate;
    }

    public void setDateUpdate(Timestamp dateUpdate) {
        this.dateUpdate = dateUpdate;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public CommandeStatus getCommandeStatus() {
        return commandeStatus;
    }

    public void setCommandeStatus(CommandeStatus commandeStatus) {
        this.commandeStatus = commandeStatus;
    }

    public List<Produit> getProduitList() {
        return produitList;
    }

    public void setProduitList(List<Produit> produitList) {
        this.produitList.clear();
        this.produitList = produitList;
    }

    public float getTotal_amount() {
        return total_amount;
    }

    public void setTotal_amount(float total_amount) {
        this.total_amount = total_amount;
    }

    @Override
    public String toString() {
        return "Commande{" +
                "uuid='" + uuid + '\'' +
                ", dateAjoute=" + dateAjoute +
                ", dateUpdate=" + dateUpdate +
                ", client=" + client +
                ", commandeStatus=" + commandeStatus +
                ", produitList=" + produitList +
                ", total_amount=" + total_amount +
                '}';
    }
    public String getClientID() {
        return clientID;
    }

    public void setClientID(String clientID) {
        this.clientID = clientID;
    }
    public JsonObject toJson() {
        Gson gson = new Gson();
        String json = gson.toJson(this);
        JsonParser jsonParser = new JsonParser();
        return jsonParser.parse(json).getAsJsonObject();
    }
}
