package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class SecondFragment extends Fragment {

    int[] array = {1, 2, 3, 4, 5};


    public SecondFragment(){
        super(R.layout.fragment_second);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        View myTextView = (TextView) view.findViewById(R.id.fragment_second_view);
        int count = 0;

        while (count < array.length) {
            Integer num = array[count];
            ((TextView) myTextView).setText(num.toString());
            count++;
        }

    }
}
