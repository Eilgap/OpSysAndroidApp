package com.example.operatingsystemsapplication.ui.chapter2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.operatingsystemsapplication.databinding.FragmentChapter2Binding;

import java.util.zip.Inflater;

public class Chapter2Fragment extends Fragment {

    private FragmentChapter2Binding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
            ViewGroup container, Bundle savedInstanceState) {
        Chapter2ViewModel chapterViewModel =
                new ViewModelProvider(this).get(Chapter2ViewModel.class);

        binding = FragmentChapter2Binding.inflate(inflater, container, false);
    View root = binding.getRoot();

        final TextView textView = binding.textGallery;
        chapterViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

@Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}