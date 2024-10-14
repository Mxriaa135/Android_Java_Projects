package com.example.navigationdrawer.ui.contato;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.navigationdrawer.databinding.FragmentContatoBinding;

public class ContatoFragment extends Fragment {
    private FragmentContatoBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ContatoViewModel contatoViewModel = new ViewModelProvider(this).get(ContatoViewModel.class);

        binding = FragmentContatoBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textContato;
        contatoViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}