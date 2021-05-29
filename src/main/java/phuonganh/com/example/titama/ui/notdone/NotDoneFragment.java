package phuonganh.com.example.titama.ui.notdone;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import phuonganh.com.example.titama.R;
import phuonganh.com.example.titama.ui.notdone.NotDoneViewModel;

public class NotDoneFragment extends Fragment {
    private NotDoneViewModel notDoneViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        notDoneViewModel = new ViewModelProvider(this).get(NotDoneViewModel.class);
        View root = inflater.inflate(R.layout.not_done_frag, container, false);
        final TextView textView = root.findViewById(R.id.text_not_done);
        notDoneViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}
