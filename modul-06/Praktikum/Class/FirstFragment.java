
    package com.example.modul6;

    import android.os.Bundle;
    import android.view.LayoutInflater;
    import android.view.View;
    import android.view.ViewGroup;
    import android.widget.Button;

    import androidx.annotation.NonNull;
    import androidx.annotation.Nullable;
    import androidx.fragment.app.Fragment;

    public class FirstFragment extends Fragment {

        public FirstFragment() {
        }

        @Nullable
        @Override
        public View onCreateView(
                @NonNull LayoutInflater inflater,
                @Nullable ViewGroup container,
                @Nullable Bundle savedInstanceState) {

            View view = inflater.inflate(
                    R.layout.fragment_first,
                    container,
                    false
            );

            Button button = view.findViewById(
                    R.id.btnGoToSecondFragment
            );

            button.setOnClickListener(v -> {
                getParentFragmentManager()
                        .beginTransaction()
                        .replace(
                                R.id.fragment_container,
                                new SecondFragment()
                        )
                        .addToBackStack(null)
                        .commit();
            });

            return view;
        }
    }
