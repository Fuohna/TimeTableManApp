package phuonganh.com.example.titama.ui.done;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class DoneViewModel extends ViewModel {
    private MutableLiveData<String> mText;

    public DoneViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("No tasks completed");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
