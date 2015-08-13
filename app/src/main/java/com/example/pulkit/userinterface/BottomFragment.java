package com.example.pulkit.userinterface;

import android.app.Fragment;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by pulkit on 8/13/15.
 */
public class BottomFragment extends Fragment {

    TextView textView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.bottom_fragmentss, container, false);
        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        textView = (TextView) getActivity().findViewById(R.id.showText);

    }

    public void changeData(int data) {
        Resources resources = getResources();
        String[] descriptions = resources.getStringArray(R.array.descriptions);
        textView.setText(descriptions[data]);
    }
}
