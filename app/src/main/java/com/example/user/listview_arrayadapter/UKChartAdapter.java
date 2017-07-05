package com.example.user.listview_arrayadapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import static android.R.attr.y;

/**
 * Created by user on 05/07/2017.
 */

public class UKChartAdapter extends ArrayAdapter<Song> {

    public UKChartAdapter(Context context, ArrayList<Song> songs){
        super(context, 0, songs);
    }

    @Override
    public View getView(int position, View listItemView, ViewGroup parent){
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.chartitems, parent, false);
        }
        Song currentSong = getItem(position);

        TextView ranking = (TextView)listItemView.findViewById(R.id.ranking);
        ranking.setText(currentSong.getRanking().toString());

        TextView title = (TextView)listItemView.findViewById(R.id.title);
        title.setText(currentSong.getTitle());

        TextView artist = (TextView)listItemView.findViewById(R.id.artist);
        artist.setText(currentSong.getArtist());

        return listItemView;
    }
}
