package com.example.mp_group_project.ui.Information;


public class InformationModel {
    String id,topic,category,description,imageUrl;



 public InformationModel(String topic, String description) {
        this.topic = topic;
        this.description = description;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getTopic() {
        return topic;
    }

    public String getId() {
        return id;
    }

    public String getCategory() {
        return category;
    }

    public  String getDescription() {
        return description;
    }

    public String getImageUrl() {
        return imageUrl;
    }
}
