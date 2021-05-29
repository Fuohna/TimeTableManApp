package phuonganh.com.example.titama.ui.notdone;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class NotDoneViewModel extends ViewModel {
    private MutableLiveData<String> mText;

    public NotDoneViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("No tasks uncompleted");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
