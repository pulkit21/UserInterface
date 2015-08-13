package com.example.pulkit.userinterface;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by pulkit on 8/13/15.
 */
public class TopFragment extends Fragment implements AdapterView.OnItemClickListener{
    Communicator communicator;
    ListView listView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.top_fragmentsss,container,false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        communicator = (Communicator) getActivity();
        listView = (ListView) getActivity().findViewById(R.id.list_item);
        ArrayAdapter arrayAdapter = ArrayAdapter.createFromResource(getActivity(),R.array.titles,android.R.layout.simple_list_item_1);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
    communicator.response(position);
    }
}
