package com.example.navigationdrawer.ui.servicos;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.navigationdrawer.databinding.FragmentServicosBinding;

public class ServicosFragment extends Fragment {
    private FragmentServicosBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ServicosViewModel servicosViewModel = new ViewModelProvider(this).get(ServicosViewModel.class);

        binding = FragmentServicosBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textServicos;
        servicosViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}