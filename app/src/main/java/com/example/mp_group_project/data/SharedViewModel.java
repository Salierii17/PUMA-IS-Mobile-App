package com.example.mp_group_project.data;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SharedViewModel extends ViewModel {
    private final MutableLiveData<String> imageUrl = new MutableLiveData<>();

    public void setImageUrl(String url) {
        imageUrl.setValue(url);
    }

    public LiveData<String> getImageUrl() {
        return imageUrl;
    }
}


