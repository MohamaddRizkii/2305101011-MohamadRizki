
package com.example.modul6;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class SecondFragment extends Fragment {

    public SecondFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater,
            @Nullable ViewGroup container,
            @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(
                R.layout.fragment_second,
                container,
                false
        );

        Button button = view.findViewById(
                R.id.btnGoToThirdFragment
        );

        button.setOnClickListener(v -> {
            getParentFragmentManager()
                    .beginTransaction()
                    .replace(
                            R.id.fragment_container,
                            new ThirdFragment()
                    )
                    .addToBackStack(null)
                    .commit();
        });

        return view;
    }
}
