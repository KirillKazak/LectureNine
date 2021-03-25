package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FirstFragment extends Fragment {

    int[] array = {1, 2, 3, 4, 5};

    public FirstFragment(){
        super(R.layout.fragment_first);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Button fragmentButton = (Button) view.findViewById(R.id.fragmentButton);
        TextView fragmentView = (TextView) view.findViewById(R.id.fragmentView);

        fragmentButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                for (int i = 0; i < array.length; i++) {
                    String num = new Integer(array[i]).toString();
                    fragmentButton.setText(num);
                }
            }
        });
    }
}
