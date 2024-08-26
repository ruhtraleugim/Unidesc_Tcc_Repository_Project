package br.com.unidesc_tccrepositories.unidesc.model;

public class TccModel {
    //#region atributos
    private Integer id ; 

    private Integer postTime;

    private String creatorName;
    
    private String notes;
    //#endregion
    //#region getters & setters

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPostTime() {
        return postTime;
    }

    public void setPostTime(Integer postTime) {
        this.postTime = postTime;
    }

    public String getCreatorName() {
        return creatorName;
    }

    public void setCreatorName(String creatorName) {
        this.creatorName = creatorName;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
    //#endregion

   
    
}
