package com.example.kursach2.ui.ingred;



import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class IngredViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public IngredViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Ингредиенты");
    }

    public LiveData<String> getText() {
        return mText;
    }
}

